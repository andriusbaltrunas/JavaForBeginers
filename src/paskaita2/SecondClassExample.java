package paskaita2;

/**
 * Created by andriusbaltrunas on 4/5/2017.
 */
public class SecondClassExample {

    public static void main(String[] args) {

        // kaip priskirti reiksme
        // int - nurodome tipa pvz (int, double, String, boolean ir t.t.)
        // x - JSUSU lokalaus kintamojo vardas, nors ir petras!!! visada prasideda mazaja raide
        // 20 - sveikas skaicius prasomas pagal nurodyta tipa!
        int x = 20;
        boolean isYouCanDrink = false;
        String name = "Pertras or Sigis"; // visada reiksme rasoma kabutese
        char a = 'a';

        //System.out.println naudojamas tik tada kai norime atspausdinti reiksme i console!!!! LN nukelia i nauja eilute
        System.out.println("Pertas");
        example2();
        SecondClassExample className = new SecondClassExample();
        className.example2();
        SecondClassExample.example2();
    }

    //metodas nieko negrazina
    public static void example2(){
        // cia metodo turinys kuris atliekamas kai yra iskvieciamas metodas!
    }

    public void exmaple3(){
        example2();
    }


}
