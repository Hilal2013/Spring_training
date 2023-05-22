package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;

import com.cydeo.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //no more view//r
@RequestMapping("/courses")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseDTO> getAllCourses(){
//return all courses

return courseService.getCourses();
    }
@GetMapping("{id}")
public CourseDTO getCourseById(@PathVariable("id") long courseId){

    return courseService.getCourseById(courseId);
}
    @GetMapping("category/{name}")
    public List<CourseDTO> getCourseByCategory(@PathVariable("name") String categoryName){

        return courseService.getCoursesByCategory(categoryName);
    }

}
