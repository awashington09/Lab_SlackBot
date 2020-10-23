package com.floreo.bbah;

import com.floreo.bbah.model.Channel;
import com.floreo.bbah.model.Message;
import com.floreo.bbah.network.Slack;
import com.floreo.bbah.network.responses.*;

import java.util.List;
import java.util.Random;
public class Bot {

    // TODO: implement your bot logic!


        public String inspirationalQuotes() {
            String[] text = new String[16];
            text[0] = "Genius is one percent inspiration and ninety-nine percent perspiration.";
            text[1] = "You can observe a lot just by watching.";
            text[2] = "A house divided against itself cannot stand.";
            text[3] = "Difficulties increase the nearer we get to the goal.";
            text[4] = "Fate is in your hands and no one elses";
            text[5] = "Be the chief but never the lord.";
            text[6] = "Nothing happens unless first we dream.";
            text[7] = "Well begun is half done.";
            text[8] = "Life is a learning experience, only if you learn.";
            text[9] = "Self-complacency is fatal to progress.";
            text[10] = "Peace comes from within. Do not seek it without.";
            text[11] = "What you give is what you get.";
            text[12] = "We can only learn to love by loving.";
            text[13] = "Life is change. Growth is optional. Choose wisely.";
            text[14] = "You'll see it when you believe it.";
            text[15] = "Today is the tomorrow we worried about yesterday.";


            String[] author = new String[16];
            author[0] = "Benjamin Franklin";
            author[1] = "Yogi Berra";
            author[2] = "Abraham Lincoln";
            author[3] = "Johann Wolfgang van Goethe";
            author[4] = "Byron Pulsifer";
            author[5] = "Lao Tzu";
            author[6] = "Carl Sandburg";
            author[7] = "Aristotle";
            author[8] = "Yogi Berra";
            author[9] = "Margaret Sangster";
            author[10] = "Buddha";
            author[11] = "Byron Pulsifer";
            author[12] = "Iris Murdoch";
            author[13] = "Karen Clark";
            author[14] = "Wayne Dyer";
            author[15] = "Unknown";



            Random quotes3 = new Random();
            int inspiration = quotes3.nextInt(16 - 1);
            Slack.sendMessage(text[inspiration] + author[inspiration]);
            return text[inspiration];
        }


    /**
     * Sample method: tests the Slack API. Prints a message indicating success or failure.
     */
    public void testApi() {
        Response apiTest = Slack.testApi();
        System.out.println("API OK: " +apiTest.isOk() + "\n");
    }

    /**
     * Sample method: prints all public AccessCode3-3 channel names and ids. Prints an error message on failure.
     */
    public void listChannels() {
        ListChannelsResponse listChannelsResponse = Slack.listChannels();

        if (listChannelsResponse.isOk()) {
            List<Channel> channels = listChannelsResponse.getChannels();

            System.out.println("\nChannels: ");
            for (Channel channel : channels) {
                System.out.println("name: " + channel.getName() + ", id:" + channel.getId());
            }
        } else {
            System.err.print("Error listing channels: " + listChannelsResponse.getError());
        }
    }

    /**
     * Sample method: prints up to the last 100 messages from a given channel. Prints an error message on failure.
     * or failure.
     *
     * @param channelId id of the given channel.
     */
    public void listMessages(String channelId) {
        ListMessagesResponse listMessagesResponse = Slack.listMessages(channelId);

        if (listMessagesResponse.isOk()) {
            List<Message> messages = listMessagesResponse.getMessages();

            System.out.println("\nMessages: ");
            for (Message message : messages) {
                System.out.println();
                System.out.println("Timestamp: " + message.getTs());
                System.out.println("Message: " + message.getText());
            }
        } else {
            System.err.print("Error listing messages: " + listMessagesResponse.getError());
        }
    }

    /**
     * Sample method: sends a plain text message to the #bots channel. Prints a message indicating success or failure.
     *
     * @param text message text.
     */
    public void sendMessageToBotsChannel(String text) {
        SendMessageResponse sendMessageResponse = Slack.sendMessage(text);

        if (sendMessageResponse.isOk()) {
            System.out.println("Message sent successfully!");
        } else {
            System.err.print("Error sending message: " + sendMessageResponse.getError());
        }
    }

    /**
     * Sample method: deletes a message from the #bots channel. Prints a message indicating success or failure.
     *
     * @param messageTs unique timestamp of the message to be deleted.
     */
    public void deleteMessageInBotsChannel(String messageTs) {
        DeleteMessageResponse deleteMessageResponse = Slack.deleteMessage(messageTs);

        if (deleteMessageResponse.isOk()) {
            System.out.println("Message deleted successfully!");
        } else {
            System.err.print("Error sending message: " + deleteMessageResponse.getError());
        }
    }
}
