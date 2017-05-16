package evolution.controller;

public class AnyDto {
	private String name;

	@Override
	public String toString() {
		return "AnyDto [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
