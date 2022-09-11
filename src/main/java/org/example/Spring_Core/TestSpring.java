package org.example.Spring_Core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Дмитрий Крпушов 27.08.2022
 */
public class TestSpring {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext - обращается к applicationContext.xml,считывает и помещает бины в applicationContext.
      //  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                //        "applicationContext.xml"
     //   );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //Второй аргумент, бин которого хотим получить
        //Music music = context.getBean("musicBean",Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        /**
         * Внедрили зависимости через конструктор
         */
        // MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //   MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//        System.out.println("_________________________________________________");
//        System.out.println("_________________________________________________");
//
//        System.out.println("firstMusicPlayer = " + firstMusicPlayer.getMusic());
//        System.out.println("firstMusicPlayer = " + firstMusicPlayer.getName());
//        System.out.println("firstMusicPlayer = " + firstMusicPlayer.getVolume());
//        firstMusicPlayer.playMusic();
//        System.out.println("_________________________________________________");
//        System.out.println("secondMusicPlayer = " + secondMusicPlayer.getMusic());
//        System.out.println("secondMusicPlayer = " + secondMusicPlayer.getName());
//        System.out.println("secondMusicPlayer = " + secondMusicPlayer.getVolume());
//        secondMusicPlayer.playMusic();
//
//        firstMusicPlayer.setVolume(10);
//        System.out.println("_________________________________________________");
//        System.out.println("_________________________________________________");
//
//        System.out.println("firstMusicPlayer = " + firstMusicPlayer.getMusic());
//        System.out.println("firstMusicPlayer = " + firstMusicPlayer.getName());
//        System.out.println("firstMusicPlayer = " + firstMusicPlayer.getVolume());
//        firstMusicPlayer.playMusic();
//        System.out.println("_________________________________________________");
//        System.out.println("secondMusicPlayer = " + secondMusicPlayer.getMusic());
//        System.out.println("secondMusicPlayer = " + secondMusicPlayer.getName());
//        System.out.println("secondMusicPlayer = " + secondMusicPlayer.getVolume());
//        secondMusicPlayer.playMusic();

     //   MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
      //  musicPlayer.playMusic();

       // MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

     //   musicPlayer.playMusic(Janr.CLASSICAL);
     //   musicPlayer.playMusic(Janr.ROCK);
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic",ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic",ClassicalMusic.class);
        System.out.println(classicalMusic1 == classicalMusic2);
        //Закрываем context. Обязательно.
        context.close();
    }
}
