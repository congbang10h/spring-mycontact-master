package com.yuen.domain;
// Generated Jan 30, 2018 7:35:01 PM by Hibernate Tools 5.0.6.Final

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

/**
 * CourseContent generated by hbm2java
 */
@Entity
@Table(name = "course_content", catalog = "test")
public class CourseContent implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer courseContentId;
	private Course course;
	private CourseContent courseContent;
	private String courseContentCode;
	private String courseContentDesc;
	private Integer courseContentPercentage;
	private Set<QgroupContentMap> qgroupContentMaps = new HashSet<QgroupContentMap>(0);
	private Set<QgroupContentMap> qgroupContentMaps_1 = new HashSet<QgroupContentMap>(0);
	private Set<ContentComment> contentComments = new HashSet<ContentComment>(0);
	private Set<CourseContent> courseContents = new HashSet<CourseContent>(0);
	private Set<CourseContent> courseContents_1 = new HashSet<CourseContent>(0);
	private Set<ContentOutcomeMap> contentOutcomeMaps = new HashSet<ContentOutcomeMap>(0);
	private Set<ContentOutcomeMap> contentOutcomeMaps_1 = new HashSet<ContentOutcomeMap>(0);
	private Set<ContentComment> contentComments_1 = new HashSet<ContentComment>(0);
	private Set<QuestionContentMap> questionContentMaps = new HashSet<QuestionContentMap>(0);
	private Set<QuestionContentMap> questionContentMaps_1 = new HashSet<QuestionContentMap>(0);

	public CourseContent() {
	}

	public CourseContent(String courseContentDesc) {
		this.courseContentDesc = courseContentDesc;
	}

	public CourseContent(Course course, CourseContent courseContent, String courseContentCode, String courseContentDesc,
			Integer courseContentPercentage, Set<QgroupContentMap> qgroupContentMaps,
			Set<QgroupContentMap> qgroupContentMaps_1, Set<ContentComment> contentComments,
			Set<CourseContent> courseContents, Set<CourseContent> courseContents_1,
			Set<ContentOutcomeMap> contentOutcomeMaps, Set<ContentOutcomeMap> contentOutcomeMaps_1,
			Set<ContentComment> contentComments_1, Set<QuestionContentMap> questionContentMaps,
			Set<QuestionContentMap> questionContentMaps_1) {
		this.course = course;
		this.courseContent = courseContent;
		this.courseContentCode = courseContentCode;
		this.courseContentDesc = courseContentDesc;
		this.courseContentPercentage = courseContentPercentage;
		this.qgroupContentMaps = qgroupContentMaps;
		this.qgroupContentMaps_1 = qgroupContentMaps_1;
		this.contentComments = contentComments;
		this.courseContents = courseContents;
		this.courseContents_1 = courseContents_1;
		this.contentOutcomeMaps = contentOutcomeMaps;
		this.contentOutcomeMaps_1 = contentOutcomeMaps_1;
		this.contentComments_1 = contentComments_1;
		this.questionContentMaps = questionContentMaps;
		this.questionContentMaps_1 = questionContentMaps_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "course_content_id", unique = true, nullable = false)
	public Integer getCourseContentId() {
		return this.courseContentId;
	}

	public void setCourseContentId(Integer courseContentId) {
		this.courseContentId = courseContentId;
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
	@JoinColumn(name = "course_parentcontent_id")
	public CourseContent getCourseContent() {
		return this.courseContent;
	}

	public void setCourseContent(CourseContent courseContent) {
		this.courseContent = courseContent;
	}

	@Column(name = "course_content_code", length = 10)
	public String getCourseContentCode() {
		return this.courseContentCode;
	}

	public void setCourseContentCode(String courseContentCode) {
		this.courseContentCode = courseContentCode;
	}

	@Column(name = "course_content_desc", nullable = false, length = 65535)
	public String getCourseContentDesc() {
		return this.courseContentDesc;
	}

	public void setCourseContentDesc(String courseContentDesc) {
		this.courseContentDesc = courseContentDesc;
	}

	@Column(name = "course_content_percentage", precision = 8, scale = 0)
	public Integer getCourseContentPercentage() {
		return this.courseContentPercentage;
	}

	public void setCourseContentPercentage(Integer courseContentPercentage) {
		this.courseContentPercentage = courseContentPercentage;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseContent")
	public Set<QgroupContentMap> getQgroupContentMaps() {
		return this.qgroupContentMaps;
	}

	public void setQgroupContentMaps(Set<QgroupContentMap> qgroupContentMaps) {
		this.qgroupContentMaps = qgroupContentMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseContent")
	public Set<QgroupContentMap> getQgroupContentMaps_1() {
		return this.qgroupContentMaps_1;
	}

	public void setQgroupContentMaps_1(Set<QgroupContentMap> qgroupContentMaps_1) {
		this.qgroupContentMaps_1 = qgroupContentMaps_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseContent")
	public Set<ContentComment> getContentComments() {
		return this.contentComments;
	}

	public void setContentComments(Set<ContentComment> contentComments) {
		this.contentComments = contentComments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseContent")
	public Set<CourseContent> getCourseContents() {
		return this.courseContents;
	}

	public void setCourseContents(Set<CourseContent> courseContents) {
		this.courseContents = courseContents;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseContent")
	public Set<CourseContent> getCourseContents_1() {
		return this.courseContents_1;
	}

	public void setCourseContents_1(Set<CourseContent> courseContents_1) {
		this.courseContents_1 = courseContents_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseContent")
	public Set<ContentOutcomeMap> getContentOutcomeMaps() {
		return this.contentOutcomeMaps;
	}

	public void setContentOutcomeMaps(Set<ContentOutcomeMap> contentOutcomeMaps) {
		this.contentOutcomeMaps = contentOutcomeMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseContent")
	public Set<ContentOutcomeMap> getContentOutcomeMaps_1() {
		return this.contentOutcomeMaps_1;
	}

	public void setContentOutcomeMaps_1(Set<ContentOutcomeMap> contentOutcomeMaps_1) {
		this.contentOutcomeMaps_1 = contentOutcomeMaps_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseContent")
	public Set<ContentComment> getContentComments_1() {
		return this.contentComments_1;
	}

	public void setContentComments_1(Set<ContentComment> contentComments_1) {
		this.contentComments_1 = contentComments_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseContent")
	public Set<QuestionContentMap> getQuestionContentMaps() {
		return this.questionContentMaps;
	}

	public void setQuestionContentMaps(Set<QuestionContentMap> questionContentMaps) {
		this.questionContentMaps = questionContentMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseContent")
	public Set<QuestionContentMap> getQuestionContentMaps_1() {
		return this.questionContentMaps_1;
	}

	public void setQuestionContentMaps_1(Set<QuestionContentMap> questionContentMaps_1) {
		this.questionContentMaps_1 = questionContentMaps_1;
	}

}
