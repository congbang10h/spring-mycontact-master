package com.yuen.domain;
// Generated Jan 30, 2018 7:35:01 PM by Hibernate Tools 5.0.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * QuestionAccessModeId generated by hbm2java
 */
@Embeddable
public class QuestionAccessModeId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int questionAccessModeId;
	private Date questionAccessModeGrantedDate;

	public QuestionAccessModeId() {
	}

	public QuestionAccessModeId(int questionAccessModeId, Date questionAccessModeGrantedDate) {
		this.questionAccessModeId = questionAccessModeId;
		this.questionAccessModeGrantedDate = questionAccessModeGrantedDate;
	}

	@Column(name = "question_access_mode_id", nullable = false)
	public int getQuestionAccessModeId() {
		return this.questionAccessModeId;
	}

	public void setQuestionAccessModeId(int questionAccessModeId) {
		this.questionAccessModeId = questionAccessModeId;
	}

	@Column(name = "question_access_mode_granted_date", nullable = false, length = 10)
	public Date getQuestionAccessModeGrantedDate() {
		return this.questionAccessModeGrantedDate;
	}

	public void setQuestionAccessModeGrantedDate(Date questionAccessModeGrantedDate) {
		this.questionAccessModeGrantedDate = questionAccessModeGrantedDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof QuestionAccessModeId))
			return false;
		QuestionAccessModeId castOther = (QuestionAccessModeId) other;

		return (this.getQuestionAccessModeId() == castOther.getQuestionAccessModeId())
				&& ((this.getQuestionAccessModeGrantedDate() == castOther.getQuestionAccessModeGrantedDate())
						|| (this.getQuestionAccessModeGrantedDate() != null
								&& castOther.getQuestionAccessModeGrantedDate() != null
								&& this.getQuestionAccessModeGrantedDate()
										.equals(castOther.getQuestionAccessModeGrantedDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getQuestionAccessModeId();
		result = 37 * result
				+ (getQuestionAccessModeGrantedDate() == null ? 0 : this.getQuestionAccessModeGrantedDate().hashCode());
		return result;
	}

}
