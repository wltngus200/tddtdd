package com.green.tddpractice.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Setter
@Getter
public class UserProfilePatchReq {
    private long SignedUserId;
    private MultipartFile pic;

    @JsonIgnore
    private String picName;
}
