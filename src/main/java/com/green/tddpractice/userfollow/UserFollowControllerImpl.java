package com.green.tddpractice.userfollow;

import com.green.tddpractice.common.model.ResultDto;
import com.green.tddpractice.userfollow.model.UserFollowReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/user/follow")
public class UserFollowControllerImpl implements UserFollowController{
    private final UserFollowServiceImpl service;
    @PostMapping
    public ResultDto<Integer> postUerFollow(@RequestBody UserFollowReq p){
        int result=service.postUserFollow(p);
        return ResultDto.<Integer>builder()
                .resultData(result)
                .resultMsg("Hello")
                .statusCode(HttpStatus.OK)
                .build();
    }

    @Override
    @DeleteMapping
    public ResultDto<Integer> deleteUserFollow(@ParameterObject @ModelAttribute UserFollowReq p){
        int result= service.deleteUserFollow(p);

        return ResultDto.<Integer>builder()
                .statusCode(HttpStatus.OK)
                .resultMsg(HttpStatus.OK.toString())
                .resultData(result)
                .build();
    }
}
