package LPS2IMA.Larchey;

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

	public boolean addContact(Contact contact) throws IllegalStateException {
		if (!isContactExist(contact.getNom())) {
			contactList.add(contact);
			return true;
		} else {
			throw new IllegalStateException("Contact déja présent dans la liste !");
		}
	}
	
	public void deleteContact(String nom) {
		for (int i = 0; i < this.contactList.size(); i++) {
			if (this.contactList.get(i).getNom() == nom) {
				this.contactList.remove(i);
			}
		}
	}
	
	public boolean isContactExist(String nom){
		Contact tmp = getContact(nom);
		if (tmp == null) {
			return false;
		} else {
			return true;
		}
	}

}
