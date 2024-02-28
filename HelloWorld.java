// Your First Program

import java.util.Scanner;

import Examples.DnD.DndCharacter;
import Examples.DnD.Races.Warforged;
import Examples.DnD.enums.DndDice;

public class HelloWorld {
    public static void main(String[] args) {
        String testString = "testString";
        char testChar = 'a';
        int testInteger = 123;
        boolean testBoolean = true;
        double testDouble = 12.34;
        float testFloat = 45.67f;
        long testLong = 105L;
        short testShort = 0;
        byte testByte = 0;

        Character testChar2 = null;
        Integer testInteger2 = null;
        Boolean testBoolean2 = null;
        Double testDouble2 = null;
        Float testFloat2 = null;
        Long testLong2 = null;
        Short testShort2 = null;
        Byte testByte2 = null;


        System.out.println("Hello, World!");

        // Scanner scanner = new Scanner(System.in);

        // System.out.println(scanner.nextLine());


        DndCharacter player = new DndCharacter("player", new Warforged(), 8, DndDice.d8);

        System.out.println(player.getStrengthModifier());

        DndDice dice = DndDice.d10;


    }
}