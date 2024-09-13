import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter string:");
            String str=sc.nextLine();
            for(int i=0;i<str.length();i+=2){
                System.out.println(""+str.charAt(i));
            }
        }catch(Exception e){}
    }
}
