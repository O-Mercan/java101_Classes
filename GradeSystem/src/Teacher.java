public class Teacher {
    String name;
    int mpno;
    String branch;

    Teacher(String name, int mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print(){
        System.out.println("Öğretmen adı: "+ this.name);
        System.out.println("Telefon numarası: "+ this.mpno);
        System.out.println("Ders kodu: "+ this.branch);
    }
}
