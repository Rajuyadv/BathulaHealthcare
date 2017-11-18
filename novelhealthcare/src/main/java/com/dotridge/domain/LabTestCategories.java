package com.dotridge.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class LabTestCategories implements Serializable {

	private static final long serialVersionUID = -3130009795015264065L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int labCatogeryId;
	private String labTestCategorie;
	private String description;
	private String satus;

	public String getLabTestCategorie() {
		return labTestCategorie;
	}

	public void setLabTestCategorie(String labTestCategorie) {
		this.labTestCategorie = labTestCategorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSatus() {
		return satus;
	}

	public void setSatus(String satus) {
		this.satus = satus;
	}

	@Override
	public String toString() {
		return "LabTestCategories [labTestCategorie=" + labTestCategorie + ", description=" + description + ", satus="
				+ satus + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((labTestCategorie == null) ? 0 : labTestCategorie.hashCode());
		result = prime * result + ((satus == null) ? 0 : satus.hashCode());
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
		LabTestCategories other = (LabTestCategories) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (labTestCategorie == null) {
			if (other.labTestCategorie != null)
				return false;
		} else if (!labTestCategorie.equals(other.labTestCategorie))
			return false;
		if (satus == null) {
			if (other.satus != null)
				return false;
		} else if (!satus.equals(other.satus))
			return false;
		return true;
	}
}
