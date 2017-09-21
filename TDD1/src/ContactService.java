
public class ContactService {

	private ContactDAO dao;

	public ContactService() {
		this.dao = new ContactDAO();
	}

	public void addContact(String nom, String tel) {
			try {
				dao.addContact(new Contact(nom, tel));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public Contact getContact(String nom) {
		if (nom.length() > 2 && nom.length() < 41) {
			try {
				Contact ret = dao.getContact(nom);
				return ret;
			} catch (NullPointerException e) {
				e.printStackTrace();
				return null;
			}
		} else {
			System.out.println("Nom invalide !");
			return null;
		}
	}
}
