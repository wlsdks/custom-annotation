package com.study.customannotation.controller;

import com.study.customannotation.annotation.JinanLogging;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnnotationController {

    @JinanLogging
    @GetMapping("/customAnnotation")
    public void customAnnotationMethod() {
        System.out.println("커스텀 어노테이션 적용 메소드 실행");
    }

    @JinanLogging(message = "커스텀 어노테이션 메시지 직접 작성")
    @GetMapping("/customAnnotationMethodSetMessage")
    public void customAnnotationMethodSetMessage() {
        System.out.println("커스텀 어노테이션 적용 메소드 실행");
    }

    @GetMapping("/nonAnnotation")
    public void nonAnnotationMethod() {
        System.out.println("커스텀 어노테이션 미적용 메소드 실행");
    }

}
