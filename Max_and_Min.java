
import java.util.*;

public class Max_and_Min {
    public static void main(String[]args){
        int a=new Scanner(System.in).nextInt();
        System.out.println(a);
        int ch[]= new int[a];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<a;i++){
            ch[i]=new Scanner(System.in).nextInt();

        }
        Arrays.sort(ch);
        System.out.println("Min:"+ch[1]);
        System.out.println("Max:"+ch[a-1]);

    }
}
