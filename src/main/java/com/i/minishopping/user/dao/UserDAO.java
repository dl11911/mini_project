package com.i.minishopping.user.dao;

import com.i.minishopping.user.bean.UserDTO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO {
    UserDTO selectUserByEmailAndPassword(String email, String password);
    void insertUser(UserDTO userDTO); // 사용자를 삽입하는 메소드

    List<UserDTO> getUserList(); // 사용자 목록을 조회하는 메소드

    void deleteUser(Long userDTO); // 사용자를 삭제하는 메소드

    UserDTO getUserById(Long userId);


    void updateUser(UserDTO userDTO);


}
