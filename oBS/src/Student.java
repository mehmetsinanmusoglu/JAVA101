public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int matNot, int matOralExam, int fizikNot, int fizikOralExam, int kimyaNot, int kimyaOralExam) {

        if (matNot >= 0 && matNot <= 100 && matOralExam >= 0 && matOralExam <= 100) {
            this.mat.note = matNot;
            this.mat.oralExam = matOralExam;
        }

        if (fizikNot >= 0 && fizikNot <= 100 && fizikOralExam >= 0 && fizikOralExam <= 100) {
            this.fizik.note = fizikNot;
            this.fizik.oralExam = fizikOralExam;
        }

        if (kimyaNot >= 0 && kimyaNot <= 100 && kimyaOralExam >= 0 && kimyaOralExam <= 100) {
            this.kimya.note = kimyaNot;
            this.kimya.oralExam = kimyaOralExam;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.note * 0.8) + (this.fizik.oralExam * 0.2)) +
                ((this.kimya.note * 0.8) + (this.kimya.oralExam * 0.2)) +
                ((this.mat.note * 0.8) + (this.mat.oralExam * 0.2))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınav Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.mat.oralExam);
        System.out.println("Fizik Sınav Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.oralExam);
        System.out.println("Kimya Sınav Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.oralExam);
    }
}
