package com.ordinary.firstSpring.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 어노테이션이 생성 될 수 있는 위치 지정
// PARAMETER : 메소드의 파라미터로 선언된 객체에서만 사용할 수 있음
@Target(ElementType.PARAMETER)
// Retention : 라이프 사이클 - 언제까지 살아 남을지
// RUNTIME 이라 런타임동안 계속 살아있음
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser { // 어노테이션 클래스
}
