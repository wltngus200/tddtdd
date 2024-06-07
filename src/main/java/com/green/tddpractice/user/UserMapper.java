package com.green.tddpractice.user;

import com.green.tddpractice.user.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int postUser(SignUpPostReq p);
    User getUserId(String uid);
    UserInfoGetRes selProfileUserInfo(UserInfoGetReq p);
    int updProfilePic(UserProfilePatchReq p);

    List<User> users(long userId);


}
