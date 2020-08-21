public class Student {

    private static int nextId = 0;
    private int id;
    private String name;
    private String major;

    public Student (String name, String major) {
        setName(name);
        setMajor(major);
        id = nextId;
        nextId++;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}
