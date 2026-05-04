import java.util.Arrays;

class SortArray {
    public static void main(String[] args) {
        int arr[] = {5, 2, 8, 1, 3};

        Arrays.sort(arr);

        System.out.println("Array in ascending order:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
class CharArrayToString {
    public static void main(String[] args) {
        char ch[] = {'J', 'a', 'v', 'a'};

        String str = new String(ch);

        System.out.println("String is: " + str);
    }
}