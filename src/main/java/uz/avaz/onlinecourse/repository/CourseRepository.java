package uz.avaz.onlinecourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.avaz.onlinecourse.entity.Course;

public interface CourseRepository extends JpaRepository<Course,Long> {
}
