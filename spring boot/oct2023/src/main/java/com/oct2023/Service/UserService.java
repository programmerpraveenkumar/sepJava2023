package com.oct2023.Service;

import com.oct2023.Model.UserModel;
import com.oct2023.Repo.UserRepo;
import com.oct2023.Request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public String getName(){
        return "this is service";
    }
    public void createUser(UserRequest userRequest){
        try{
            UserModel userModel = new UserModel();
            userModel.setName(userRequest.getName());
            userModel.setEmail(userRequest.getEmail());
            userRepo.save(userModel);
        }catch (Exception e){
            throw e;
        }
    }
    public void updateUser(UserRequest userRequest)throws Exception{
        try{
            UserModel userModel = userRepo.findById(userRequest.getId()).orElseThrow(()->new Exception("No User Found"));
            if(userRequest.getName() != null && !userRequest.getName().equals("")){
                userModel.setName(userRequest.getName());
            }if(userRequest.getEmail() != null && !userRequest.getEmail().equals("")){
                userModel.setEmail(userRequest.getEmail());
            }
            userRepo.save(userModel);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }
    public Boolean login(String email,String password) throws Exception{
        UserModel userModel = userRepo.login(email,password).orElseThrow(()->new Exception("No User Found"));
        return true;
    }
    public void deleteUser(Long userId)throws Exception{
        try{
            UserModel userModel = userRepo.findById(userId).orElseThrow(()->new Exception("No User Found"));
            userRepo.delete(userModel);
        }catch (Exception e){
            throw e;
        }
    }

    public List<UserModel> getUserList(){
        return userRepo.findAll();//get all records from the user table.
    }

}
