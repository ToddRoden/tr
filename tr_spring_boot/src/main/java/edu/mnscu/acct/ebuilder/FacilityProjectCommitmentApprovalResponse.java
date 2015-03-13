package edu.mnscu.acct.ebuilder;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class FacilityProjectCommitmentApprovalResponse {
	private String data;
	private String errorMsg;
	private String status;
	

	@JsonProperty("Data")
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	@JsonProperty("ErrorMsg")
	public String getErrorMsg() {
		return errorMsg;
	}
	
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@JsonProperty("Status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "FacilityProjectCommitmentApprovalResponse [data=" + data
				+ ", errorMsg=" + errorMsg + ", status=" + status + "]";
	}
	
}
