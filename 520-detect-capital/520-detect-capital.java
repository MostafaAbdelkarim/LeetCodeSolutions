class Solution {
    public boolean detectCapitalUse(String word) {
        boolean result = false;
        int countUpper = 0, countLower = 0;
        if(word.length() < 1) return result;
        for(int i = 1; i < word.length(); i++)
        {
            if(Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1)))
            {
                return false;
            }
            if(Character.isUpperCase(word.charAt(i)))
            {
                countUpper++;
            }
            else if(Character.isLowerCase(word.charAt(i)))
            {
                countLower++;
            }
        }
        if(countUpper == word.length()-1 || countLower == word.length() -1)
        {
            result = true;
        }
        return result;
    }
}

//regex solution
// return word.matches("[A-Z]*|.[a-z]*");