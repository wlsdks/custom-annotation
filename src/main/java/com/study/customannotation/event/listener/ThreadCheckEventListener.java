package com.study.customannotation.event.listener;

import com.study.customannotation.event.ThreadCheckEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 이벤트 리스너 클래스
 */
@Slf4j
@Component
public class ThreadCheckEventListener {

    @EventListener
    public void checkThread(ThreadCheckEvent event) {
        log.info("첫번째: " + event.getMessage());
    }

    @EventListener
    public void checkThread2(ThreadCheckEvent event) {
        log.info("두번째: " + event.getMessage());
    }

    @EventListener
    public void checkThread3(ThreadCheckEvent event) {
        log.info("세번째: " + event.getMessage());
    }

    @Async
    @EventListener
    public void checkThread4(ThreadCheckEvent event) {
        log.info("비동기 이벤트 리스너: " + event.getMessage());
    }

}
