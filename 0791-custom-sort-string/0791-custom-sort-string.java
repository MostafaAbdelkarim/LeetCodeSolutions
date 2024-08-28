class Solution {
    public String customSortString(String order, String s) {
        final StringBuilder sb = new StringBuilder();
        final Set<Character> charsSet = s.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toSet());
        
        final Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < order.length(); i++) {
            char currentChar = order.charAt(i);
            if (frequencyMap.containsKey(currentChar)) {
                int count = frequencyMap.get(currentChar);
                for (int j = 0; j < count; j++) {
                    sb.append(currentChar);
                }
                frequencyMap.remove(currentChar);
            }
        }
        
        for (char c : frequencyMap.keySet()) {
            int count = frequencyMap.get(c);
            for (int j = 0; j < count; j++) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}