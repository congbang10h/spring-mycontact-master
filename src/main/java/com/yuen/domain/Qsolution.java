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
 * Qsolution generated by hbm2java
 */
@Entity
@Table(name = "qsolution", catalog = "test")
public class Qsolution implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer qsolutionId;
	private Question question;
	private Set<QsolutionComponent> qsolutionComponents = new HashSet<QsolutionComponent>(0);
	private Set<QsolutionComponent> qsolutionComponents_1 = new HashSet<QsolutionComponent>(0);

	public Qsolution() {
	}

	public Qsolution(Question question) {
		this.question = question;
	}

	public Qsolution(Question question, Set<QsolutionComponent> qsolutionComponents,
			Set<QsolutionComponent> qsolutionComponents_1) {
		this.question = question;
		this.qsolutionComponents = qsolutionComponents;
		this.qsolutionComponents_1 = qsolutionComponents_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "qsolution_id", unique = true, nullable = false)
	public Integer getQsolutionId() {
		return this.qsolutionId;
	}

	public void setQsolutionId(Integer qsolutionId) {
		this.qsolutionId = qsolutionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "question_id", nullable = false)
	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "qsolution")
	public Set<QsolutionComponent> getQsolutionComponents() {
		return this.qsolutionComponents;
	}

	public void setQsolutionComponents(Set<QsolutionComponent> qsolutionComponents) {
		this.qsolutionComponents = qsolutionComponents;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "qsolution")
	public Set<QsolutionComponent> getQsolutionComponents_1() {
		return this.qsolutionComponents_1;
	}

	public void setQsolutionComponents_1(Set<QsolutionComponent> qsolutionComponents_1) {
		this.qsolutionComponents_1 = qsolutionComponents_1;
	}

}
