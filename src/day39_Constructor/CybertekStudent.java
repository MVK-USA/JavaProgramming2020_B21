package day39_Constructor;

public class CybertekStudent {

    public String name, gender;
    public int age;

    public static String schoolName, dreamJob;
    public static boolean hasReplit, hasFlipGrid;

    static {
        schoolName = "Cebertek School";
        dreamJob = "SDET";
        hasReplit = true;
        hasFlipGrid = true;
    }

    public void setInfo(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public String toString() {
        return "CybertekStudent{ " +
                "name=' " + name + '\'' +
                ", gender=' " + gender + '\'' +
                ", age= " + age +
                ", School name= "+schoolName+
                '}';
    }
}
