package main;

import java.util.Scanner;
import model.Grievance;
import service.GrievanceService;
import service.GrievanceServiceImpl;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GrievanceService service = new GrievanceServiceImpl();

        while (true) {

            System.out.println("\n===== Student Grievance System =====");
            System.out.println("1. Add Grievance");
            System.out.println("2. View Grievances");
            System.out.println("3. Resolve Grievance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Grievance ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Description: ");
                    String desc = sc.nextLine();

                    service.addGrievance(new Grievance(id, name, desc));
                    break;

                case 2:
                    service.viewGrievances();
                    break;1

                case 3:
                    System.out.print("Enter Grievance ID to Resolve: ");
                    int gid = sc.nextInt();
                    service.resolveGrievance(gid);
                    break;

                case 4:
                    System.out.println("Exiting System...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}