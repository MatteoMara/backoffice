package it.mediacontents.backoffice.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class SupplierCapability {

    @Id
    private Long id;

    private Long supplierId;

    @ManyToOne
    private JobType jobType;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "capabilityId")
    List<PortfolioEntry> portfolioEntries;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public List<PortfolioEntry> getPortfolioEntries() {
        return portfolioEntries;
    }

    public void setPortfolioEntries(List<PortfolioEntry> portfolioEntries) {
        this.portfolioEntries = portfolioEntries;
    }
}
