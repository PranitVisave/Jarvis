/*Q2) Define an abstract class Staff with protected members id and name. Define a parameterized
constructor. Define one subclass OfficeStaff with member department. Create n objects of
OfficeStaff and display all details. */

import java.util.Scanner;

abstract class Staff {
    protected int id;
    protected String name;

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class OfficeStaff extends Staff {
    private String department;

    public OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }
    
    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class S01_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of OfficeStaff objects: ");
        n = sc.nextInt();
        
        OfficeStaff[] officeStaffArray = new OfficeStaff[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for OfficeStaff " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt(); 
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Department: ");
            String department = sc.next();

            officeStaffArray[i] = new OfficeStaff(id, name, department);
        }
        for (int i = 0; i < n; i++)  
            officeStaffArray[i].displayDetails();

        sc.close();
    }
}
