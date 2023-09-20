public class A_BC_DEF_pattern {
    public static void main(String[] args){
        char a='A';
        int num=0;
        System.out.println((char)num);
        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(a+num));
                num++;
            }
            
            System.out.println();
        }
    }
}
