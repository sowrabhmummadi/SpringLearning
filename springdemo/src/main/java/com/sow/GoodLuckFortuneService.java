package com.sow;

import org.springframework.stereotype.Component;

@Component
public class GoodLuckFortuneService implements FortuneService {
    @Override
    public String getFortuneMessage() {
        return "its your luck day";
    }
}
