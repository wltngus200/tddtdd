package com.green.tddpractice.feed;

import com.green.tddpractice.feed.model.*;
import com.green.tddpractice.feedcomment.model.FeedCommentGetRes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedMapper {
    int postFeed(FeedPostReq p);
    int postFeedPics(FeedPostPicReq p);


    List<FeedGetRes> getFeed(FeedGetReq p);

    List<String> getFeedPicsByFeedId(long feedId);

    //아직 안 함
    List<FeedCommentGetRes> getFeedComment(long feedId);

    int deleteFeed(long feedId);
    int deleteFeedPics(long feedId);

}
