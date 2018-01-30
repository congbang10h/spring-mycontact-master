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
 * Peo generated by hbm2java
 */
@Entity
@Table(name = "peo", catalog = "test")
public class Peo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer peoId;
	private PeoVersion peoVersion;
	private String peoCode;
	private String peoDescVn;
	private String peoDescEn;
	private Set<MissionPeoMap> missionPeoMaps = new HashSet<MissionPeoMap>(0);
	private Set<PeoComment> peoComments = new HashSet<PeoComment>(0);
	private Set<MissionPeoMap> missionPeoMaps_1 = new HashSet<MissionPeoMap>(0);
	private Set<PeoComment> peoComments_1 = new HashSet<PeoComment>(0);
	private Set<PeoSoMap> peoSoMaps = new HashSet<PeoSoMap>(0);
	private Set<PeoSoMap> peoSoMaps_1 = new HashSet<PeoSoMap>(0);

	public Peo() {
	}

	public Peo(String peoCode, String peoDescVn, String peoDescEn) {
		this.peoCode = peoCode;
		this.peoDescVn = peoDescVn;
		this.peoDescEn = peoDescEn;
	}

	public Peo(PeoVersion peoVersion, String peoCode, String peoDescVn, String peoDescEn,
			Set<MissionPeoMap> missionPeoMaps, Set<PeoComment> peoComments, Set<MissionPeoMap> missionPeoMaps_1,
			Set<PeoComment> peoComments_1, Set<PeoSoMap> peoSoMaps, Set<PeoSoMap> peoSoMaps_1) {
		this.peoVersion = peoVersion;
		this.peoCode = peoCode;
		this.peoDescVn = peoDescVn;
		this.peoDescEn = peoDescEn;
		this.missionPeoMaps = missionPeoMaps;
		this.peoComments = peoComments;
		this.missionPeoMaps_1 = missionPeoMaps_1;
		this.peoComments_1 = peoComments_1;
		this.peoSoMaps = peoSoMaps;
		this.peoSoMaps_1 = peoSoMaps_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "peo_id", unique = true, nullable = false)
	public Integer getPeoId() {
		return this.peoId;
	}

	public void setPeoId(Integer peoId) {
		this.peoId = peoId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "peo_version_id")
	public PeoVersion getPeoVersion() {
		return this.peoVersion;
	}

	public void setPeoVersion(PeoVersion peoVersion) {
		this.peoVersion = peoVersion;
	}

	@Column(name = "peo_code", nullable = false, length = 5)
	public String getPeoCode() {
		return this.peoCode;
	}

	public void setPeoCode(String peoCode) {
		this.peoCode = peoCode;
	}

	@Column(name = "peo_desc_vn", nullable = false, length = 65535)
	public String getPeoDescVn() {
		return this.peoDescVn;
	}

	public void setPeoDescVn(String peoDescVn) {
		this.peoDescVn = peoDescVn;
	}

	@Column(name = "peo_desc_en", nullable = false, length = 65535)
	public String getPeoDescEn() {
		return this.peoDescEn;
	}

	public void setPeoDescEn(String peoDescEn) {
		this.peoDescEn = peoDescEn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "peo")
	public Set<MissionPeoMap> getMissionPeoMaps() {
		return this.missionPeoMaps;
	}

	public void setMissionPeoMaps(Set<MissionPeoMap> missionPeoMaps) {
		this.missionPeoMaps = missionPeoMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "peo")
	public Set<PeoComment> getPeoComments() {
		return this.peoComments;
	}

	public void setPeoComments(Set<PeoComment> peoComments) {
		this.peoComments = peoComments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "peo")
	public Set<MissionPeoMap> getMissionPeoMaps_1() {
		return this.missionPeoMaps_1;
	}

	public void setMissionPeoMaps_1(Set<MissionPeoMap> missionPeoMaps_1) {
		this.missionPeoMaps_1 = missionPeoMaps_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "peo")
	public Set<PeoComment> getPeoComments_1() {
		return this.peoComments_1;
	}

	public void setPeoComments_1(Set<PeoComment> peoComments_1) {
		this.peoComments_1 = peoComments_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "peo")
	public Set<PeoSoMap> getPeoSoMaps() {
		return this.peoSoMaps;
	}

	public void setPeoSoMaps(Set<PeoSoMap> peoSoMaps) {
		this.peoSoMaps = peoSoMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "peo")
	public Set<PeoSoMap> getPeoSoMaps_1() {
		return this.peoSoMaps_1;
	}

	public void setPeoSoMaps_1(Set<PeoSoMap> peoSoMaps_1) {
		this.peoSoMaps_1 = peoSoMaps_1;
	}

}
