package main;

import services.EmployeeService;
import services.ProjectService;
import services.TaskService;

import java.util.*;

public class ProjectApp {
    public static void main(String[] args) throws Exception {
        EmployeeService empser = new EmployeeService();
        ProjectService projser = new ProjectService();
        TaskService taskser = new TaskService();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Menu:");
            System.out.println("1. Create Employee");
            System.out.println("2. Create Project");
            System.out.println("3. Create Task");
            System.out.println("4. Assign project to employee ");
            System.out.println("5. Delete Employee ");
            System.out.println("6. Assign task in project to an Employee");
            System.out.println("7. Delete Project");
            System.out.println("8. Get Tasks for Project and Employee");
            System.out.println("9. Exit");

            int ch = sc.nextInt();
            sc.nextLine(); 

            switch (ch) {
                case 1:
                    empser.createEmp();
                    break;
                case 2:
                    projser.createProj();
                    break;
                case 3: 
                    taskser.createTask();
                    break;
                case 4: 
                    empser.assignProjecttoEmp();
                    break;
                case 5:
                    empser.deleteEmp();
                    break;
                case 6:
                    taskser.assignProjectTaskToEmp();
                    break;
                case 7:
                    projser.deleteProj();
                    break;
                case 8:
                    taskser.getTasks();
                    break;
                case 9:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        }
    }
