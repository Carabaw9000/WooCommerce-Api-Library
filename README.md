# WooCommerce-Api-Library
(Alpha version,Not yet on Maven Central) WooCommerce Api Library written in Java,using Spring RestTemplate

### ----------------------------------------------------How to use------------------------------------------------------

### Link to look at
https://woocommerce.github.io/woocommerce-rest-api-docs/

### Main class to use
How to start 
```java
private OnlineStore onlineStore = new OnlineStoreEnable(new Authenticate(
            "https://www.example.co.za/demo",       //The link to the website.
            "ck_234ahoekb3904lcvldska990f",         //This is your consumer_key that is an example.
            "cs_5lfpviorjnldmfj390489fjfjkb2d"));   //This is your consumer_secret that is an example.
```            
        
### Creating your method.
This is an example with the onlineStore.get() method.
```java
public String get(String id) throws IOException {
       return onlineStore.get(WooCommerce.PRODUCTS,"2012"); //This will get the product with id 2012.And return it as String in JSON format.
    }           
 ````
    
 
### More examples 
```java
 onlineStore.update(WooCommerce.PRODUCTS,"2032","regular_price=2000");
 /*
 The "regular_price=2000" is the query that you add for whichever value you want to change of that product
 visit https://woocommerce.github.io/woocommerce-rest-api-docs/#product-properties and go into products
 then go under Product properties to see which one you can change.Remember to put the "=" after the property then 
 the value you want to add e.g "regular_price=101","catalog_visibility=hidden","status=publish","featured=false" etc...
 */
 ```
 ```java
 onlineStore.updateSpecific(WooCommerceSpecific.PRODUCT_VARIATIONS,"2032", "2034", "regular_price=2000");
 //The updateSpecific requires the WooCommerceSpecific type asswell
```
```java
 onlineStore.delete(WooCommerce.PRODUCTS,"2012");
 //This will delete the product with its spesified id.
 ```
