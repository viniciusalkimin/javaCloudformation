package com.myorg;

import software.amazon.awscdk.App;

public class AluraAwsInfraApp {
    public static void main(final String[] args) {
        App app = new App();

        new AluraVpcStack(app, "vpc");
        app.synth();
    }
}

