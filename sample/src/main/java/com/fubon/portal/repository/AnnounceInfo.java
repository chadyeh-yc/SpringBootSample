package com.fubon.portal.repository;

import com.fubon.datasource.Auditable;
import java.math.BigDecimal;
import java.util.Date;

public class AnnounceInfo extends Auditable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column MXACC.PORTAL_ANNOUNCE.PRIORITY
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	private BigDecimal priority;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column MXACC.PORTAL_ANNOUNCE.START_TIME
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	private Date startTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column MXACC.PORTAL_ANNOUNCE.END_TIME
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	private Date endTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column MXACC.PORTAL_ANNOUNCE.SN
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	private Short sn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column MXACC.PORTAL_ANNOUNCE.TITLE
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column MXACC.PORTAL_ANNOUNCE.CONTENT
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	private String content;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column MXACC.PORTAL_ANNOUNCE.PRIORITY
	 * @return  the value of MXACC.PORTAL_ANNOUNCE.PRIORITY
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	public BigDecimal getPriority() {
		return priority;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column MXACC.PORTAL_ANNOUNCE.PRIORITY
	 * @param priority  the value for MXACC.PORTAL_ANNOUNCE.PRIORITY
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	public void setPriority(BigDecimal priority) {
		this.priority = priority;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column MXACC.PORTAL_ANNOUNCE.START_TIME
	 * @return  the value of MXACC.PORTAL_ANNOUNCE.START_TIME
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column MXACC.PORTAL_ANNOUNCE.START_TIME
	 * @param startTime  the value for MXACC.PORTAL_ANNOUNCE.START_TIME
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column MXACC.PORTAL_ANNOUNCE.END_TIME
	 * @return  the value of MXACC.PORTAL_ANNOUNCE.END_TIME
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column MXACC.PORTAL_ANNOUNCE.END_TIME
	 * @param endTime  the value for MXACC.PORTAL_ANNOUNCE.END_TIME
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column MXACC.PORTAL_ANNOUNCE.SN
	 * @return  the value of MXACC.PORTAL_ANNOUNCE.SN
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	public Short getSn() {
		return sn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column MXACC.PORTAL_ANNOUNCE.SN
	 * @param sn  the value for MXACC.PORTAL_ANNOUNCE.SN
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	public void setSn(Short sn) {
		this.sn = sn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column MXACC.PORTAL_ANNOUNCE.TITLE
	 * @return  the value of MXACC.PORTAL_ANNOUNCE.TITLE
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column MXACC.PORTAL_ANNOUNCE.TITLE
	 * @param title  the value for MXACC.PORTAL_ANNOUNCE.TITLE
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column MXACC.PORTAL_ANNOUNCE.CONTENT
	 * @return  the value of MXACC.PORTAL_ANNOUNCE.CONTENT
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column MXACC.PORTAL_ANNOUNCE.CONTENT
	 * @param content  the value for MXACC.PORTAL_ANNOUNCE.CONTENT
	 * @mbg.generated  Mon Jun 08 14:54:53 CST 2020
	 */
	public void setContent(String content) {
		this.content = content;
	}
}