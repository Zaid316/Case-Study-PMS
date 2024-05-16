package dao;
import java.util.List;
import entity.model.Employee;
import entity.model.Project;
import entity.model.Task;

public interface IProjectRepository {
    boolean createEmployee(Employee emp);
    boolean createProject(Project pj);
    boolean createTask(Task task);
    boolean assignProjectToEmployee(int projectId, int employeeId);
    boolean assignTaskInProjectToEmployee(int taskId, int projectId, int employeeId);
    boolean deleteEmployee(int userId);
    boolean deleteProject(int projectId);
    List<Task> getAllTasks(int empId, int projectId);

}
