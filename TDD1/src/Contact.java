
public class Contact {
	private String nom;
	private String tel;

	Contact(String nom, String tel) throws IllegalArgumentException {
		if (tel.length() > 0) {
		this.tel = tel;
		} else {
			throw new IllegalArgumentException("Bad tel length !");
		}
		if (nom.length() > 2 && nom.length() < 41) {
			this.nom = nom;
		} else {
			throw new IllegalArgumentException("Bad name length !");
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if (nom.length() > 2 && nom.length() < 41) {
		this.nom = nom;
		} else {
			throw new IllegalArgumentException("Bad name length !");
		}
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		if (tel.length() > 0) {
			this.tel = tel;
			} else {
				throw new IllegalArgumentException("Bad tel length !");
			}
	}

}
