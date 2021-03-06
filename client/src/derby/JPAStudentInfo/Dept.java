package derby.JPAStudentInfo;

import javax.persistence.*;
import java.util.*;

@Entity
public class Dept {

    @Id private int did;
    private String dname;

    @OneToMany(mappedBy="major")
    private Collection<derby.StudentInfo.Student> majors;

	public Dept() {}

	public Dept(int did, String dname) {
		this.did = did;
		this.dname = dname;
	}

    public int getId() {
        return did;
    }

    public String getName() {
        return dname;
    }

    public void changeName(String newname) {
        dname = newname;
    }

    public Collection<derby.StudentInfo.Student> getMajors() {
		return majors;
	}
}
