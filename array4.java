import java.util.*;
public class array3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
         int[][]number = new int[rows][columns];
         //input
         //rows
         for(int i = 0;i<rows;i++){
            //columns
            for(int j = 0;j<columns;j++){
                number[i][j] = sc.nextInt();
                
            }
         }
         int x = sc.nextInt();

         for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                //compare with x;
                if(number[i][j]==x){
                    System.out.println();
                }
            }
         }
         
    }
    
}
