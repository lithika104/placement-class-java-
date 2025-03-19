public class firstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

      
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

     
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
       
     firstMissingPositive obj = new firstMissingPositive();

        int[] nums1 = {3, 4, -1, 1};
        int[] nums2 = {1, 2, 0};
        int[] nums3 = {7, 8, 9, 11, 12};

        System.out.println("First missing positive in {3, 4, -1, 1}: " + obj.firstMissingPositive(nums1));
        System.out.println("First missing positive in {1, 2, 0}: " + obj.firstMissingPositive(nums2));
        System.out.println("First missing positive in {7, 8, 9, 11, 12}: " + obj.firstMissingPositive(nums3));
    }
}