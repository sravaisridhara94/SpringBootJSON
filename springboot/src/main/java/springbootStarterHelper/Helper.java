package springbootStarterHelper;

import java.util.ArrayList;
import java.util.List;

import springbootStarterModel.Entity;


public class Helper {



public List<Entity> addStudent() {
	
	List<Entity> studentList = new ArrayList<Entity> ();
	
	studentList.add(new Entity("1","Sravani", "Sridhara", "11-14-1994", "California State University", "Computer Science", "3.5"));
	studentList.add(new Entity("2","Sai Priya", "Anumula", "05-19-1994", "California State University", "Computer Science", "3.6"));
	
	return studentList;
}
	

}
