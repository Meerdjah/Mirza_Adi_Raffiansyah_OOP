
public class Intern extends Employee
{
    private double hourlyRate;
    private int hoursWorked;

    public Intern(
    String name, 
    int id, 
    Position position, 
    Division division, 
    double hourlyRate, 
    int hoursWorked
    )
    {
        super(name, id, position, division);
        this.hourlyRate = hourlyRate;
        this.hoursWorked  = hoursWorked;
    }

    @Override
    public double totalSalary()
    {
        double salary = hourlyRate * hoursWorked;
        int monthlyWorked = hoursWorked * 20;
        
        if (monthlyWorked < 20)
        {
            return 0;
        }
        else if (monthlyWorked > 20 && monthlyWorked < 88)
        {
            return salary;
        }
        else
        {
            return salary * 110/100;
        }
    }
    
    public void displayInfo()
    {
        System.out.println("Nama: " + getName());
        System.out.println("Id: " + getId());
        System.out.println("Divisi: " + division);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + totalSalary());
    }
}
