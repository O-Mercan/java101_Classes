public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Ömer Hoca",123123321,"CLC");
        Teacher t2 = new Teacher("Nicola Tesla", 123123, "FZK");
        Teacher t3 = new Teacher("asdasd", 111, "Bio");

        Course calculus = new Course("calculus","101", "CLC");
        calculus.addTeacher(t1);

        Course pyhsics = new Course("pyhsics", "102", "pyh");
        pyhsics.addTeacher(t2);

        Course bio = new Course("Biology", "101", "Bio");
        bio.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123","4", calculus, pyhsics, bio);
        s1.addBulkExamNote(100,90,50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "3213","4", calculus,pyhsics, bio);
        s2.addBulkExamNote(10,20,30);
        s2.isPass();

        Student s3 = new Student("Domdom Ali", "345", "4", calculus, pyhsics, bio);
        s2.addBulkExamNote(40,60,70);
        s3.isPass();
    }
}
