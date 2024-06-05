class Solution {
    public List<String> commonChars(String[] words) {
        final List<String> result = new ArrayList<>();
        if (words == null || words.length == 0) return result;
        
        final Map<Character, Integer> initMap = new HashMap<>();
        for (char c : words[0].toCharArray()) {
            initMap.put(c, initMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 1; i < words.length; i++) {
            final Map<Character, Integer> freqMap = new HashMap<>();
            for (char c : words[i].toCharArray()) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
            for (char c : initMap.keySet()) {
                if (freqMap.containsKey(c)) {
                    initMap.put(c, Math.min(initMap.get(c), freqMap.get(c)));
                } else {
                    initMap.put(c, 0);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : initMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                result.add(String.valueOf(c));
            }
        }
        return result; 
    }
}