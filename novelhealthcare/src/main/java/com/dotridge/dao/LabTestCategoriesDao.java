package com.dotridge.dao;

import java.util.List;

import com.dotridge.domain.LabTestCategories;

public interface LabTestCategoriesDao {

	public LabTestCategories createLabTestCategories(LabTestCategories labTestCategories);

	public LabTestCategories getLabTestCategoriesById(int id);

	public LabTestCategories updateLabTestCategories(LabTestCategories labTestCategories);

	public boolean deleteLabTestCategories(int pId);

	public List<LabTestCategories> getLabTestCategoriesByName(String catgryName);

	public LabTestCategories getLabTestCategoriesByUniqueName(String name);

	public List<LabTestCategories> getAllLabTestCategoriess();

	public List<LabTestCategories> getAllLabTestCategoriessByPagianation(int currentPage, int noOfRecPerPage);
}
