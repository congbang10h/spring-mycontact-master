package com.yuen.domain;
// Generated Jan 30, 2018 7:35:01 PM by Hibernate Tools 5.0.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CourseAssignment generated by hbm2java
 */
@Entity
@Table(name = "course_assignment", catalog = "test")
public class CourseAssignment implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer courseAssignId;
	private Course course;
	private User user;
	private String courseAssignRole;

	public CourseAssignment() {
	}

	public CourseAssignment(String courseAssignRole) {
		this.courseAssignRole = courseAssignRole;
	}

	public CourseAssignment(Course course, User user, String courseAssignRole) {
		this.course = course;
		this.user = user;
		this.courseAssignRole = courseAssignRole;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "course_assign_id", unique = true, nullable = false)
	public Integer getCourseAssignId() {
		return this.courseAssignId;
	}

	public void setCourseAssignId(Integer courseAssignId) {
		this.courseAssignId = courseAssignId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "course_assign_role", nullable = false, length = 10)
	public String getCourseAssignRole() {
		return this.courseAssignRole;
	}

	public void setCourseAssignRole(String courseAssignRole) {
		this.courseAssignRole = courseAssignRole;
	}

}