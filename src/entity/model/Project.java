package entity.model;

public class Project {
    public int id;
    public String projectName;
    public String description;
    public String startDate;
    public String status;
    


public Project(){

}

public Project(int id, String projectName, String description, String startDate, String status) {
    this.id = id;
    this.projectName = projectName;
    this.description = description;
    this.startDate = startDate;
    this.status = status;
}
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getProjectName() {
    return projectName;
}

public void setProjectName(String projectName) {
    this.projectName = projectName;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public String getStartDate() {
    return startDate;
}

public void setStartDate(String startDate) {
    this.startDate = startDate;
}

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}
}
