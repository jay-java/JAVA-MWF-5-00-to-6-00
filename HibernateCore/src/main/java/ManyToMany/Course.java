package ManyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	@Id	
	private int cid;
	@Column(name="course_name")
	private String cname;
	private String duration;
	
	@ManyToMany
	private List<Student> students;
	
	

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int cid, String cname, String duration, List<Student> students) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.duration = duration;
		this.students = students;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", duration=" + duration + ", students=" + students + "]";
	}
	
	
}
