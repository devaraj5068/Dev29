public class SelectionSort{
    public static void sorting(int [] a){
        int n = a.length;
        for (int i=0; i<n-1; i++){
            int m=i;
        for(int j= i+1; j<n; j++ ) if (a[j]< a[m])m=j;
        int t= a[i];
        a[i]=a[m];
        a[m]=t;
        }
    }
    public static void printArray(int [] a){
        for (int n:a)  System.out.print(n+" ");
        System.out.println();
    }
    public static void main (String [] args){
        int [] a= { 34, 65, 12, 87, 37,59};
        System.out.println("Before Sorting");
        printArray(a);
        sorting(a);
        System.out.println("After Sorting");
        printArray(a);
    }
}