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
 * QuestionTakerCommentRelationship generated by hbm2java
 */
@Entity
@Table(name = "question_taker_comment_relationship", catalog = "test")
public class QuestionTakerCommentRelationship implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer questionTakerCommentRelationshipId;
	private QuestionTakerComment questionTakerCommentByParentQuestionTakerCommentId;
	private QuestionTakerComment questionTakerCommentByChildQuestionTakerCommentId;
	private String questionTakerCommentRelationshipDesc;

	public QuestionTakerCommentRelationship() {
	}

	public QuestionTakerCommentRelationship(QuestionTakerComment questionTakerCommentByParentQuestionTakerCommentId,
			QuestionTakerComment questionTakerCommentByChildQuestionTakerCommentId,
			String questionTakerCommentRelationshipDesc) {
		this.questionTakerCommentByParentQuestionTakerCommentId = questionTakerCommentByParentQuestionTakerCommentId;
		this.questionTakerCommentByChildQuestionTakerCommentId = questionTakerCommentByChildQuestionTakerCommentId;
		this.questionTakerCommentRelationshipDesc = questionTakerCommentRelationshipDesc;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "question_taker_comment_relationship_id", unique = true, nullable = false)
	public Integer getQuestionTakerCommentRelationshipId() {
		return this.questionTakerCommentRelationshipId;
	}

	public void setQuestionTakerCommentRelationshipId(Integer questionTakerCommentRelationshipId) {
		this.questionTakerCommentRelationshipId = questionTakerCommentRelationshipId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_question_taker_comment_id")
	public QuestionTakerComment getQuestionTakerCommentByParentQuestionTakerCommentId() {
		return this.questionTakerCommentByParentQuestionTakerCommentId;
	}

	public void setQuestionTakerCommentByParentQuestionTakerCommentId(
			QuestionTakerComment questionTakerCommentByParentQuestionTakerCommentId) {
		this.questionTakerCommentByParentQuestionTakerCommentId = questionTakerCommentByParentQuestionTakerCommentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "child_question_taker_comment_id")
	public QuestionTakerComment getQuestionTakerCommentByChildQuestionTakerCommentId() {
		return this.questionTakerCommentByChildQuestionTakerCommentId;
	}

	public void setQuestionTakerCommentByChildQuestionTakerCommentId(
			QuestionTakerComment questionTakerCommentByChildQuestionTakerCommentId) {
		this.questionTakerCommentByChildQuestionTakerCommentId = questionTakerCommentByChildQuestionTakerCommentId;
	}

	@Column(name = "question_taker_comment_relationship_desc", length = 65535)
	public String getQuestionTakerCommentRelationshipDesc() {
		return this.questionTakerCommentRelationshipDesc;
	}

	public void setQuestionTakerCommentRelationshipDesc(String questionTakerCommentRelationshipDesc) {
		this.questionTakerCommentRelationshipDesc = questionTakerCommentRelationshipDesc;
	}

}