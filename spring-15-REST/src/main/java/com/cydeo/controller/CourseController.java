package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;

import com.cydeo.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //no more view//r
@RequestMapping("/courses/api/v1")
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

    @PostMapping()
    public CourseDTO createCourse(@RequestBody CourseDTO course){
//how im gonna capture Json from postman body
        //whatever we are puttin in API we captur with @RequestBody
        return courseService.createCourse(course);
    }
    @PutMapping("{id}")
    public void updateCourse(@PathVariable("id") long courseId,@RequestBody CourseDTO course){
//we need to capture that object too
         courseService.updateCourse(courseId,course);
    }
    @DeleteMapping("{id}")
    public void deleteCourse(@PathVariable("id") long courseId){

        courseService.deleteCourseById(courseId);
    }

}
