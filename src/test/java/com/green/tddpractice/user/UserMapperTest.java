package com.green.tddpractice.user;

import com.green.tddpractice.user.model.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.ActiveProfiles;

import java.sql.DatabaseMetaData;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@MybatisTest
@ActiveProfiles
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserMapperTest {
    @Autowired
    private UserMapper mapper;

    @Test
    void postUser() {
        User user=mapper.getUserId("aa123");
        List<User> u1=mapper.users(1);
        assertEquals(1, u1.size());
        assertEquals(u1,user);

    }

    @Test
    void getUserId() {
    }

    @Test
    void selProfileUserInfo() {
    }

    @Test
    void updProfilePic() {
    }
}