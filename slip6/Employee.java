public class Employee 
{
    private int empId;
    private String empName;
    private String empDesignation;
    private double empSalary;

    public Employee(int empId, String empName, String empDesignation, double empSalary) 
    {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
    }

    @Override
    public String toString() 
    {
        return "Employee ID: " + empId + "\n" +
               "Employee Name: " + empName + "\n" +
               "Employee Designation: " + empDesignation + "\n" +
               "Employee Salary: " + empSalary;
    }

    public static void main(String[] args) 
    {      
        Employee employee = new Employee(1, "John Doe", "Manager", 50000.0);
        System.out.println(employee);
    }
}
