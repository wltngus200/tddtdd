package com.green.tddpractice.user;

import com.green.tddpractice.common.model.ResultDto;
import com.green.tddpractice.user.model.*;
import com.green.tddpractice.common.model.ResultDto;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserControllerImpl {
    private final UserServiceImpl service;

    @PostMapping("sign-up")
    public ResultDto<Integer> postUser(@RequestPart(required = false) MultipartFile mf, @RequestPart SignUpPostReq p){
        int result=service.postUser(mf, p);
        return ResultDto.<Integer>builder()
                .statusCode(HttpStatus.OK)
                .resultData(result)
                .resultMsg("가입 ╰(*°▽°*)╯ 완료")
                .build();
    }
    @PostMapping("sign-in")
    public ResultDto<SignInRes> postSignIn(@RequestBody SignInPostReq p){
        SignInRes result=service.postSignIn(p);
        return ResultDto.<SignInRes>builder()
                .statusCode(HttpStatus.OK)
                .resultMsg("♪(´▽｀) 어서 와")
                .resultData(result)
                .build();
    }
    @GetMapping
    public ResultDto<UserInfoGetRes> getUserInfo(@ParameterObject @ModelAttribute UserInfoGetReq p){
        UserInfoGetRes result=service.getUserInfo(p);
        return ResultDto.<UserInfoGetRes>builder()
                .statusCode(HttpStatus.OK)
                .resultMsg("( ⓛ ω ⓛ *) 파칭")
                .resultData(result)
                .build();
    }

    @PatchMapping(value="pic", consumes="multipart/form-data")//consumes 빼도 가능
    public ResultDto<String> patchProfilePic(@ModelAttribute UserProfilePatchReq p){//모델 어트리뷰트=폼데이터 형식 JSON안 보냄
        //순수하게 HTML만으로 데이터를 전송할 수 있는 것이 폼데이터
        String result = service.patchProfilePic(p);//파일 명 리턴
        return ResultDto.<String>builder()
                .statusCode(HttpStatus.OK)
                .resultMsg("(❤´艸｀❤)")
                .resultData(result)
                .build();
    }
}
