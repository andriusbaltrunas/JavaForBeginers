package paskaita6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by andriusbaltrunas on 4/11/2017.
 */

// Sukurti objekto klas?, kuri saugot? informacij? apie Vartotoj?
// (vardas, pavard?, amius, miestas). Parašyti metod?, kuris iš duot? parametr?
// (vardas, pavard?, amius, miestas)
// sukurt? objekt? ir ?d?t? j? kolekcij?.
// Kolekcijos rezultatus atspausdinti ekrane.
public class Uzd13 {
    public static void main(String[] args){
        List<Person> persons = new ArrayList<>();

        Uzd13 uzd13 = new Uzd13();
        uzd13.createPerson(persons,"Petras","Petraitis", 36, "Kaunas");
        uzd13.createPerson(persons,"Jonas","Petraitis", 33, "Klaipeda");
        uzd13.createPerson(persons,"Petras","Jonaitis", 30, "Vilnius");
        Collections.sort(persons);
        uzd13.spauzd(persons);
    }

    private void spauzd(List<Person> list){
        for (Person p: list ){
          /* System.out.println(p.getVardas() + " " + p.getPavarde() + " " + p.getAmzius() + " "
                    + p.getMiestas());*/
            System.out.println(p); //Spausdina pagal toString metoda
        }


    }

    private void createPerson(List<Person> person, String vardas, String pavarde,
                              int amzius, String miestas){
        Person p = new Person(vardas, pavarde, amzius, miestas);
        /*p.setVardas(vardas);
        p.setPavarde(pavarde);
        p.setAmzius(amzius);
        p.setMiestas(miestas);*/
    person.add(p);
    }


}
class Person implements Comparable<Person>{
    private String vardas;
    private String pavarde;
    private int amzius;
    private String miestas;

    //konstruktorius
    public Person (String vardas, String pav, int age, String town){
       this.vardas = vardas; //naudosim klases lygio kintamaji
        this.pavarde = pav;
        this.amzius=age;
        this.miestas=town;
    }
    @Override
    public String toString() {
        return "Person{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", amzius=" + amzius +
                ", miestas='" + miestas + '\'' +
                '}';
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getAmzius() {
        return amzius;
    }

    public void setAmzius(int amzius) {
        this.amzius = amzius;
    }

    public String getMiestas() {
        return miestas;
    }

    public void setMiestas(String miestas) {
        this.miestas = miestas;
    }

    @Override
    public int compareTo(Person o) {
        return miestas.compareTo(o.getMiestas());
    }
}
