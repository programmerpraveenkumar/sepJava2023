package com.oct2023.Repo;

import com.oct2023.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<UserModel,Long> {
    @Query("select user from UserModel as user where user.email = ?1 and user.password=?2")
    Optional<UserModel> login(String email, String password);
}
