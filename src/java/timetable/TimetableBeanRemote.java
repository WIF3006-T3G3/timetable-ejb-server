package timetable;

import java.util.ArrayList;
import javax.ejb.Remote;
import timetable.dto.Course;

@Remote
public interface TimetableBeanRemote {

    public ArrayList<Course> getTimetable();

    public void updateTimetable(ArrayList<Course> courses);
}
