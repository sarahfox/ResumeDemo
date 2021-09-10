package com.eldonfox.ResumeDemo;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
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
        bootstrap.addBundle(new AssetsBundle("/web/assets/", "/", "index.html"));
    }

    @Override
    public void run(final ResumeDemoConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
