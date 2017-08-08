package org.github.Carabaw9000.WooCommerce;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * Created by kenneth on 2017/08/05.
 */
public class OnlineStoreEnable implements OnlineStore {

    final Authenticate authenticate;
    final RestTemplate restTemplate = new RestTemplate();

    public OnlineStoreEnable(Authenticate authenticate){
        this.authenticate = authenticate;
    }

    public void update(String api,String id,Map<String,String> params){
        restTemplate.postForObject(authenticate.url+api+id+"?"+
                authenticate.securityKey,params,String.class);
    }
    public void update(String api,String id,String query){
        restTemplate.put(authenticate.url+api+id+"?"+
                authenticate.securityKey+"&"+query,String.class);
    }
    public void create(String api,Map<String,String> params){
        restTemplate.postForObject(authenticate.url+
                        api +"?"+ authenticate.securityKey,
                params,String.class);
    }
    public void create(String api,String query){
       restTemplate.postForLocation(authenticate.url+
                        api +"?"+ authenticate.securityKey+
                "&"+query,String.class).toString();
    }
    public String get(String api,String productId){

        ResponseEntity<String> response = restTemplate.getForEntity
                (authenticate.url+api+productId+"?"+
                authenticate.securityKey
                ,String.class);
        return response.getBody();
    }

    /*
    public String getSpecific(String type,String parentId,String id){
        String[] WCtype;
        WCtype = type.split("_");
        ResponseEntity<String> response = restTemplate.getForEntity(
                authenticate.url+WCtype[0]+parentId+WCtype[1]+
                        id+"?"+authenticate.securityKey,String.class);
        return  response.getBody();
    }
    */

    public String getPerPage(String api,int page,int amount){
        ResponseEntity<String> response = restTemplate.getForEntity
                (authenticate.url+api+"?per_page="+amount+"&page="+page+"&"+
                                authenticate.securityKey,String.class);
        return response.getBody();
    }
    public String getAll(String api,Map<String,String> params){
        ResponseEntity<String> response = restTemplate.getForEntity(
                authenticate.url+api+"?"+authenticate.securityKey,String.class,params);
        return response.getBody();
    }
    public String getAll(String api,String query){
        ResponseEntity<String> response = restTemplate.getForEntity(
                authenticate.url+api+"?"+authenticate.securityKey+"&"+query,String.class);
        return response.getBody();
    }
    public void delete(String api,String id){
        restTemplate.delete(authenticate.url+api+id+"?"+
                authenticate.securityKey);
    }
}
