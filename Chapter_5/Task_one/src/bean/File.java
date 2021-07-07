package bean;

public abstract class File {

	private String name;
	private Directory directory;

	public File(String name, String path) {
		this.name = name;
		this.directory = new Directory(path);
	}

	public abstract void create_file();

	public abstract void rename(String new_name);

	public abstract void show_content();

	public abstract void add_content();

	public abstract void delete();

	public void set_name(String name) {
		this.name = name;
	}

	public void set_directory(String directory) {
		this.directory.set_directory(directory);
	}

	public String get_name() {
		return this.name;
	}

	public Directory get_directory() {
		return this.directory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((directory == null) ? 0 : directory.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		File other = (File) obj;
		if (directory == null) {
			if (other.directory != null)
				return false;
		} else if (!directory.equals(other.directory))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
