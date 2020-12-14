package HomeWork.Repl_It;

public class Replit115ArraysFindMax {

    public static void main(String[] args) {

        int[] nums = {5, 16, -8, 0, 25};
        int max = nums[0];

        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("max = " + max);
    }
}
