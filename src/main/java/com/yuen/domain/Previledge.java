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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Previledge generated by hbm2java
 */
@Entity
@Table(name = "previledge", catalog = "test")
public class Previledge implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer previledgeId;
	private String previledgeCode;
	private String previledgeDesc;
	private Set<CourseAccessMode> courseAccessModes = new HashSet<CourseAccessMode>(0);
	private Set<RolePreviledgeMap> rolePreviledgeMaps = new HashSet<RolePreviledgeMap>(0);
	private Set<QuestionAccessMode> questionAccessModes = new HashSet<QuestionAccessMode>(0);
	private Set<PreviledgeRelstionship> previledgeRelstionshipsForParentPreviledgeId = new HashSet<PreviledgeRelstionship>(
			0);
	private Set<TopicAccessMode> topicAccessModes = new HashSet<TopicAccessMode>(0);
	private Set<CourseAccessMode> courseAccessModes_1 = new HashSet<CourseAccessMode>(0);
	private Set<ProgramAccessMode> programAccessModes = new HashSet<ProgramAccessMode>(0);
	private Set<TestAccessMode> testAccessModes = new HashSet<TestAccessMode>(0);
	private Set<PreviledgeRelstionship> previledgeRelstionshipsForParentPreviledgeId_1 = new HashSet<PreviledgeRelstionship>(
			0);
	private Set<PreviledgeRelstionship> previledgeRelstionshipsForChildPreviledgeId = new HashSet<PreviledgeRelstionship>(
			0);
	private Set<QuestionAccessMode> questionAccessModes_1 = new HashSet<QuestionAccessMode>(0);
	private Set<TestAccessMode> testAccessModes_1 = new HashSet<TestAccessMode>(0);
	private Set<ProgramAccessMode> programAccessModes_1 = new HashSet<ProgramAccessMode>(0);
	private Set<TopicAccessMode> topicAccessModes_1 = new HashSet<TopicAccessMode>(0);
	private Set<PreviledgeRelstionship> previledgeRelstionshipsForChildPreviledgeId_1 = new HashSet<PreviledgeRelstionship>(
			0);
	private Set<RolePreviledgeMap> rolePreviledgeMaps_1 = new HashSet<RolePreviledgeMap>(0);

	public Previledge() {
	}

	public Previledge(String previledgeCode, String previledgeDesc) {
		this.previledgeCode = previledgeCode;
		this.previledgeDesc = previledgeDesc;
	}

	public Previledge(String previledgeCode, String previledgeDesc, Set<CourseAccessMode> courseAccessModes,
			Set<RolePreviledgeMap> rolePreviledgeMaps, Set<QuestionAccessMode> questionAccessModes,
			Set<PreviledgeRelstionship> previledgeRelstionshipsForParentPreviledgeId,
			Set<TopicAccessMode> topicAccessModes, Set<CourseAccessMode> courseAccessModes_1,
			Set<ProgramAccessMode> programAccessModes, Set<TestAccessMode> testAccessModes,
			Set<PreviledgeRelstionship> previledgeRelstionshipsForParentPreviledgeId_1,
			Set<PreviledgeRelstionship> previledgeRelstionshipsForChildPreviledgeId,
			Set<QuestionAccessMode> questionAccessModes_1, Set<TestAccessMode> testAccessModes_1,
			Set<ProgramAccessMode> programAccessModes_1, Set<TopicAccessMode> topicAccessModes_1,
			Set<PreviledgeRelstionship> previledgeRelstionshipsForChildPreviledgeId_1,
			Set<RolePreviledgeMap> rolePreviledgeMaps_1) {
		this.previledgeCode = previledgeCode;
		this.previledgeDesc = previledgeDesc;
		this.courseAccessModes = courseAccessModes;
		this.rolePreviledgeMaps = rolePreviledgeMaps;
		this.questionAccessModes = questionAccessModes;
		this.previledgeRelstionshipsForParentPreviledgeId = previledgeRelstionshipsForParentPreviledgeId;
		this.topicAccessModes = topicAccessModes;
		this.courseAccessModes_1 = courseAccessModes_1;
		this.programAccessModes = programAccessModes;
		this.testAccessModes = testAccessModes;
		this.previledgeRelstionshipsForParentPreviledgeId_1 = previledgeRelstionshipsForParentPreviledgeId_1;
		this.previledgeRelstionshipsForChildPreviledgeId = previledgeRelstionshipsForChildPreviledgeId;
		this.questionAccessModes_1 = questionAccessModes_1;
		this.testAccessModes_1 = testAccessModes_1;
		this.programAccessModes_1 = programAccessModes_1;
		this.topicAccessModes_1 = topicAccessModes_1;
		this.previledgeRelstionshipsForChildPreviledgeId_1 = previledgeRelstionshipsForChildPreviledgeId_1;
		this.rolePreviledgeMaps_1 = rolePreviledgeMaps_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "previledge_id", unique = true, nullable = false)
	public Integer getPreviledgeId() {
		return this.previledgeId;
	}

	public void setPreviledgeId(Integer previledgeId) {
		this.previledgeId = previledgeId;
	}

	@Column(name = "previledge_code", nullable = false, length = 100)
	public String getPreviledgeCode() {
		return this.previledgeCode;
	}

	public void setPreviledgeCode(String previledgeCode) {
		this.previledgeCode = previledgeCode;
	}

	@Column(name = "previledge_desc", nullable = false, length = 65535)
	public String getPreviledgeDesc() {
		return this.previledgeDesc;
	}

	public void setPreviledgeDesc(String previledgeDesc) {
		this.previledgeDesc = previledgeDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "previledge")
	public Set<CourseAccessMode> getCourseAccessModes() {
		return this.courseAccessModes;
	}

	public void setCourseAccessModes(Set<CourseAccessMode> courseAccessModes) {
		this.courseAccessModes = courseAccessModes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "previledge")
	public Set<RolePreviledgeMap> getRolePreviledgeMaps() {
		return this.rolePreviledgeMaps;
	}

	public void setRolePreviledgeMaps(Set<RolePreviledgeMap> rolePreviledgeMaps) {
		this.rolePreviledgeMaps = rolePreviledgeMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "previledge")
	public Set<QuestionAccessMode> getQuestionAccessModes() {
		return this.questionAccessModes;
	}

	public void setQuestionAccessModes(Set<QuestionAccessMode> questionAccessModes) {
		this.questionAccessModes = questionAccessModes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "previledgeByParentPreviledgeId")
	public Set<PreviledgeRelstionship> getPreviledgeRelstionshipsForParentPreviledgeId() {
		return this.previledgeRelstionshipsForParentPreviledgeId;
	}

	public void setPreviledgeRelstionshipsForParentPreviledgeId(
			Set<PreviledgeRelstionship> previledgeRelstionshipsForParentPreviledgeId) {
		this.previledgeRelstionshipsForParentPreviledgeId = previledgeRelstionshipsForParentPreviledgeId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "previledge")
	public Set<TopicAccessMode> getTopicAccessModes() {
		return this.topicAccessModes;
	}

	public void setTopicAccessModes(Set<TopicAccessMode> topicAccessModes) {
		this.topicAccessModes = topicAccessModes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "previledge")
	public Set<CourseAccessMode> getCourseAccessModes_1() {
		return this.courseAccessModes_1;
	}

	public void setCourseAccessModes_1(Set<CourseAccessMode> courseAccessModes_1) {
		this.courseAccessModes_1 = courseAccessModes_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "previledge")
	public Set<ProgramAccessMode> getProgramAccessModes() {
		return this.programAccessModes;
	}

	public void setProgramAccessModes(Set<ProgramAccessMode> programAccessModes) {
		this.programAccessModes = programAccessModes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "previledge")
	public Set<TestAccessMode> getTestAccessModes() {
		return this.testAccessModes;
	}

	public void setTestAccessModes(Set<TestAccessMode> testAccessModes) {
		this.testAccessModes = testAccessModes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "previledgeByParentPreviledgeId")
	public Set<PreviledgeRelstionship> getPreviledgeRelstionshipsForParentPreviledgeId_1() {
		return this.previledgeRelstionshipsForParentPreviledgeId_1;
	}

	public void setPreviledgeRelstionshipsForParentPreviledgeId_1(
			Set<PreviledgeRelstionship> previledgeRelstionshipsForParentPreviledgeId_1) {
		this.previledgeRelstionshipsForParentPreviledgeId_1 = previledgeRelstionshipsForParentPreviledgeId_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "previledgeByChildPreviledgeId")
	public Set<PreviledgeRelstionship> getPreviledgeRelstionshipsForChildPreviledgeId() {
		return this.previledgeRelstionshipsForChildPreviledgeId;
	}

	public void setPreviledgeRelstionshipsForChildPreviledgeId(
			Set<PreviledgeRelstionship> previledgeRelstionshipsForChildPreviledgeId) {
		this.previledgeRelstionshipsForChildPreviledgeId = previledgeRelstionshipsForChildPreviledgeId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "previledge")
	public Set<QuestionAccessMode> getQuestionAccessModes_1() {
		return this.questionAccessModes_1;
	}

	public void setQuestionAccessModes_1(Set<QuestionAccessMode> questionAccessModes_1) {
		this.questionAccessModes_1 = questionAccessModes_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "previledge")
	public Set<TestAccessMode> getTestAccessModes_1() {
		return this.testAccessModes_1;
	}

	public void setTestAccessModes_1(Set<TestAccessMode> testAccessModes_1) {
		this.testAccessModes_1 = testAccessModes_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "previledge")
	public Set<ProgramAccessMode> getProgramAccessModes_1() {
		return this.programAccessModes_1;
	}

	public void setProgramAccessModes_1(Set<ProgramAccessMode> programAccessModes_1) {
		this.programAccessModes_1 = programAccessModes_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "previledge")
	public Set<TopicAccessMode> getTopicAccessModes_1() {
		return this.topicAccessModes_1;
	}

	public void setTopicAccessModes_1(Set<TopicAccessMode> topicAccessModes_1) {
		this.topicAccessModes_1 = topicAccessModes_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "previledgeByChildPreviledgeId")
	public Set<PreviledgeRelstionship> getPreviledgeRelstionshipsForChildPreviledgeId_1() {
		return this.previledgeRelstionshipsForChildPreviledgeId_1;
	}

	public void setPreviledgeRelstionshipsForChildPreviledgeId_1(
			Set<PreviledgeRelstionship> previledgeRelstionshipsForChildPreviledgeId_1) {
		this.previledgeRelstionshipsForChildPreviledgeId_1 = previledgeRelstionshipsForChildPreviledgeId_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "previledge")
	public Set<RolePreviledgeMap> getRolePreviledgeMaps_1() {
		return this.rolePreviledgeMaps_1;
	}

	public void setRolePreviledgeMaps_1(Set<RolePreviledgeMap> rolePreviledgeMaps_1) {
		this.rolePreviledgeMaps_1 = rolePreviledgeMaps_1;
	}

}