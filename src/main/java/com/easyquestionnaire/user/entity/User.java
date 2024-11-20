package com.easyquestionnaire.user.entity;

import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Getter
@Setter
@Builder
public class User {

    @Id
    private ObjectId privateId;
    private String publicId;

    @NotNull
    @Size(min = 4, max = 12, message = "최소4글자 최대 12글자입니다.")
    //@NotBlank
    private String userId;

    @NotNull
    @Size(min = 10, message = "최소10글자 입니다.")
    //@NotBlank
    private String password;

    @NotNull
    //@NotBlank
    private String username;
}
