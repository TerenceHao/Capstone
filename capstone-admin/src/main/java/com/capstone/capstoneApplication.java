package com.capstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 
 * @author capstone
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class capstoneApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(capstoneApplication.class, args);
        System.out.println(" Group11Capstone started successfully! \n");
    }
}
