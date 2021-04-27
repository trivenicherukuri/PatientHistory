package com.psic;

public class Patient {

	private int patientID;
	private String patientName;
	private String patientAddress;
	private int patientPhNumber;
	private String doctorName;
	private String treatment;
	private String appointmentStatus;

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public int getPatientPhNumber() {
		return patientPhNumber;
	}

	public void setPatientPhNumber(int patientPhNumber) {
		this.patientPhNumber = patientPhNumber;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public String getAppointmentStatus() {
		return appointmentStatus;
	}

	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	public Patient(int patientID, String patientName, String patientAddress, int patientPhNumber, String doctorName,
			String treatment, String appointmentStatus) {
		super();
		this.patientID = patientID;
		this.patientName = patientName;
		this.patientAddress = patientAddress;
		this.patientPhNumber = patientPhNumber;
		this.doctorName = doctorName;
		this.treatment = treatment;
		this.appointmentStatus = appointmentStatus;
	}

	@Override
	public String toString() {
		return "Patient [patientID=" + patientID + ", patientName=" + patientName + ", patientAddress=" + patientAddress
				+ ", patientPhNumber=" + patientPhNumber + ", doctorName=" + doctorName + ", treatment=" + treatment
				+ ", appointmentStatus=" + appointmentStatus + "]";
	}

}
