/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krazytwitterbot;

import java.util.List;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author User
 */
public class Krazytwitterbot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
        
        ConfigurationBuilder cf = new ConfigurationBuilder();
        
        cf.setDebugEnabled(true)
                .setOAuthConsumerKey("QlvQa4UOL2lUqkM2cz4liWE6p")
                .setOAuthConsumerSecret("fBkhjCOsCOQS7Q1xTg87KaZSaWziOTZrP4QT8ZBS19KlPGStlf")
                .setOAuthAccessToken("3309410744-v7wBeD01byqftUDKEVFCt9dVmbDCc17rmoRFvGN")
                .setOAuthAccessTokenSecret("8OxBWE8ONr6cp0w0Wchmvy8tzMyrAYWPCkun9bah3YkLa");
        
        TwitterFactory tf = new TwitterFactory(cf.build());
        twitter4j.Twitter twitter = tf.getInstance();
        
        List<Status> status = twitter.getHomeTimeline();
        for(Status st : status){
            System.out.println(st.getUser().getName()+"---------"+st.getText());
        }
    }
    
}
