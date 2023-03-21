class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1) {
            if(flowerbed[0] == 0 && n <= 1) {
                return true;
            }
            else if(n <= 0) {
                return true;
            }
            else {
                return false;
            }
        }
        for(int i=0;i<flowerbed.length;i++) {
            if(i == 0 && flowerbed[i] == 0 && flowerbed[i+1] == 0) {
                n--;
                flowerbed[i] = 1;
                continue;
            }
            if(i == flowerbed.length - 1 && flowerbed[i-1] == 0 && flowerbed[i] == 0) {
                n--;
                flowerbed[i] = 1;
                continue;
            }
            if( i > 0 && i < flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                n--;
                flowerbed[i] = 1;
                continue;
            }
        }
        if(n <= 0) {
            return true;
        }
        return false;
    }
}