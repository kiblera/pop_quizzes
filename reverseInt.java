package part_05;

public class reverseInt {

    public static void main(String[] strings) {

        int nums[] = {8, 58, 19, 5, 29, 10, 28, 73, 83, 1};

        for (int i = 0; i < nums.length / 2; i++) {
            int t = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = t;
        }
        for (int t = 0; t <= nums.length - 1; t++) {
            System.out.println(nums[t]);
        }
    }
}