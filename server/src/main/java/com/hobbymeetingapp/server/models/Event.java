package com.hobbymeetingapp.server.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Event extends EntityDel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @NotNull
    @Column(name = "Name")
    private String name;

    @NotNull
    @Column(name = "CreatorId")
    private Integer creatorId;

    //Podejrzewam, że lokalizacja z GoogleAPI będzie stringiem.
    @NotNull
    @Column(name = "LocationId")
    private String locationId;

    @NotNull
    @Column(name = "InterestId")
    private Integer interestId;

    @NotNull
    @Column(name = "Date")
    private Date date;

    @Column(name = "DurationMinutes")
    private Integer durationMinutes;

    @NotNull
    @Column(name = "IsFinished")
    private Boolean isFinished;

    //Nie not null - brak wartości oznacza nieskończoność użytkowników
    @Column(name = "MaxParticipantsQuantity")
    private Integer maxParticipantsQuantity;

    @Column(name = "Description")
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public Integer getInterestId() {
        return interestId;
    }

    public void setInterestId(Integer interestId) {
        this.interestId = interestId;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public Boolean getFinished() {
        return isFinished;
    }

    public void setFinished(Boolean finished) {
        isFinished = finished;
    }

    public Integer getMaxParticipantsQuantity() {
        return maxParticipantsQuantity;
    }

    public void setMaxParticipantsQuantity(Integer maxParticipantsQuantity) {
        this.maxParticipantsQuantity = maxParticipantsQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
