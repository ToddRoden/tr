package edu.mnscu.acct.ebuilder;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by gn3210hg on 10/8/15.
 */
@Entity
@javax.persistence.Table(name = "EBUILDER_PO_BALANCE", schema = "ISRS", catalog = "")
public class EbuilderPoBalanceEntity {
    private BigDecimal ebuilderPoBalanceId;

    @Id
    @javax.persistence.Column(name = "EBUILDER_PO_BALANCE_ID")
    public BigDecimal getEbuilderPoBalanceId() {
        return ebuilderPoBalanceId;
    }

    public void setEbuilderPoBalanceId(BigDecimal ebuilderPoBalanceId) {
        this.ebuilderPoBalanceId = ebuilderPoBalanceId;
    }

    private String rcId;

    @Basic
    @javax.persistence.Column(name = "RC_ID")
    public String getRcId() {
        return rcId;
    }

    public void setRcId(String rcId) {
        this.rcId = rcId;
    }

    private BigDecimal projectId;

    @Basic
    @javax.persistence.Column(name = "PROJECT_ID")
    public BigDecimal getProjectId() {
        return projectId;
    }

    public void setProjectId(BigDecimal projectId) {
        this.projectId = projectId;
    }

    private String projectName;

    @Basic
    @javax.persistence.Column(name = "PROJECT_NAME")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    private String poNbr;

    @Basic
    @javax.persistence.Column(name = "PO_NBR")
    public String getPoNbr() {
        return poNbr;
    }

    public void setPoNbr(String poNbr) {
        this.poNbr = poNbr;
    }

    private String commitNbr;

    @Basic
    @javax.persistence.Column(name = "COMMIT_NBR")
    public String getCommitNbr() {
        return commitNbr;
    }

    public void setCommitNbr(String commitNbr) {
        this.commitNbr = commitNbr;
    }

    private String commitDesc;

    @Basic
    @javax.persistence.Column(name = "COMMIT_DESC")
    public String getCommitDesc() {
        return commitDesc;
    }

    public void setCommitDesc(String commitDesc) {
        this.commitDesc = commitDesc;
    }

    private String commitItemNbr;

    @Basic
    @javax.persistence.Column(name = "COMMIT_ITEM_NBR")
    public String getCommitItemNbr() {
        return commitItemNbr;
    }

    public void setCommitItemNbr(String commitItemNbr) {
        this.commitItemNbr = commitItemNbr;
    }

    private String commitItemDesc;

    @Basic
    @javax.persistence.Column(name = "COMMIT_ITEM_DESC")
    public String getCommitItemDesc() {
        return commitItemDesc;
    }

    public void setCommitItemDesc(String commitItemDesc) {
        this.commitItemDesc = commitItemDesc;
    }

    private String fundSourceName;

    @Basic
    @javax.persistence.Column(name = "FUND_SOURCE_NAME")
    public String getFundSourceName() {
        return fundSourceName;
    }

    public void setFundSourceName(String fundSourceName) {
        this.fundSourceName = fundSourceName;
    }

    private String fy;

    @Basic
    @javax.persistence.Column(name = "FY")
    public String getFy() {
        return fy;
    }

    public void setFy(String fy) {
        this.fy = fy;
    }

    private String ccNbr;

    @Basic
    @javax.persistence.Column(name = "CC_NBR")
    public String getCcNbr() {
        return ccNbr;
    }

    public void setCcNbr(String ccNbr) {
        this.ccNbr = ccNbr;
    }

    private String acctCode;

    @Basic
    @javax.persistence.Column(name = "ACCT_CODE")
    public String getAcctCode() {
        return acctCode;
    }

    public void setAcctCode(String acctCode) {
        this.acctCode = acctCode;
    }

    private String objectCode;

    @Basic
    @javax.persistence.Column(name = "OBJECT_CODE")
    public String getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    private BigDecimal commitObjTotalAmt;

    @Basic
    @javax.persistence.Column(name = "COMMIT_OBJ_TOTAL_AMT")
    public BigDecimal getCommitObjTotalAmt() {
        return commitObjTotalAmt;
    }

    public void setCommitObjTotalAmt(BigDecimal commitObjTotalAmt) {
        this.commitObjTotalAmt = commitObjTotalAmt;
    }

    private BigDecimal commitObjActualAmt;

    @Basic
    @javax.persistence.Column(name = "COMMIT_OBJ_ACTUAL_AMT")
    public BigDecimal getCommitObjActualAmt() {
        return commitObjActualAmt;
    }

    public void setCommitObjActualAmt(BigDecimal commitObjActualAmt) {
        this.commitObjActualAmt = commitObjActualAmt;
    }

    private BigDecimal commitObjBalAmt;

    @Basic
    @javax.persistence.Column(name = "COMMIT_OBJ_BAL_AMT")
    public BigDecimal getCommitObjBalAmt() {
        return commitObjBalAmt;
    }

    public void setCommitObjBalAmt(BigDecimal commitObjBalAmt) {
        this.commitObjBalAmt = commitObjBalAmt;
    }

    private String vendorName;

    @Basic
    @javax.persistence.Column(name = "VENDOR_NAME")
    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    private String vendorNbr;

    @Basic
    @javax.persistence.Column(name = "VENDOR_NBR")
    public String getVendorNbr() {
        return vendorNbr;
    }

    public void setVendorNbr(String vendorNbr) {
        this.vendorNbr = vendorNbr;
    }

    private Timestamp loadTimestamp;

    @Basic
    @javax.persistence.Column(name = "LOAD_TIMESTAMP")
    public Timestamp getLoadTimestamp() {
        return loadTimestamp;
    }

    public void setLoadTimestamp(Timestamp loadTimestamp) {
        this.loadTimestamp = loadTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EbuilderPoBalanceEntity that = (EbuilderPoBalanceEntity) o;

        if (acctCode != null ? !acctCode.equals(that.acctCode) : that.acctCode != null) return false;
        if (ccNbr != null ? !ccNbr.equals(that.ccNbr) : that.ccNbr != null) return false;
        if (commitDesc != null ? !commitDesc.equals(that.commitDesc) : that.commitDesc != null) return false;
        if (commitItemDesc != null ? !commitItemDesc.equals(that.commitItemDesc) : that.commitItemDesc != null)
            return false;
        if (commitItemNbr != null ? !commitItemNbr.equals(that.commitItemNbr) : that.commitItemNbr != null)
            return false;
        if (commitNbr != null ? !commitNbr.equals(that.commitNbr) : that.commitNbr != null) return false;
        if (commitObjActualAmt != null ? !commitObjActualAmt.equals(that.commitObjActualAmt) : that.commitObjActualAmt != null)
            return false;
        if (commitObjBalAmt != null ? !commitObjBalAmt.equals(that.commitObjBalAmt) : that.commitObjBalAmt != null)
            return false;
        if (commitObjTotalAmt != null ? !commitObjTotalAmt.equals(that.commitObjTotalAmt) : that.commitObjTotalAmt != null)
            return false;
        if (ebuilderPoBalanceId != null ? !ebuilderPoBalanceId.equals(that.ebuilderPoBalanceId) : that.ebuilderPoBalanceId != null)
            return false;
        if (fundSourceName != null ? !fundSourceName.equals(that.fundSourceName) : that.fundSourceName != null)
            return false;
        if (fy != null ? !fy.equals(that.fy) : that.fy != null) return false;
        if (loadTimestamp != null ? !loadTimestamp.equals(that.loadTimestamp) : that.loadTimestamp != null)
            return false;
        if (objectCode != null ? !objectCode.equals(that.objectCode) : that.objectCode != null) return false;
        if (poNbr != null ? !poNbr.equals(that.poNbr) : that.poNbr != null) return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null) return false;
        if (projectName != null ? !projectName.equals(that.projectName) : that.projectName != null) return false;
        if (rcId != null ? !rcId.equals(that.rcId) : that.rcId != null) return false;
        if (vendorName != null ? !vendorName.equals(that.vendorName) : that.vendorName != null) return false;
        if (vendorNbr != null ? !vendorNbr.equals(that.vendorNbr) : that.vendorNbr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ebuilderPoBalanceId != null ? ebuilderPoBalanceId.hashCode() : 0;
        result = 31 * result + (rcId != null ? rcId.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (poNbr != null ? poNbr.hashCode() : 0);
        result = 31 * result + (commitNbr != null ? commitNbr.hashCode() : 0);
        result = 31 * result + (commitDesc != null ? commitDesc.hashCode() : 0);
        result = 31 * result + (commitItemNbr != null ? commitItemNbr.hashCode() : 0);
        result = 31 * result + (commitItemDesc != null ? commitItemDesc.hashCode() : 0);
        result = 31 * result + (fundSourceName != null ? fundSourceName.hashCode() : 0);
        result = 31 * result + (fy != null ? fy.hashCode() : 0);
        result = 31 * result + (ccNbr != null ? ccNbr.hashCode() : 0);
        result = 31 * result + (acctCode != null ? acctCode.hashCode() : 0);
        result = 31 * result + (objectCode != null ? objectCode.hashCode() : 0);
        result = 31 * result + (commitObjTotalAmt != null ? commitObjTotalAmt.hashCode() : 0);
        result = 31 * result + (commitObjActualAmt != null ? commitObjActualAmt.hashCode() : 0);
        result = 31 * result + (commitObjBalAmt != null ? commitObjBalAmt.hashCode() : 0);
        result = 31 * result + (vendorName != null ? vendorName.hashCode() : 0);
        result = 31 * result + (vendorNbr != null ? vendorNbr.hashCode() : 0);
        result = 31 * result + (loadTimestamp != null ? loadTimestamp.hashCode() : 0);
        return result;
    }
}
