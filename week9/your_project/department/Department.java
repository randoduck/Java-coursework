package department;

public class Department {
    protected String departmentName;    // Protected
    public String departmentCode;       // Public

    public void setDepartmentDetails(String name, String code) {
        this.departmentName = name;
        this.departmentCode = code;
    }

    public void displayDepartmentDetails() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Department Code: " + departmentCode);
    }
}
