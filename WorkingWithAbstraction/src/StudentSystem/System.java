package StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class System {
    private Map<String, Student> students;

    public System() {

        this.students = new HashMap<>();
    }

    public Map<String, Student> getStudents() {

        return this.students;
    }

    public void ParseCommand(String[] args) {

        String command = args[0];

        String name = args[1];

        switch (command) {
            case "Create":

                int age = Integer.parseInt(args[2]);

                double grade = Double.parseDouble(args[3]);

                students.putIfAbsent(name, new Student(name, age, grade));

                break;

            case "Show":
                if (students.containsKey(name)) {

                    Student student = students.get(name);

                    java.lang.System.out.println(student);

                    break;
                }


        }
    }
}
