package com.cydeo.service.impl;

import com.cydeo.mapper.UserMapper;
import com.cydeo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
    @Mock
    UserRepository userRepository;

    @Mock
    UserMapper userMapper;

    @InjectMocks
    UserServiceImpl userService;

    @Test
    void findByUserName_Test() {

        // I'm calling the real method inside the main, which is the method I want to test.
        userService.findByUserName("harold@manager.com");
    // imported verify method statically
        // I'm checking if this method ran or not.//if the userRepository find this method is run or not//we are checking until here is ok or not
        verify(userRepository).findByUserNameAndIsDeleted("harold@manager.com", false);
//verify that user repositories this method getting called one time two times we are checking how many times if we put 2  test fail
       //in some methods we can use more than one methods for example mapperUtil.convert
        verify(userRepository, times(1)).findByUserNameAndIsDeleted("harold@manager.com", false);
//
        verify(userRepository, atLeastOnce()).findByUserNameAndIsDeleted("harold@manager.com", false);
        verify(userRepository, atLeast(1)).findByUserNameAndIsDeleted("harold@manager.com", false);

        verify(userRepository, atMostOnce()).findByUserNameAndIsDeleted("harold@manager.com", false);

        //this is gonna faill because this method is not running 10 times
        verify(userRepository, atMost(10)).findByUserNameAndIsDeleted("harold@manager.com", false);

       // you want to see order// check order
        InOrder inOrder = inOrder(userRepository, userMapper);

        inOrder.verify(userRepository).findByUserNameAndIsDeleted("harold@manager.com", false);
        inOrder.verify(userMapper).convertToDto(null);



    }
}