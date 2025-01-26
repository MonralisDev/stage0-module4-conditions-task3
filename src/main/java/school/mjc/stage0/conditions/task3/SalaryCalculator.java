package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
            return;
        }

        double tax = 0;

        if (salary <= 10000) {
            tax = salary * 0.15; // Податок 15%
        } else if (salary > 10000 && salary <= 20000) {
            tax = salary * 0.18; // Податок 18%
        } else if (salary > 20000) {
            tax = salary * 0.20; // Податок 20%
        }

        int salaryAfterTax = (int) (salary - tax);

        System.out.println(salaryAfterTax);
    }
}