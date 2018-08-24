/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * @author evda
 */
@SpringBootApplication
@EnableConfigServer
public class Lab3ServerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(Lab3ServerApplication.class, args);
    }
    
}
