class Solution {
    public boolean wordPattern(String pattern, String s) {
        final Map<Character, String> map = new HashMap<>();
        final String[] str = s.split(" ");
        if(pattern.length() != str.length){
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get((pattern.charAt(i))).equals(str[i])) {
                    return false;
                }
            } else if(map.containsValue(str[i])){
                    return false;
            } else {
                map.put((pattern.charAt(i)), str[i]);
            }
        }
        return true;
    }
}