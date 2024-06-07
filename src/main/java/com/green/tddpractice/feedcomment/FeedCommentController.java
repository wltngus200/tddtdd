package com.green.tddpractice.feedcomment;

import com.green.tddpractice.common.model.ResultDto;
import com.green.tddpractice.feedcomment.model.FeedCommentDeleteReq;
import com.green.tddpractice.feedcomment.model.FeedCommentPostReq;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface FeedCommentController {
    ResultDto<Long> insFeedComment(@RequestBody FeedCommentPostReq p);
    ResultDto<Integer> deleteFeedComment(@PathVariable @ModelAttribute FeedCommentDeleteReq p);
}
