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
 * CourseOutcomeVersion generated by hbm2java
 */
@Entity
@Table(name = "course_outcome_version", catalog = "test")
public class CourseOutcomeVersion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer courseOutcomeVersionId;
	private Course course;
	private String courseOutcomeVersionCode;
	private Date courseOutcomeVersionDate;
	private boolean courseOutcomeVersionIsused;
	private Set<CourseOutcome> courseOutcomes = new HashSet<CourseOutcome>(0);
	private Set<CoSoMapVersion> coSoMapVersions = new HashSet<CoSoMapVersion>(0);
	private Set<CourseOutcome> courseOutcomes_1 = new HashSet<CourseOutcome>(0);
	private Set<CoSoMapVersion> coSoMapVersions_1 = new HashSet<CoSoMapVersion>(0);

	public CourseOutcomeVersion() {
	}

	public CourseOutcomeVersion(String courseOutcomeVersionCode, Date courseOutcomeVersionDate,
			boolean courseOutcomeVersionIsused) {
		this.courseOutcomeVersionCode = courseOutcomeVersionCode;
		this.courseOutcomeVersionDate = courseOutcomeVersionDate;
		this.courseOutcomeVersionIsused = courseOutcomeVersionIsused;
	}

	public CourseOutcomeVersion(Course course, String courseOutcomeVersionCode, Date courseOutcomeVersionDate,
			boolean courseOutcomeVersionIsused, Set<CourseOutcome> courseOutcomes, Set<CoSoMapVersion> coSoMapVersions,
			Set<CourseOutcome> courseOutcomes_1, Set<CoSoMapVersion> coSoMapVersions_1) {
		this.course = course;
		this.courseOutcomeVersionCode = courseOutcomeVersionCode;
		this.courseOutcomeVersionDate = courseOutcomeVersionDate;
		this.courseOutcomeVersionIsused = courseOutcomeVersionIsused;
		this.courseOutcomes = courseOutcomes;
		this.coSoMapVersions = coSoMapVersions;
		this.courseOutcomes_1 = courseOutcomes_1;
		this.coSoMapVersions_1 = coSoMapVersions_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "course_outcome_version_id", unique = true, nullable = false)
	public Integer getCourseOutcomeVersionId() {
		return this.courseOutcomeVersionId;
	}

	public void setCourseOutcomeVersionId(Integer courseOutcomeVersionId) {
		this.courseOutcomeVersionId = courseOutcomeVersionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Column(name = "course_outcome_version_code", nullable = false, length = 10)
	public String getCourseOutcomeVersionCode() {
		return this.courseOutcomeVersionCode;
	}

	public void setCourseOutcomeVersionCode(String courseOutcomeVersionCode) {
		this.courseOutcomeVersionCode = courseOutcomeVersionCode;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "course_outcome_version_date", nullable = false, length = 10)
	public Date getCourseOutcomeVersionDate() {
		return this.courseOutcomeVersionDate;
	}

	public void setCourseOutcomeVersionDate(Date courseOutcomeVersionDate) {
		this.courseOutcomeVersionDate = courseOutcomeVersionDate;
	}

	@Column(name = "course_outcome_version_isused", nullable = false)
	public boolean isCourseOutcomeVersionIsused() {
		return this.courseOutcomeVersionIsused;
	}

	public void setCourseOutcomeVersionIsused(boolean courseOutcomeVersionIsused) {
		this.courseOutcomeVersionIsused = courseOutcomeVersionIsused;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseOutcomeVersion")
	public Set<CourseOutcome> getCourseOutcomes() {
		return this.courseOutcomes;
	}

	public void setCourseOutcomes(Set<CourseOutcome> courseOutcomes) {
		this.courseOutcomes = courseOutcomes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseOutcomeVersion")
	public Set<CoSoMapVersion> getCoSoMapVersions() {
		return this.coSoMapVersions;
	}

	public void setCoSoMapVersions(Set<CoSoMapVersion> coSoMapVersions) {
		this.coSoMapVersions = coSoMapVersions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseOutcomeVersion")
	public Set<CourseOutcome> getCourseOutcomes_1() {
		return this.courseOutcomes_1;
	}

	public void setCourseOutcomes_1(Set<CourseOutcome> courseOutcomes_1) {
		this.courseOutcomes_1 = courseOutcomes_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseOutcomeVersion")
	public Set<CoSoMapVersion> getCoSoMapVersions_1() {
		return this.coSoMapVersions_1;
	}

	public void setCoSoMapVersions_1(Set<CoSoMapVersion> coSoMapVersions_1) {
		this.coSoMapVersions_1 = coSoMapVersions_1;
	}

}
