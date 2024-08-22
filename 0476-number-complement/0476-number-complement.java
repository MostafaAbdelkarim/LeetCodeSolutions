class Solution {
    public int findComplement(int num) {
        final String binaryString = Integer.toBinaryString(num);
        final char[] arr = binaryString.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0') {
                arr[i] = '1';
            } else {
                arr[i] = '0';
            }
        }

        final String s = new String(arr);
        return Integer.parseInt(s, 2);
    }
}