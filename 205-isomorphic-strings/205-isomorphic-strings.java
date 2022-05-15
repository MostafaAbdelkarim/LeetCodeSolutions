class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() == 0 || t.length() == 0)
        {
            return false;
        }
        if(s.length() != t.length())
        {
            return false;
        }
        
        int size = s.length();
        int[] sArr = new int[256];
        int[] tArr = new int[256];
        for(int i = 0; i < size; i++)
        {
            if(sArr[s.charAt(i)] != tArr[t.charAt(i)]) return false;
            sArr[s.charAt(i)] = i + 1;
            tArr[t.charAt(i)] = i + 1;
        }
        return true;
    }
}

//HashMap solution

//         if (s == null || t == null) 
//         {
//             return false;
//         }
//         if (s.length() != t.length()) 
//         {
//             return false;
//         }
//         Map<Character, Integer> mapS = new HashMap<Character, Integer>();
//         Map<Character, Integer> mapT = new HashMap<Character, Integer>();

//         for (int i = 0; i < s.length(); i++) 
//         {
//             int indexS = mapS.getOrDefault(s.charAt(i), -1);
//             int indexT = mapT.getOrDefault(t.charAt(i), -1);
                        
//             if (indexS != indexT) 
//             {
//                 return false;
//             }
//             mapS.put(s.charAt(i), i);
//             mapT.put(t.charAt(i), i);
//         }
//         return true;