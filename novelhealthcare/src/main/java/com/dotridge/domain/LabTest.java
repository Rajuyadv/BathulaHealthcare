package com.dotridge.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class LabTest implements Serializable {

	private static final long serialVersionUID = 8386031327051443452L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int labTestId;
	private String testName;
	private String status;
	private int referenceRange;
	private int unit;
	@OneToOne
	private LabTestCategories testCategories;

}
