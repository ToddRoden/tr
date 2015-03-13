package edu.mnscu.acct.ebuilder;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
{
   "TransactionID":"TRANID123",		The transaction ID generated in ISRS
   "CommitmentNumber":"CM-0003",	The commitment number to approve in e-builder
   "UserName":"isrs",				A predefined user in e-builder 
   "Comments":"Sample Comments",	Some comments
   "MnScuID":"mnID123",				MNSCU generated ID
   "TransactionDate":"1/12/2000"	Transaction Date of the transaction
}
 */



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FacilityProjectCommitmentApprovalRequest {
	private String transactionId;
	private String commitmentNumber;
    private String userName = "isrs";
	private String comments;
	private String mnscuId;
    private String transactionDate;
    private String poNbr;

	@JsonIgnore
    private Date updateTimeStamp;

	@JsonIgnore
    private String projectId;

	@JsonIgnore
    private String rcId;

    @JsonProperty("MnScuID")	
    public String getMnscuId() {
		return mnscuId;
	}
	public void setMnscuId(String mnscuId) {
		this.mnscuId = mnscuId;
	}

	@JsonProperty("TransactionID")
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	public Date getUpdateTimeStamp() {
		return updateTimeStamp;
	}
	public void setUpdateTimeStamp(Date updateTimeStamp) {
		this.updateTimeStamp = updateTimeStamp;
	}

	@JsonProperty("Comments")
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	@JsonProperty("PONumber")
	public String getPoNbr() {
		return poNbr;
	}
	public void setPoNbr(String poNbr) {
		this.poNbr = poNbr;
	}
	
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	
	public String getRcId() {
		return rcId;
	}
	public void setRcId(String rcId) {
		this.rcId = rcId;
	}

	@JsonProperty("CommitmentNumber")
	public String getCommitmentNumber() {
		return commitmentNumber;
	}
	public void setCommitmentNumber(String commitmentNumber) {
		this.commitmentNumber = commitmentNumber;
	}

	@JsonProperty("TransactionDate")
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public void setTransactionDate(Date updateTimeStamp) {
		SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy");		
		this.transactionDate = sf.format(updateTimeStamp);
	}

	@JsonProperty("UserName")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "FacilityProjectCommitmentApprovalRequest [transactionId="
				+ transactionId + ", commitmentNumber=" + commitmentNumber
				+ ", userName=" + userName + ", comments=" + comments
				+ ", mnscuId=" + mnscuId + ", transactionDate="
				+ transactionDate + ", poNbr=" + poNbr + ", updateTimeStamp="
				+ updateTimeStamp + ", projectId=" + projectId + ", rcId="
				+ rcId + "]";
	}

}

