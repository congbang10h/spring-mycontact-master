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
 * SoComment generated by hbm2java
 */
@Entity
@Table(name = "so_comment", catalog = "test")
public class SoComment implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer soCommentId;
	private ProgramComment programComment;
	private ProgramDecision programDecision;
	private StudentOutcome studentOutcome;
	private Date soCommentDate;
	private Date soCommentTime;
	private String soCommentDesc;
	private Set<SoCommentRelationship> soCommentRelationshipsForChildSoCommentId = new HashSet<SoCommentRelationship>(
			0);
	private Set<SoCommentRelationship> soCommentRelationshipsForChildSoCommentId_1 = new HashSet<SoCommentRelationship>(
			0);
	private Set<SoCommentRelationship> soCommentRelationshipsForParentSoCommentId = new HashSet<SoCommentRelationship>(
			0);
	private Set<SoCommentRelationship> soCommentRelationshipsForParentSoCommentId_1 = new HashSet<SoCommentRelationship>(
			0);

	public SoComment() {
	}

	public SoComment(Date soCommentDate, String soCommentDesc) {
		this.soCommentDate = soCommentDate;
		this.soCommentDesc = soCommentDesc;
	}

	public SoComment(ProgramComment programComment, ProgramDecision programDecision, StudentOutcome studentOutcome,
			Date soCommentDate, Date soCommentTime, String soCommentDesc,
			Set<SoCommentRelationship> soCommentRelationshipsForChildSoCommentId,
			Set<SoCommentRelationship> soCommentRelationshipsForChildSoCommentId_1,
			Set<SoCommentRelationship> soCommentRelationshipsForParentSoCommentId,
			Set<SoCommentRelationship> soCommentRelationshipsForParentSoCommentId_1) {
		this.programComment = programComment;
		this.programDecision = programDecision;
		this.studentOutcome = studentOutcome;
		this.soCommentDate = soCommentDate;
		this.soCommentTime = soCommentTime;
		this.soCommentDesc = soCommentDesc;
		this.soCommentRelationshipsForChildSoCommentId = soCommentRelationshipsForChildSoCommentId;
		this.soCommentRelationshipsForChildSoCommentId_1 = soCommentRelationshipsForChildSoCommentId_1;
		this.soCommentRelationshipsForParentSoCommentId = soCommentRelationshipsForParentSoCommentId;
		this.soCommentRelationshipsForParentSoCommentId_1 = soCommentRelationshipsForParentSoCommentId_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "so_comment_id", unique = true, nullable = false)
	public Integer getSoCommentId() {
		return this.soCommentId;
	}

	public void setSoCommentId(Integer soCommentId) {
		this.soCommentId = soCommentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "program_comment_id")
	public ProgramComment getProgramComment() {
		return this.programComment;
	}

	public void setProgramComment(ProgramComment programComment) {
		this.programComment = programComment;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "program_decision_id")
	public ProgramDecision getProgramDecision() {
		return this.programDecision;
	}

	public void setProgramDecision(ProgramDecision programDecision) {
		this.programDecision = programDecision;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "so_id")
	public StudentOutcome getStudentOutcome() {
		return this.studentOutcome;
	}

	public void setStudentOutcome(StudentOutcome studentOutcome) {
		this.studentOutcome = studentOutcome;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "so_comment_date", nullable = false, length = 10)
	public Date getSoCommentDate() {
		return this.soCommentDate;
	}

	public void setSoCommentDate(Date soCommentDate) {
		this.soCommentDate = soCommentDate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "so_comment_time", length = 8)
	public Date getSoCommentTime() {
		return this.soCommentTime;
	}

	public void setSoCommentTime(Date soCommentTime) {
		this.soCommentTime = soCommentTime;
	}

	@Column(name = "so_comment_desc", nullable = false, length = 65535)
	public String getSoCommentDesc() {
		return this.soCommentDesc;
	}

	public void setSoCommentDesc(String soCommentDesc) {
		this.soCommentDesc = soCommentDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "soCommentByChildSoCommentId")
	public Set<SoCommentRelationship> getSoCommentRelationshipsForChildSoCommentId() {
		return this.soCommentRelationshipsForChildSoCommentId;
	}

	public void setSoCommentRelationshipsForChildSoCommentId(
			Set<SoCommentRelationship> soCommentRelationshipsForChildSoCommentId) {
		this.soCommentRelationshipsForChildSoCommentId = soCommentRelationshipsForChildSoCommentId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "soCommentByChildSoCommentId")
	public Set<SoCommentRelationship> getSoCommentRelationshipsForChildSoCommentId_1() {
		return this.soCommentRelationshipsForChildSoCommentId_1;
	}

	public void setSoCommentRelationshipsForChildSoCommentId_1(
			Set<SoCommentRelationship> soCommentRelationshipsForChildSoCommentId_1) {
		this.soCommentRelationshipsForChildSoCommentId_1 = soCommentRelationshipsForChildSoCommentId_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "soCommentByParentSoCommentId")
	public Set<SoCommentRelationship> getSoCommentRelationshipsForParentSoCommentId() {
		return this.soCommentRelationshipsForParentSoCommentId;
	}

	public void setSoCommentRelationshipsForParentSoCommentId(
			Set<SoCommentRelationship> soCommentRelationshipsForParentSoCommentId) {
		this.soCommentRelationshipsForParentSoCommentId = soCommentRelationshipsForParentSoCommentId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "soCommentByParentSoCommentId")
	public Set<SoCommentRelationship> getSoCommentRelationshipsForParentSoCommentId_1() {
		return this.soCommentRelationshipsForParentSoCommentId_1;
	}

	public void setSoCommentRelationshipsForParentSoCommentId_1(
			Set<SoCommentRelationship> soCommentRelationshipsForParentSoCommentId_1) {
		this.soCommentRelationshipsForParentSoCommentId_1 = soCommentRelationshipsForParentSoCommentId_1;
	}

}
