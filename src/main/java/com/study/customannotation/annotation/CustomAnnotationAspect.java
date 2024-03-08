package com.study.customannotation.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 어노테이션 적용범위 설정
 */
@Aspect
@Component
public class CustomAnnotationAspect {

    @Around("@annotation(com.study.customannotation.annotation.JinanLogging)")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {

        // 1. MethodSignature로 형변환
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        // 2. Method 객체로부터 어노테이션 추출
        JinanLogging annotation = method.getAnnotation(JinanLogging.class);

        String message = annotation.message();
        String methodName = methodSignature.getName();

        System.out.println("[**" + methodName + "**] 실행 전: " + message);
        Object result = joinPoint.proceed();
        System.out.println("[**" + methodName + "**] 실행 후: " + message);

        return result;
    }

}
