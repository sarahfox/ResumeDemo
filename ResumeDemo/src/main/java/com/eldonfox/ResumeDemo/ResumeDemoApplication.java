package com.eldonfox.ResumeDemo;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ResumeDemoApplication extends Application<ResumeDemoConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ResumeDemoApplication().run(args);
    }

    @Override
    public String getName() {
        return "ResumeDemo";
    }

    @Override
    public void initialize(final Bootstrap<ResumeDemoConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ResumeDemoConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
