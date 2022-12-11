package service3;
import model.SuperDepartment;
public class TechDepartment extends SuperDepartment {

	public String departmentName()
	{
		temp="Tech Department";
		return  temp;
	}
	public String getTodaysWork() {
		temp="Complete coding of Module 1";
				return  temp;
	}
	public String getWorkDeadline() {
		temp="Complete by EOD";
				return  temp;
	}
	public String getTechStackInformation() {
		temp="Core Java";
		return  temp;
	}
}
