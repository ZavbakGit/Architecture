package builder;

public class Department {
    private String name;
    private int count;
    private Boolean general;

    public Department(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Boolean getGeneral() {
        return general;
    }

    public void setGeneral(Boolean general) {
        this.general = general;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", general=" + general +
                '}';
    }
}
