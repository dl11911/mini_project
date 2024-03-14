package com.i.minishopping.user.dao;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.i.minishopping.user.bean.UserDTO;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserDAOImpl implements UserDAO {

    private final SqlSession sqlSession;
    @Override
    public void insertUser(UserDTO userDTO) {
        sqlSession.insert("userSQL.writeUser", userDTO);
    }

    @Override
    public List<UserDTO> getUserList() {
        return sqlSession.selectList("userSQL.getUserList"); // 사용자 목록을 반환 (새로운 리스트로 반환하여 외부에서의 변경 방지)
    }

    @Override
    public void deleteUser(Long userId) {
        sqlSession.delete("userSQL.deleteUser",userId);

    }
    @Override
    public UserDTO getUserById(Long userId) {
        return sqlSession.selectOne("userSQL.getUserById", userId);
    }

    @Override
    public void updateUser(UserDTO userDTO){

        sqlSession.update("userSQL.updateUser",userDTO);
    }

}
