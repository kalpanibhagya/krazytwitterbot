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
                .setOAuthConsumerKey("consumer key")
                .setOAuthConsumerSecret("consumer secret")
                .setOAuthAccessToken("access token")
                .setOAuthAccessTokenSecret("access token key");
        
        TwitterFactory tf = new TwitterFactory(cf.build());
        twitter4j.Twitter twitter = tf.getInstance();
        
        List<Status> status = twitter.getHomeTimeline();
        for(Status st : status){
            System.out.println(st.getUser().getName()+"---------"+st.getText());
        }
    }
    
}
