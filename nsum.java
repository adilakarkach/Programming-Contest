import java.util.Scanner;
public class nsum {
    
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
       
    int[] a= new int[10];
    int n = input.nextInt();
    int zwischen =0;
    
    for(int i = 0; i<n; i++){

        a[i] = input.nextInt();
        zwischen += a[i];
    }   
    
     
    
    System.out.println(zwischen);   
}
}