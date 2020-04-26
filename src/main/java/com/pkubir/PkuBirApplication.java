package com.pkubir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author 技术微信号：wx17725354261
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class PkuBirApplication
{
    public static void main(String[] args)
    {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(PkuBirApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  天津视云智慧科技有限公司启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " 车联网，物联网，医院HIS，OA，商城等高端代码获取或软件定制开发，加微信：17725354261，技术群：256860212，今日头条：大数据java架构师，公众号：前劲科技\n" );
    }
}
