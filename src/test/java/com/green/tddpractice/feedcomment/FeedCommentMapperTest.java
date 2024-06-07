package com.green.tddpractice.feedcomment;

import com.green.tddpractice.feedcomment.model.FeedCommentGetRes;
import com.green.tddpractice.feedcomment.model.FeedCommentPostReq;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;


@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class FeedCommentMapperTest {
    @Autowired
    private FeedCommentMapper mapper;

    @Test
    void insFeedComment() {
        /* 모르겠다!!!
        List<FeedCommentGetRes> firstList=mapper.feedAllComment(); //새로운 메소드 모든 댓글

        FeedCommentPostReq req1=new FeedCommentPostReq();
        req1.setFeedCommentId(1); req1.setFeedId(1); req1.setUserId(1); req1.setComment("안녕");
        given(mapper.insFeedComment(req1)).willReturn(1); //들어간다면 이 값을 리턴
        verify(mapper).insFeedComment(req1); //실제 작동 여부
        List<FeedCommentGetRes> secondList=mapper.feedAllComment();
        assertEquals(firstList.size(), secondList.size()-1,"새로 받아온 값");

        List<FeedCommentGetRes> list1=mapper.feedCommentList(13);
        assertEquals(3, list1.size(), "리스트 사이즈값이 다름");*/
    }

    @Test
    void deleteFeedComment() {
    }

    @Test
    void feedCommentList() {
    }
}