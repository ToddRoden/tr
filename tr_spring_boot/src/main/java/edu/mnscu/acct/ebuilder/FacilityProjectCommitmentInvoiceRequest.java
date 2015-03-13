package edu.mnscu.acct.ebuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
       {  
         "CommitmentInvoiceNumber":"CIP - 00015",
         "CommitmentNumber":"008",
         "CostCenterNumber":"cent#1",
         "Description":"PayApp_UnitCost commitment",
         "FiscalYear":"2016",
         "FundingSourceAmount":500.45000000000,
         "ObjectCode":"04.1550",
         "OccurrenceDate":"08\/04\/2014",
         "ProcessCounter":"15",
         "ProcessPrefix":"CIP",
         "ProjectID":"bells_007199",
         "RC_ID":"0208",
         "VendorNumber":"STP001"
         
         --Requested eBuilder to Add - tr
         "PONumber":"U03500"
         "PreviousActor":""
         "PreviousActorEmail":""
         "FundingSource":"9999-891010-0999"
      },

2014-09-21
{
CommitmentInvoiceAmount: "1.00"
CommitmentInvoiceNumber: "INVI - 00001"
CommitmentNumber: "CIR - 00032"
CostCenterNumber: "891005"
Description: "Todd test again"
FiscalYear: "9999"
FundingSourceAmount: "0.50"
FundingSourceName: "9999-891005-0999"
ObjectCode: "00.1110"
OccurrenceDate: "08\/29\/2014"
PONumber: "U03648"
PartialFinalPaymentFlag: "ISRSISRS"
PreviousActor: "ISRSISRS"
PreviousActorEmail: ""
ProcessCounter: "1"
ProcessPrefix: "INVI"
ProjectID: "88901"
RC_ID: "0070"
VendorInvoiceNumber: "tr-001"
VendorNumber: "0000203683-001"
}
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class FacilityProjectCommitmentInvoiceRequest {
	    private String projectId;
		private String rcId;
	    private String purchaseOrderNumber; 
	    private String occurrenceDate;   //Commitment Field: CommitmentChangeDate 
	    private String description;      //Commitment Field: CommitmentChangeDescription
	    private String objectCode;       //Commitment Item Field: Object Code
	    private String amount;
	    private String fy;
	    private String costCenterNbr;

	    private String accountCode;
	    private String commitmentNumber; //Commitment Field: CommitmentChangeNumber
	    private String commitmentInvoiceNumber; 
	    private String commitmentInvoiceAmount; 
	    private String vendorInvoiceNumber; 
	    private String prefix;           //Process Field: ProcessPrefix
	    private String processCounter;   //Process Field: ProcessCounter
	    private String previousActor;    
	    private String previousActorEmail;    
	    private String fundingSource;
	    private String vendorNbr;
	    private String paymentStatus = "P"; //todo tr - 2014/09/01 this is not currently being sent but is needed to process a payment so will default to "P"
	    
	    private String retainageAmount;
	    private String retainagePercentage;
	    private String retainageReleasedAmount;
	    private String invoiceItemAmount;


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
		@JsonProperty("OccurrenceDate")
		public void setOccurrenceDate(String occurrenceDate) {
			this.occurrenceDate = occurrenceDate;
		}

		
		public Date getOccurrenceDateAsDate() {
		    SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		    df.setLenient(false);
		    Date occurrenceDateAsDate=null;
		    if (StringUtils.isNotEmpty(this.occurrenceDate)) {	
		    	try {
		    		occurrenceDateAsDate = df.parse(this.occurrenceDate);
			    } catch (ParseException pe) {
			    	return null;
			  }
		    }
		    return occurrenceDateAsDate;
		}

		
		public String getDescription() {
			return description;
		}
		@JsonProperty("Description")
		public void setDescription(String description) {
			this.description = description;
		}
		
	
		//eBuilder 
		public String getObjectCode() {
//			return StringUtils.substringAfter(accountCode, ".");
			return objectCode;
		}
		@JsonProperty("ObjectCode")
		public void setObjectCode(String objectCode) {
			this.objectCode = StringUtils.substringAfter(objectCode, ".");
		}
		
		
		public String getAmount() {
			return amount;
		}
		@JsonProperty("FundingSourceAmount")
		public void setAmount(String amount) {
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
		@JsonIgnore
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
		@JsonProperty("FundingSourceName")
		public void setFundingSource(String fundingSource) {
			this.fundingSource = fundingSource;
		}

		
		public String getCommitmentInvoiceNumber() {
			return commitmentInvoiceNumber;
		}
		@JsonProperty("CommitmentInvoiceNumber")
		public void setCommitmentInvoiceNumber(String commitmentInvoiceNumber) {
			this.commitmentInvoiceNumber = commitmentInvoiceNumber;
		}

		
		/**
		 * @return the commitmentInvoiceAmount
		 */
		public String getCommitmentInvoiceAmount() {
			return commitmentInvoiceAmount;
		}
		/**
		 * @param commitmentInvoiceAmount the commitmentInvoiceAmount to set
		 */
		@JsonProperty("CommitmentInvoiceAmount")
		public void setCommitmentInvoiceAmount(String commitmentInvoiceAmount) {
			this.commitmentInvoiceAmount = commitmentInvoiceAmount;
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
		}		
		
		
		public String getVendorLocId() {
			return StringUtils.substringAfter(vendorNbr, "-");
		}		

		
		
		public String getPaymentStatus() {
			return (!StringUtils.equalsIgnoreCase(paymentStatus,"F") ? "P" : paymentStatus);
//todo tr remove above line when this attribute gets sent by eBuilder
//			return paymentStatus;
		}
		@JsonProperty("PartialFinalPaymentFlag")		
		public void setPaymentStatus(String paymentStatus) {
			this.paymentStatus = paymentStatus;
		}
		
		
		public String getVendorInvoiceNumber() {
			return vendorInvoiceNumber;
		}
		@JsonProperty("VendorInvoiceNumber")
		public void setVendorInvoiceNumber(String vendorInvoiceNumber) {
			this.vendorInvoiceNumber = vendorInvoiceNumber;
		}
		
		public String getRetainageAmount() {
			return retainageAmount;
		}
		@JsonProperty("InvoiceItemAmountRetained")
		public void setRetainageAmount(String retainageAmount) {
			this.retainageAmount = retainageAmount;
		}
		
		public String getRetainagePercentage() {
			return retainagePercentage;
		}
		@JsonProperty("InvoiceItemRetainagePercentage")
		public void setRetainagePercentage(String retainagePercentage) {
			this.retainagePercentage = retainagePercentage;
		}
		
		public String getRetainageReleasedAmount() {
			return retainageReleasedAmount;
		}
		@JsonProperty("InvoiceItemAmountReleased")
		public void setRetainageReleasedAmount(String retainageReleasedAmount) {
			this.retainageReleasedAmount = retainageReleasedAmount;
		}
		
		public String getInvoiceItemAmount() {
			return invoiceItemAmount;
		}
		@JsonProperty("InvoiceItemAmount")
		public void setInvoiceItemAmount(String invoiceItemAmount) {
			this.invoiceItemAmount = invoiceItemAmount;
		}

		@Override
		public String toString() {
			return "FacilityProjectCommitmentInvoiceRequest [projectId="
					+ projectId + ", rcId=" + rcId + ", purchaseOrderNumber="
					+ purchaseOrderNumber + ", occurrenceDate="
					+ occurrenceDate + ", description=" + description
					+ ", objectCode=" + objectCode + ", amount=" + amount
					+ ", fy=" + fy + ", costCenterNbr=" + costCenterNbr
					+ ", accountCode=" + accountCode + ", commitmentNumber="
					+ commitmentNumber + ", commitmentInvoiceNumber="
					+ commitmentInvoiceNumber + ", commitmentInvoiceAmount="
					+ commitmentInvoiceAmount + ", vendorInvoiceNumber="
					+ vendorInvoiceNumber + ", prefix=" + prefix
					+ ", processCounter=" + processCounter + ", previousActor="
					+ previousActor + ", previousActorEmail="
					+ previousActorEmail + ", fundingSource=" + fundingSource
					+ ", vendorNbr=" + vendorNbr + ", paymentStatus="
					+ paymentStatus + ", retainageAmount=" + retainageAmount
					+ ", retainagePercentage=" + retainagePercentage
					+ ", retainageReleasedAmount=" + retainageReleasedAmount
					+ ", invoiceItemAmount=" + invoiceItemAmount + "]";
		}
		
}



