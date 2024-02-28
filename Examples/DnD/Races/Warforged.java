package Examples.DnD.Races;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Examples.DnD.DamageTypes;
import Examples.DnD.enums.DndLanguages;

public class Warforged implements Race {

    private int speed;
    private List<DndLanguages> languages;

    public Warforged() {
        this.speed = 30;
        this.languages = new ArrayList<>(Arrays.asList(DndLanguages.Common));
    }

    @Override
    public List<DndLanguages> getLanguages() {
        return languages;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int checkResistances(int damage, DamageTypes damageType) {

        switch (damageType) {
            case Poison:
                return damage / 2;

            default:
                return damage;
        }
    }

    @Override
    public int checkImmunities(int damage, DamageTypes damageType) {
        return damage;
    }

}
