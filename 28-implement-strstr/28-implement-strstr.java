class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) 
        {
            return 0;
        }
        if (haystack.isEmpty())
        {
            return -1;   
        }
        int occurance = 0;
        for(int i = 0; i < haystack.length(); i++)
        {
            if (i + needle.length() > haystack.length()) break;
            for(int j = 0; j < needle.length(); j++)
            {
                if(haystack.charAt(i+j) != needle.charAt(j))
                {
                    break;
                }
                else if(j == needle.length() -1)
                {
                    return i;
                }
            }
        }
        return -1;
    }
}