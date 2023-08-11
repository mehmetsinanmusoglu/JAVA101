public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public double tax(int salary) {

        if (salary < 1000) {
            return 0;
        } else {
            return (salary * 0.03);
        }
    }

    public double bonus(int workHours) {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary(int hireYear) {
        int a = 2021 - hireYear;
        if (a < 10) {
            return (salary * 0.05);
        } else if (a < 20) {
            return (salary * 0.1);
        } else {
            return (salary * 0.15);
        }

    }

    @Override
    public String toString() {
        return "-------------------------" + '\n' +
                "İsim = '" + name + '\n' +
                "Maaş = " + salary + '\n' +
                "Çalışma Saati = " + workHours + '\n' +
                "Başlangıç Yılı = " + hireYear + '\n' +
                "Vergi = " + tax(this.salary) + '\n' +
                "Bonus = " + bonus(this.workHours) + '\n' +
                "Maaş Artışı = " + raiseSalary(this.hireYear) + '\n' +
                "Vergi ve Bonuslar ile birlikte maaş = " + (salary + bonus(this.workHours) - tax(this.salary)) + '\n' +
                "Toplam Maaş = " + (salary + raiseSalary(this.hireYear)) + '\n' +
                "--------------------------";
    }
}
