package at.htl.klassestudent;

import org.junit.Test;

import static org.junit.Assert.*;

public class KlasseStudentTest {

    @Test
    public void testStudentCompareTo() {
        Student s1 = new Student("B", "3");
        Student s2 = new Student("B", "3");
        Student s3 = new Student("A", "2");

        assertEquals(-1, s3.compareTo(s1));
        assertEquals(1, s1.compareTo(s3));
        assertEquals(0, s1.compareTo(s2));
    }

    @Test
    public void testBubbleSort() {
        Klasse klasse = new Klasse(1, Klasse.testData());
        klasse.sortBubble();

        assertEquals(true, isSorted(klasse.getStudents()));
    }

    @Test
    public void testInsertionSort() {
        Klasse klasse = new Klasse(1, Klasse.testData());
        klasse.sortInsertion();

        assertEquals(true, isSorted(klasse.getStudents()));
    }

    public boolean isSorted(Student[] students) {
        for (int i = 0; i < students.length-1; i++) {
            if(students[i].compareTo(students[i+1]) > 0) {
                return false;
            }
        }
        return true;
    }
}