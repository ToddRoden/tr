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

public class FacilityProjectCommitmentChangeApprovalRequest {
	private String transactionId;
	private String commitmentChangeNumber;
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
    @JsonProperty("MnScuID")
	public void setMnscuId(String mnscuId) {
		this.mnscuId = mnscuId;
	}
	
    @JsonProperty("TransactionID")
	public String getTransactionId() {
		return transactionId;
	}
	@JsonProperty("TransactionID")
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
	@JsonProperty("Comments")
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

	@JsonProperty("CommitmentChangeNumber")
	public String getCommitmentChangeNumber() {
		return commitmentChangeNumber;
	}
	@JsonProperty("CommitmentChangeNumber")
	public void setCommitmentChangeNumber(String commitmentChangeNumber) {
		this.commitmentChangeNumber = commitmentChangeNumber;
	}

	@JsonProperty("TransactionDate")
	public String getTransactionDate() {
		return transactionDate;
	}
	@JsonProperty("TransactionDate")
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	@JsonProperty("TransactionDate")
	public void setTransactionDate(Date updateTimeStamp) {
		SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy");		
		this.transactionDate = sf.format(updateTimeStamp);
	}

	@JsonProperty("UserName")
	public String getUserName() {
		return userName;
	}
	@JsonProperty("UserName")
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "FacilityProjectCommitmentChangeApprovalRequest [transactionId="
				+ transactionId + ", commitmentChangeNumber="
				+ commitmentChangeNumber + ", userName=" + userName
				+ ", comments=" + comments + ", mnscuId=" + mnscuId
				+ ", transactionDate=" + transactionDate + ", poNbr=" + poNbr
				+ ", updateTimeStamp=" + updateTimeStamp + ", projectId="
				+ projectId + ", rcId=" + rcId + "]";
	}

}

