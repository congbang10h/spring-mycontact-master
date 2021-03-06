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
 * QuestionGroup generated by hbm2java
 */
@Entity
@Table(name = "question_group", catalog = "test")
public class QuestionGroup implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer questionGroupId;
	private User user;
	private String questionGroupDesc;
	private Set<QgroupContentMap> qgroupContentMaps = new HashSet<QgroupContentMap>(0);
	private Set<QgroupQuestionMap> qgroupQuestionMaps = new HashSet<QgroupQuestionMap>(0);
	private Set<QgroupQuestionMap> qgroupQuestionMaps_1 = new HashSet<QgroupQuestionMap>(0);
	private Set<QgroupTopicMap> qgroupTopicMaps = new HashSet<QgroupTopicMap>(0);
	private Set<QgroupContentMap> qgroupContentMaps_1 = new HashSet<QgroupContentMap>(0);
	private Set<QgroupTopicMap> qgroupTopicMaps_1 = new HashSet<QgroupTopicMap>(0);

	public QuestionGroup() {
	}

	public QuestionGroup(String questionGroupDesc) {
		this.questionGroupDesc = questionGroupDesc;
	}

	public QuestionGroup(User user, String questionGroupDesc, Set<QgroupContentMap> qgroupContentMaps,
			Set<QgroupQuestionMap> qgroupQuestionMaps, Set<QgroupQuestionMap> qgroupQuestionMaps_1,
			Set<QgroupTopicMap> qgroupTopicMaps, Set<QgroupContentMap> qgroupContentMaps_1,
			Set<QgroupTopicMap> qgroupTopicMaps_1) {
		this.user = user;
		this.questionGroupDesc = questionGroupDesc;
		this.qgroupContentMaps = qgroupContentMaps;
		this.qgroupQuestionMaps = qgroupQuestionMaps;
		this.qgroupQuestionMaps_1 = qgroupQuestionMaps_1;
		this.qgroupTopicMaps = qgroupTopicMaps;
		this.qgroupContentMaps_1 = qgroupContentMaps_1;
		this.qgroupTopicMaps_1 = qgroupTopicMaps_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "question_group_id", unique = true, nullable = false)
	public Integer getQuestionGroupId() {
		return this.questionGroupId;
	}

	public void setQuestionGroupId(Integer questionGroupId) {
		this.questionGroupId = questionGroupId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "question_group_desc", nullable = false, length = 65535)
	public String getQuestionGroupDesc() {
		return this.questionGroupDesc;
	}

	public void setQuestionGroupDesc(String questionGroupDesc) {
		this.questionGroupDesc = questionGroupDesc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionGroup")
	public Set<QgroupContentMap> getQgroupContentMaps() {
		return this.qgroupContentMaps;
	}

	public void setQgroupContentMaps(Set<QgroupContentMap> qgroupContentMaps) {
		this.qgroupContentMaps = qgroupContentMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionGroup")
	public Set<QgroupQuestionMap> getQgroupQuestionMaps() {
		return this.qgroupQuestionMaps;
	}

	public void setQgroupQuestionMaps(Set<QgroupQuestionMap> qgroupQuestionMaps) {
		this.qgroupQuestionMaps = qgroupQuestionMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionGroup")
	public Set<QgroupQuestionMap> getQgroupQuestionMaps_1() {
		return this.qgroupQuestionMaps_1;
	}

	public void setQgroupQuestionMaps_1(Set<QgroupQuestionMap> qgroupQuestionMaps_1) {
		this.qgroupQuestionMaps_1 = qgroupQuestionMaps_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionGroup")
	public Set<QgroupTopicMap> getQgroupTopicMaps() {
		return this.qgroupTopicMaps;
	}

	public void setQgroupTopicMaps(Set<QgroupTopicMap> qgroupTopicMaps) {
		this.qgroupTopicMaps = qgroupTopicMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionGroup")
	public Set<QgroupContentMap> getQgroupContentMaps_1() {
		return this.qgroupContentMaps_1;
	}

	public void setQgroupContentMaps_1(Set<QgroupContentMap> qgroupContentMaps_1) {
		this.qgroupContentMaps_1 = qgroupContentMaps_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "questionGroup")
	public Set<QgroupTopicMap> getQgroupTopicMaps_1() {
		return this.qgroupTopicMaps_1;
	}

	public void setQgroupTopicMaps_1(Set<QgroupTopicMap> qgroupTopicMaps_1) {
		this.qgroupTopicMaps_1 = qgroupTopicMaps_1;
	}

}
