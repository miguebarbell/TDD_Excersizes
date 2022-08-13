package com.quintrix.banking.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

/***
 * Please read about JPA repositories and utilize them here
 * @author drhin
 *
 */
@Controller
public class CompanyRepository {

	public List<Branch> branches = new ArrayList<>();
	public Branch addBranch(Branch newBranch) {
		branches.add(newBranch);
    return newBranch;
	}

	public Branch findBranchByLocation(String test_location) {
		return branches.stream().filter(branch -> branch.location.equals(test_location)).findFirst().get();
	}
//	public Branch findBranchByLocation(String location);
//	public Branch findBranchById(long id);
	
}
