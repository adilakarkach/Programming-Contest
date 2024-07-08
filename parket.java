import java.util.Scanner;

public class parket {

    public static int grossterFaktor(int x, int y, int z){
        int faktor = 0;
    
        for(int i = x/2; i >=2; i--){
            if(x%i == 0){
                if((i-2)*((x/i)-2) == y){
                   // System.out.println(i);   
                    faktor=i;
                    break;
                }
             
            }

        }

        return faktor;
    }        
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();


        int z = x+y;

        int erg1 = grossterFaktor(z,y,x);
        
       

        System.out.println(erg1 + " " + z/erg1);  





    }

    
}
