
public class Main
{
    public static void Main(String[] args)
    {
        FullTimeEmployee Harvan = new FullTimeEmployee("Harvan", 2294, Position.Director, Division.Seminar, 1000, 700, 0.6);
        FullTimeEmployee Rafi = new FullTimeEmployee("Rafi", 2938, Position.Staff, Division.Marketing, 500, 100, 0.9);
        
        Intern Karina = new Intern("Karina", 4319, Position.Intern, Division.Design, 2, 7);
        Intern Bernadya = new Intern("Bernadya", 3291, Position.Intern, Division.CreativeMedia, 3, 6);
        
        Manager Hasan = new Manager("Hasan", 1001);
        
        Hasan.assignTask(Harvan, "Find a Speaker for Grand Event");
        Hasan.assignTask(Rafi, "Marketing to Company A");
        
        Hasan.addEmployee(Harvan);
        Hasan.addEmployee(Rafi);
        
        Harvan.displayInfo();
        Rafi.displayInfo();
        Karina.displayInfo();
        Bernadya.displayInfo();
        Hasan.displayInfo();
    }
}
