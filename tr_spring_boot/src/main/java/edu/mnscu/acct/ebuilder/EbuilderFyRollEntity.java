package edu.mnscu.acct.ebuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by gn3210hg on 10/8/15.
 */
@Entity
@Table(name = "EBUILDER_FY_ROLL", schema = "ISRS", catalog = "")
public class EbuilderFyRollEntity {
    private BigDecimal ebuilderFyRollId;
    private String rcId;
    private String poNbr;
    private String fy;
    private String ccNbr;
    private String objectCode;
    private String rollStatusCode;
    private BigDecimal encumAmt;
    private Timestamp loadTimestamp;
    private Timestamp updateTimestamp;
    private String updateUserId;

    @Id
    @Column(name = "EBUILDER_FY_ROLL_ID")
    public BigDecimal getEbuilderFyRollId() {
        return ebuilderFyRollId;
    }

    public void setEbuilderFyRollId(BigDecimal ebuilderFyRollId) {
        this.ebuilderFyRollId = ebuilderFyRollId;
    }

    @Basic
    @Column(name = "RC_ID")
    public String getRcId() {
        return rcId;
    }

    public void setRcId(String rcId) {
        this.rcId = rcId;
    }

    @Basic
    @Column(name = "PO_NBR")
    public String getPoNbr() {
        return poNbr;
    }

    public void setPoNbr(String poNbr) {
        this.poNbr = poNbr;
    }

    @Basic
    @Column(name = "FY")
    public String getFy() {
        return fy;
    }

    public void setFy(String fy) {
        this.fy = fy;
    }

    @Basic
    @Column(name = "CC_NBR")
    public String getCcNbr() {
        return ccNbr;
    }

    public void setCcNbr(String ccNbr) {
        this.ccNbr = ccNbr;
    }

    @Basic
    @Column(name = "OBJECT_CODE")
    public String getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    @Basic
    @Column(name = "ROLL_STATUS_CODE")
    public String getRollStatusCode() {
        return rollStatusCode;
    }

    public void setRollStatusCode(String rollStatusCode) {
        this.rollStatusCode = rollStatusCode;
    }

    @Basic
    @Column(name = "ENCUM_AMT")
    public BigDecimal getEncumAmt() {
        return encumAmt;
    }

    public void setEncumAmt(BigDecimal encumAmt) {
        this.encumAmt = encumAmt;
    }

    @Basic
    @Column(name = "LOAD_TIMESTAMP")
    public Timestamp getLoadTimestamp() {
        return loadTimestamp;
    }

    public void setLoadTimestamp(Timestamp loadTimestamp) {
        this.loadTimestamp = loadTimestamp;
    }

    @Basic
    @Column(name = "UPDATE_TIMESTAMP")
    public Timestamp getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Timestamp updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    @Basic
    @Column(name = "UPDATE_USER_ID")
    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EbuilderFyRollEntity that = (EbuilderFyRollEntity) o;

        if (ccNbr != null ? !ccNbr.equals(that.ccNbr) : that.ccNbr != null) return false;
        if (ebuilderFyRollId != null ? !ebuilderFyRollId.equals(that.ebuilderFyRollId) : that.ebuilderFyRollId != null)
            return false;
        if (encumAmt != null ? !encumAmt.equals(that.encumAmt) : that.encumAmt != null) return false;
        if (fy != null ? !fy.equals(that.fy) : that.fy != null) return false;
        if (loadTimestamp != null ? !loadTimestamp.equals(that.loadTimestamp) : that.loadTimestamp != null)
            return false;
        if (objectCode != null ? !objectCode.equals(that.objectCode) : that.objectCode != null) return false;
        if (poNbr != null ? !poNbr.equals(that.poNbr) : that.poNbr != null) return false;
        if (rcId != null ? !rcId.equals(that.rcId) : that.rcId != null) return false;
        if (rollStatusCode != null ? !rollStatusCode.equals(that.rollStatusCode) : that.rollStatusCode != null)
            return false;
        if (updateTimestamp != null ? !updateTimestamp.equals(that.updateTimestamp) : that.updateTimestamp != null)
            return false;
        if (updateUserId != null ? !updateUserId.equals(that.updateUserId) : that.updateUserId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ebuilderFyRollId != null ? ebuilderFyRollId.hashCode() : 0;
        result = 31 * result + (rcId != null ? rcId.hashCode() : 0);
        result = 31 * result + (poNbr != null ? poNbr.hashCode() : 0);
        result = 31 * result + (fy != null ? fy.hashCode() : 0);
        result = 31 * result + (ccNbr != null ? ccNbr.hashCode() : 0);
        result = 31 * result + (objectCode != null ? objectCode.hashCode() : 0);
        result = 31 * result + (rollStatusCode != null ? rollStatusCode.hashCode() : 0);
        result = 31 * result + (encumAmt != null ? encumAmt.hashCode() : 0);
        result = 31 * result + (loadTimestamp != null ? loadTimestamp.hashCode() : 0);
        result = 31 * result + (updateTimestamp != null ? updateTimestamp.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        return result;
    }
}
