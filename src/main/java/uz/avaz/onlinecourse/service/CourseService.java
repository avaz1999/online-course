package uz.avaz.onlinecourse.service;

import org.springframework.stereotype.Service;
import uz.avaz.onlinecourse.dto.CourseDto;
import uz.avaz.onlinecourse.entity.Attachment;
import uz.avaz.onlinecourse.entity.Course;
import uz.avaz.onlinecourse.repository.AttachmentRepository;
import uz.avaz.onlinecourse.repository.CourseRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;
    private final AttachmentRepository attachmentRepository;

    public CourseService(CourseRepository courseRepository,
                         AttachmentRepository attachmentRepository) {
        this.courseRepository = courseRepository;
        this.attachmentRepository = attachmentRepository;
    }

    public List<CourseDto> getAllCourse() {
        List<Course> getAllCourse = courseRepository.findAll();
        return courseDtoFactory(getAllCourse);
    }

    private List<CourseDto> courseDtoFactory(List<Course> courseList) {
        List<CourseDto> courseDtoList = new ArrayList<>();
        for (Course course : courseList) {
            CourseDto courseDto = new CourseDto(
                    course.getId(),
                    course.getName(),
                    course.getPrice(),
                    course.getBase64Encode()
            );
            courseDtoList.add(courseDto);
        }
        return courseDtoList;
    }
}
