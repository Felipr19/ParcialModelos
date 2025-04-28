public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Calculus", "020-84", "Basic Calculus");
        Course course2 = new Course("MachineLearning", "020-81", "Basic Machine Learning");
        Course course3 = new Course("IntroductionToIA", "020-83", "Introdction to Artificial intelligence");

        CourseOffer courseOfferSystem = new CourseOffer();
        Observer observer1 = new Empleado("Andrea Mahecha", "webmaster");
        Observer observer2 = new Empleado("Luz Dary", "brodcast");
        Observer observer3 = new Empleado("Laura Molina", "Community Manager");

        courseOfferSystem.addObserver(observer1);
        courseOfferSystem.addObserver(observer2);
        courseOfferSystem.addObserver(observer3);

        courseOfferSystem.addCourse(course1);
        courseOfferSystem.addCourse(course2);
        courseOfferSystem.addCourse(course3);

        courseOfferSystem.removeCourse(course2);
    }
    
}
