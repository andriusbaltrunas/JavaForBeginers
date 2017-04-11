package paskaita6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andriusbaltrunas on 4/11/2017.
 */

//1.1.  Sukurti nauj? ArrayList kolekcij?,
// prid?ti 5 vartotoj? vardus ir juos atspausdinti,
// jei vardo ilgis ilgesnis nei 6 simboliai.
// Rezultatus spausdinti ekrane naudojant for cikl?.

//Naudojant sukurt? kolekcij? parašyti du metodus.
// Pirmas gr?ina pirm? list`o element?, o antras metodas paskutin?.
// Rezultatus spausdinti ekrane.

public class JurateUzdavinys1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Andrius");
        names.add("Onute");
        names.add("Jonas");
        names.add("Petriukas");
        names.add("Maryte");
        System.out.println("pirmas elementas yra "+pirmas(names));
        System.out.println("antras elementas yra "+antras(names));
        for (String name : names) {
            if (name.length()> 6) {


                System.out.println(name);
            }
        }

    }

    private static String pirmas(List<String> petras) {
        return petras.get(0);

    }
    private static String antras (List<String> vardas) {
        return vardas.get(vardas.size()-1);
    }
}
