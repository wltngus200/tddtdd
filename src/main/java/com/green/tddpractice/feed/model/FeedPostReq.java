package com.green.tddpractice.feed.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@ToString
public class FeedPostReq {
    @JsonIgnore
    private long feedId;

    private long userId;
    private String contents;
    private String location;
}
