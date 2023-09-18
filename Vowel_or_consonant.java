import java.util.Scanner;

public class Vowel_or_consonant {
    public static void main(String[]args){
        String name= new Scanner(System.in).nextLine();
        char ch[]=new char[name.length()]; //if () these brackets are not given then error will be shown length cannot be resolved or is not a field
        for(int i=0; i<name.length();i++){
            ch[i]=name.charAt(i);

        }
        System.out.println(ch[0]);
        if(ch[0]=='a'|| ch[0]=='e'|| ch[0]=='i'|| ch[0]=='o'|| ch[0]=='u'){
           System.out.println("It is a vowel"); 
        }
        else{System.out.println("It is a consonant");}

        char ch1[]=name.toCharArray();
        if(ch[0]=='a'|| ch[0]=='e'|| ch[0]=='i'|| ch[0]=='o'|| ch[0]=='u'){
           System.out.println("It is a vowel"); 
        }
        else{System.out.println("It is a consonant");}
    }
}
