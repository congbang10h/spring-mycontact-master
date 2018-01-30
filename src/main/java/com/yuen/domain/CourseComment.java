package com.yuen.domain;
// Generated Jan 30, 2018 7:35:01 PM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CourseComment generated by hbm2java
 */
@Entity
@Table(name = "course_comment", catalog = "test")
public class CourseComment implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer courseCommentId;
	private CourseAccessMode courseAccessMode;
	private CourseReviewerDecision courseReviewerDecision;
	private Date courseCommentDate;
	private Date courseCommentTime;
	private String courseCommentDesc;
	private Set<ContentComment> contentComments = new HashSet<ContentComment>(0);
	private Set<CourseCommentRelationship> courseCommentRelationshipsForParentCourseCommentId = new HashSet<CourseCommentRelationship>(
			0);
	private Set<ContentComment> contentComments_1 = new HashSet<ContentComment>(0);
	private Set<CourseCommentRelationship> courseCommentRelationshipsForChildCourseCommentId = new HashSet<CourseCommentRelationship>(
			0);
	private Set<CourseCommentRelationship> courseCommentRelationshipsForParentCourseCommentId_1 = new HashSet<CourseCommentRelationship>(
			0);
	private Set<CourseCommentRelationship> courseCommentRelationshipsForChildCourseCommentId_1 = new HashSet<CourseCommentRelationship>(
			0);

	public CourseComment() {
	}

	public CourseComment(Date courseCommentDate, Date courseCommentTime, String courseCommentDesc) {
		this.courseCommentDate = courseCommentDate;
		this.courseCommentTime = courseCommentTime;
		this.courseCommentDesc = courseCommentDesc;
	}

	public CourseComment(CourseAccessMode courseAccessMode, CourseReviewerDecision courseReviewerDecision,
			Date courseCommentDate, Date courseCommentTime, String courseCommentDesc,
			Set<ContentComment> contentComments,
			Set<CourseCommentRelationship> courseCommentRelationshipsForParentCourseCommentId,
			Set<ContentComment> contentComments_1,
			Set<CourseCommentRelationship> courseCommentRelationshipsForChildCourseCommentId,
			Set<CourseCommentRelationship> courseCommentRelationshipsForParentCourseCommentId_1,
			Set<CourseCommentRelationship> courseCommentRelationshipsForChildCourseCommentId_1) {
		this.courseAccessMode = courseAccessMode;
		this.courseReviewerDecision = courseReviewerDecision;
		this.courseCommentDate = courseCommentDate;
		this.courseCommentTime = courseCommentTime;
		this.courseCommentDesc = courseCommentDesc;
		this.contentComments = contentComments;
		this.courseCommentRelationshipsForParentCourseCommentId = courseCommentRelationshipsForParentCourseCommentId;
		this.contentComments_1 = contentComments_1;
		this.courseCommentRelationshipsForChildCourseCommentId = courseCommentRelationshipsForChildCourseCommentId;
		this.courseCommentRelationshipsForParentCourseCommentId_1 = courseCommentRelationshipsForParentCourseCommentId_1;
		this.courseCommentRelationshipsForChildCourseCommentId_1 = courseCommentRelationshipsForChildCourseCommentId_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "course_comment_id", unique = true, nullable = false)
	public Integer getCourseCommentId() {
		return this.courseCommentId;
	}

	public void setCourseCommentId(Integer courseCommentId) {
		this.courseCommentId = courseCommentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_access_mode_id")
	public CourseAccessMode getCourseAccessMode() {
		return this.courseAccessMode;
	}

	public void setCourseAccessMode(CourseAccessMode courseAccessMode) {
		this.courseAccessMode = courseAccessMode;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_reviewer_decision_id")
	public CourseReviewerDecision getCourseReviewerDecision() {
		return this.courseReviewerDecision;
	}

	public void setCourseReviewerDecision(CourseReviewerDecision courseReviewerDecision) {
		this.courseReviewerDecision = courseReviewerDecision;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "course_comment_date", nullable = false, length = 10)
	public Date getCourseCommentDate() {
		return this.courseCommentDate;
	}

	public void setCourseCommentDate(Date courseCommentDate) {
		this.courseCommentDate = courseCommentDate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "course_comment_time", nullable = false, length = 8)
	public Date getCourseCommentTime() {
		return this.courseCommentTime;
	}

	public void setCourseCommentTime(Date courseCommentTime) {
		this.courseCommentTime = courseCommentTime;
	}

	@Column(name = "course_comment_desc", nullable = false, length = 65535)
	public String getCourseCommentDesc() {
		return this.courseCommentDesc;
	}

	public void setCourseCommentDesc(String courseCommentDesc) {
		this.courseCommentDesc = courseCommentDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseComment")
	public Set<ContentComment> getContentComments() {
		return this.contentComments;
	}

	public void setContentComments(Set<ContentComment> contentComments) {
		this.contentComments = contentComments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseCommentByParentCourseCommentId")
	public Set<CourseCommentRelationship> getCourseCommentRelationshipsForParentCourseCommentId() {
		return this.courseCommentRelationshipsForParentCourseCommentId;
	}

	public void setCourseCommentRelationshipsForParentCourseCommentId(
			Set<CourseCommentRelationship> courseCommentRelationshipsForParentCourseCommentId) {
		this.courseCommentRelationshipsForParentCourseCommentId = courseCommentRelationshipsForParentCourseCommentId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseComment")
	public Set<ContentComment> getContentComments_1() {
		return this.contentComments_1;
	}

	public void setContentComments_1(Set<ContentComment> contentComments_1) {
		this.contentComments_1 = contentComments_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseCommentByChildCourseCommentId")
	public Set<CourseCommentRelationship> getCourseCommentRelationshipsForChildCourseCommentId() {
		return this.courseCommentRelationshipsForChildCourseCommentId;
	}

	public void setCourseCommentRelationshipsForChildCourseCommentId(
			Set<CourseCommentRelationship> courseCommentRelationshipsForChildCourseCommentId) {
		this.courseCommentRelationshipsForChildCourseCommentId = courseCommentRelationshipsForChildCourseCommentId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseCommentByParentCourseCommentId")
	public Set<CourseCommentRelationship> getCourseCommentRelationshipsForParentCourseCommentId_1() {
		return this.courseCommentRelationshipsForParentCourseCommentId_1;
	}

	public void setCourseCommentRelationshipsForParentCourseCommentId_1(
			Set<CourseCommentRelationship> courseCommentRelationshipsForParentCourseCommentId_1) {
		this.courseCommentRelationshipsForParentCourseCommentId_1 = courseCommentRelationshipsForParentCourseCommentId_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseCommentByChildCourseCommentId")
	public Set<CourseCommentRelationship> getCourseCommentRelationshipsForChildCourseCommentId_1() {
		return this.courseCommentRelationshipsForChildCourseCommentId_1;
	}

	public void setCourseCommentRelationshipsForChildCourseCommentId_1(
			Set<CourseCommentRelationship> courseCommentRelationshipsForChildCourseCommentId_1) {
		this.courseCommentRelationshipsForChildCourseCommentId_1 = courseCommentRelationshipsForChildCourseCommentId_1;
	}

}