package Examples.DnD;

import java.util.ArrayList;
import java.util.List;

import Examples.DnD.Races.Race;
import Examples.DnD.enums.DndDice;
import Examples.DnD.enums.DndLanguages;
import Examples.DnD.enums.DndStatusConditions;

public class DndCharacter{
    private String name;
    private Race race;
    private int armorClass;
    private int maxHealth;
    private int currentHealth;
    private DndDice meleeWeapon;
    private int STR = 17;
    private int DEX = 10;
    private int CON = 10;
    private int INT = 10;
    private int WIS = 10;
    private int CHA = 10;
    private List<DndLanguages> languages;
    private List<DndStatusConditions> statusConditions;
    
    public DndCharacter(String name, Race race, int health, DndDice meleeWeapon) {
        this.name = name;
        this.race = race;
        this.maxHealth = health;
        this.currentHealth = health;
        this.meleeWeapon = meleeWeapon;
        this.languages = race.getLanguages();
        this.statusConditions = new ArrayList<>();
    }

    // region get/sets

    public int getStrengthModifier() {
        return this.calculateModifier(this.STR);
    }

    public int getDexterityModifier() {
        return this.calculateModifier(this.DEX);
    }

    public int getConstitutionModifier() {
        return this.calculateModifier(this.CON);
    }

    public int getIntelligenceModifier() {
        return this.calculateModifier(this.INT);
    }

    public int getWisdomModifier() {
        return this.calculateModifier(this.WIS);
    }

    public int getCharismaModifier() {
        return this.calculateModifier(this.CHA);
    }

    public DndDice getMeleeWeapon() {
        return this.meleeWeapon;
    }

    // endregion

    private int calculateModifier(int statValue) {
        return statValue / 2 - 5;
    }

    public int moveCharcter(int range) {
        return this.race.getSpeed() - range;
    }

    public int meleeAttack() {
        return meleeWeapon.rollDice();
    }
}