package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType,
               CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    //Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;

    }

    @Override
    public String toString(){

        String result = "";
        String noJob = "OOPS! This job does not seem to exist.\n";
        String noData = "Data not available";

        // if everything but ID is empty, it doesn't exist. Exit logic.
        if(this.name == "" && this.employer.getValue() == "" && this.coreCompetency.getValue() == "" && this.positionType.getValue() == "" && this.location.getValue() == ""){
            result = "\n"+ noJob;
        } else {
//
//            result = "\nID: " + id
//                    + "\nName:" + name
//                    + "\nEmployer: " + employer
//                    + "\nLocation:" + location
//                    + "\nPosition Type: " + positionType
//                    + "\nCore Competency: " + coreCompetency
//                    + "\n";

            String newName = "\nName: " + name;
            if (name.equals("")) {
                newName = "\nName: " + noData;
            }

            String newEmployer = "\nEmployer: " + employer.getValue();
            if (employer.getValue().equals("") || employer.getValue() == null) {
                newEmployer = "\nEmployer: " + noData;

            }
            String newLocation = "\nLocation: " + location.getValue();
            if (location.getValue().equals("") || location.getValue() == null) {
                newLocation = "\nLocation: " + noData;
            }
            String newPositionType = "\nPosition Type: " + positionType.getValue();
            if (positionType.getValue().equals("") || positionType.getValue() == null) {
                newPositionType = "\nPosition Type: " + noData;
            }
            String newCoreCompetency = "\nCore Competency: " + coreCompetency.getValue();
            if (coreCompetency.getValue().equals("") || coreCompetency.getValue() == null) {
                newCoreCompetency = "\nCore Competency: " + noData;
            }
            result = "\nID: " + id
                    + newName
                    + newEmployer
                    + newLocation
                    + newPositionType
                    + newCoreCompetency
                    + "\n";

        }
        return result;
    }
}
