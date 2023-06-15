class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int sAscii[] = new int[65536];
        int tAscii[] = new int[65536];
        for (int i = 0; i < s.length(); i++) {
            sAscii[s.charAt(i)]++;
            tAscii[t.charAt(i)]++;
        }
        for (int i = 0; i < 65536; ++i) {
            if (sAscii[i] != tAscii[i])
                return false;
        }
        return true;
    }
}