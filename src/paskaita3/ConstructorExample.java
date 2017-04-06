package paskaita3;

/**
 * Created by andriusbaltrunas on 4/6/2017.
 */
public class ConstructorExample {
    private int first;
    private int second;

    // tuscias konstruktorius visos klases turi pagal nutylejima tuscia konstruktoriu
    public ConstructorExample(){
        System.out.println("Tuscias konstrukstorius");
    }

    // konstruroriui perduodama reiksme vienas skacius
    public ConstructorExample(int id){
        System.out.println("2 konstruktorius su reiksme >> " + id);
    }

    public ConstructorExample(int a, int b) {
        this.first = a;
        this.second = b;
    }

    public void sum(){
        System.out.println("Suma >> " +(first + second));
    }
}


class MyMainApp{
    public static void main(String[] args) {
        ConstructorExample example = new ConstructorExample();
        ConstructorExample example1 = new ConstructorExample(123);
        ConstructorExample example2 = new ConstructorExample(12, 12);
        example2.sum();
    }
}
