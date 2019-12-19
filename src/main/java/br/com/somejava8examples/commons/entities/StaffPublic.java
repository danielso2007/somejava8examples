package br.com.somejava8examples.commons.entities;

import java.util.Objects;

import br.com.somejava8examples.commons.BaseEntity;

public class StaffPublic implements BaseEntity {

	private String name;
	private int age;
	private String extra;

	public StaffPublic() {
	}

	public StaffPublic(String name, int age, String extra) {
		this.name = name;
		this.age = age;
		this.extra = extra;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, extra, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof StaffPublic)) {
			return false;
		}
		StaffPublic other = (StaffPublic) obj;
		return age == other.age && Objects.equals(extra, other.extra) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "StaffPublic [" + (name != null ? "name=" + name + ", " : "") + "age=" + age + ", "
				+ (extra != null ? "extra=" + extra : "") + "]";
	}

}
