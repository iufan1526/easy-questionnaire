package com.easyquestionnaire.user.service;

import com.easyquestionnaire.common.object.ApiResponse;
import com.easyquestionnaire.common.util.DateUtil;
import com.easyquestionnaire.user.entity.User;
import com.easyquestionnaire.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public ApiResponse createUser(User user) {
        ApiResponse apiResponse = new ApiResponse();

        User findUser = userRepository.findByUserId(user.getUserId());
        if (findUser == null) {
            String publicId = "USER-" + DateUtil.getCurrentDateTimeToString() + "-"+ UUID.randomUUID();

            user.setPublicId(publicId);
            User savedUser = userRepository.save(user);

            apiResponse.setData(user.getUserId());
            apiResponse.setMessage("회원가입이 완료되었습니다.");
        } else {
            apiResponse.setData(null);
            apiResponse.setMessage("이미 존재하는 아이디가 있습니다.");
        }

        return apiResponse;
    }


}
