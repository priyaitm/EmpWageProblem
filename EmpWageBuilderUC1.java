package practice.employeWage;

public class EmpWageBuilderUC1 {
    double check_pre= Math.floor(Math.random() * 10)%2;
    int is_full_time=1;
    void empCheck() {
        if (check_pre == is_full_time) {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }

}
