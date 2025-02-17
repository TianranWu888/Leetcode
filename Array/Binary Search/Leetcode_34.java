class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                while (nums[left] != target) {
                    left++;
                }
                while (nums[right] != target) {
                    right--;
                }
                return new int[] {left, right};
            }

            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return new int[] {-1, -1};
    }
}