package org.github.Carabaw9000.WooCommerce;

/**
 * Created by kenneth on 2017/08/05.
 */
public class Authenticate {

    public String consumerKey;
    public String consumerSecret;
    public String securityKey;
    public String url;
    public String version   = "2";
    public String signature = "/wp-json/wc/v"+version+"/";

    public Authenticate(String url, String consumerKey, String consumerSecret){
        this.consumerKey    = "consumer_key="+consumerKey;
        this.consumerSecret = "&consumer_secret="+ consumerSecret;
        this.url            = url+signature;
        securityKey         = this.consumerKey+this.consumerSecret;
    }
    public Authenticate(String url, String consumerKey, String consumerSecret,int WooCommerceVersion){
        this.consumerKey    = "consumer_key="+consumerKey;
        this.consumerSecret = "&consumer_secret="+consumerSecret;
        version             = Integer.toString(WooCommerceVersion);
        this.url            = url+signature;
        securityKey         = this.consumerKey+this.consumerSecret;
    }
}
