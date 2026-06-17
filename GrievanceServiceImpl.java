package service;

import model.Grievance;
import java.util.ArrayList;

public class GrievanceServiceImpl implements GrievanceService {

    private ArrayList<Grievance> grievances = new ArrayList<>();

    @Override
    public void addGrievance(Grievance grievance) {
        grievances.add(grievance);
        System.out.println("✅ Grievance Submitted Successfully!");
    }

    @Override
    public void viewGrievances() {

        if (grievances.isEmpty()) {
            System.out.println("No grievances found.");
            return;
        }

        for (Grievance g : grievances) {
            System.out.println(g);
        }
    }

    @Override
    public void resolveGrievance(int id) {

        for (Grievance g : grievances) {
            if (g.getGrievanceId() == id) {
                g.resolve();
                System.out.println("✅ Grievance Resolved!");
                return;
            }
        }

        System.out.println("❌ Grievance Not Found!");
    }
}