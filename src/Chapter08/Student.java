package Chapter08;

public class Student {
	private String name;
	private String studentId;
	private String phoneNo;
	
	public Student(String name, String studentId, String phoneNo) {
		this.name = name;
		this.studentId = studentId;
		this.phoneNo = phoneNo;
	}
	public String getName() {
		return name;
	}
	public String getStudentId() {
		return studentId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void printStudentInfo() {
		System.out.println(this.name + "(" + this.studentId + ") / 전화번호 : " + this.phoneNo);
	}
}
