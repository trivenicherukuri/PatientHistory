package com.psic;

public class Consultation {

	private int patientID;
	private String patientName;
	private String doctorName;
	private String treatment;

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

	public Consultation(int patientID, String patientName, String doctorName, String treatment) {
		super();
		this.patientID = patientID;
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.treatment = treatment;
	}

	@Override
	public String toString() {
		return "Consultation [patientID=" + patientID + ", patientName=" + patientName + ", doctorName=" + doctorName
				+ ", treatment=" + treatment + "]";
	}

}
