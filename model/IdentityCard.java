package idcard.model;

public class IdentityCard 
{

	private String name;
	private Integer age;
	private String city;
	private String password;
	public IdentityCard(String name, Integer age, String city, String password) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "IdentityCard [name=" + name + ", age=" + age + ", city=" + city + ", password=" + password + "]";
	}
	
	
}
