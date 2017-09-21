package LPS2IMA.Larchey;

import org.easymock.Capture;
import org.easymock.EasyMock;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;

public class MockFailTest extends MockTest {
	
	@TestSubject
	private ContactService service = new ContactService();
	
	@Mock 
	private IContactDAO dao;
	
	@Test
	public void testCreerContactCasValide() throws ContactExistsException{
		
		String nom = "ContactOk";
		String tel = "TelOk";
		EasyMock.expect(dao.addContact(nom)).andReturn(true);
		
		replayAll();
		
		service.addContact(nom, tel);
		
		verifyAll();
		
	}
	
	@Test
	public void testCreerContactErr() throws ContactExistsException{
		
		String nom = "ContactPasOkDuToutDuToutDuToutDuToutDuToutDuToutDuToutDuToutDuToutDuToutDuToutDuToutDuToutDuToutDuToutDuToutDuToutDuToutDuToutDuTout";
		String tel = "TelOk";
		EasyMock.expect(dao.addContact(nom)).andReturn(true);
		
		Capture <String> capture = EasyMock.newCapture();
		dao.addContact(EasyMock.capture(capture));
		
		replayAll();
		
		service.addContact(nom, tel);
		
		verifyAll();
		
	}

}
