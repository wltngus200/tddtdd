package com.green.tddpractice.userfollow;

import com.green.tddpractice.userfollow.model.UserFollowEntity;
import com.green.tddpractice.userfollow.model.UserFollowReq;
import com.green.tddpractice.userfollow.model.UserFollowEntity;
import com.green.tddpractice.userfollow.model.UserFollowReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserFollowMapper {
    int insUserFollow(UserFollowReq p);
    List<UserFollowEntity> selUserFollowListForTest(UserFollowReq p);
    int delUserFollow(UserFollowReq p);
}

