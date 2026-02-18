package week7.day1;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;
// LISTERNER
public class LeadModule {
	@Test// LISTERNER
	public void createLead() {
		System.out.println("Create Lead Executed");
		throw new NoSuchElementException();
	}
	@Test
	public void deleteLead() {
		System.out.println("Delete Lead Executed");
	}
	@Test
	public void editLead() {
		System.out.println("Edit Lead Executed");
	}

}