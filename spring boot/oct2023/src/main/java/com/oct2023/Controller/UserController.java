package com.oct2023.Controller;

import com.oct2023.Request.LoginRequest;
import com.oct2023.Request.UserRequest;
import com.oct2023.Response.LoginResponse;
import com.oct2023.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
@CrossOrigin(origins ="*")
public class UserController {

    //below autowired will create object for userService
    @Autowired
    UserService userService;

    @GetMapping("getUser")
    public String getName(){
        return userService.getName();//calling the service method.
    }
    @GetMapping("getUserList")
    public  ResponseEntity<?>  getUserList(){
        //TODO handling the exception
        return ResponseEntity.ok(userService.getUserList());
    }

    @PostMapping("createUser")
    public ResponseEntity<?> createUser(@RequestBody UserRequest userRequest){
        LoginResponse response= new LoginResponse();
        try{
            userService.createUser(userRequest);
            response.setMessage("User is created..");
            return ResponseEntity.ok(response);//200 ok
        }catch (Exception e){
            response.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(response);//400 error
        }
    }



    @PutMapping("update")
    public ResponseEntity<?>  userUpdate(@RequestBody UserRequest userRequest){
        LoginResponse response= new LoginResponse();
        try{
            userService.updateUser(userRequest);
            response.setMessage("User is updated..");
            return ResponseEntity.ok(response);//200 ok
        }catch (Exception e){
            response.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(response);//400 error
        }
    }

    @DeleteMapping("delete/{userId}")
    public ResponseEntity<?>  userDelete(@PathVariable Long userId){
            LoginResponse response= new LoginResponse();
            try{
                userService.deleteUser(userId);
                response.setMessage("User is delete..");
                return ResponseEntity.ok(response);//200 ok
            }catch (Exception e){
                response.setMessage(e.getMessage());
                return ResponseEntity.badRequest().body(response);//400 error
            }
    }


    @PostMapping("login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest){
        LoginResponse response= new LoginResponse();
        try{
            userService.login(loginRequest.getEmail(),loginRequest.getPassword());
            response.setMessage("ok");
            return ResponseEntity.ok(response);//200 ok
        }catch (Exception e){
            response.setMessage(e.getMessage());
            return ResponseEntity.badRequest().body(response);//400 error
        }

    }
}
