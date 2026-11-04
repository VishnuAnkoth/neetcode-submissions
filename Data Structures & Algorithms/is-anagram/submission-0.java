class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        Arrays.sort(sChar);
        char[] tChar = t.toCharArray();
        Arrays.sort(tChar);
        return Arrays.equals(sChar, tChar);
    }
}
