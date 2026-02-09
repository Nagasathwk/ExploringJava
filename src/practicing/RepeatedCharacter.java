package practicing;

import jdk.dynalink.beans.StaticClass;

import java.util.LinkedHashMap;
import java.util.*;

public class RepeatedCharacter {
    public static void main(String[] args) {


        String c = "hkdfbfdk";
        int freq = 0;
        char result;
        Map<Character, Integer> sat = new HashMap<>();
        for (char ch : c.toCharArray()) {
            sat.put(ch, sat.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : sat.entrySet()) {

        }


    }

}






