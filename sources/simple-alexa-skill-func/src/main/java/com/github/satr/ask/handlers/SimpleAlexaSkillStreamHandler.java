package com.github.satr.ask.handlers;

import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class SimpleAlexaSkillStreamHandler extends SkillStreamHandler {

    public SimpleAlexaSkillStreamHandler() {
        super(Skills.standard()
                .addRequestHandler(new WelcomeRequestHandler())
                .addRequestHandler(new CustomLaunchRequestHandler())
                .build());
    }
}
