package edu.mnscu.acct.ebuilder;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FacilityProjectCommitmentInvoiceRequestList {
	List<FacilityProjectCommitmentInvoiceRequest> facilityProjectCommitmentInvoiceRequests = new ArrayList<FacilityProjectCommitmentInvoiceRequest>();
	private String errorMsg;
	private String status;
	
	public List<FacilityProjectCommitmentInvoiceRequest> getFacilityProjectCommitmentInvoiceRequests() {
		return facilityProjectCommitmentInvoiceRequests;
	}

	@JsonProperty("Data")
	public void setFacilityProjectCommitmentInvoiceRequests(
			List<FacilityProjectCommitmentInvoiceRequest> facilityProjectCommitmentInvoiceRequests) {
		this.facilityProjectCommitmentInvoiceRequests = facilityProjectCommitmentInvoiceRequests;
	}

	public String getErrorMsg() {
		return errorMsg;
	}
	@JsonProperty("ErrorMsg")
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getStatus() {
		return status;
	}
	@JsonProperty("Status")
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "FacilityProjectCommitmentInvoiceRequestList [facilityProjectCommitmentInvoiceRequests="
				+ facilityProjectCommitmentInvoiceRequests
				+ ", errorMsg="
				+ errorMsg + ", status=" + status + "]";
	}
	
}
