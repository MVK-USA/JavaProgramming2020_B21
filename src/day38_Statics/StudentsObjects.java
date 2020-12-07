package day38_Statics;

public class StudentsObjects {

    public static void main(String[] args) {
         CybertekStudent student1 = new CybertekStudent();

         CybertekStudent student2 = new CybertekStudent();

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        System.out.println(CybertekStudent.schoolName); // prefered
    }
}
