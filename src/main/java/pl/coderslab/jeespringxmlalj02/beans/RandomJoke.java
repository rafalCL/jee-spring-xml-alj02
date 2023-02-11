package pl.coderslab.jeespringxmlalj02.beans;

import org.springframework.stereotype.Component;

@Component
public class RandomJoke {
    public String getRandomJoke() {
        return "Chuck Norris zgrał cały internet na dyskietkę. Dwa razy!";
    }
}
