package com.sow;

import org.springframework.stereotype.Component;

@Component
class BadLuckFortuneService implements FortuneService {

    @Override
    public String getFortuneMessage() {
        return "not so lucky today day";
    }
}
