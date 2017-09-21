package LPS2IMA.Larchey;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import LPS2IMA.Larchey.ContactService;

public class TestFonctionnelContactService {

	//Test IDEA

	private ContactService service ; 
	@Before
	public void setUp() {
		service = new ContactService() ;
	}
	
	@Test
	public void testCreerContactWithCorrectParameter() {
		service.addContact("ALbert","0200000000");
		assertTrue(true);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreerContactWithNameLengthUnderThree() {
		service.addContact("AL","0200000000");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreerContactWithNameLengthSuperiorToTheLimit() {
		service.addContact("Somebodyoncetoldmetheworldisgonnarollmeiaintthesharpesttoolintheshed","0200000000");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreerContactWithTelephoneLengthMinimal() {
		service.addContact("Toto","02");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testCreerContactWithTelephoneLengthMaximal() {
		service.addContact("Toto","02020202020");
	}
	
	@Test (expected = IllegalStateException.class)
	public void testCreerContactWithContactAlreadyExist() {
		service.addContact("Toto","0202020202");
		service.addContact("Toto","0202020211");
	}
	

}

