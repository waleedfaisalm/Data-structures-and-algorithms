/**
 * Created by SCC on 2/4/2021.
 */
public class pr2 {
    static int[] a = {10,20,30,40,50,60,70,80,90};
    int[] b=new int[a.length];
    public void print (){
        System.out.println("Before");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + "  ");
        System.out.println();

    }
    public void Copy(){
        System.out.println("After");
        for(int i=0;i<a.length;i++) {
            b[i]=a[i];
            System.out.print(b[i] + "  ");
        }
    }

    public static void main(String[] args) {
        pr2 p=new pr2();
        p.print();
        p.Copy();
    }

}





