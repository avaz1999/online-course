package uz.avaz.onlinecourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.avaz.onlinecourse.entity.Course;
import uz.avaz.onlinecourse.service.AttachmentService;
import uz.avaz.onlinecourse.service.CourseService;

@Controller
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;
    private final AttachmentService attachmentService;

    public CourseController(CourseService courseService,
                            AttachmentService attachmentService) {
        this.courseService = courseService;
        this.attachmentService = attachmentService;

    }


    @GetMapping
    public String getAllCourses(Model model){
        model.addAttribute("courseList",courseService.getAllCourse());
        return "course_card";
    }
}
