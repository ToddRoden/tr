package edu.mnscu.acct.ebuilder;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FacilityProjectCommitmentRequestList {
	List<FacilityProjectCommitmentRequest> facilityProjectCommitmentRequests = new ArrayList<FacilityProjectCommitmentRequest>();
	private String errorMsg;
	private String status;
	
	public List<FacilityProjectCommitmentRequest> getFacilityProjectCommitmentRequests() {
		return facilityProjectCommitmentRequests;
	}

	@JsonProperty("Data")
	public void setFacilityProjectCommitmentRequests(
			List<FacilityProjectCommitmentRequest> facilityProjectCommitmentRequests) {
		this.facilityProjectCommitmentRequests = facilityProjectCommitmentRequests;
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
		return "FacilityProjectCommitmentRequestList [facilityProjectCommitmentRequests="
				+ facilityProjectCommitmentRequests
				+ ", errorMsg="
				+ errorMsg
				+ ", status=" + status + "]";
	}
	
}
