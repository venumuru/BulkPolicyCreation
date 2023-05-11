package utils;

import org.aeonbits.owner.Config;

@Config.Sources(value="file:${user.dir}/src/main/resources/FrameworkConf.properties")
public interface FrameworkConf extends Config {
    String endPoint();
    String dataSheetPath();

}
