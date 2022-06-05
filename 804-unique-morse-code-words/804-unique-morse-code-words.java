class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<String>();
		String[] encodes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--","-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		for (String item : words) 
        {
			String temp = "";
			for (int i = 0; i < item.length(); i++) 
            {
				temp = temp + encodes[item.charAt(i) - 'a'];
			}
			set.add(temp);
		}
		return set.size();
    }
}