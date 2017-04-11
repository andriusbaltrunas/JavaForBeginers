package paskaita6;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by andriusbaltrunas on 4/11/2017.
 */
public class ListExample {

    public static void main(String... args) {
        // sukursime List kolekcija
        List<String> names = new ArrayList<>();

        // idejimas i list

        names.add("Petras");
        names.add("Jonas");

        System.out.println(names.get(0));
        // nuo 8 javos
        //names.stream().forEach(System.out::println);

        for (String name : names){
            System.out.println(name);
        }


    }
}
