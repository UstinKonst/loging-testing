public class Arr {
    public static boolean arr2(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 4) {
                return true;
            }
        }
        return false;
    }

}