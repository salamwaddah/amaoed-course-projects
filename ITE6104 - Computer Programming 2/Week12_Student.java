public class Week12_Student extends Week12_Person {
    private final String subject;

    public Week12_Student(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void printInfo() {
        System.out.print(super.getName() + super.getAge() + subject);
    }
}
