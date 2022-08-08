package com.quintrix.banking.company;

/***
 * Please read about JPA repositories and utilize them here
 * @author drhin
 *
 */
public interface CompanyRepository /* extends CrudRepository<Branch, Long> */ {

	public Branch addBranch(Branch newBranch);
	public Branch findBranchByLocation(String location);
	public Branch findBranchById(long id);
	
}
