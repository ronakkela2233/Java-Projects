import java.util.Scanner;
public class Number_reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");
        int num=sc.nextInt();
        String num_1=String.valueOf(num);
        double b=0,a=0;
        
        for(int i=num_1.length();i>0;i--){
            a=num%10;
            b=b + (a*(Math.pow(10,i)));
            num=num/10;
            
        }
        System.out.println("The reverse is: "+(int)b/10);
    }
    
}
