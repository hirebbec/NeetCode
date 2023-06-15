import java.util.*;

class Solution {

    public static void main(String[] args) {
        String[] strings = {"abc", "acb"};
        List<List<String>> anagrams = groupAnagrams(strings);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> anagrams = new ArrayList<>();
        for (String str : strs) {
            if (!map.containsKey(getLetters(str))) {
                map.put(getLetters(str), new ArrayList<>());
            }
            map.get(getLetters(str)).add(str);
        }
        for (String key : map.keySet()) {
            anagrams.add(map.get(key));
        }
        return anagrams;
    }

    private static String getLetters(String str) {
        int[] letters = new int[26];
        for (int i = 0; i < str.length(); ++i) {
            letters[str.charAt(i) - 97]++;
        }
        return Arrays.toString(letters);
    }
}