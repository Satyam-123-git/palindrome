import java.util.*;
class fabonic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int f1=0,f2=1,f3;
        System.out.print("enter the number :");
        int n=sc.nextInt();
        System.out.print(f1 + " " + f2 + " " );
        for(int i=1;i<n;i++){
            f3=f1+f2;
            System.out.print(f3 + " ");
            f1=f2;
            f2=f3;
        }
    }
}