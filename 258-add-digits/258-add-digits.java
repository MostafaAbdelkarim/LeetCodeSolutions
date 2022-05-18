class Solution {
    public int addDigits(int num) {
        if(num < 0 || num == 0) return 0;
        String number = String.valueOf(num);
        int result = 0;
        for(int i = 0; i < number.length(); i++)
        {
            String s = "" + number.charAt(i);
            int numbers = Integer.parseInt(s);
            result = result + numbers;
        }
        return result < 10 ? result : addDigits(result);
    }
}