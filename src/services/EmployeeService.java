package services;
import dao.*;
import entity.model.*;
import java.util.*;

public class EmployeeService {
    Scanner sc;
    ProjectRepositoryImpl edao;


   public EmployeeService(){
        
        edao = new ProjectRepositoryImpl();
        sc = new Scanner(System.in);    
    }

    public void createEmp(){

        Employee emp = new Employee();
        System.out.println("Enter employee id: ");
        emp.setId(sc.nextInt());
        sc.nextLine();

        System.out.println("enter employee name: ");
        emp.setName(sc.nextLine());

        System.out.println("Enter employee designation: ");
        emp.setDesignation(sc.nextLine());

        System.out.println("Enter employee gender (Male/Female): ");
        emp.setGender(sc.nextLine());

        System.out.println("Enter Employee Salary: ");
        emp.setSalary(sc.nextDouble());
        sc.nextLine();

        System.out.println("Enter employee project id: "); //check for exception here as it is foriegn key
        emp.setProject_id(sc.nextInt());
        sc.nextLine();

        edao.createEmployee(emp);


    }

    public void assignProjecttoEmp(){ //exception here
    
        System.out.println("Enter employee ID: ");
        int employeeId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter project ID to assign: ");
        int projectId = sc.nextInt();
        sc.nextLine();

        edao.assignProjectToEmployee(projectId, employeeId);


    }

    public void deleteEmp(){ //exception here
        System.out.println("Enter employee ID: ");
        int employeeId = sc.nextInt();
        sc.nextLine();

        edao.deleteEmployee(employeeId);
        
    }


    
}
