package com.green.tddpractice.feedfavorite;

import com.green.tddpractice.common.model.ResultDto;
import com.green.tddpractice.feedfavorite.model.FeedFavoriteToggleReq;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/feed/favorite")
@RequiredArgsConstructor
public class FeedFavoriteControllerImpl {
    private final FeedFavoriteServiceImpl service;

    @GetMapping
    public ResultDto<Integer> toggleFavorite(@ModelAttribute FeedFavoriteToggleReq p){
        int result=service.toggleFavorite(p);
        return ResultDto.<Integer>builder()
                .statusCode(HttpStatus.OK)
                .resultMsg((result==0?"좋아요 취소":"좋아요 처리")+"ο(=•ω＜=)ρ⌒☆ 좋아요 처음 해봐요")
                .resultData(result)
                .build();
    }
}
