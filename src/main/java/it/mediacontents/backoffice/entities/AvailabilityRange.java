package it.mediacontents.backoffice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AvailabilityRange {

    @Id
    private Long id;

    private Long supplierId;

    //to be decided how to efficiently store the base point
    private String basePoint;

    private Long distance;

    private Long travelTime;

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

    public String getBasePoint() {
        return basePoint;
    }

    public void setBasePoint(String basePoint) {
        this.basePoint = basePoint;
    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public Long getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Long travelTime) {
        this.travelTime = travelTime;
    }
}
