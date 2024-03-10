package com.study.customannotation.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ThreadCheckEvent {

    private final String message;

}
