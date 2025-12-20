package example.hibernate.association.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="Department_name")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="dept_no")
	private Integer deptNo;
	
	@Column(name="dept_name")
	private String Name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="Dept_No") //Indicates Foreign key column
	private List<Employee> employees;

	public Department(Integer deptNo, String name, List<Employee> employees) {
		super();
		this.deptNo = deptNo;
		Name = name;
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", Name=" + Name + ", employees=" + employees + "]";
	}

	public Integer getDeptNo() {
		return deptNo;
	}
	 protected Department() {
	 }

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}

}
