class Solution {
    public static int trap(int[] Num) {
        int left = 0, right = Num.length - 1;
        int maxLeft = 0, maxRight = 0;
        int water = 0;

        while (left <= right) {
            if (Num[left] < Num[right]) {
                if (Num[left] >= maxLeft) {
                    maxLeft = Num[left];
                } else {
                    water += maxLeft - Num[left];
                }
                left++;
            } else {
                if (Num[right] >= maxRight) {
                    maxRight = Num[right];
                } else {
                    water += maxRight - Num[right];
                }
                right--;
            }
        }

        return water;
    
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}