package day12_NestedIf;

public class AgeGroups2 {

    public static void main(String[] args) {
        int age = 99;
        String ageGroups = "";

        if(age>=1 && age<=2){
            ageGroups = "infant";
        }else if(age>=3 && age<=5){
            ageGroups = "Toddler";
        }else if(age>=6 && age<=9){
            ageGroups = "kid";
        }else if(age>=10 && age<=12){
            ageGroups ="Pre-Teen";
        }else if(age>=13 && age <=17){
            ageGroups = "Teenager";
        }else if(age>=18 && age<=20){
            ageGroups = "Young";
        }else if(age>=21 && age<=39){
            ageGroups="Adult";
        }else if (age>=40 && age<=49){
            ageGroups = "Young Middle-Aged Adult";
        }else if(age>=50 && age<=54){
            ageGroups = "Middle-Aged Adult";
        }else if(age>=55 && age<=64){
            ageGroups = "Very Young Senior Citizen";
        }else if(age>=65 && age<=74){
            ageGroups = "Young Senior Citizen";
        }else if(age>=75 && age<=84){
            ageGroups = "Senior Citizen";
        }else{
            ageGroups = "Old Senior Citizen";
        }

        System.out.println(ageGroups);
        System.out.println("============TERNARY============");

        String ageGroups2 = (age>=1 && age<=2)?ageGroups = "infant"
                :(age>=3 && age<=5)?"Toddler":(age>=6 && age<=9)?"kid"
                :(age>=10 && age<=12)?"Pre-Teen":(age>=13 && age <=17)?"Teenager"
                :(age>=18 && age<=20)?"Young":(age>=21 && age<=39)?"Adult"
                :(age>=40 && age<=49)?"Young Middle-Aged Adult":(age>=50 && age<=54)
                ?"Middle-Aged Adult":(age>=55 && age<=64)?"Very Young Senior Citizen"
                :(age>=65 && age<=74)?"Young Senior Citizen":(age>=75 && age<=84)
                ?"Senior Citizen":"Old Senior Citizen";
        System.out.println(ageGroups2);


    }
}
