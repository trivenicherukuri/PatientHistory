package com.psic;

import java.util.Scanner;

public class PSICMain {

	public static void main(String[] args) {

		int patientID;
		String patientName;
		String patientAddress;
		int patientPhNumber;
		String doctorName;
		String treatment;
		String appointmentStatus;

		int count = 0;

		char otherchoice = 'Y';

		Patient patient[] = new Patient[15];
		Consultation consultation[] = new Consultation[10];
		TimeTable time4week = new TimeTable();

		while (otherchoice == 'Y') {
			Scanner scn = new Scanner(System.in);
			System.out.println("******************************************************************************");
			System.out.println("           Welcome to Physiotherapy & Sports Injury Centre (PSIC)");
			System.out.println("******************************************************************************");
			System.out.println("1: List of Treatment offer by Physician");
			System.out.println("******************************************************************************");
			System.out.println("2: Register & Book Appointment");
			System.out.println("******************************************************************************");
			System.out.println("3: Physician Consultation");
			System.out.println("******************************************************************************");
			System.out.println("4: Reschedule or Cancel Appointment");
			System.out.println("******************************************************************************");
			System.out.println("5: View History of Patient");
			System.out.println("******************************************************************************");
			System.out.println("6: Exist Application");
			System.out.println("******************************************************************************");
			System.out.println("                  Please select your choice of service");
			System.out.println("******************************************************************************");

			int choice = scn.nextInt();

			switch (choice) {
			
			case 1:
				System.out.println("*****List of Treatment offer by Physician*****");
				time4week.displayTimeTable();
				break;
			
			case 2:
				System.out.println("*****Book Appointment*****");
				System.out.println("Patient ID: ");
				patientID = scn.nextInt();
				System.out.println("Patient Name: ");
				patientName = scn.next();
				System.out.println("Patient Address: ");
				patientAddress = scn.next();
				System.out.println("Patient Phone Number: ");
				patientPhNumber = scn.nextInt();
				System.out.println("Doctor name: ");
				doctorName = scn.next();
				System.out.println("Treatment: ");
				treatment = scn.next();
				System.out.println("Appointment Status: ");
				appointmentStatus = scn.next();

				patient[count] = new Patient(patientID, patientName, patientAddress, patientPhNumber, doctorName,
						treatment, appointmentStatus);
				count++;
				System.out.println("Appointment Booked Successfully..!!");
				break;

			case 3:
				System.out.println("*****Book Appointment*****");
				System.out.println("Patient ID: ");
				patientID = scn.nextInt();
				System.out.println("Patient Name: ");
				patientName = scn.next();
				System.out.println("Doctor Name: ");
				doctorName = scn.next();
				System.out.println("Treatment: ");
				treatment = scn.next();

				consultation[count] = new Consultation(patientID, patientName, doctorName, treatment);
				count++;
				System.out.println("Appointment Booked Successfully..!!");
				break;

			case 4:
				System.out.println("*****Update Appointment Status*****");
				System.out.println("Patient ID: ");
				patientID = scn.nextInt();
				for (int i = 0; i < count; i++) {
					if (patient[i] != null && patient[i].getPatientID() == patientID) {
						System.out.println("Appointment Status: ");
						appointmentStatus = scn.next();
						if (appointmentStatus.equals("Cancel"))
							System.out.println("Appointment is Cancelled Successfully..!!");
						else
							System.out.println("Appointment is Rescheduled Successfully..!!");
						patient[i].setAppointmentStatus(appointmentStatus);
					}
				}
				break;

			case 5:
				System.out.println("*****View Patient Details*****");
				System.out.println("Patient ID: ");
				patientID = scn.nextInt();
				for (int i = 0; i < count; i++) {
					if (patient[i] != null && patient[i].getPatientID() == patientID) {

						System.out.println("Patient ID: " + patient[i].getPatientID());
						System.out.println("Patient Name: " + patient[i].getPatientName());
						System.out.println("Patient Address: " + patient[i].getPatientAddress());
						System.out.println("Patient Phone Number: " + patient[i].getPatientPhNumber());
						System.out.println("Physician: " + patient[i].getDoctorName());
						System.out.println("Treatment: " + patient[i].getTreatment());
						System.out.println("Appointment Status: " + patient[i].getAppointmentStatus());

					}else {
						System.out.println("Patient ID is invalid :"+patientID);
					}
				}
				break;

			case 6:
				System.out.println("Thank you for using PSIC Application...!!!");
				break;

			default:
				System.out.println("Sorry...!! You enter a worng choice...!!");
				System.out.println("Thank You...!! Please try again...!!");
				break;

			}
			System.out.println("Do you like to continue...!!");
			otherchoice = scn.next().charAt(0);
			if (Character.isLowerCase(otherchoice)) {
				otherchoice = Character.toUpperCase(otherchoice);
			}

		}
	}
}
