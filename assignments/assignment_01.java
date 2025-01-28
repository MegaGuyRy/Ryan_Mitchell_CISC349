package assignments;

// Base class 
class Employee {
    private String fullName;
    private String jobTitle;
    private String ssn;

    // Constructor
    public Employee(String fullName, String jobTitle, String ssn) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.ssn = ssn;
    }

    public void displayDetails() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("SSN: " + ssn);
    }
}
// Full-time salaried employee class
class SalariedFullTimeEmployee extends Employee {
    private double annualSalary;

    public SalariedFullTimeEmployee(String fullName, String jobTitle, String ssn, double annualSalary) {
        super(fullName, jobTitle, ssn);
        this.annualSalary = annualSalary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Annual Salary: $" + annualSalary);
        System.out.println("Work Hours/Week: 45");
    }
}

// part-time salaried employee class
class SalariedPartTimeEmployee extends Employee {
    private double annualSalary;
    private int weeklyHours;

    public SalariedPartTimeEmployee(String fullName, String jobTitle, String ssn, double annualSalary, int weeklyHours) {
        super(fullName, jobTitle, ssn);
        this.annualSalary = annualSalary;
        this.weeklyHours = weeklyHours;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Annual Salary: $" + annualSalary);
        System.out.println("Work Hours/Week: " + weeklyHours);
    }
}

// Contractor class
class Contractor extends Employee {
    private double hourlyRate;

    public Contractor(String fullName, String jobTitle, String ssn, double hourlyRate) {
        super(fullName, jobTitle, ssn);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hourly Rate: $" + hourlyRate);
    }
}

public class assignment_01 {
    public static void main(String[] args) {
        Employee fullTime = new SalariedFullTimeEmployee("Joe Shmoe", "Software Engineer", "123-45-6789", 60000);
        Employee partTime = new SalariedPartTimeEmployee("JJ Abrums", "Project Manager", "222-22-4321", 30000, 30);
        Employee contractor = new Contractor("KK Jones", "Data Analyst", "111-11-1111", 35);

        fullTime.displayDetails();
        System.out.println();
        partTime.displayDetails();
        System.out.println();
        contractor.displayDetails();
    }
}
