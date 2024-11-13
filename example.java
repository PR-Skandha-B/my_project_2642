import java.util.*;

public class example {
    public static void main(String[] args) {
    int num,fact=1;
    Scanner myobj=new Scanner(System.in);
    System.out.println("Enter the digit: ");
    num=myobj.nextInt();
    for(int i=1;i<=num;i++){
        fact*=i;
    }

    System.out.println("Fact of "+num+"is\t" +fact);
    }
}
