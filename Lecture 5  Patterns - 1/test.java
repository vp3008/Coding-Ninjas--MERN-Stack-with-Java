import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] input = { 3, 1, 4 };
        int sum5 = 0;
        int sum3 = 0;
        int rest[] = new int[input.length];
        int j = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 5 == 0)
                sum5 += input[i];
            else if (input[i] % 3 == 0)
                sum3 += input[i];
            else {
                rest[j] = input[i];
                j++;
            }
        }
        Arrays.sort(rest);
        System.out.println(Arrays.toString(rest));
        System.out.println(sum3 + " " + sum5);
        j = rest.length - 1;
        while (j >= 0) {
            if (sum3 < sum5) {
                sum3 += rest[j];
                j--;
            } else {
                sum5 += rest[j];
                j--;
            }
        }
        System.out.println(sum3 + " " + sum5);
        System.out.println(sum3 == sum5);
    }
}