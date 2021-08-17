package bean;

public abstract class File {

	private String name;
	private Directory directory;

	public File(String name, String path) {
		this.name = name;
		this.directory = new Directory(path);
	}

	public File() {
		this.directory = null;
		this.name = "";
	}
	
	public abstract void createFile();

	public abstract void rename(String newName);

	public abstract String getContent();

	public abstract void addContent(String content);

	public abstract void delete();

	public void setName(String name) {
		this.name = name;
	}

	public void setDirectory(String directory) {
		this.directory.setDirectory(directory);
	}

	public String getName() {
		return this.name;
	}

	public Directory getDirectory() {
		return this.directory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((directory == null) ? 0
													   : directory.hashCode());
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
