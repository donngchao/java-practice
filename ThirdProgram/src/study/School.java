package study;

import java.util.ArrayList;

public class School {
	 private ArrayList<classroom> classrooms;
	    private String classRoomName;
	    private String teacherName;

	    public School() {
	        classrooms = new ArrayList<classroom>();
	    }

	    public void addClassRoom(classroom newClassRoom, String theClassRoomName) {
	        classrooms.add(newClassRoom);
	        classRoomName = theClassRoomName;
	    }

	    // how to write a method to add a teacher to the classroom by using the
	    // classroom parameter
	    // and the teachers name
	    public void addTeacherToClassRoom(classroom myClassRoom, String TeacherName)
	    {
	        classroom.setTeacherName(TeacherName);
	    }
}
