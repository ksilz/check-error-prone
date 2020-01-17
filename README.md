### How to use this repository
Validates various issues for [Error Prone](https://errorprone.info). Here's how to run it:
- Make sure that you have Java 11 installed.
- Clone this repository.
- Run `gradlew.bat` (Windows) or `./gradlew` (Mac, Linux).
- The application runs fine.
- Edit [`build.gradle`](https://github.com/ksilz/check-error-prone/blob/49f90b44e23e17ca03ff05436278e82a4a3cc15c/build.gradle#L99):
  - Comment out the line with `excludedPaths = ".*/issues/.*"`, currently line 103. This would include **all** files for Error Prone.
  - Uncomment one of the `excludedPaths` line below.
  - Save.
- Run `gradlew.bat` (Windows) or `./gradlew` (Mac, Linux) again.
- You'll get an error.

### Which issues are included?
Currently, this repository recreates these issues:
- [#1479](https://github.com/google/error-prone/issues/1479): Lombok - MultiVariableDeclaration: IllegalArgumentException "Start [449] should not be after end [-1]" (Preconditions.java:300)
- [#1430](https://github.com/google/error-prone/issues/1430):
IllegalArgumentException from AlmostJavadoc pattern on project using lombok
- [#1481](https://github.com/google/error-prone/issues/1481): Lombok false positive: MissingOverride for "@EqualsAndHashCode(callSuper = true)" when extending base class

