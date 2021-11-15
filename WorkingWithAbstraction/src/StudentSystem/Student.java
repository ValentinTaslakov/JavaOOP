package StudentSystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {

        String output = String.format("%s is %s years old.",name,age);

        if (grade >= 5.00) {
            output += " Excellent student.";
        } else if (grade >= 3.50) {
            output += " Average student.";
        } else {
            output += " Very nice person.";
        }

        return output;
    }
}





