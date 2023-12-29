# android-common-strings

Some common strings used across projects.


## Import
Add jitpack
```kotlin
maven { setUrl("https://jitpack.io") }
```
```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        maven { setUrl("https://jitpack.io") }
    }
}
```
Add dependency.
```kotlin
implementation("com.github.bogdan-pechounov:compose-custom-colors:0.1")
```
## References

[The Missing Apple iOS Localization Term Glossary](https://www.ibabbleon.com/apple-ios-localization-term-glossary.html#request)
