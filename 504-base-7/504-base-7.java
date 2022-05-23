class Solution {
    public String convertToBase7(int num) {
       StringBuilder s = new StringBuilder();
        int n = Math.abs(num);
        while(n / 7 != 0)
        {
            s.append(n % 7);
            n /= 7;
        }
        s.append(n);
        if(num < 0) s.append('-');
        return s.reverse().toString();
    }
}
