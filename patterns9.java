import java.util.*;
public class patterns9 {
    public static void main(String[] args) {
        int n = 5;
        //upperhalf-upprhalf
        (int i=1;i<=n;i++){
            //1st partfor
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //space
        int space=2*(n-1);
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        //2nd part
        for(int j=1;j<=i;j++){
            System.out.println("*");
         }
         System.out.println();
         }
        //lower half
          (int i=n;i>=1;i--){
            //1st partfor
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //space
        int space=2*(n-1);
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        //2nd part
        for(int j=1;j<=i;j++){
            System.out.println("*");
         }
         System.out.println();
        }

    }
}
