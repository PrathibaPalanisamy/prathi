import java.util.Scanner;    
class Fact
{  
     public static void main(String args[]){  
      int i,fac=1;  
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      for(i=1;i<=num;i++){    
          fac=fac*i;    
      }    
      System.out.println("Factorial of "+num+" is: "+fac);    
     }  
    }  
