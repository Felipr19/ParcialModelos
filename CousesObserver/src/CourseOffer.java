
import java.util.ArrayList;
import java.util.List;

public class CourseOffer implements Subject {
    private final List<Course> courses = new ArrayList<>();
    public List<Observer> observers = new ArrayList<>();
    
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(courses);
        }
    }

    public void addCourse(Course course) {
        courses.add(course);
        notifyObservers();
    }

    public void removeCourse(Course course) {
        courses.remove(course);
        notifyObservers();
    }

}