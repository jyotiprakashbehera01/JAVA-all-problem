public class patterns6 {
    public static void main(String[] args) {
        int n=5;
        //outer line
        for(int i=1;i<=n;i++){
            //innner lope
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
