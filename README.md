# 🌍 TranslationAPI 

Smart localization system for Nukkit-MOT that automatically detects the player's language from the Minecraft client and provides translations.

## 🔍 Features
- Automatically detects the player's language (ru_RU, en_US, etc.)
- Ready-made templates for Russian and English
- Supports Maven/Gradle
- Simple API for developers

# 🛠 Examples
Builds languages
```java
TranslationAPI api = new TranslationAPI().builds(new File(this.getDataFolder(), "/translations"));
```
Edit en_US.json
```en_US.json
{
  "test": "Test for plugin"
}
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
    <groupId>com.github.Factrys</groupId>
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
    implementation 'com.github.Factrys:Translation:TAG'
}
```
