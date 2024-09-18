import java.util.ArrayList;
import java.util.List;

public class Manager extends Person
{
    // instance variables - replace the example below with your own
    private List<Employee> employees;

    /**
     * Constructor for objects of class Manager
     */
    public Manager(String name, int id)
    {
        super(name, id);
        employees = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }
    
    public void assignTask(Employee employee, String task)
    {
        employee.receiveTask(task);
    }
    
    public void displayInfo()
    {
        System.out.println("Nama: " + getName());
        System.out.println("Id: " + getId());
        System.out.println("Employees Managed:");
         
        for (Employee employee : employees)
        {
            System.out.println("- " + employee.getName());
        }
    }
}
