package at.htl.klassestudent;

import java.util.Arrays;

public class Klasse {

    int klassenbezeichnung;
    Student[] students;

    public Klasse(int klassenbezeichnung, Student[] students) {
        this.students = students;
        this.klassenbezeichnung = klassenbezeichnung;
    }

    public void sortBubble() {

        boolean getauscht = false;

        int i = students.length -1;

        do {
            getauscht = false;

            for (int j = 0; j < i; j++) {
                if (students[j].compareTo(students[j+1]) > 0) {

                    Student help = students[j];
                    students[j] = students[j+1];
                    students[j+1] = help;
                    getauscht = true;
                }
            }

            i--;
        }while (getauscht || (i>=0));


    }

    public void sortInsertion() {

        int n = students.length;


        for (int i = 0; i <n ; i++) {

            Student key = students[i];

            int j = i-1;

            while (j >= 0 && students[j].compareTo(key) > 0) {
                students[j+1] = students[j];
                j = j -1;
            }

            students[j+1] = key;
            
            
        }

    }

    public static Student[] testData() {
        Student[] students = new Student[6];

        students[0] = new Student("B", "3");
        students[1] = new Student("B", "2");
        students[2] = new Student("A", "2");
        students[3] = new Student("E", "3");
        students[4] = new Student("D", "2");
        students[5] = new Student("A", "1");

        return students;
    }

    public int getKlassenbezeichnung() {
        return klassenbezeichnung;
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        String str ="";

        for (int i = 0; i < students.length; i++) {
            str += students[i].toString() + "\n";
        }
        return str;
    }
}
