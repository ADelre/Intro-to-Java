// Your First Program

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

        String[] testStringArray = new String[10];
        List<String> testStringList = new ArrayList<>();
        Map<String, String> testStringMap = new HashMap<>();
        Set<String> testStringSet = new HashSet<>();



        System.out.println("Hello, World!");
    }
}