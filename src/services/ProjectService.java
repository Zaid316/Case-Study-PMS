package services;
import dao.*;
import entity.model.*;
import java.util.*;

public class ProjectService{
    Scanner sc;
    IProjectRepository edao;
    Project proj;


public ProjectService(){ //u can also parametrize
    edao = new ProjectRepositoryImpl();
    sc = new Scanner(System.in);
    proj = new Project();

}

public void createProj(){
    
        System.out.println("Enter project id: ");
        proj.setId(sc.nextInt());
        sc.nextLine(); 

        System.out.println("Enter project name: ");
        proj.setProjectName(sc.nextLine());

        System.out.println("Enter project description: ");
        proj.setDescription(sc.nextLine());

        System.out.println("Enter project start date (YYYY-MM-DD): ");
        proj.setStartDate(sc.nextLine());//exception handling here

        System.out.println("Enter project status('started', 'development', 'build', 'test', 'deployed'): ");
        proj.setStatus(sc.nextLine());

        edao.createProject(proj);
    }

public void deleteProj(){

        System.out.println("Enter project id: ");
        int projectId = sc.nextInt();
        sc.nextLine(); 

        edao.deleteProject(projectId);

}
}
