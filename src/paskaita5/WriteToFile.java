package paskaita5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by andriusbaltrunas on 4/10/2017.
 */
public class WriteToFile {
    public static void main(String[] args) {

        try {
            // true FileWriter`i nurodo, kad failas bus papildomas irasomu tekstu
            //BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Persons.txt"), true));

            // failo rasymas viska istrynus ir irasant is naujo
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Persons.txt"), true));
            bw.newLine();
            bw.write("Benas");
            bw.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
