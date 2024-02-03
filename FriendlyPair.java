
import java.util.*;
public class FriendlyPair{
    static int getSum(int num){
    int sum = 0;
    for(int i=1;i<=num;i++){
        if(num % i == 0){
            sum = sum + i;
        }
    }
    
    return sum;
    }
    
    public static void main(String[] args){
        //FriendlyNo obj = new FriendlyNo();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int A = getSum(num1) / num1;
        int B = getSum(num2) / num2;


        if(A == B){
        System.out.println("The numbers " + num1  + " and " + num2 + " are friendly pair");
         }else{
        System.out.println("The numbers are not friendly Pair");
          }
        }

    }
