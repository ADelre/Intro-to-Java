package Examples.DnD.Races;

import java.util.List;

import Examples.DnD.DamageTypes;
import Examples.DnD.enums.DndLanguages;

public interface Race {
    public int getSpeed();
    public List<DndLanguages> getLanguages();
    public int checkImmunities(int damage, DamageTypes damageType);
    public int checkResistances(int damage, DamageTypes damageType);
}
