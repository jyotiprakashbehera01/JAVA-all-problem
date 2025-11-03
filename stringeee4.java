import java.util.*;
public class stringeee4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("jyoti");
        System.out.println(sb);

        //charecter at index
      //  System.out.println(sb.charAt(0));

        //set char at index 0
      //  sb.setCharAt(0, 'p');
      //  System.out.println(sb);

      //insert
      sb.insert(2,'y');
      System.out.println(sb);

      //delet the extra  :
      sb.delete(2, 3);
      System.out.println(sb);
    }
}
