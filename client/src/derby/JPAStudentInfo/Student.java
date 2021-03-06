package derby.JPAStudentInfo;

import javax.persistence.*;
import java.util.*;

@Entity
public class Student {

    @Id private int sid;
    private String sname;
    private int gradyear;

    @OneToMany(mappedBy="student")
    private Collection<Enroll> enrollments;

    @ManyToOne
    @JoinColumn(name="MajorId")
    private derby.StudentInfo.Dept major;

	public Student() {}

	public Student(int sid, String sname, int gradyear, derby.StudentInfo.Dept major) {
		this.sid = sid;
		this.sname = sname;
		this.gradyear = gradyear;
		this.major = major;
	}

    public int getId() {
        return sid;
    }

    public String getName() {
        return sname;
    }

	public int getGradYear() {
        return gradyear;
    }

    public void changeGradYear(int year) {
        gradyear = year;
    }

    public derby.StudentInfo.Dept getMajor() {
		return major;
	}

	public void changeMajor(derby.StudentInfo.Dept dept) {
		major = dept;
	}

	public Collection<Enroll> getEnrollments() {
		return enrollments;
	}
}
