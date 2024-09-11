
public class Employee
extends Person
implements CalculateSalary
{
    protected Division division;
    protected Position position;

    public Employee(String name, int id, Position position, Division division)
    {
        super(name, id);
        this.position = position;
        this.division = division;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void receiveTask(String task)
    {
            
    }
    
    public double totalSalary()
    {
        return 0;
    }
}
