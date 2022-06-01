class Solution {
    public String restoreString(String s, int[] indices) {
        char[] temp = s.toCharArray();
        for (int i = 0; i < temp.length; i++)
        {
            int idx = indices[i];
            temp[idx] = s.charAt(i);
        }
        return String.valueOf(temp);
    }
}