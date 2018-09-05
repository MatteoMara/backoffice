package it.mediacontents.backoffice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.File;
import java.time.LocalDateTime;

@Entity
public class PortfolioEntry {

    @Id
    private Long id;

    private Long capabilityId;

    private File file;

    private LocalDateTime uploadDate;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCapabilityId() {
        return capabilityId;
    }

    public void setCapabilityId(Long capabilityId) {
        this.capabilityId = capabilityId;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public LocalDateTime getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDateTime uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
