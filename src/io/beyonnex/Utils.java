package io.beyonnex;

import java.util.*;


public class Utils {
    public static Map<String, List<String>> anagramMap = new HashMap<>();

    // Anagram Definition : https://en.wikipedia.org/wiki/Anagram
    public static boolean areAnagrams(String str1, String str2) {

        // Trim and convert to lowercase
        String cleanedStr1 = str1.trim().toLowerCase();
        String cleanedStr2 = str2.trim().toLowerCase();

        // Early exit if the strings are the same
        if (cleanedStr1.equals(cleanedStr2))
            return true;

        if (cleanedStr1.length() != cleanedStr2.length()) return false;

        char[] charArray1 = cleanedStr1.toCharArray();
        char[] charArray2 = cleanedStr2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void addAnagrams(String key, String value) {
        List<String> anagrams = anagramMap.computeIfAbsent(key, k -> new ArrayList<>());
        if (!anagrams.contains(value)) {
            anagrams.add(value);
        }
    }
}