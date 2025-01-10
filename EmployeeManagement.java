abstract class Employee{
    private String name;
    private int eid;
    
    abstract double calcSalary();

    public Employee(String name, int eid){
        this.name = name;
        this.eid = eid;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getEid(){
        return this.eid;
    }
    public void setEid(int eid){
        this.eid = eid;
    }
    
    public void display(){
        System.out.println("\tEmployee Name : "+this.name);
        System.out.println("\tEmployee ID : "+this.eid);
    }
}

class FullTimeEmp extends Employee{
    
    double anualSalary;

    public FullTimeEmp(String name, int eid,double anualSalary) {
        super(name, eid);
        this.anualSalary=anualSalary;
    }

    @Override
    double calcSalary() {
        return anualSalary/12;
    }
}


class PartTimeEmp extends Employee{
    double hourlyRate = 120;
    int hoursWorked ;

    public PartTimeEmp(String name, int eid, int hoursWorked) {
        super(name, eid);
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calcSalary() {
        return hourlyRate * hoursWorked;
    }
}

class SalaryCalculator{
    public static double calcBonus(Employee emp , double bonusPercent){
        return (emp.calcSalary() * bonusPercent)/100;
    }

    public static double calcBonus( double FixedBonus){
        return FixedBonus;
    }
}


public class EmployeeManagement {
    public static void main(String[] args) {
        FullTimeEmp fullTimeEmp_1 = new FullTimeEmp("Prince",1099,10_00_000);
        FullTimeEmp fullTimeEmp_2= new FullTimeEmp("Anuj", 1111,500_000);
        PartTimeEmp partTimeEmp_1 = new PartTimeEmp("Mahavir",1088,24);

        System.out.println("Salary of Full Time Employee : "+fullTimeEmp_1.calcSalary());
        System.out.println("Salary of Part Time Employee : "+partTimeEmp_1.calcSalary());

        System.out.println("\nFullTime Employee details : ");
        fullTimeEmp_1.display();
        System.out.println("\tSalary : "+fullTimeEmp_1.calcSalary());
        System.out.println("\tBonus : "+SalaryCalculator.calcBonus(fullTimeEmp_1,20));

        System.out.println("\nFullTime Employee details : ");
        fullTimeEmp_2.display();
        System.out.println("\tSalary : "+fullTimeEmp_2.calcSalary());
        System.out.println("\tBonus : "+SalaryCalculator.calcBonus(fullTimeEmp_2,10));

        System.out.println("\nPartTime Employee details : ");
        partTimeEmp_1.display();
        System.out.println("\tSalary : "+partTimeEmp_1.calcSalary());
        SalaryCalculator.calcBonus(5000);
    }
}
