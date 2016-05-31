/**
 * 
 */
package com.govind.springData.oracle;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Proxy;



/**
 * @author govindaraju.v
 *
 */
@Entity
@Table(name="USER_LOGGED_IN")
@Proxy(lazy=false)
public class UsersLoggedInVO {
	private Integer userLoggedId;
	private Long userLoggedPrsId;
	private Integer prsSessionId;
	private String timeOutFlag;
	private Date loginTime;
	private Date logoutTime;
	
	@Column(name="USER_LOGGED_ID")
	@Id
	@GeneratedValue(generator = "assigned")
	//@GeneratedValue( strategy=GenerationType.SEQUENCE,   generator="SEQ_ULI_USER_LOGGED_IDGenerator")
	//@GenericGenerator(name = "SEQ_ULI_USER_LOGGED_IDGenerator", strategy = "sequence",parameters=@Parameter(name="sequence",value="SEQ_ULI_USER_LOGGED_ID"))
	public Integer getUserLoggedId() {
		return userLoggedId;
	}
	public void setUserLoggedId(Integer userLoggedId) {
		this.userLoggedId = userLoggedId;
	}
	@Column(name="USER_LOGGED_PRS_ID")
	public Long getUserLoggedPrsId() {
		return userLoggedPrsId;
	}
	public void setUserLoggedPrsId(Long userLoggedPrsId) {
		this.userLoggedPrsId = userLoggedPrsId;
	}
	@Column(name="PRS_SESSION_ID")
	public Integer getPrsSessionId() {
		return prsSessionId;
	}
	public void setPrsSessionId(Integer prsSessionId) {
		this.prsSessionId = prsSessionId;
	}
	@Column(name="TIMEOUT_FLAG")
	public String getTimeOutFlag() {
		return timeOutFlag;
	}
	public void setTimeOutFlag(String timeOutFlag) {
		this.timeOutFlag = timeOutFlag;
	}
	@Column(name="LOGIN_TIME")
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		//setLoginTimeStr(WWCCUtils.convertDateTimeToStrFormat(loginTime));
		this.loginTime = loginTime;
	}
	@Column(name="LOGOUT_TIME")
	public Date getLogoutTime() {
		return logoutTime;
	}
	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}
}
