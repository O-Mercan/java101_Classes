import java.sql.SQLOutput;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    int tax(){
        int tax;
        if (this.salary < 1000) {
            return tax = 0;
        }
        else{
            return tax = this.salary * 3/100;
        }
    }
    int raiseSalary(){
        int newSalary ;
        if(2021 - this.hireYear < 10){
            return newSalary = this.salary * 5/100;
        }
        if(2021 - this.hireYear > 10 && 2021 - this.hireYear <20){
            return newSalary = this.salary * 10/100;

        }
        if (2021 - this.hireYear >= 20){
            return newSalary = this.salary * 15/100;
        }
        else{
            return newSalary = 0;
        }
    }
    int bonus(){
        if(this.workHours >40){
            return (this.workHours - 40) * 30;
        }
        else{
            return 0;
        }
    }

    public String toString(){
        System.out.println("Adı : " + this.name
        + "\nÇalışma saati : " + this.workHours
        + "\nBaşlangıç yılı : " + this.hireYear
        + "\nVergi : " + tax()
        + "\nBonus : " + bonus()
        + "\nMaaş Artışı : " + raiseSalary()
        + "\nVerig ve Bonuslar ile birlikte maas: " + (this.salary - tax() + bonus())
        + "\nToplam Maaş : " + (this.salary - tax() + bonus() + raiseSalary()));
        return null;
    }
}
