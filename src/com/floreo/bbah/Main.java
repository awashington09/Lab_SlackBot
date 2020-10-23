package com.floreo.bbah;

public class Main {



    public static void main(String[] args) {

        Bot myBot = new Bot();

        myBot.testApi();

        myBot.listChannels();

        //myBot.listMessages(Slack.BOTS_CHANNEL_ID);
        
        // Post "Hello, world!" to the #bots channel
        //myBot.sendMessageToBotsChannel("Hello, world!");

        myBot.sendMessageToBotsChannel("Here is your inspirational quote!:");

        myBot.inspirationalQuotes();

        // Post a pineapple photo to the #bots channel
        //myBot.sendMessageToBotsChannel("http://weknowyourdreams.com/images/pineapple/pineapple-07.jpg");

    }
}

