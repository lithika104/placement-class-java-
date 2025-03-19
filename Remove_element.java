public class Remove_element {

    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        System.out.println("Removing elements...");


        Remove_element obj = new Remove_element();


        int[] nums = {3, 2, 2, 3};
        int val = 3;


        int k = obj.removeElement(nums, val);


        System.out.println("Remaining elements count: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}