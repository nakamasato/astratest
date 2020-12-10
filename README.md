# Astra Test

Java application to connect to Astra Cassandra.

## Prerequisite

1. Create a database in [Astra](https://astra.datastax.com)
1. `gradle`

## secure-connection.zip

Put your `secure-connect-trial.zip` in the root dir.

## Environment Variables

You can get the configuration from the console

- `CASSANDRA_USER`
- `CASSANDRA_PASS`

## Run

```
11:17:30: Executing task 'App.main()'...

> Task :compileJava UP-TO-DATE
> Task :processResources NO-SOURCE
> Task :classes UP-TO-DATE

> Task :App.main()
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
4.0.0.684

Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/6.7/userguide/command_line_interface.html#sec:command_line_warnings

BUILD SUCCESSFUL in 13s
2 actionable tasks: 1 executed, 1 up-to-date
11:17:43: Task execution finished 'App.main()'.
```