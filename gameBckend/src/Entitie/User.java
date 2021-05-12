package Entitie;

public class User {
	private int id;
	private String firstname;
	private String lastname;
	private String nationalityNumber;
	private String birthYear;
	
	public User() {
		
	}

	public User(int id, String firstname, String lastname, String nationalityNumber, String birthYear) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.nationalityNumber = nationalityNumber;
		this.birthYear = birthYear;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNationalityNumber() {
		return nationalityNumber;
	}

	public void setNationalityNumber(String nationalityNumber) {
		this.nationalityNumber = nationalityNumber;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	
	
	
}
