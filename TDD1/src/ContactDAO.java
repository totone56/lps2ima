import java.util.ArrayList;

public class ContactDAO {

	private ArrayList<Contact> contactList;

	public ContactDAO() {
		this.contactList = new ArrayList<Contact>();
	}

	public Contact getContact(String nom) {
		for (int i = 0; i < this.contactList.size(); i++) {
			if (this.contactList.get(i).getNom() == nom) {
				return this.contactList.get(i);
			}
		}
		return null;
	}

	public void addContact(Contact contact) {
		if (!isContactExist(contact.getNom())) {
			contactList.add(contact);
		} else {
			System.out.println("Contact déja présent dans la liste !");
		}
	}
	
	public boolean isContactExist(String nom){
		Contact tmp = getContact(nom);
		if (tmp == null) {
			return true;
		} else {
			return true;
		}
	}

}
