package java_sol;

public class TwoSum {
    public static void main(String[] args) {
        int[] input = {2,5,1,8,6};
        int target = 13;
        int[] res = twoSum(input,target);
        System.out.println("Index " + res[0] + " and " + res[1]);
    }

    public static int[] twoSum(int[] input, int target) {
        for (int i = 0; i < input.length-1; i++) {
            for (int j = 1; j < input.length; j++) {
                if (input[i] + input[j] == target) return new int[]{i,j};
            }
        }
        return new int[]{0,0};
    }
}
