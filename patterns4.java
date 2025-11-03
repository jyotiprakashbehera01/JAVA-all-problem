public class patterns4 {
    public static void main(String[] args) {
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        }
    }System.out.println();
}
