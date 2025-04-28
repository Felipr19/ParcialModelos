
import java.util.List;

public class Empleado implements Observer {
    @SuppressWarnings("FieldMayBeFinal")
    private String name;
    @SuppressWarnings("FieldMayBeFinal")
    private String department;

    public Empleado(String name,String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public void update(List<Course> courses) {
        System.out.println("Updated course list for " + name +"("+department+")" +":");
        for (Course course : courses) {
            System.out.println(course.name + " (" + course.code + "): " + course.description);
        }
        System.out.println();
    }
}