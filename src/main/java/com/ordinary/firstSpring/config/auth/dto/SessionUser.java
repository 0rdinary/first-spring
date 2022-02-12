package com.ordinary.firstSpring.config.auth.dto;

import com.ordinary.firstSpring.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    // Serializable : 직렬화
    // Object 또는 데이터를 외부의 자바 시스템에서도 사용할 수 있도록 byte 형태로 데이터를 변환
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
