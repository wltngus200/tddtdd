package com.green.tddpractice.userfollow;

import com.green.tddpractice.userfollow.model.UserFollowReq;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@Import(UserFollowServiceImpl.class)
@ExtendWith(SpringExtension.class)
class UserFollowServiceTest {
    @MockBean
    private UserFollowMapper mapper;

    @Autowired
    private UserFollowService service;
    @Test
    void postUserFollow() {
        UserFollowReq p1=new UserFollowReq(1, 3);
        given(mapper.insUserFollow(p1)).willReturn(1);
        assertEquals(1, service.postUserFollow(p1));
        verify(mapper).insUserFollow(p1);

        UserFollowReq p2=new UserFollowReq(7, 6);
        given(mapper.insUserFollow(p2)).willReturn(1);
        assertEquals(1, service.postUserFollow(p2));
        verify(mapper).insUserFollow(p2);
    }

    @Test
    void deleteUserFollow() {
    }
}