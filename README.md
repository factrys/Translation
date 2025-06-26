# 🌍 TranslationAPI 

Smart localization system for Nukkit-MOT that automatically detects the player's language from the Minecraft client and provides translations.

## 🔍 Features
- Automatically detects the player's language (ru_RU, en_US, etc.)
- Simple API for developers

# 🛠 Examples
Builds languages
```java
TranslationAPI api = new Translation().builds(
                "Test",
                new File(this.getDataFolder(), "/translations"), //or getDataFolder()
                Config.JSON //or Config.YAML
        );
```
Edit en_US.json or en_US.yml
```en_US.json
{
  "test": "Test for plugin"
}
```
```en_US.yml
  "test": "Test for plugin"
```
get text
```java
player.sendMessage(api.translate(player, "test"));
```
```java
player.sendMessage(api.translate("en_US", "test"));
```
# 🔌 Installation
## Maven
Repository:
```html
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
Dependency
```html
<dependency>
    <groupId>com.github.factrys</groupId>
    <artifactId>Translation</artifactId>
    <version>TAG</version>
</dependency>
```
## Gradle
Repository:
```gradle
repositories {
    mavenCentral()
    maven { url 'https://jitpack.io' }
}
```
Dependency:
```gradle
dependencies {
    implementation 'com.github.factrys:Translation:TAG'
}
```
