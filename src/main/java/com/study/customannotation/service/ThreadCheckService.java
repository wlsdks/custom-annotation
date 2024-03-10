package com.study.customannotation.service;

import com.study.customannotation.event.ThreadCheckEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class ThreadCheckService {

    private final ApplicationEventPublisher eventPublisher;

    // 이벤트를 발행하는 메서드
    public void checkThread() throws InterruptedException {

        log.info("========== 스프링 이벤트 발행 메서드 호출완료 ==========");
        // 1초간 대기한다.
        Thread.sleep(1000);

        // 이벤트를 발행한다.
        eventPublisher.publishEvent(new ThreadCheckEvent("Thread Check"));
        log.info("========== 스프링 이벤트 발행 메서드 종료 ==========");
    }

}
