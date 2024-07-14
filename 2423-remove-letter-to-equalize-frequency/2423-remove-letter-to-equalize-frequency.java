class Solution {
    public boolean equalFrequency(String word) {
        
        final Map<Character, Integer> map = new HashMap<>();

        for (char ch : word.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : word.toCharArray()) {
            map.put(ch, map.get(ch) - 1);
            Set<Integer> frequencies = new HashSet<>(map.values());

            frequencies.remove(0);

            if (frequencies.size() == 1) {
                return true;
            }

            map.put(ch, map.get(ch) + 1);
        }
        return false;
    }
}