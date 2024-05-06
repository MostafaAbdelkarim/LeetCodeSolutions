class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return List.of(List.of());
        if (strs.length == 1) return List.of(List.of(strs[0]));
        final Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            final char[] chars = str.toCharArray();
            Arrays.sort(chars);
            final String sortedWord = new String(chars);
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(str);
        }
        return new ArrayList<>(map.values());
    }
}