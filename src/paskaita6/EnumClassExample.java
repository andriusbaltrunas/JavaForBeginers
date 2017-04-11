package paskaita6;

/**
 * Created by andriusbaltrunas on 4/11/2017.
 */
public class EnumClassExample {

    public static void main(String[] args) {
        System.out.println(Country.EE);
        System.out.println(Country.LT.getId());
        System.out.println(Country.LV.getLang());
    }
}

enum Country{
    LT(1, "lt"), LV(2, "lv"), EE(3, "ee");
    private int id;
    private String lang;
    Country(int id, String lang) {
        this.id = id;
        this.lang = lang;
    }

    public int getId() {
        return id;
    }

    public String getLang() {
        return lang;
    }
}
