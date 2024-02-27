public class Part1 {
    int[] x = {1, 3, 4, 7, 5};
    int[] y = {6, 2, 5, 1, 3};
    int[] z = new int[5];

    public Part1() {
        for (int i=0; i<5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }
    }

    public static void printArray(int[] a, String n) {
        System.out.print("Array " + n + " = {");
        for (int i= 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println("}");
    }
}
