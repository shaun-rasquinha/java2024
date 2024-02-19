public class Practice {
    public static void main(String[] args) {

        Student s1 = new Student(1056, "karan");

        s1.setStudent(8.8);
        s1.displayProfile();

        System.out.println("Percentage of " + s1.getName() + " is " + s1.findPercentage());

    }

}

class Student {
    private int rollno;
    private String name;
    private double cgpa = 0.0;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;

    }

    public void setStudent(double cgpa) {
        this.cgpa = cgpa;
    }

    public int getrollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public void displayProfile() {
        System.out.println(rollno + " " + name + " " + cgpa);
    }

    public double findPercentage() {
        double percent = cgpa * 10;
        return percent;
    }
}