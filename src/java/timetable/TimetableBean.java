package timetable;

import java.util.ArrayList;
import javax.ejb.Stateless;
import timetable.dto.Course;

/**
 *
 * @author ChinJiaXiong
 */
@Stateless
public class TimetableBean implements TimetableBeanRemote {

    ArrayList<Course> selectedCourses = new ArrayList<>();

    public ArrayList<Course> getTimetable() {
        return selectedCourses;
    }

    public void updateTimetable(ArrayList<Course> courses) {
        selectedCourses = courses;
    }
}
