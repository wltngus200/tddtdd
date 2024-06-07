package com.green.tddpractice.feed;

import com.green.tddpractice.common.CustomFileUtils;
import com.green.tddpractice.feed.model.*;
import com.green.tddpractice.feedcomment.model.FeedCommentGetRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static com.green.tddpractice.common.GlobalConst.COMMENT_SIZE_PER_FEED;


public interface FeedService {

    FeedPostRes postFeed(List<MultipartFile> fileNames, FeedPostReq p);

    List<FeedGetRes> getFeed(FeedGetReq p);

    int deleteFeed(long feedId);

}
