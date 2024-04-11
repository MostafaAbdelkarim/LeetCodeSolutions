class Solution {
    public String reverseWords(String s) {
        final String[] words = s.split(" +");
        final StringBuilder sb = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

// can also be solved using functional programming approach
// return Arrays.asList(s.split(" "))
//             .reversed()
//             .stream()
//             .filter(element -> !element.equals(""))
//             .collect(Collectors.joining(" "));