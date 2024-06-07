package com.green.tddpractice.feedcomment;

import com.green.tddpractice.feedcomment.model.FeedCommentDeleteReq;
import com.green.tddpractice.feedcomment.model.FeedCommentGetRes;
import com.green.tddpractice.feedcomment.model.FeedCommentPostReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedCommentMapper {
    int insFeedComment(FeedCommentPostReq p);
    int deleteFeedComment(FeedCommentDeleteReq p);

    List<FeedCommentGetRes> feedCommentList(long feedId);
}
