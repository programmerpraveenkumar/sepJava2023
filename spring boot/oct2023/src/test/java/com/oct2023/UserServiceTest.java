package com.oct2023;


import com.oct2023.Model.UserModel;
import com.oct2023.Repo.UserRepo;
import com.oct2023.Request.UserRequest;
import com.oct2023.Service.UserService;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.BDDMockito.given;

import static org.junit.Assert.assertEquals;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @InjectMocks
    UserService userService;
    @Mock
    UserRepo userRepo;

    @Test
    public void createUser(){
        System.out.println("inside test case");
        UserRequest userRequest = new UserRequest();
        userRequest.setEmail("test@gmail.com");
        userRequest.setName("testname");
        userRequest.setId(1L);
        userService.createUser(userRequest);
    }
   
    @Test
    public void getUserList(){
        UserModel userModel = new UserModel();
        userModel.setEmail("test@gmail.com");
        userModel.setId(1L);
        userModel.setPassword("asdfads");
        List<UserModel> list = new ArrayList<>();
        list.add(userModel);

       given(userRepo.findAll()).willReturn(list);

        List<UserModel> listRest = userService.getUserList();
        Assert.notNull(listRest);
    }
}

