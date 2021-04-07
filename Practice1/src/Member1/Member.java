package Member1;

public class Member {
	private String name;
	private String m_id;
	private String m_pw;
	private int age;
	private String phone;
	
	
	public Member(String name, String m_id, String m_pw, int age, String phone) {
		super();
		this.name = name;
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.age = age;
		this.phone = phone;
	}
	
	public Member() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
