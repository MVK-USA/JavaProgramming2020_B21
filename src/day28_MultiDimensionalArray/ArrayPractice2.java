package day28_MultiDimensionalArray;

public class ArrayPractice2 {

    public static void main(String[] args) {

        String[] employeesName = {"Asel", "Afrooz", "Safa", "Suveyda", "Rinat" };
        //        index numbers:     0        1         2        3        4
        int[] employeeSalary = {100000, 110000, 105000, 120000, 125000};
        // index numbers:         0        1       2       3       4

        int max = employeeSalary[0];
        String nameOfMax = "";
        int min = employeeSalary[0];
        String nameOfMin = "";

        for(int i =0; i<= employeesName.length-1; i++){  // i: 0, 1, 2, 3, 4
            System.out.println(employeesName[i] +" : $"+employeeSalary[i]);

            if(employeeSalary[i]> max){
                max=employeeSalary[i];
                nameOfMax = employeesName[i];
            }
            if(employeeSalary[i]<min){
                min = employeeSalary[i];
                nameOfMin = employeesName[i];
            }
        }
        System.out.println(nameOfMax+" has the maximum salary: $" + max);
        System.out.println(nameOfMin+" has the minimum salary: $" + min);

        /*
        John: $100000

         Who has the minimum salary?
         Who has the maximum salary?
         */
    }
}
