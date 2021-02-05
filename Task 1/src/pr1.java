/**
 * Created by SCC on 2/4/2021.
 */
public class pr1 {
    static int[] a = {1,2,3,4,5,6,7,8,9};
    int[] b = new int[a.length];
    public void print (){
        System.out.println("Before");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + "  ");
        System.out.println();

    }
    public void Switch(){
        System.out.println("After");
        for(int i=a.length-1;i>=0;i--) {
            b[i]=a[i];
            System.out.print(b[i] + "  ");
        }
    }

    public static void main(String[] args) {
        pr1 p=new pr1();
        p.print();
        p.Switch();

    }
}




