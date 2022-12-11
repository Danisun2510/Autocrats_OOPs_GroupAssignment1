package service2;
import model.SuperDepartment;
public class HrDepartment extends SuperDepartment {
	
	public String departmentName()
	{
		temp="HR Department";
		return  temp;
	}
	public String getTodaysWork() {
		temp="Fill today's timesheet and mark your attendance";
				return  temp;
	}
	public String getWorkDeadline() {
		temp="Complete by EOD";
				return  temp;
	}
	public String doActivity() {
		temp="team Lunch";
		return  temp;
	}
}

