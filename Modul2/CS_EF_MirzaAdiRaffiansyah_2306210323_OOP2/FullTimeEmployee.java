
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
        
    }
    
    public double bonusSalary()
    {
        return 0;
    }
    
    public double totalSalary()
    {
        return 0;
    }
}
