package com.green.tddpractice.user;

import com.green.tddpractice.user.model.*;
import com.green.tddpractice.user.model.SignInPostReq;
import com.green.tddpractice.user.model.SignUpPostReq;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {
    int postUser(MultipartFile mf, SignUpPostReq p);
    SignInRes postSignIn(SignInPostReq p);
    UserInfoGetRes getUserInfo(UserInfoGetReq p);
    String patchProfilePic(UserProfilePatchReq p);
}
