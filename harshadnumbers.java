import java.util.Scanner;
public class harshadnumbers {


    public static int harsh(int n){
        int[] digits = new int[10];
        int counter = 0;
        int sum =0;
        while(n > 0){
            digits[counter] = n % 10;
            n = n / 10;
            sum += digits[counter]; 
            counter++;
           
    
        }   
        

    return sum;
    } 
    
    public static void main(String[] args) {

    


    Scanner input = new Scanner(System.in);    
       
    
    int n = input.nextInt();
   
 
    int sum = harsh(n);   
 
    if(n % sum == 0){
        System.out.println(n);
    }
    else{
    while(n % sum != 0){
        sum = harsh(++n);
        
    };

    System.out.println(n);
    }
   
   
    input.close();
     
 
}
}
