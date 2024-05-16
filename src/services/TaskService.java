package services;
import dao.*;
import java.util.*;
import entity.model.*;

public class TaskService {
    Scanner sc;
    ProjectRepositoryImpl edao;
    Task task;

    public TaskService(){
    edao = new ProjectRepositoryImpl();
    sc = new Scanner(System.in);
    task = new Task();

    }

public void createTask(){
        System.out.println("Enter Task id: ");
        task.setTask_id(sc.nextInt());
        sc.nextLine(); 

        System.out.println("Enter Task name: ");
        task.setTask_name(sc.nextLine());

        System.out.println("Enter project id (should be present in project table): ");//handle exception here
        task.setProject_id(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter Employee ID(should be present in the Employee table): ");//handle exception here
        task.setEmployee_id(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter task status('Assigned', 'Started', 'Completed'): ");
        task.setStatus(sc.nextLine());

        edao.createTask(task);
    }

    public void assignProjectTaskToEmp(){

        System.out.println("Enter project id (should be present in project table): ");//handle exception here
        int projectId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Employee ID(should be present in the Employee table): ");//handle exception here
        int employeeId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Task id: ");
        int task_id = sc.nextInt();
        sc.nextLine(); 

        edao.assignTaskInProjectToEmployee(task_id,projectId,employeeId);
    }

    public void getTasks(){

        System.out.println("Enter project id (should be present in project table): ");//handle exception here
        int projectId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Employee ID(should be present in the Employee table): ");//handle exception here
        int employeeId = sc.nextInt();
        sc.nextLine();

        List<Task> tasks = edao.getAllTasks(projectId,employeeId);
        if (tasks.isEmpty()) {
            System.out.println("No tasks found for employee id:  " + employeeId + "projectId" + projectId);
        } else {
            System.out.println("Employee ID: " + employeeId + ", Project ID: " + projectId);
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    
}




