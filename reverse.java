import java.util.*;

public class reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.nextLine());


        String rev_str = "";

        for(int i=0;i<sb.length()/2;i++){

            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length()-i-1));
            sb.setCharAt((sb.length()-i-1), temp);
        }

        System.out.print(sb);




        
    }
    
}
