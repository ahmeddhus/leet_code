class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int output = 0;
        Boolean lastIndexCan = false;

        if (n == 0)
            return true;

        if (flowerbed.length == 1) {
            return flowerbed[0] == 0 && n <= 1;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] != 0 || lastIndexCan) {
                lastIndexCan = false;
                continue;
            }

            if (i == 0) {
                if (flowerbed[i + 1] == 0) {
                    output++;
                    lastIndexCan = true;
                    continue;
                }
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0) {
                    output++;
                    lastIndexCan = true;
                    continue;
                }
            } else {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    output++;
                    lastIndexCan = true;
                    continue;
                }
            }

            lastIndexCan = false;
        }
        return output >= n;
    }
}