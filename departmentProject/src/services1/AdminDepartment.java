package services1;
import model.SuperDepartment;
public class AdminDepartment extends SuperDepartment{
	
	public String departmentName()
	{
		temp="Admin Department";
		return  temp;
	}
	public String getTodaysWork() {
		temp="Complete your documents submission";
				return  temp;
	}
	public String getWorkDeadline() {
		temp="Complete by EOD";
				return  temp;
	}
	 }
