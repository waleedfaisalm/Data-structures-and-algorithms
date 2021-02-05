/**
 * Created by SCC on 2/4/2021.
 */
public class pr4 {
    public static void main(String[] args) {
        double a[] = new double[5];
        System.out.println("Before");
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.println("After");
        for (int i = 0; i <a.length ; i++) {
            double random=Math.random();
            a[i]=random;
            System.out.println(a[i]);
        }

    }
}
