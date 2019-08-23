package builder;

public class DepartmentBuilder {
    private Department department;

    public DepartmentBuilder(String name) {
        department = new Department(name);
    }

    public DepartmentBuilder count(Integer count){
        department.setCount(count);
        return this;
    }

    public DepartmentBuilder general(Boolean general){
        department.setGeneral(general);
        return this;
    }

    public Department build(){
        return department;
    }
}
