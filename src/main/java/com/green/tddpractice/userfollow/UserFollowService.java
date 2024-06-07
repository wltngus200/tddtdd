package com.green.tddpractice.userfollow;

import com.green.tddpractice.userfollow.model.UserFollowReq;
import com.green.tddpractice.userfollow.model.UserFollowReq;

public interface UserFollowService {
    int postUserFollow(UserFollowReq p);
    int deleteUserFollow(UserFollowReq p);
}
