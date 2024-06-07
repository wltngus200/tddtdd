package com.green.tddpractice.feedfavorite;

import com.green.tddpractice.feedfavorite.model.FeedFavoriteToggleReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FeedFavoriteServiceImpl implements FeedFavoriteService {
    private final FeedFavoriteMapper mapper;

    public int toggleFavorite(FeedFavoriteToggleReq p){
        int result = mapper.delFeedFavorite(p);
        if(result == 1) {
            return 0;
        }
        return mapper.insFeedFavorite(p);
    }

}
