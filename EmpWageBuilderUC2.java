package practice.employeWage;

public class EmpWageBuilderUC2 {
    double check_pre= Math.floor(Math.random() * 10)%2;
    int is_full_time=1;
    int emp_rate_per_hour=20;
    int empHrs=0;
    int empWage=0;
    int  empWage() {
        if (check_pre == is_full_time) {
            System.out.println("Employee is present");
            empHrs=8;
        }
        else {
            System.out.println("Employee is Absent");
            empHrs=0;
        }
        empWage=empHrs*emp_rate_per_hour;
        return empWage;
    }
}
