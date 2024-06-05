class Solution {
    public boolean areNumbersAscending(String s) {
        final String[] tokens = s.split(" ");
        int previousNumber = -1;

        for (String token : tokens) {
            if (isNumeric(token)) {
                int currentNumber = Integer.parseInt(token);
                if (currentNumber <= previousNumber) {
                    return false;
                }
                previousNumber = currentNumber;
            }
        }

        return true;
    }

    private boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}