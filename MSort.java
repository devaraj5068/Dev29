import java.util.Arrays;

public class MSort {
    static void s(int[] a) {
        if (a.length < 2) return;
        int m = a.length / 2;
        int[] l = Arrays.copyOfRange(a, 0, m), r = Arrays.copyOfRange(a, m, a.length);
        s(l); s(r); mrg(a, l, r);
    }

    static void mrg(int[] a, int[] l, int[] r) {
        int i = 0, j = 0, k = 0;
        while (i < l.length && j < r.length) a[k++] = l[i] < r[j] ? l[i++] : r[j++];
        while (i < l.length) a[k++] = l[i++];
        while (j < r.length) a[k++] = r[j++];
    }

    public static void main(String[] args) {
        int[] a = {6, 3, 8, 5, 2};
        s(a);
        System.out.println(Arrays.toString(a));
    }
}
