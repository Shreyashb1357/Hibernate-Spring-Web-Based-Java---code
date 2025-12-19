package example.hibernate.annotation.entity;

import org.hibernate.annotations.Generated;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Course_Master (Table Name)  we will create table in sql using JPA Annotation.

@Entity //Marking as Entity , so compiler will know this is an Entity and we have to create table
@Table(name="Course_Details")
public class Course {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="course_Id")
	private Integer courseId;
	
	
	@Column(name="Course_Title")
	private String title;
	
	@Column(name="Course_Duration")
	private int duration;
	
	@Column(name="Course_Fees")
	private int fees;
	public Course() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", duration=" + duration + ", fees=" + fees + "]";
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public Course(Integer courseId, String title, int duration, int fees) {
		super();
		this.courseId = courseId;
		this.title = title;
		this.duration = duration;
		this.fees = fees;
	}
	
}

