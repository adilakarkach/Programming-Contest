import java.util.Scanner;
public class howmanydigits {

    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);    
        //log(a*b) == log(a)+log(b)
    double[] arr = new double[1000001];

    
    arr[0] = 1;
    arr[1] = 1;     

    for(int i=1; i<1000001; i++){
       arr[i] = Math.log10(i) + arr[i-1];
    }

    while (input.hasNext()) {
        int n = input.nextInt();
        System.out.println((int) Math.floor(arr[n]));
    }
  
}
}
