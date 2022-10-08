import java.util.*;

public class Vir{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
    scn.close();   
 }

 public static int getProduct(int b, int n1, int n2){
        int ans=0;
        int pow=1;
        while(n2 !=0){
            int d2=n2%10;
            n2=n2/10;
            int ans1=getsingle(b,n1,d2);
            ans=getsum(b,ans1*pow,ans);
            pow*=10;
            
        }
        return ans;
 }
 public static int getsingle(int b,int n,int d){
    int pow=1;
    int ans=0;
    int carry=0;
    while(n!=0 || carry !=0){
        int d1=n%10;
        n=n/10;
        int mul=d1*d+carry;
        ans+=(mul%b)*pow;
        carry=mul/b;
        pow*=10;
    }
    return ans;
 }
  public static int getsum(int b, int n1, int n2){
       int ans=0;
       int carry=0;
       int pow=1;
        while(n1 !=0 || carry !=0 || n2 !=0){
            int d2=n2%10;
            int d1=n1%10;
            n1=n1/10;
            if(n2!=0){
                
            n2=n2/10;
            }
            int sum=d2+d1+carry;
            carry=sum/b;
            int res=sum%b;
            ans+=res*pow;
            pow*=10;
        }
        return ans;
   }
 

}
