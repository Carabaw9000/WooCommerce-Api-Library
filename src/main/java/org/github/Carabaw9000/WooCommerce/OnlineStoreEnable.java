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

    public void update(WooCommerce type,String id,Map<String,String> params){
        restTemplate.postForObject(authenticate.url+type.getValue()+id+"?"+
                    authenticate.securityKey,params,String.class);
    }
    public void update(WooCommerce type,String id,String query){
        restTemplate.put(authenticate.url+type.getValue()+id+"?"+
                authenticate.securityKey+"&"+query,String.class);
    }
    public void updateSpecific(WooCommerceSpecific type,String parentId,String id,String query){
        String[] WCtype;
        WCtype = type.getValue().split("_");
        restTemplate.put(authenticate.url+WCtype[0]+parentId+WCtype[1]+
                id+"?"+authenticate.securityKey+"&"+query,String.class);
    }
    public void create(WooCommerce type,Map<String,String> params){
        restTemplate.postForObject(authenticate.url+
                        type.getValue() +"?"+ authenticate.securityKey,
                params,String.class);
    }
    public void create(WooCommerce type,String query){
       restTemplate.postForLocation(authenticate.url+
               type.getValue() +"?"+ authenticate.securityKey+
                "&"+query,String.class);
    }
    public String get(WooCommerce type,String productId){
        ResponseEntity<String> response = restTemplate.getForEntity
                (authenticate.url+type.getValue()+productId+"?"+
                authenticate.securityKey
                ,String.class);
        return response.getBody();
    }

    public String getSpecific(WooCommerceSpecific type,String parentId,String id){
        String[] WCtype;
        WCtype = type.getValue().split("_");
        ResponseEntity<String> response = restTemplate.getForEntity(
                authenticate.url+WCtype[0]+parentId+WCtype[1]+
                        id+"?"+authenticate.securityKey,String.class);
        return  response.getBody();
    }

    public String getPerPage(WooCommerce type,int page,int amount){
        ResponseEntity<String> response = restTemplate.getForEntity
                (authenticate.url+type.getValue()+"?per_page="+amount+"&page="+page+"&"+
                                authenticate.securityKey,String.class);
        return response.getBody();
    }
    public String getAll(WooCommerce type,Map<String,String> params){
        ResponseEntity<String> response = restTemplate.getForEntity(
                authenticate.url+type.getValue()+"?"+authenticate.securityKey,String.class,params);
        return response.getBody();
    }
    public String getAll(WooCommerce type,String query){
        ResponseEntity<String> response = restTemplate.getForEntity(
                authenticate.url+type.getValue()+"?"+authenticate.securityKey+"&"+query,String.class);
        return response.getBody();
    }
    public void delete(WooCommerce type,String id){
        restTemplate.delete(authenticate.url+type.getValue()+id+"?"+
                authenticate.securityKey);
    }
    public void deleteSpecific(WooCommerceSpecific type,String parentId,String id){
        String[] WCtype;
        WCtype = type.getValue().split("_");
        restTemplate.delete(authenticate.url+WCtype[0]+parentId+WCtype[1]+
                        id+"?"+authenticate.securityKey);
    }
}
