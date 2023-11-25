package Chapter11;

import Chapter07.Student;

public class StudentComparator implements Comparable<Student> {
    @Override
    public int compare(Student a, Student B) {
        if (a.sno > b.sno) return -1;
        else if (a.sno == b.sno) return 0;
        else return 1;
    }
}
