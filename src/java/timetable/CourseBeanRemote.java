package timetable;

import javax.ejb.Remote;
import timetable.dto.Course;

@Remote
public interface CourseBeanRemote {

    public Course[] getCourses();
}
