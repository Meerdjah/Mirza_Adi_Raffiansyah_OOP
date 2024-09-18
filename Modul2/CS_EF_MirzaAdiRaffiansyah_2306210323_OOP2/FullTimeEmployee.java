
public class FullTimeEmployee extends Employee
{
    private double baseBonus;
    private double performanceRating;
    private double baseSalary;

    /**
     * Constructor for objects of class FullTimeEmployee
     */
    public FullTimeEmployee(
    String name,
    int id,
    Position position,
    Division division,
    double baseSalary,
    double baseBonus,
    double performanceRating
    )
    {
        super(name, id, position, division);
        this.baseSalary = baseSalary;
        this.baseBonus = baseBonus;
        this.performanceRating = performanceRating;
    }

    public void displayInfo()
    {
        System.out.println("Nama: " + getName());
        System.out.println("Id: " + getId());
        System.out.println("Divisi: " + division);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Base Bonus: " + baseBonus);
        System.out.println("Total Salary: " + totalSalary());        
    }
    
    public double bonusSalary()
    {
        if (performanceRating < 0.2)
        {
            return 0;
        }
        else
        {
            return baseSalary * performanceRating;
        }
    }
    
    @Override
    public double totalSalary()
    {
        return baseSalary + bonusSalary();
    }
}
