package model;

import java.time.LocalDate;

public class Grievance {

    private int grievanceId;
    private String studentName;
    private String description;
    private String status;
    private LocalDate date;

    public Grievance(int grievanceId, String studentName, String description) {
        this.grievanceId = grievanceId;
        this.studentName = studentName;
        this.description = description;
        this.status = "Pending";
        this.date = LocalDate.now();
    }

    public int getGrievanceId() {
        return grievanceId;
    }

    public String getStatus() {
        return status;
    }

    public void resolve() {
        this.status = "Resolved";
    }

    @Override
    public String toString() {
        return grievanceId + " | " + studentName + " | " +
               description + " | " + status + " | " + date;
    }
}