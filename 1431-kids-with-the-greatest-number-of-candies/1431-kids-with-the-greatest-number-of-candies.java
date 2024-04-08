class Solution {
    public List<Boolean> kidsWithCandies(final int[] candies, final int extraCandies) {
        final List<Boolean> result = new ArrayList<>();
        final int maxCandies = maxCandies(candies);
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
    }
    
    private int maxCandies(final int[] candies) {
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(candy, maxCandies);
        }
        return maxCandies;
    }
}