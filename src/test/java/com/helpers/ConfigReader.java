package com.helpers;


import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties", "classpath:config.properties", "classpath:allure.properties"})
public interface ConfigReader extends Config {

    @Key("allure.results.directory")
    String allureResultsDir();

    @Key("base.url")
    String baseUrl();

    @Key("base.test.video.path")
    String baseTestVideoPath();

    @Key("browser")
    String browser();

    @Key("headless")
    boolean headless();

    @Key("slow.motion")
    int slowMotion();

    @Key("timeout")
    int timeout();

    @Key("video")
    boolean video();

}
