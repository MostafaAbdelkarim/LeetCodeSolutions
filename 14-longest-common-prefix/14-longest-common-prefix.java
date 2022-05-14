class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);             
            }
        }
        return strs[0];
    }
}

        // int index = 0;
        // String result = "";
        // String x = strs[0];
        // if (strs.length == 0 || strs == null) return "";
        // if(strs.length == 1) return x;
        // for(int i = 0; i < strs.length; i++)
        // {
        //     String f = strs[i];
        //     for(int j = i + 1; j < strs.length; j++)
        //     {
        //         String s = strs[j];
        //         if(f.isEmpty() || s.isEmpty())
        //         {
        //             return result;
        //         }
        //         if(f.charAt(index) == s.charAt(index))
        //         {
        //             result = result + f.charAt(index);
        //             index++;
        //         }
        //         else
        //         {
        //             return result;
        //         }
        //     }
        // }
        // return result;