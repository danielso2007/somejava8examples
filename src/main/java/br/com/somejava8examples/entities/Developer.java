package br.com.somejava8examples.entities;

import java.math.BigDecimal;
import java.util.Objects;

import br.com.somejava8examples.commons.BaseEntity;

public class Developer implements BaseEntity {

	private String name;
	private BigDecimal salary;
	private Integer age;

	public Developer(String name, BigDecimal salary, Integer age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Developer)) {
			return false;
		}
		Developer other = (Developer) obj;
		return Objects.equals(age, other.age) && Objects.equals(name, other.name)
				&& Objects.equals(salary, other.salary);
	}

	@Override
	public String toString() {
		return "Developer [" + (name != null ? "name=" + name + ", " : "")
				+ (salary != null ? "salary=" + salary + ", " : "") + (age != null ? "age=" + age : "") + "]";
	}

}
