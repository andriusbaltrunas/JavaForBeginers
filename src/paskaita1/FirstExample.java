package paskaita1;

import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 4/4/2017.
 */
public class FirstExample {

    public static void main(String[] args) {
        System.out.println("Hi Andrius");
        FirstExampleSupportClass example = new FirstExampleSupportClass();
        example.sayHi();
        int sum = example.sum(10, 20);
        //tiesiog uzkomentavau
        //System.out.println(example.sum(10, 20));
        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Please insert a number");
        int insertedNumb = scanner.nextInt();
        System.out.println("Inserted number >> " + insertedNumb);*/


        example.userName(scanner);
    }
}

class FirstExampleSupportClass{

    public void userName(Scanner sc){
        System.out.println("Please insert your name :)");
        String name = sc.nextLine();
        System.out.println("Hi " + name);

    }

    public void sayHi(){
        System.out.println("Labas");
    }

    public int sum(int firstNumb, int secondNumb){
        return firstNumb + secondNumb;
    }

    public int sum(int firstNumb, int secondNumb , int secondNumb1){
        return firstNumb + secondNumb;
    }

    public float sum(float firstNumb, float secondNumb){
        double aa= 2.4;
        double ab = 2.4;
        return firstNumb + secondNumb;
    }

}
