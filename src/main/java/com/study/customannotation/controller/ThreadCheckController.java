package com.study.customannotation.controller;

import com.study.customannotation.service.ThreadCheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ThreadCheckController {

    private final ThreadCheckService threadCheckService;

    @GetMapping("/checkThread")
    public void checkThread() throws InterruptedException {
        threadCheckService.checkThread();
    }

}
