package practice.employeWage;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation Program");
        EmpWageBuilderUC1 employee = new EmpWageBuilderUC1();
       // employee.empCheck();
        EmpWageBuilderUC2 employee1 = new EmpWageBuilderUC2();
        System.out.println(employee1.empWage());
    }
}
