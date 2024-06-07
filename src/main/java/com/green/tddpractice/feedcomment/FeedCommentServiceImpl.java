package com.green.tddpractice.feedcomment;

import com.green.tddpractice.feedcomment.model.FeedCommentDeleteReq;
import com.green.tddpractice.feedcomment.model.FeedCommentGetRes;
import com.green.tddpractice.feedcomment.model.FeedCommentPostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FeedCommentServiceImpl implements FeedCommentService{
    private final FeedCommentMapper mapper;

    public long insFeedComment(FeedCommentPostReq p){
        int affectedRows= mapper.insFeedComment(p);
        return p.getFeedCommentId();
    }

    public int deleteFeedComment(FeedCommentDeleteReq p){
        return mapper.deleteFeedComment(p);
    }

    public List<FeedCommentGetRes> feedCommentListGet(long feedId) {
        return mapper.feedCommentList(feedId);
    }
}
