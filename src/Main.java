import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,y;
        int a,b,c,d,e;
        x=in.nextInt();
        y=in.nextInt();
        System.out.printf("%d+%d=%d\n",x,y,x+y);
        System.out.printf("%d*%d=%d\n",x,y,x*y);
        System.out.printf("%d-%d=%d\n",x,y,x-y);
        System.out.printf("%d/%d=%d...%d\n",x,y,x/y,x%y);
        in.close();

    }
}
