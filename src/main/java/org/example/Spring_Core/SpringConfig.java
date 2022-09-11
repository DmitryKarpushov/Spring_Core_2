package org.example.Spring_Core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Дмитрий Карпушов 10.09.2022
 */
@Configuration
//@ComponentScan("org.example.Spring_Core")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(rockMusic(),classicalMusic());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
