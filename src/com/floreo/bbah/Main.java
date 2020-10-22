package com.floreo.bbah;

import com.floreo.bbah.network.Slack;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Bot myBot = new Bot();

        myBot.testApi();

        myBot.listChannels();

        myBot.listMessages(Slack.BOTS_CHANNEL_ID);

        Random quotes3 = new Random();
        int inspiration = quotes3.nextInt(1642);
        System.out.println("please work: " + inspiration);


        // Post "Hello, world!" to the #bots channel
       // myBot.sendMessageToBotsChannel("Hello, world!");

        // Post a pineapple photo to the #bots channel
        //myBot.sendMessageToBotsChannel("http://weknowyourdreams.com/images/pineapple/pineapple-07.jpg");

    }
}
