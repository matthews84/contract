package com.whxisoft;

import com.whxisoft.datasource.DynamicDataSourceRegister;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({DynamicDataSourceRegister.class})
@MapperScan("com.whxisoft.mapper")
public class HtmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HtmsApplication.class, args);
    }

}
