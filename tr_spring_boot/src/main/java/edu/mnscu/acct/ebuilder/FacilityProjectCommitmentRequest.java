package edu.mnscu.acct.ebuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
/*
 * {
AccountCode: "00.1110"
CommitmentAmount: "0.10"
CommitmentDate: "09\/22\/2014"
CommitmentDescription: "test previous actor email address inclusion"
CommitmentNumber: "CIR - 00051"
CostCenterNumber: "891005"
FiscalYear: "9999"
FundingSource: "9999-891005-0999"
FundingSourceAmount: 0.05
Prefix: "CIR"
PreviousActor: "Todd Roden"
PreviousActorEmail: "Todd.Roden@so.mnscu.edu"
ProcessCounter: "51"
ProjectID: "88901"
RC_ID: "0070"
VendorName: "UNISOURCE WORLDWIDE INC, BROOKLYN PARK(001)"
VendorNumber: "0000203683-001"
}
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FacilityProjectCommitmentRequest {
	    private String projectId;
		private String rcId;
	    private String purchaseOrderNumber; 
	    private String occurrenceDate;   //Commitment Field: Commitment Date 
	    private String vendorNbr;
	    private String vendorId;
	    //private String vendorLocNbr;
	    private String vendorLocId;
	    private String description;      //Commitment Field: Description
	    private String objectCode;       //Commitment Item Field: Object Code
	    private Double amount;
	    private String fy;
	    private String costCenterNbr;

	    private String accountCode;
	    private String commitmentNumber; //Commitment Field: Commitment Number
	    private String prefix;           //Process Field: Prefix
	    private String processCounter;   //Process Field: Process Counter
	    private String previousActor;    
	    private String previousActorEmail;    
	    private String vendorName;
	    private String fundingSource;
		private String commitmentAmount;
		
		
		public FacilityProjectCommitmentRequest(String projectId, String rcId,
				String purchaseOrderNumber,
				String occurrenceDate, String vendorNbr, String vendorId,
				String vendorLocId, String description, String objectCode,
				Double amount, String fy, String costCenterNbr) {
			this.projectId = projectId;
			this.rcId = rcId;
			this.purchaseOrderNumber = purchaseOrderNumber;
			this.occurrenceDate = occurrenceDate;
			this.vendorNbr = vendorNbr;
			this.vendorId = vendorId;
			//this.vendorLocNbr = vendorLocNbr;
			this.vendorLocId = vendorLocId;
			this.description = description;
			this.objectCode = objectCode;
			this.amount = amount;
			this.fy = fy;
			this.costCenterNbr = costCenterNbr;
		}
		
		public FacilityProjectCommitmentRequest(String projectId, String rcId,
				String purchaseOrderNumber,
				String occurrenceDate, String vendorNbr, String vendorId,
				String vendorLocId, String description, String objectCode,
				Double amount, String fy, String costCenterNbr,
				String accountCode, String commitmentNumber, 
				String prefix, String processCounter) {
			
			this(projectId, rcId,
					purchaseOrderNumber,
					occurrenceDate, vendorNbr, vendorId,
					vendorLocId, description, objectCode,
					amount, fy, costCenterNbr);
			
			this.accountCode = accountCode;
			this.commitmentNumber = commitmentNumber;
			this.prefix = prefix;
			this.processCounter = processCounter;
			
		}
		

		
		public FacilityProjectCommitmentRequest() {
			
		} 
		

		public String getProjectId() {
			return projectId;
		}
		@JsonProperty("ProjectID")
		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		
		public String getRcId() {
			return rcId;
		}
		@JsonProperty("RC_ID")
		public void setRcId(String rcId) {
			this.rcId = rcId;
		}

		
		public String getPurchaseOrderNumber() {
			return purchaseOrderNumber;
		}
		public void setPurchaseOrderNumber(String purchaseOrderNumber) {
			this.purchaseOrderNumber = purchaseOrderNumber;
		} 
		
		
		public String getOccurrenceDate() {
			return occurrenceDate;
		}
		@JsonProperty("CommitmentDate")
		public void setOccurrenceDate(String occurrenceDate) {
			this.occurrenceDate = occurrenceDate;
		}
		public Date getOccurrenceDateAsDate() {
			if (StringUtils.isNotEmpty(occurrenceDate)) {
				SimpleDateFormat df = new SimpleDateFormat("mm/dd/yyyy");
				df.setLenient(false);
				try {
					return df.parse(occurrenceDate);
				} catch(ParseException pe) {
				}
			}
			return null;
		}
		
		
		public String getVendorNbr() {
			return vendorNbr;
		}
		@JsonProperty("VendorNumber")
		public void setVendorNbr(String vendorNbr) {
			this.vendorNbr = vendorNbr;
		}

		
		public String getVendorId() {
			return StringUtils.substringBefore(vendorNbr, "-");
			//return vendorId;
		}
		public void setVendorId(String vendorId) {
			this.vendorId = vendorId;
		}

		
		public String getVendorLocId() {
			return StringUtils.substringAfter(vendorNbr, "-");
			//return vendorLocId;
		}
		public void setVendorLocId(String vendorLocId) {
			this.vendorLocId = vendorLocId;
		}

		
		public String getDescription() {
			return description;
		}
		@JsonProperty("CommitmentDescription")
		public void setDescription(String description) {
			this.description = description;
		}

		
		public String getObjectCode() {
			return StringUtils.substringAfter(accountCode, ".");
			//return objectCode;
		}
		public void setObjectCode(String objectCode) {
			this.objectCode = objectCode;
		}

		
		public Double getAmount() {
			return amount;
		}
		@JsonProperty("FundingSourceAmount")
		public void setAmount(Double amount) {
			this.amount = amount;
		}

		
		public String getFy() {
			return fy;
		}
		@JsonProperty("FiscalYear")
		public void setFy(String fy) {
			this.fy = fy;
		}

		
		public String getCostCenterNbr() {
			return costCenterNbr;
		}
		@JsonProperty("CostCenterNumber")
		public void setCostCenterNbr(String costCenterNbr) {
			this.costCenterNbr = costCenterNbr;
		}

		
		public String getAccountCode() {
			return accountCode;
		}
		@JsonProperty("AccountCode")
		public void setAccountCode(String accountCode) {
			this.accountCode = accountCode;
		}

		
		public String getCommitmentNumber() {
			return commitmentNumber;
		}
		@JsonProperty("CommitmentNumber")
		public void setCommitmentNumber(String commitmentNumber) {
			this.commitmentNumber = commitmentNumber;
		}

		
		public String getPrefix() {
			return prefix;
		}
		@JsonProperty("Prefix")
		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}

		
		public String getProcessCounter() {
			return processCounter;
		}
		@JsonProperty("ProcessCounter")
		public void setProcessCounter(String processCounter) {
			this.processCounter = processCounter;
		}

		
		public String getPreviousActor() {
			return previousActor;
		}
		@JsonProperty("PreviousActor")
		public void setPreviousActor(String previousActor) {
			this.previousActor = previousActor;
		}

		
		public String getPreviousActorEmail() {
			return previousActorEmail;
		}
		@JsonProperty("PreviousActorEmail")
		public void setPreviousActorEmail(String previousActorEmail) {
			this.previousActorEmail = previousActorEmail;
		}

		
		public String getVendorName() {
			return vendorName;
		}
		@JsonProperty("VendorName")
		public void setVendorName(String vendorName) {
			this.vendorName = vendorName;
		}

		
		public String getFundingSource() {
			return fundingSource;
		}
		@JsonProperty("FundingSource")
		public void setFundingSource(String fundingSource) {
			this.fundingSource = fundingSource;
		}

		/**
		 * @return the commitmentAmount
		 */
		public String getCommitmentAmount() {
			return commitmentAmount;
		}
		/**
		 * @param commitmentAmount the commitmentAmount to set
		 */
		@JsonProperty("CommitmentAmount")
		public void setCommitmentAmount(String commitmentAmount) {
			this.commitmentAmount = commitmentAmount;
		}


		@Override
		public String toString() {
			return "FacilityProjectCommitmentRequest [projectId=" + projectId
					+ ", rcId=" + rcId + ", purchaseOrderNumber="
					+ purchaseOrderNumber + ", occurrenceDate="
					+ occurrenceDate + ", vendorNbr=" + vendorNbr
					+ ", vendorId=" + vendorId + ", vendorLocId=" + vendorLocId
					+ ", description=" + description + ", objectCode="
					+ objectCode + ", amount=" + amount + ", fy=" + fy
					+ ", costCenterNbr=" + costCenterNbr + ", accountCode="
					+ accountCode + ", commitmentNumber=" + commitmentNumber
					+ ", prefix=" + prefix + ", processCounter="
					+ processCounter + ", previousActor=" + previousActor
					+ ", previousActorEmail=" + previousActorEmail
					+ ", vendorName=" + vendorName + ", fundingSource="
					+ fundingSource + ", commitmentAmount=" + commitmentAmount
					+ "]";
		}
		
}



