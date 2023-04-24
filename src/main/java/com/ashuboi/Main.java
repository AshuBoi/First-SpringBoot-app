package com.ashuboi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.web.reactive.server.ReactiveWebServerFactory;
import java.awt.*;
import java.io.*;
import java.lang.String;
import java.lang.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.util.Arrays;

@SpringBootApplication
@RestController
public class Main
{
    public static void asciiv(char x, String y)
    {
        int[] a = new int[y.length()];
        Arrays.fill(a, 0);
        int c = x, count1 = 0, count2 = 0;
        y = y.toUpperCase();
        System.out.println(x + "ablphabet has ascii value=" + c);
        for (int i = 65; i <= 90; i++)
        {
            System.out.println(Integer.toString(i));
        }
    }

    public static void main(String[] args) throws IOException
    {
        InputStreamReader x = new InputStreamReader(System.in);
        BufferedReader y = new BufferedReader(x);
        SpringApplication.run(Main.class, args);
        String s;
        System.out.println("hello welcome to AshuBois World");
        System.out.println("&.&     *____*  .  #__#     %.%");
        System.out.println(" Enter you good name please: ");
        s = y.readLine();
        s = s + " ";
        String temp;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == ' ') {
                break;
            }
            asciiv(ch, s);
        }
        System.out.println("now you might be thinking why i did this");
        System.out.println(" so this is my first springboot application");
        System.out.println("it basically shows that i can make my small codes work on springboot framework" + "/n"+"open your browser and type https://localhost:8080 after running this code");
        Main obj= new Main();
        obj.greet();
    }
    @GetMapping("http://localhost:8080/")
    public String greet()
    {
        return "hello";
    }

}
