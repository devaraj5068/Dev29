public class BSearch {
    static int s(int[] a, int t, int l, int h) {
        if (l > h) return -1;
        int m = (l + h) / 2;
        return a[m] == t ? m : a[m] < t ? s(a, t, m + 1, h) : s(a, t, l, m - 1);
    }
    public static void main(String[] args) {
        System.out.println(s(new int[]{1, 3, 5, 7, 9}, 5, 0, 4));
    }
}
