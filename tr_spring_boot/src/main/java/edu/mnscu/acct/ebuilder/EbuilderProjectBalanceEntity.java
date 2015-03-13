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
@javax.persistence.Table(name = "EBUILDER_PROJECT_BALANCE", schema = "ISRS", catalog = "")
public class EbuilderProjectBalanceEntity {
    private BigDecimal ebuilderProjectBalId;

    @Id
    @javax.persistence.Column(name = "EBUILDER_PROJECT_BAL_ID")
    public BigDecimal getEbuilderProjectBalId() {
        return ebuilderProjectBalId;
    }

    public void setEbuilderProjectBalId(BigDecimal ebuilderProjectBalId) {
        this.ebuilderProjectBalId = ebuilderProjectBalId;
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

    private String fundSourceName;

    @Basic
    @javax.persistence.Column(name = "FUND_SOURCE_NAME")
    public String getFundSourceName() {
        return fundSourceName;
    }

    public void setFundSourceName(String fundSourceName) {
        this.fundSourceName = fundSourceName;
    }

    private BigDecimal fundTotalAmt;

    @Basic
    @javax.persistence.Column(name = "FUND_TOTAL_AMT")
    public BigDecimal getFundTotalAmt() {
        return fundTotalAmt;
    }

    public void setFundTotalAmt(BigDecimal fundTotalAmt) {
        this.fundTotalAmt = fundTotalAmt;
    }

    private BigDecimal fundActualAmt;

    @Basic
    @javax.persistence.Column(name = "FUND_ACTUAL_AMT")
    public BigDecimal getFundActualAmt() {
        return fundActualAmt;
    }

    public void setFundActualAmt(BigDecimal fundActualAmt) {
        this.fundActualAmt = fundActualAmt;
    }

    private BigDecimal fundUnspentBalAmt;

    @Basic
    @javax.persistence.Column(name = "FUND_UNSPENT_BAL_AMT")
    public BigDecimal getFundUnspentBalAmt() {
        return fundUnspentBalAmt;
    }

    public void setFundUnspentBalAmt(BigDecimal fundUnspentBalAmt) {
        this.fundUnspentBalAmt = fundUnspentBalAmt;
    }

    private BigDecimal fundCommitAmt;

    @Basic
    @javax.persistence.Column(name = "FUND_COMMIT_AMT")
    public BigDecimal getFundCommitAmt() {
        return fundCommitAmt;
    }

    public void setFundCommitAmt(BigDecimal fundCommitAmt) {
        this.fundCommitAmt = fundCommitAmt;
    }

    private BigDecimal fundCommitBalAmt;

    @Basic
    @javax.persistence.Column(name = "FUND_COMMIT_BAL_AMT")
    public BigDecimal getFundCommitBalAmt() {
        return fundCommitBalAmt;
    }

    public void setFundCommitBalAmt(BigDecimal fundCommitBalAmt) {
        this.fundCommitBalAmt = fundCommitBalAmt;
    }

    private BigDecimal fundAvailAmt;

    @Basic
    @javax.persistence.Column(name = "FUND_AVAIL_AMT")
    public BigDecimal getFundAvailAmt() {
        return fundAvailAmt;
    }

    public void setFundAvailAmt(BigDecimal fundAvailAmt) {
        this.fundAvailAmt = fundAvailAmt;
    }

    private String fundSourceDesc;

    @Basic
    @javax.persistence.Column(name = "FUND_SOURCE_DESC")
    public String getFundSourceDesc() {
        return fundSourceDesc;
    }

    public void setFundSourceDesc(String fundSourceDesc) {
        this.fundSourceDesc = fundSourceDesc;
    }

    private String bondFundingYear;

    @Basic
    @javax.persistence.Column(name = "BOND_FUNDING_YEAR")
    public String getBondFundingYear() {
        return bondFundingYear;
    }

    public void setBondFundingYear(String bondFundingYear) {
        this.bondFundingYear = bondFundingYear;
    }

    private String appropGroupCode;

    @Basic
    @javax.persistence.Column(name = "APPROP_GROUP_CODE")
    public String getAppropGroupCode() {
        return appropGroupCode;
    }

    public void setAppropGroupCode(String appropGroupCode) {
        this.appropGroupCode = appropGroupCode;
    }

    private String bondTypeShortDesc;

    @Basic
    @javax.persistence.Column(name = "BOND_TYPE_SHORT_DESC")
    public String getBondTypeShortDesc() {
        return bondTypeShortDesc;
    }

    public void setBondTypeShortDesc(String bondTypeShortDesc) {
        this.bondTypeShortDesc = bondTypeShortDesc;
    }

    private String swiftAppropId;

    @Basic
    @javax.persistence.Column(name = "SWIFT_APPROP_ID")
    public String getSwiftAppropId() {
        return swiftAppropId;
    }

    public void setSwiftAppropId(String swiftAppropId) {
        this.swiftAppropId = swiftAppropId;
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

    private BigDecimal acProjectFundingId;

    @Basic
    @javax.persistence.Column(name = "AC_PROJECT_FUNDING_ID")
    public BigDecimal getAcProjectFundingId() {
        return acProjectFundingId;
    }

    public void setAcProjectFundingId(BigDecimal acProjectFundingId) {
        this.acProjectFundingId = acProjectFundingId;
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

        EbuilderProjectBalanceEntity that = (EbuilderProjectBalanceEntity) o;

        if (acProjectFundingId != null ? !acProjectFundingId.equals(that.acProjectFundingId) : that.acProjectFundingId != null)
            return false;
        if (appropGroupCode != null ? !appropGroupCode.equals(that.appropGroupCode) : that.appropGroupCode != null)
            return false;
        if (bondFundingYear != null ? !bondFundingYear.equals(that.bondFundingYear) : that.bondFundingYear != null)
            return false;
        if (bondTypeShortDesc != null ? !bondTypeShortDesc.equals(that.bondTypeShortDesc) : that.bondTypeShortDesc != null)
            return false;
        if (ccNbr != null ? !ccNbr.equals(that.ccNbr) : that.ccNbr != null) return false;
        if (ebuilderProjectBalId != null ? !ebuilderProjectBalId.equals(that.ebuilderProjectBalId) : that.ebuilderProjectBalId != null)
            return false;
        if (fundActualAmt != null ? !fundActualAmt.equals(that.fundActualAmt) : that.fundActualAmt != null)
            return false;
        if (fundAvailAmt != null ? !fundAvailAmt.equals(that.fundAvailAmt) : that.fundAvailAmt != null) return false;
        if (fundCommitAmt != null ? !fundCommitAmt.equals(that.fundCommitAmt) : that.fundCommitAmt != null)
            return false;
        if (fundCommitBalAmt != null ? !fundCommitBalAmt.equals(that.fundCommitBalAmt) : that.fundCommitBalAmt != null)
            return false;
        if (fundSourceDesc != null ? !fundSourceDesc.equals(that.fundSourceDesc) : that.fundSourceDesc != null)
            return false;
        if (fundSourceName != null ? !fundSourceName.equals(that.fundSourceName) : that.fundSourceName != null)
            return false;
        if (fundTotalAmt != null ? !fundTotalAmt.equals(that.fundTotalAmt) : that.fundTotalAmt != null) return false;
        if (fundUnspentBalAmt != null ? !fundUnspentBalAmt.equals(that.fundUnspentBalAmt) : that.fundUnspentBalAmt != null)
            return false;
        if (fy != null ? !fy.equals(that.fy) : that.fy != null) return false;
        if (loadTimestamp != null ? !loadTimestamp.equals(that.loadTimestamp) : that.loadTimestamp != null)
            return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null) return false;
        if (projectName != null ? !projectName.equals(that.projectName) : that.projectName != null) return false;
        if (rcId != null ? !rcId.equals(that.rcId) : that.rcId != null) return false;
        if (swiftAppropId != null ? !swiftAppropId.equals(that.swiftAppropId) : that.swiftAppropId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ebuilderProjectBalId != null ? ebuilderProjectBalId.hashCode() : 0;
        result = 31 * result + (rcId != null ? rcId.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (fundSourceName != null ? fundSourceName.hashCode() : 0);
        result = 31 * result + (fundTotalAmt != null ? fundTotalAmt.hashCode() : 0);
        result = 31 * result + (fundActualAmt != null ? fundActualAmt.hashCode() : 0);
        result = 31 * result + (fundUnspentBalAmt != null ? fundUnspentBalAmt.hashCode() : 0);
        result = 31 * result + (fundCommitAmt != null ? fundCommitAmt.hashCode() : 0);
        result = 31 * result + (fundCommitBalAmt != null ? fundCommitBalAmt.hashCode() : 0);
        result = 31 * result + (fundAvailAmt != null ? fundAvailAmt.hashCode() : 0);
        result = 31 * result + (fundSourceDesc != null ? fundSourceDesc.hashCode() : 0);
        result = 31 * result + (bondFundingYear != null ? bondFundingYear.hashCode() : 0);
        result = 31 * result + (appropGroupCode != null ? appropGroupCode.hashCode() : 0);
        result = 31 * result + (bondTypeShortDesc != null ? bondTypeShortDesc.hashCode() : 0);
        result = 31 * result + (swiftAppropId != null ? swiftAppropId.hashCode() : 0);
        result = 31 * result + (fy != null ? fy.hashCode() : 0);
        result = 31 * result + (ccNbr != null ? ccNbr.hashCode() : 0);
        result = 31 * result + (acProjectFundingId != null ? acProjectFundingId.hashCode() : 0);
        result = 31 * result + (loadTimestamp != null ? loadTimestamp.hashCode() : 0);
        return result;
    }
}
