import java.util.Scanner;
public class q3 {
    static int n,temp,res=0,rem;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        temp=n;
        while (temp!=0) {
            rem=temp%10;
            res=res+(rem*rem*rem);
            temp=temp/10;
        }
        if(n==res){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
