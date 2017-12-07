package com.dotridge.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//
@Entity
public class PatientTest implements Serializable {

	private static final long serialVersionUID = -6659991924605201279L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientTestId;
	@ManyToOne
	private Patient patient;
	private Date testDate;
	private Date deliveryDate;
	@OneToMany
	private TestType testType;
	public int getPatientTestId() {
		return patientTestId;
	}
	public void setPatientTestId(int patientTestId) {
		this.patientTestId = patientTestId;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public TestType getTestType() {
		return testType;
	}
	public void setTestType(TestType testType) {
		this.testType = testType;
	}
	@Override
	public String toString() {
		return "PatientTest [patientTestId=" + patientTestId + ", patient=" + patient + ", testDate=" + testDate
				+ ", deliveryDate=" + deliveryDate + ", testType=" + testType + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deliveryDate == null) ? 0 : deliveryDate.hashCode());
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
		result = prime * result + patientTestId;
		result = prime * result + ((testDate == null) ? 0 : testDate.hashCode());
		result = prime * result + ((testType == null) ? 0 : testType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatientTest other = (PatientTest) obj;
		if (deliveryDate == null) {
			if (other.deliveryDate != null)
				return false;
		} else if (!deliveryDate.equals(other.deliveryDate))
			return false;
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		if (patientTestId != other.patientTestId)
			return false;
		if (testDate == null) {
			if (other.testDate != null)
				return false;
		} else if (!testDate.equals(other.testDate))
			return false;
		if (testType == null) {
			if (other.testType != null)
				return false;
		} else if (!testType.equals(other.testType))
			return false;
		return true;
	}
	
}
