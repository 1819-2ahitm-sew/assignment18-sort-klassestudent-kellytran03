package at.htl.klassestudent;

public class Student implements Comparable<Student> {

    private String vorname;
    private String nachname;

    public Student() {
    }

    public Student(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {

        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int compareTo(Student o) {
        if (this.nachname.equals(o.getNachname())) {
            return this.vorname.compareTo(o.getVorname());
        }
        return this.nachname.compareTo(o.getNachname());
    }

    @Override
    public String toString() {
        return "Student: " +
                "nachname='" + nachname + '\'' +
                ", vorname='" + vorname + '\'' ;
    }
}
