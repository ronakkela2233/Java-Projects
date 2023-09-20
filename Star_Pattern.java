import java.util.Scanner;

public class Star_Pattern {
    public static void main(String[] args){
        System.out.print("Enter a Random Integer: ");
        int num= new Scanner(System.in).nextInt();

        // prints left sided pyramid

        // for(int i=0;i<num;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // prints a proper pyramid

        // for(int i=1;i<=num;i++){
        //     for(int j=num-i;j>0;j--){
        //         System.out.print(" ");
        //     }
        //     for(int m=1;m<=i;m++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        

        // prints a left sided pyramid

         for(int i=1;i<=num;i++){
            for(int j=num-i;j>0;j--){
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
