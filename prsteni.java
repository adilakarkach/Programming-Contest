import java.util.Scanner;

public class prsteni {

    public static int GGT(int firstWheel, int wheel) {

        int counter = 1;

        while (wheel != 0) {
            if (firstWheel > wheel) {
                firstWheel = firstWheel - wheel;

            } else {
                wheel = wheel - firstWheel;
            }
            counter++;
        }

        return firstWheel;
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int numberWheels = input.nextInt();

        int wheels[] = new int[numberWheels];

        int teiler[] = new int[numberWheels];

        for (int i = 0; i < numberWheels; i++) {

            wheels[i] = input.nextInt();

            teiler[i] = GGT(wheels[0], wheels[i]);



        }

        for(int i  = 1; i < numberWheels; i++){

            System.out.println( wheels[0]/ teiler[i] + "/" + wheels[i]/teiler[i]);
        }


    }

}
