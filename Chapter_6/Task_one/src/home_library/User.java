package home_library;

public class User {

	private boolean admin = false;
	private String email;
	private String password;

	protected User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	protected boolean is_admin() {
		return this.admin;
	}

	public void give_admin() {
		this.admin = true;
	}

	public void take_admin() {
		this.admin = false;
	}

	protected String get_email() {
		return this.email;
	}

	protected String get_password() {
		return this.password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (admin ? 1231 : 1237);
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (admin != other.admin)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

}
