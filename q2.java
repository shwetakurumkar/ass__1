// import java.util.Scanner;
// public class q2 {
//     public static void main(String[] args) {
//         String inputstr;
//         Scanner sc = new Scanner(System.in);
//         inputstr=sc.nextLine();
//         int count=0;
//         for(int i=0;i<=inputstr.length();i++){
//             char ch=inputstr.charAt(i);
//             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                 count++;
//             }
//         }
//         System.out.println("number of vowels: "+count);
//     }
// }
public class q2 {
    public static void main(String[] args) {
        String str= "education";
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'
            ||str.charAt(i)=='o'||str.charAt(i)=='u'){
                c++;
            }
        }
        System.out.println("Total number of vowels "+c);
    }
}