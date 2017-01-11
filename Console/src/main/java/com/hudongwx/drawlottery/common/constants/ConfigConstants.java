package com.hudongwx.drawlottery.common.constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 配置常量类.
 * Date: 2017/1/5 0005
 * Time: 11:08
 *
 * @author <a href="http://userwu.github.io">wuhongxu</a>.
 * @version 1.0.0
 */
@Component
@ConfigurationProperties(locations = {"classpath:project/config.properties"})
public class ConfigConstants {
    private Logger logger = LoggerFactory.getLogger(ConfigConstants.class);
    /**
     * 项目路径
     */
    private String contextPath;
    /**
     * 静态资源
     */
    private String staticServePath;


    /**
     * 文件上传路径
     */
    private String uploadPath;

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public String getStaticServePath() {
        return staticServePath;
    }

    public void setStaticServePath(String staticServePath) {
        this.staticServePath = staticServePath;
    }

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }
}