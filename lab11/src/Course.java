public class Course {

    private String id;
    private String name;
    private String time;
    private String room;
    private Student[] students;

    public Course(String id, String name, String time, String room, int studentSize) {
        this.id = id;
        setName(name);
        setTime(time);
        setRoom(room);
        students = new Student[studentSize];
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Student[] getStudents() {
        return students;
    }
// ask
    public boolean registerStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == student.getId()) {
                break;
            }
            if (students[i] == null || students[i].getName().equals("")) {
                students[i] = student;
                return true;
            }
        }
        return false;
    }

    public boolean dropStudent(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i] = null;
                return true;
            }
        }
        return false;
    }

}

