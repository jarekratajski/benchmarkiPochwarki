# benchmarkiPochwarki

*there are lies damn lies and benchmarks*

check for yourself - but don't trust the results if you can't explain *why*

Build code:

./gradlew clean build


Run benchmark

./gradlew jmh


Notice: jmh plugin works on jvm from version 8 to 11 (including graal).
At the moment it fails on more recent java platforms.
