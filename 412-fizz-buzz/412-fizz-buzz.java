class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        int i = 1;
        while(i <= n){
            if (i % 15 == 0) ans.add("FizzBuzz");
            else if (i % 3 == 0) ans.add("Fizz");
            else if (i % 5 == 0) ans.add("Buzz");
            else ans.add(String.valueOf(i));
            i++;
        }
        return ans; 
    }
}