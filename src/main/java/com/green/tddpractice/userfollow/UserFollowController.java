package com.green.tddpractice.userfollow;

import com.green.tddpractice.common.model.ResultDto;
import com.green.tddpractice.userfollow.model.UserFollowReq;
import com.green.tddpractice.common.model.ResultDto;
import com.green.tddpractice.userfollow.model.UserFollowReq;

public interface UserFollowController {
    ResultDto<Integer> postUerFollow(UserFollowReq p);
    ResultDto<Integer> deleteUserFollow(UserFollowReq p);
}
