package com.bigmall.hermit.mmg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @description 用于生产MMG的代码
 *
 */
public class Generator {
    public static void main(String[] args) throws XMLParserException, IOException, SQLException, InterruptedException, InvalidConfigurationException {
        ArrayList<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        InputStream resourceAsStream = Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser configurationParser = new ConfigurationParser(warnings);
        Configuration configuration = configurationParser.parseConfiguration(resourceAsStream);
        resourceAsStream.close();
        DefaultShellCallback defaultShellCallback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, defaultShellCallback, warnings);
        myBatisGenerator.generate(null);
        for (String warning: warnings) {
            System.out.println(warning);
        }
    }
}

