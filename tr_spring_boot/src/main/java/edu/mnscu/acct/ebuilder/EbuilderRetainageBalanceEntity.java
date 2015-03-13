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
@javax.persistence.Table(name = "EBUILDER_RETAINAGE_BALANCE", schema = "ISRS", catalog = "")
public class EbuilderRetainageBalanceEntity {
    private BigDecimal ebuilderRetainageBalId;

    @Id
    @javax.persistence.Column(name = "EBUILDER_RETAINAGE_BAL_ID")
    public BigDecimal getEbuilderRetainageBalId() {
        return ebuilderRetainageBalId;
    }

    public void setEbuilderRetainageBalId(BigDecimal ebuilderRetainageBalId) {
        this.ebuilderRetainageBalId = ebuilderRetainageBalId;
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

    private String commitInvoiceDesc;

    @Basic
    @javax.persistence.Column(name = "COMMIT_INVOICE_DESC")
    public String getCommitInvoiceDesc() {
        return commitInvoiceDesc;
    }

    public void setCommitInvoiceDesc(String commitInvoiceDesc) {
        this.commitInvoiceDesc = commitInvoiceDesc;
    }

    private String invoiceRefNbr;

    @Basic
    @javax.persistence.Column(name = "INVOICE_REF_NBR")
    public String getInvoiceRefNbr() {
        return invoiceRefNbr;
    }

    public void setInvoiceRefNbr(String invoiceRefNbr) {
        this.invoiceRefNbr = invoiceRefNbr;
    }

    private BigDecimal invoiceAmt;

    @Basic
    @javax.persistence.Column(name = "INVOICE_AMT")
    public BigDecimal getInvoiceAmt() {
        return invoiceAmt;
    }

    public void setInvoiceAmt(BigDecimal invoiceAmt) {
        this.invoiceAmt = invoiceAmt;
    }

    private BigDecimal invoiceRetainageAmt;

    @Basic
    @javax.persistence.Column(name = "INVOICE_RETAINAGE_AMT")
    public BigDecimal getInvoiceRetainageAmt() {
        return invoiceRetainageAmt;
    }

    public void setInvoiceRetainageAmt(BigDecimal invoiceRetainageAmt) {
        this.invoiceRetainageAmt = invoiceRetainageAmt;
    }

    private BigDecimal invoiceReleaseAmt;

    @Basic
    @javax.persistence.Column(name = "INVOICE_RELEASE_AMT")
    public BigDecimal getInvoiceReleaseAmt() {
        return invoiceReleaseAmt;
    }

    public void setInvoiceReleaseAmt(BigDecimal invoiceReleaseAmt) {
        this.invoiceReleaseAmt = invoiceReleaseAmt;
    }

    private Timestamp invoicePaidDate;

    @Basic
    @javax.persistence.Column(name = "INVOICE_PAID_DATE")
    public Timestamp getInvoicePaidDate() {
        return invoicePaidDate;
    }

    public void setInvoicePaidDate(Timestamp invoicePaidDate) {
        this.invoicePaidDate = invoicePaidDate;
    }

    private BigDecimal commitRetainageAmt;

    @Basic
    @javax.persistence.Column(name = "COMMIT_RETAINAGE_AMT")
    public BigDecimal getCommitRetainageAmt() {
        return commitRetainageAmt;
    }

    public void setCommitRetainageAmt(BigDecimal commitRetainageAmt) {
        this.commitRetainageAmt = commitRetainageAmt;
    }

    private BigDecimal commitReleaseAmt;

    @Basic
    @javax.persistence.Column(name = "COMMIT_RELEASE_AMT")
    public BigDecimal getCommitReleaseAmt() {
        return commitReleaseAmt;
    }

    public void setCommitReleaseAmt(BigDecimal commitReleaseAmt) {
        this.commitReleaseAmt = commitReleaseAmt;
    }

    private BigDecimal commitRetainageBalAmt;

    @Basic
    @javax.persistence.Column(name = "COMMIT_RETAINAGE_BAL_AMT")
    public BigDecimal getCommitRetainageBalAmt() {
        return commitRetainageBalAmt;
    }

    public void setCommitRetainageBalAmt(BigDecimal commitRetainageBalAmt) {
        this.commitRetainageBalAmt = commitRetainageBalAmt;
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

        EbuilderRetainageBalanceEntity that = (EbuilderRetainageBalanceEntity) o;

        if (commitInvoiceDesc != null ? !commitInvoiceDesc.equals(that.commitInvoiceDesc) : that.commitInvoiceDesc != null)
            return false;
        if (commitNbr != null ? !commitNbr.equals(that.commitNbr) : that.commitNbr != null) return false;
        if (commitReleaseAmt != null ? !commitReleaseAmt.equals(that.commitReleaseAmt) : that.commitReleaseAmt != null)
            return false;
        if (commitRetainageAmt != null ? !commitRetainageAmt.equals(that.commitRetainageAmt) : that.commitRetainageAmt != null)
            return false;
        if (commitRetainageBalAmt != null ? !commitRetainageBalAmt.equals(that.commitRetainageBalAmt) : that.commitRetainageBalAmt != null)
            return false;
        if (ebuilderRetainageBalId != null ? !ebuilderRetainageBalId.equals(that.ebuilderRetainageBalId) : that.ebuilderRetainageBalId != null)
            return false;
        if (invoiceAmt != null ? !invoiceAmt.equals(that.invoiceAmt) : that.invoiceAmt != null) return false;
        if (invoicePaidDate != null ? !invoicePaidDate.equals(that.invoicePaidDate) : that.invoicePaidDate != null)
            return false;
        if (invoiceRefNbr != null ? !invoiceRefNbr.equals(that.invoiceRefNbr) : that.invoiceRefNbr != null)
            return false;
        if (invoiceReleaseAmt != null ? !invoiceReleaseAmt.equals(that.invoiceReleaseAmt) : that.invoiceReleaseAmt != null)
            return false;
        if (invoiceRetainageAmt != null ? !invoiceRetainageAmt.equals(that.invoiceRetainageAmt) : that.invoiceRetainageAmt != null)
            return false;
        if (loadTimestamp != null ? !loadTimestamp.equals(that.loadTimestamp) : that.loadTimestamp != null)
            return false;
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
        int result = ebuilderRetainageBalId != null ? ebuilderRetainageBalId.hashCode() : 0;
        result = 31 * result + (rcId != null ? rcId.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (poNbr != null ? poNbr.hashCode() : 0);
        result = 31 * result + (commitNbr != null ? commitNbr.hashCode() : 0);
        result = 31 * result + (commitInvoiceDesc != null ? commitInvoiceDesc.hashCode() : 0);
        result = 31 * result + (invoiceRefNbr != null ? invoiceRefNbr.hashCode() : 0);
        result = 31 * result + (invoiceAmt != null ? invoiceAmt.hashCode() : 0);
        result = 31 * result + (invoiceRetainageAmt != null ? invoiceRetainageAmt.hashCode() : 0);
        result = 31 * result + (invoiceReleaseAmt != null ? invoiceReleaseAmt.hashCode() : 0);
        result = 31 * result + (invoicePaidDate != null ? invoicePaidDate.hashCode() : 0);
        result = 31 * result + (commitRetainageAmt != null ? commitRetainageAmt.hashCode() : 0);
        result = 31 * result + (commitReleaseAmt != null ? commitReleaseAmt.hashCode() : 0);
        result = 31 * result + (commitRetainageBalAmt != null ? commitRetainageBalAmt.hashCode() : 0);
        result = 31 * result + (vendorName != null ? vendorName.hashCode() : 0);
        result = 31 * result + (vendorNbr != null ? vendorNbr.hashCode() : 0);
        result = 31 * result + (loadTimestamp != null ? loadTimestamp.hashCode() : 0);
        return result;
    }
}
