package com.floreo.bbah;
import com.floreo.bbah.model.Channel;
import com.floreo.bbah.model.Message;
import com.floreo.bbah.network.Slack;
import com.floreo.bbah.network.responses.*;
import java.util.Random;
import java.util.List;

public class Main {
public static void main(String[] args) {
        Bot myBot = new Bot();
        myBot.testApi();
        myBot.listChannels();
        //myBot.listMessages(Slack.BOTS_CHANNEL_ID);
        // Post "Hello, world!" to the #bots channel
        //myBot.sendMessageToBotsChannel("Hello, world!");
        myBot.sendMessageToBotsChannel("Here is your inspirational quote:");
        myBot.inspirationalQuotes();
        // Post a pineapple photo to the #bots channel
        //myBot.sendMessageToBotsChannel("http://weknowyourdreams.com/images/pineapple/pineapple-07.jpg");

        }



    }

