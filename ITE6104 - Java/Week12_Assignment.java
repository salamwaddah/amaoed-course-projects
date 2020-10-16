public class Week12_Assignment {
    public static void main(String[] args) {
        for (int x = 20; x > 18; x--) {
            Week12_Student s = new Week12_Student("name" + x, x, "subj" + x);
            s.printInfo();
        }
    }
}
