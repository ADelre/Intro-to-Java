package Examples.DnD.enums;

import java.util.Random;

public enum DndDice {
    d4(4),
    d6(6),
    d8(8),
    d10(10),
    d12(12),
    d20(20);

    private Random random = new Random();
    private final int diceSides;

    private DndDice(int diceSides) {
        this.diceSides = diceSides;
    }
    public int getDndDice() {
        return diceSides;
    }

    public int rollDice() {
        return random.nextInt(diceSides) + 1;
    }
}
