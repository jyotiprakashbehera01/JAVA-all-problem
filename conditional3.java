import java.util.Scanner;

public class conditional3 {
    public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int button = sc.nextInt();
            if (button == 1){
                    System.out.println("HELLO");
            }else if (button == 2) {
                System.out.println("NAMASTE");
            }else if (button == 3){
                System.out.println("bonjor");
            }else{
                System.out.println("invalide Button");
            }
    }
}
