# Example Java Project Using Build Scan in Gradke

This is an example project that you can use to experience the [Build Scan® service of Develocity][gradle.com].

It is a small Java project containing Little Sample Codes and has the [Develocity Gradle Plugin][manual] already applied.

## Create a Build Scan®

Follow these simple steps to create and publish a Build Scan® on [scans.gradle.com][scans.gradle.com]:

1. Clone this project
1. Run `./gradlew build --scan`
1. Agree to the [Terms of Service][terms-of-service] on the command line

The build should end with something similar to:

    Publishing build scan...
    https://gradle.com/s/ria2s2x5oaazq

Follow the green link shown at the end of the build to view your Build Scan® on [scans.gradle.com][scans.gradle.com].

Note: If you run a build without the `--scan` flag, no Build Scan® will be created and
no information will be sent.
