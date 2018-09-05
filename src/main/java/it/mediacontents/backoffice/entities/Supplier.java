package it.mediacontents.backoffice.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Supplier {

    @Id
    private Long id;

    private String name;

    private String firstName;

    private Integer status;

    private LocalDateTime subscriptionDate;

    private String username;

    private String password;

    private String uuid;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "supplierId")
    List<SupplierTool> tools;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "supplierId")
    List<Contact> contacts;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "supplierId")
    List<AvailabilityRange> availabilityRanges;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "supplierId")
    List<SupplierCapability> capabilities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(LocalDateTime subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public List<SupplierTool> getTools() {
        return tools;
    }

    public void setTools(List<SupplierTool> tools) {
        this.tools = tools;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<AvailabilityRange> getAvailabilityRanges() {
        return availabilityRanges;
    }

    public void setAvailabilityRanges(List<AvailabilityRange> availabilityRanges) {
        this.availabilityRanges = availabilityRanges;
    }

    public List<SupplierCapability> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(List<SupplierCapability> capabilities) {
        this.capabilities = capabilities;
    }
}
