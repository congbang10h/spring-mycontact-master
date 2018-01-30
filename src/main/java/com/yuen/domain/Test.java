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
 * Test generated by hbm2java
 */
@Entity
@Table(name = "test", catalog = "test")
public class Test implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer testId;
	private Course course;
	private User user;
	private String testCode;
	private String testHeader;
	private String testFooter;
	private String testDesc;
	private Date testCreationDate;
	private Date testCreationTime;
	private Date testStartdate;
	private Date testStarttime;
	private int testDuration;
	private Set<TakerTestMap> takerTestMaps = new HashSet<TakerTestMap>(0);
	private Set<TestAccessMode> testAccessModes = new HashSet<TestAccessMode>(0);
	private Set<TestSection> testSections = new HashSet<TestSection>(0);
	private Set<TestSection> testSections_1 = new HashSet<TestSection>(0);
	private Set<TakerTestMap> takerTestMaps_1 = new HashSet<TakerTestMap>(0);
	private Set<TestAccessMode> testAccessModes_1 = new HashSet<TestAccessMode>(0);

	public Test() {
	}

	public Test(String testCode, String testHeader, String testFooter, Date testCreationDate, Date testCreationTime,
			Date testStartdate, Date testStarttime, int testDuration) {
		this.testCode = testCode;
		this.testHeader = testHeader;
		this.testFooter = testFooter;
		this.testCreationDate = testCreationDate;
		this.testCreationTime = testCreationTime;
		this.testStartdate = testStartdate;
		this.testStarttime = testStarttime;
		this.testDuration = testDuration;
	}

	public Test(Course course, User user, String testCode, String testHeader, String testFooter, String testDesc,
			Date testCreationDate, Date testCreationTime, Date testStartdate, Date testStarttime, int testDuration,
			Set<TakerTestMap> takerTestMaps, Set<TestAccessMode> testAccessModes, Set<TestSection> testSections,
			Set<TestSection> testSections_1, Set<TakerTestMap> takerTestMaps_1, Set<TestAccessMode> testAccessModes_1) {
		this.course = course;
		this.user = user;
		this.testCode = testCode;
		this.testHeader = testHeader;
		this.testFooter = testFooter;
		this.testDesc = testDesc;
		this.testCreationDate = testCreationDate;
		this.testCreationTime = testCreationTime;
		this.testStartdate = testStartdate;
		this.testStarttime = testStarttime;
		this.testDuration = testDuration;
		this.takerTestMaps = takerTestMaps;
		this.testAccessModes = testAccessModes;
		this.testSections = testSections;
		this.testSections_1 = testSections_1;
		this.takerTestMaps_1 = takerTestMaps_1;
		this.testAccessModes_1 = testAccessModes_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "test_id", unique = true, nullable = false)
	public Integer getTestId() {
		return this.testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
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
	@JoinColumn(name = "user_id")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "test_code", nullable = false, length = 10)
	public String getTestCode() {
		return this.testCode;
	}

	public void setTestCode(String testCode) {
		this.testCode = testCode;
	}

	@Column(name = "test_header", nullable = false, length = 65535)
	public String getTestHeader() {
		return this.testHeader;
	}

	public void setTestHeader(String testHeader) {
		this.testHeader = testHeader;
	}

	@Column(name = "test_footer", nullable = false, length = 65535)
	public String getTestFooter() {
		return this.testFooter;
	}

	public void setTestFooter(String testFooter) {
		this.testFooter = testFooter;
	}

	@Column(name = "test_desc", length = 65535)
	public String getTestDesc() {
		return this.testDesc;
	}

	public void setTestDesc(String testDesc) {
		this.testDesc = testDesc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "test_creation_date", nullable = false, length = 10)
	public Date getTestCreationDate() {
		return this.testCreationDate;
	}

	public void setTestCreationDate(Date testCreationDate) {
		this.testCreationDate = testCreationDate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "test_creation_time", nullable = false, length = 8)
	public Date getTestCreationTime() {
		return this.testCreationTime;
	}

	public void setTestCreationTime(Date testCreationTime) {
		this.testCreationTime = testCreationTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "test_startdate", nullable = false, length = 10)
	public Date getTestStartdate() {
		return this.testStartdate;
	}

	public void setTestStartdate(Date testStartdate) {
		this.testStartdate = testStartdate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "test_starttime", nullable = false, length = 8)
	public Date getTestStarttime() {
		return this.testStarttime;
	}

	public void setTestStarttime(Date testStarttime) {
		this.testStarttime = testStarttime;
	}

	@Column(name = "test_duration", nullable = false)
	public int getTestDuration() {
		return this.testDuration;
	}

	public void setTestDuration(int testDuration) {
		this.testDuration = testDuration;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
	public Set<TakerTestMap> getTakerTestMaps() {
		return this.takerTestMaps;
	}

	public void setTakerTestMaps(Set<TakerTestMap> takerTestMaps) {
		this.takerTestMaps = takerTestMaps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
	public Set<TestAccessMode> getTestAccessModes() {
		return this.testAccessModes;
	}

	public void setTestAccessModes(Set<TestAccessMode> testAccessModes) {
		this.testAccessModes = testAccessModes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
	public Set<TestSection> getTestSections() {
		return this.testSections;
	}

	public void setTestSections(Set<TestSection> testSections) {
		this.testSections = testSections;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
	public Set<TestSection> getTestSections_1() {
		return this.testSections_1;
	}

	public void setTestSections_1(Set<TestSection> testSections_1) {
		this.testSections_1 = testSections_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
	public Set<TakerTestMap> getTakerTestMaps_1() {
		return this.takerTestMaps_1;
	}

	public void setTakerTestMaps_1(Set<TakerTestMap> takerTestMaps_1) {
		this.takerTestMaps_1 = takerTestMaps_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
	public Set<TestAccessMode> getTestAccessModes_1() {
		return this.testAccessModes_1;
	}

	public void setTestAccessModes_1(Set<TestAccessMode> testAccessModes_1) {
		this.testAccessModes_1 = testAccessModes_1;
	}

}