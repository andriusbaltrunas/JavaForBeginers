package paskaita3;

import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 4/6/2017.
 */
public class SecondTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = "";

        do{
            System.out.println("Iveskite zodi");
            word = sc.nextLine();
            System.out.println("zodis >> " + word);
        }while (!word.equals("pabaiga"));

        /*while (true) {
            System.out.println("Iveskite zodi");
            String name = sc.nextLine();
            System.out.println("zodis >> " + name);
            if(name.equals("pabaiga")){
                break;
            }
        }*/
    }
}
