package com.quintrix.banking.company;

import org.springframework.data.jpa.repository.JpaRepository;

/***
 * Please read about JPA repositories and utilize them here
 * @author drhin
 *
 */
public interface CompanyRepository extends JpaRepository<Branch, Long> {

	public Branch addBranch(Branch newBranch);

	public Branch findBranchByLocation(String location);
	public Branch findBranchById(long id);
	
}
