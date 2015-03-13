package Controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.mnscu.acct.ebuilder.*;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8088/ws/ebRESTAPI.svc/custom/MNSCU/commitments/0070
//@RequestMapping("//ws/ebRESTAPI.svc/custom/MNSCU/commitments/$RC_ID/**")
//@RequestMapping("http://localhost:8088/ws/ebRESTAPI.svc/")
@RequestMapping("/ws/ebRESTAPI.svc/")
@RestController
public class FacilitiesController {

    private static final String BASE_URL = "/ws/ebRESTAPI.svc/custom/MNSCU/";
    private static final String AUTH_RESP = "<ebAuthenticatedPartner xmlns=\"http://schemas.datacontract.org/2004/07/ebRestService\" xmlns:i=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
            "<Account>\n" +
            "<AccountID>944055d9-30b0-493f-8973-17aa441f6907</AccountID>\n" +
            "<IsExpired>false</IsExpired>\n" +
            "<Name>Minnesota State Colleges and Universities System (MNSCU)</Name>\n" +
            "<PortalType i:nil=\"true\" />\n" +
            "</Account>\n" +
            "<SecurityToken>ixGgUqSGe3cfLS9bdz+A1k1V1IVII4Rw5lCS4WbnotB1rzcRyWaq7zvn8bRBQkObxbkU0wBYrCj4BhOg0Ugr7g==</SecurityToken>\n" +
            "</ebAuthenticatedPartner>";

    @RequestMapping(value = "partners/MNSCU/authenticatepartner", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
//    @RequestMapping(value = "partners/MNSCU/authenticatepartner", method = RequestMethod.POST, produces = {MediaType.APPLICATION_XML_VALUE})
    public ebAuthenticatePartner getSecurityToken() {
        return new ebAuthenticatePartner();
//    public String getSecurityToken() {
//        return AUTH_RESP;
    }


    @RequestMapping(value = "custom/MNSCU/commitments/{rcId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
//    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_XML_VALUE})
//    @RequestMapping(method = RequestMethod.GET, headers = {"Accept=text/html,application/xhtml+xml,application/xml"}, produces = {MediaType.APPLICATION_XML_VALUE})
    public FacilityProjectCommitmentRequestList getCommitments(
            @PathVariable String rcId) {
        FacilityProjectCommitmentRequestList fprl = new FacilityProjectCommitmentRequestList();
        fprl.setStatus("OK");
        if (StringUtils.equalsIgnoreCase(rcId, "0070")) {
            fprl.getFacilityProjectCommitmentRequests().add(new FacilityProjectCommitmentRequest(
                    "980003", "0070", "", "03/01/2015", "0001234-001", "0001234", "001", "1st Test", "01.5001", 10.00, "2015", "300500", "5130.03", "CIR - 00013", "CIR", "C13"));
        } else if (StringUtils.equalsIgnoreCase(rcId, "0072")) {
            fprl.getFacilityProjectCommitmentRequests().add(new FacilityProjectCommitmentRequest(
                    "980003", "0072", "", "03/01/2015", "0001234-001", "0001234", "001", "1st Test", "01.5001", 10.00, "2015", "300500", "5130.03", "CIR - 00013", "CIR", "C13"));
        }
        return fprl;
    }

    @RequestMapping(value = "custom/MNSCU/commitmentchanges/{rcId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
//    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_XML_VALUE})
//    @RequestMapping(method = RequestMethod.GET, headers = {"Accept=text/html,application/xhtml+xml,application/xml"}, produces = {MediaType.APPLICATION_XML_VALUE})
    public FacilityProjectCommitmentChangeRequestList getCommitmentChanges(
            @PathVariable String rcId) {
        FacilityProjectCommitmentChangeRequestList fprl = new FacilityProjectCommitmentChangeRequestList();
        fprl.setStatus("OK");
        if (StringUtils.equalsIgnoreCase(rcId, "0070")) {
            fprl.getFacilityProjectCommitmentChangeRequests().add(new FacilityProjectCommitmentChangeRequest("88907", "0070", "U12345", "03/01/2015", "1st Test", 10.00, "2015", "300500",
                    "01.5001", "CCI - 00004", "CCI",  "1",  "Dave Lund",
                    "", "0070-9999-875060-2012-GO Bond Debt", "600"));

/*
            fprl.getFacilityProjectCommitmentChangeRequests().add(new FacilityProjectCommitmentChangeRequestGroovy(
            [projectId:"980003", rcId:"0070", purchaseOrderNumber:"", occurrenceDate:"03/01/2015",
            description:"1st Test", objectCode:"01.5001", amount:10.00, fy:"2015", costCenterNbr:"300500",
            accountCode:"", commitmentNumber:"", prefix:"",  processCounter:"",  previousActor:"",
            previousActorEmail:"", fundingSource:"", commitmentChangeAmount:0]));

            FacilityProjectCommitmentChangeRequest("980003", "0070", "", "03/01/2015", "1st Test", 10.00, "2015", "300500",
                        "01.5001", "CCI - 00004", "CCI",  "1",  "Dave Lund",
                        "", "0070-9999-875060-2012-GO Bond Debt", "600");

            FacilityProjectCommitmentChangeRequestGroovy fpg = new FacilityProjectCommitmentChangeRequestGroovy(
                    [projectId:"980003", rcId:"0070", purchaseOrderNumber:"", occurrenceDate:"03/01/2015",
                    description:"1st Test", amount:10.00, fy:"2015", costCenterNbr:"300500",
                    accountCode:"01.5001", commitmentNumber:"CCI - 00004", prefix:"CCI",  processCounter:"1",  previousActor:"Dave Lund",
                    previousActorEmail:"", fundingSource:"0070-9999-875060-2012-GO Bond Debt", commitmentChangeAmount:"600"]);
*/
        } else if (StringUtils.equalsIgnoreCase(rcId, "0072")) {
//            fprl.getFacilityProjectCommitmentChangeRequests().add(new FacilityProjectCommitmentChangeRequest(
  //                  "980003", "0072", "", "03/01/2015", "1st Test", "01.5001", 10.00, "2015", "300500"));
        }
        return fprl;
    }



    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public FacilityProjectCommitmentRequest testJunk() {
        return new FacilityProjectCommitmentRequest(
                "980003", "9999", "", "03/01/2015", "0001234-001", "0001234", "001", "1st Test", "01.5001", 10.00, "2015", "300500");
    }
}


class ebAuthenticatePartner0 {
    Account myAccount;
    String SecurityToken = "ixGgUqSGe3cfLS9bdz+A1k1V1IVII4Rw5lCS4WbnotB1rzcRyWaq7zvn8bRBQkObX0f5Xmk5DJtRMwWOx5DPBQ==";

    ebAuthenticatePartner0() {
        super();
        this.myAccount = new Account();
    }

    @JsonProperty("Account")
    public Account getMyAccount() {
        return myAccount;
    }

    public void setMyAccount(Account myAccount) {
        this.myAccount = myAccount;
    }

    public String getSecurityToken() {
        return SecurityToken;
    }

    public void setSecurityToken(String securityToken) {
        SecurityToken = securityToken;
    }
}

class ebAuthenticatePartner {
    String test = "<Account>\n" +
            "<AccountID>944055d9-30b0-493f-8973-17aa441f6907</AccountID>\n" +
            "<IsExpired>false</IsExpired>\n" +
            "<Name>Minnesota State Colleges and Universities System (MNSCU)</Name>\n" +
            "<PortalType i:nil=\"true\" />\n" +
            "</Account>\n" +
            "<SecurityToken>ixGgUqSGe3cfLS9bdz+A1k1V1IVII4Rw5lCS4WbnotB1rzcRyWaq7zvn8bRBQkObxbkU0wBYrCj4BhOg0Ugr7g==</SecurityToken>\n";


    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}


class Account {
    String AccountID = "944055d9-30b0-493f-8973-17aa441f6907";
    String IsExpired = "false";
    String Name = "Minnesota State Colleges and Universities System (MNSCU)";
    String PortalType = "";

    public String getAccountID() {
        return AccountID;
    }

    public void setAccountID(String accountID) {
        AccountID = accountID;
    }

    public String getIsExpired() {
        return IsExpired;
    }

    public void setIsExpired(String isExpired) {
        IsExpired = isExpired;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPortalType() {
        return PortalType;
    }

    public void setPortalType(String portalType) {
        PortalType = portalType;
    }
}
