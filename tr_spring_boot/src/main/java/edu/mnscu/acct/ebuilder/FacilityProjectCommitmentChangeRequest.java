package edu.mnscu.acct.ebuilder;

import org.apache.commons.lang.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
      {
         "AccountCode":"100.205.00000",
         "CommitmentChangeDate":"07\/02\/2014",
         "CommitmentChangeDescription":"Draft Test",
         "CommitmentChangeNumber":"CCH - 00003",
         "CostCenterNumber":"S1",
         "FiscalYear":"2014",
         "FundingSource":"Source #1",
         "FundingSourceAmount":543.90000000000,
         "PONumber":"CPO",
         "PreviousActor":"Abel Norcisa",
         "ProcessCounter":"3",
         "ProcessPrefix":"CCH",
         "ProjectID":"PD123",
         "RC_ID":"0070"
      },
      
      {
		AccountCode: "00.1110"
		CommitmentChangeAmount: "0.05"
		CommitmentChangeDate: "09\/21\/2014"
		CommitmentChangeDescription: "Test commitmentChange process"
		CommitmentChangeNumber: "CCI - 00001"
		CostCenterNumber: "891006"
		FiscalYear: "2015"
		FundingSource: "2015-891006-0999"
		FundingSourceAmount: 0.03
		PONumber: "U03716"
		PreviousActor: "Todd Roden"
		PreviousActorEmail: ""
		ProcessCounter: "1"
		ProcessPrefix: "CCI"
		ProjectID: "88901"
		RC_ID: "0070"
	}
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class FacilityProjectCommitmentChangeRequest {
	    private String projectId;
		private String rcId;
	    private String purchaseOrderNumber; 
	    private String occurrenceDate;   //Commitment Field: CommitmentChangeDate 
	    private String description;      //Commitment Field: CommitmentChangeDescription
	    private String objectCode;       //Commitment Item Field: Object Code
	    private Double amount;
	    private String fy;
	    private String costCenterNbr;

	    private String accountCode;
	    private String commitmentNumber; //Commitment Field: CommitmentChangeNumber
	    private String prefix;           //Process Field: ProcessPrefix
	    private String processCounter;   //Process Field: ProcessCounter
	    private String previousActor;    
	    private String previousActorEmail;    
	    private String fundingSource;
	    private String commitmentChangeAmount;

    public FacilityProjectCommitmentChangeRequest(String projectId, String rcId,
                                            String purchaseOrderNumber,
                                            String occurrenceDate,
                                            String description, String objectCode,
                                            Double amount, String fy, String costCenterNbr) {
        this.projectId = projectId;
        this.rcId = rcId;
        this.purchaseOrderNumber = purchaseOrderNumber;
        this.occurrenceDate = occurrenceDate;
        this.description = description;
        this.objectCode = objectCode;
        this.amount = amount;
        this.fy = fy;
        this.costCenterNbr = costCenterNbr;
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
		@JsonProperty("PONumber")
		public void setPurchaseOrderNumber(String purchaseOrderNumber) {
			this.purchaseOrderNumber = purchaseOrderNumber;
		} 

		
		public String getOccurrenceDate() {
			return occurrenceDate;
		}
		@JsonProperty("CommitmentChangeDate")
		public void setOccurrenceDate(String occurrenceDate) {
			this.occurrenceDate = occurrenceDate;
		}

		
		public String getDescription() {
			return description;
		}
		@JsonProperty("CommitmentChangeDescription")
		public void setDescription(String description) {
			this.description = description;
		}

		
		public String getObjectCode() {
			return StringUtils.substringAfter(accountCode, ".");
			//return objectCode;
		}
		@JsonProperty("ObjectCode")
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
		@JsonProperty("CommitmentChangeNumber")
		public void setCommitmentNumber(String commitmentNumber) {
			this.commitmentNumber = commitmentNumber;
		}

		
		public String getPrefix() {
			return prefix;
		}
		@JsonProperty("ProcessPrefix")
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

		
		public String getFundingSource() {
			return fundingSource;
		}
		@JsonProperty("FundingSource")
		public void setFundingSource(String fundingSource) {
			this.fundingSource = fundingSource;
		}

		
		/**
		 * @return the commitmentChangeAmount
		 */
		public String getCommitmentChangeAmount() {
			return commitmentChangeAmount;
		}
		/**
		 * @param commitmentChangeAmount the commitmentChangeAmount to set
		 */
		@JsonProperty("CommitmentChangeAmount")
		public void setCommitmentChangeAmount(String commitmentChangeAmount) {
			this.commitmentChangeAmount = commitmentChangeAmount;
		}
		
		
		@Override
		public String toString() {
			return "FacilityProjectCommitmentChangeRequest [projectId="
					+ projectId + ", rcId=" + rcId + ", purchaseOrderNumber="
					+ purchaseOrderNumber + ", occurrenceDate="
					+ occurrenceDate + ", description=" + description
					+ ", objectCode=" + objectCode + ", amount=" + amount
					+ ", fy=" + fy + ", costCenterNbr=" + costCenterNbr
					+ ", accountCode=" + accountCode + ", commitmentNumber="
					+ commitmentNumber + ", prefix=" + prefix
					+ ", processCounter=" + processCounter + ", previousActor="
					+ previousActor + ", previousActorEmail="
					+ previousActorEmail + ", fundingSource=" + fundingSource
					+ ", commitmentChangeAmount=" + commitmentChangeAmount
					+ "]";
		}
}



