package service;

import model.Grievance;

public interface GrievanceService {

    void addGrievance(Grievance grievance);

    void viewGrievances();

    void resolveGrievance(int id);
}