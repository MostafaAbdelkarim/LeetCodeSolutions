class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int index = 1;
        for(String s: sentence.split(" "))
        {
            if(s.startsWith(searchWord))
            {
                return index;
            }
            else
            {
                index++;
            }
        }
        return -1;
    }
}