public class App {
    public static void main(String[] args) throws Exception {
        int[] numList = {5, 15, 3, 8, 9, 1, 20, 7};
        // Printing the original list 
        for (int i = 0; i < numList.length; i++) {
            System.out.println(numList[i]);
        }

        // Overwriting the list 
        numList = sort(numList);
        System.out.println("\nThe sorted version is: ");

        // Printing the new result
        for (int i = 0; i < numList.length; i++) {
            System.out.println(numList[i]);
        }

    }

    public static int[] sort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {

                if (nums[j] > nums[j + 1]) {

                }
            }
        }

        return nums;

    }
}
