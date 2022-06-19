public class Main {
    public static void main(String[] args) {
        University university = new University("1", "Алматинский Технологический университет","АТУ", 1991, "23");
        Student student = new Student("Анатолий", "33", 3, 3.5f);
        System.out.println(university.fullName + student.fullName);

    }
}
