public class BFS {
    public static int search(int[] arr, int t) {
        for (int i = 0; i < arr.length; i++) if (arr[i] == t) return i;
        return -1;
    }
    public static void main(String[] a) {
        System.out.println(search(new int[]{4, 2, 7, 1, 3},3));
    }
}
