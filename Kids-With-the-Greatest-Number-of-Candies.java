class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();

        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max)
                max = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            output.add((candies[i] + extraCandies) >= max);
        }
        return output;
    }
}