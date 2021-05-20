# Lenient jacoco reports with Gradle 4.10.3

https://discuss.gradle.org/t/code-coverage-come-after-test-and-integration-test-but-integration-test-may-not-exist/39998

## Only unit tests

```bash
$ JAVA_HOME=/usr/lib/jvm/java-8-openjdk ./gradlew clean check
```

I had to force JDK to 8 and Gradle 4.10.3 does not support the toolchain api.
The environment variable did the job.

Open file:///tmp/foo/build/reports/jacoco/test/html/default/Foo.html and Foo
coverage should be at 22%, only the `coveredByUnitTests` method is covered at
100% everything else is at 0%.

## Add integ tests

Uncomment the 4th line in `build.gradle` and give it a new try. Coverage should
jump at 44%, with 2 methods covered at 100% and everything else still at 0%.
