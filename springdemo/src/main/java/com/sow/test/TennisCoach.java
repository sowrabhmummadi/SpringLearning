package com.sow.test;

import com.sow.Coach;
import org.springframework.stereotype.Component;

@Component("tenCOach")
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "test";
    }

    @Override
    public String getFortuneMessage() {
        return "test2";
    }
}
