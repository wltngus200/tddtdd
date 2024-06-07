package com.green.tddpractice.feedcomment;

import com.green.tddpractice.feedcomment.model.FeedCommentDeleteReq;
import com.green.tddpractice.feedcomment.model.FeedCommentGetRes;
import com.green.tddpractice.feedcomment.model.FeedCommentPostReq;

import java.util.List;

public interface FeedCommentService {

    long insFeedComment(FeedCommentPostReq p);
    int deleteFeedComment(FeedCommentDeleteReq p);
    List<FeedCommentGetRes> feedCommentListGet(long feedId);
}
