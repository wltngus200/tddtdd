package com.green.tddpractice.feed;

import com.green.tddpractice.common.CustomFileUtils;
import com.green.tddpractice.feed.model.FeedPostPicReq;
import com.green.tddpractice.feed.model.FeedPostReq;
import com.green.tddpractice.feed.model.FeedPostRes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.multipart.MultipartFile;


import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(SpringExtension.class)
@Import(FeedServiceImpl.class)
@TestPropertySource(
        properties = {
                "file.directory=D:/2024_BACK_JI/download/greengram_tdd/"
        }
)
class FeedServiceTest {
    @Value("${file.directory}")
    String uploadPath;

    @Autowired
    private FeedService service;

    @MockBean
    private FeedMapper mapper;
    @MockBean
    private CustomFileUtils utils;

    @Test
    void postFeed() throws Exception {
        MultipartFile multipartFile1=new MockMultipartFile("pic", "a.jpg", "image/jpg",
                new FileInputStream(String.format("%stest/a.jpg", uploadPath)));
        MultipartFile multipartFile2=new MockMultipartFile("pic", "b.jpg", "image/jpg",
                new FileInputStream(String.format("%stest/b.jpg", uploadPath)));
        List<MultipartFile> feed1=new ArrayList();
        feed1.add(multipartFile1); feed1.add(multipartFile2);

        FeedPostReq req1=new FeedPostReq();
        req1.setFeedId(1); req1.setUserId(4);

        given(mapper.postFeed(req1)).willReturn(1);
        assertEquals(1, service.postFeed(feed1, req1));
        verify(mapper).postFeed(req1);

    }
    //아예 세팅부터 틀린듯 원본 복사해 와도 안 돌아간다 한 번 더 배우고 해보자

    @Test
    void getFeed() {
    }

    @Test
    void deleteFeed() {
    }
}