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

    }

    @Test
    void deleteFeedComment() {
    }

    @Test
    void feedCommentList() {
    }
}