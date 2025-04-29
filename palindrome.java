import java.util.*;
class palindrome{
    public static void cheak(int a,int rev){
        if(a==rev){
            System.out.print("number is pallindrom :");
        }else{
            System.out.print("number is not a pallindrom :");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter th number : ");
        int n=sc.nextInt();
        int r,rev=0,a=n;
        while(n>0){
            r=n%10;
            rev=rev*10 + r;
            n=n/10; 
        }
        cheak(a,rev);
    }
}