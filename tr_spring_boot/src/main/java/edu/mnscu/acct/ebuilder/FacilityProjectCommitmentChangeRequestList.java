package edu.mnscu.acct.ebuilder;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FacilityProjectCommitmentChangeRequestList {
	List<FacilityProjectCommitmentChangeRequest> facilityProjectCommitmentChangeRequests = new ArrayList<FacilityProjectCommitmentChangeRequest>();
	private String errorMsg;
	private String status;
	
	public List<FacilityProjectCommitmentChangeRequest> getFacilityProjectCommitmentChangeRequests() {
		return facilityProjectCommitmentChangeRequests;
	}

	@JsonProperty("Data")
	public void setFacilityProjectCommitmentChangeRequests(
			List<FacilityProjectCommitmentChangeRequest> facilityProjectCommitmentChangeRequests) {
		this.facilityProjectCommitmentChangeRequests = facilityProjectCommitmentChangeRequests;
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
		return "FacilityProjectCommitmentChangeRequestList [facilityProjectCommitmentChangeRequests="
				+ facilityProjectCommitmentChangeRequests
				+ ", errorMsg="
				+ errorMsg + ", status=" + status + "]";
	}
	
}
