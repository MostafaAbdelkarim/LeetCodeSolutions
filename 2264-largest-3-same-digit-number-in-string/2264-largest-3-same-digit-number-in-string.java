class Solution {
    public String largestGoodInteger(String num) {
        String [] inp = new String[]{"999","888","777","666","555","444","333","222","111","000"};
        for(String i:inp)
        {
            if(num.contains(i))
            {
                return i;
            }
        }
        return "";
    }
}
// looping solution
        // int max=-1;
        // for(int i=0;i<s.length()-2;i++)
        // {
        //     if(s.charAt(i)==s.charAt(i+1)&&s.charAt(i+1)==s.charAt(i+2))
        //     max=Math.max(max,Integer.parseInt(s.substring(i,i+3)));
        // }
        // if(max==-1)
        //     return "";
        // if(max==0)
        //     return "000";
        // return max+"";