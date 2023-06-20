package com.cydeo.service.impl;

import com.cydeo.dto.ProjectDTO;
import com.cydeo.entity.Project;
import com.cydeo.mapper.ProjectMapper;
import com.cydeo.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProjectServiceImplTest {
////this method(getprojectbycode) use projectRepostory and projectmapper so I need objects of both them
    @Mock
    ProjectRepository projectRepository;

    @Mock
    ProjectMapper projectMapper;

    @InjectMocks //im trying to test getByProjectCode method inside projectservicceimpl class
            //if you are trying mocking we need to inject these mocks inside to real project repository
    ProjectServiceImpl projectService;

    @Test
    void getByProjectCode_Test() {
//we are defining how our mock objects methods behave
        // Given(some preparation to start my test) //run once and return me new entity
        when(projectRepository.findByProjectCode(anyString())).thenReturn(new Project());   // Stubbing
        when(projectMapper.convertToDto(any(Project.class))).thenReturn(new ProjectDTO());

        // When//we are doing real action//we are calling the method thet we want to test
        ProjectDTO projectDTO = projectService.getByProjectCode(anyString());

        // Then
        InOrder inOrder = inOrder(projectRepository, projectMapper);  // I want to check the order of these 2 Mocks

        inOrder.verify(projectRepository).findByProjectCode(anyString());  // We are providing in which order these 2 Mocks should be
        inOrder.verify(projectMapper).convertToDto(any(Project.class));

        assertNotNull(projectDTO);//we are checking that returning object is null or not

    }

    @Test
    void getByProjectCode_ExceptionTest() {

        when(projectRepository.findByProjectCode("")).thenThrow(new NoSuchElementException("Project Not Found"));
//im running method which i wanted to test//im checking exception
        Throwable throwable = assertThrows(NoSuchElementException.class, () -> projectService.getByProjectCode(""));
// im doing some more verification////im checking the exception
        verify(projectRepository).findByProjectCode("");
//never method is checking this never run?
        verify(projectMapper, never()).convertToDto(any(Project.class));
// these verify lines=> im checking the place of exception

        assertEquals("Project Not Found", throwable.getMessage());
//im checking exception correct or not
    }

}
