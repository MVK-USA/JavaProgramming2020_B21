package day28_MultiDimensionalArray;

public class ArrayPractice4 {

    public static void main(String[] args) {
        String[] employeesName = {"Asel", "Afrooz", "Safa", "Suveyda", "Rinat" };
        //        index numbers:     0        1         2        3        4
        int[] employeeSalary = {100000, 110000, 105000, 120000, 125000};
        // index numbers:         0        1       2       3       4

        int max = employeeSalary[0];
        for(int each: employeeSalary){
            if(each> max){
                max=each;
            }
        } // to find the maximum salary

        System.out.println("Max: "+max);
        for(int i= 0; i<=employeesName.length-1; i++){ // to COMPARE emplyees salary with MAX salary
            if(max == employeeSalary[i]){ // if the employees
                System.out.println(employeesName[i]);
            }
        }
    }
}
