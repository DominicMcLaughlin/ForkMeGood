/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forkmegood;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * @author dominic mclaughlin
 */
public class ForkMeGood {

    public static void main(String[] args) {
         System.out.print("Steppin on the beach!");
         Timer timer = new Timer();
         timer.schedule(new TimerTask(){
             public void run(){
                 try{
                    AudioInputStream audio = AudioSystem.getAudioInputStream(
                        new File("./Grass_Beach.wav"));
                    Clip clip = AudioSystem.getClip();
                    clip.open(audio);
                    clip.start();
                } catch(Exception e){
                    System.out.println("Error Playing Audio File");
                }
             }
         }, 0, 15000);
    }
    
    public static void sans()
    {
    System.out.println("sans undertale is really great");
    System.out.println("░░░░░░░░░░░░░░░░░░░░░░░");
    System.out.println("░░░░░▄▄▀▀▀▀▀▀▀▀▀▄▄░░░░░");
    System.out.println("░░░░█░░░░░░░░░░░░░█░░░░");
    System.out.println("░░░█░░░░░░░░░░▄▄▄░░█░░░");
    System.out.println("░░░█░░▄▄▄░░▄░░███░░█░░░");
    System.out.println("░░░▄█░▄░░░▀▀▀░░░▄░█▄░░░");
    System.out.println("░░░█░░▀█▀█▀█▀█▀█▀░░█░░░");
    System.out.println("░░░▄██▄▄▀▀▀▀▀▀▀▄▄██▄░░░");
    System.out.println("░▄█░█▀▀█▀▀▀█▀▀▀█▀▀█░█▄░");
    System.out.println("░██░█▄▄█▄▄▄█▄▄▄█▄▄█░██░");
    }
}
