/**
 * ITE6104 - Lab 9
 * Abdulsalam Alaraj
 * AMA Computer University
 */

public class Lab9ExceptionTest {
    public static void main(String[] args) {
        try {
            String[] nums = {"one", "two", "three"};
            for (int i = 0; i <= 3; i++) {
                System.out.println(nums[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array Index 3 is out of bounds");
        }
    }
}
