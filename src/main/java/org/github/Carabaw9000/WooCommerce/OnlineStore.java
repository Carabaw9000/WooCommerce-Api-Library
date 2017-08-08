package org.github.Carabaw9000.WooCommerce;

import java.util.Map;

/**
 * Created by kenneth on 2017/08/05.
 */
public interface OnlineStore {

     void update(String WooCommerceType, String id, String query);

     void update(String WooCommerceType, String id, Map<String, String> params);

     void create(String WooCommerceType, Map<String, String> parameters);

     void create(String WooCommerceType, String query);

     String get(String WooCommerceType, String productId);

     //String getSpecific(String WooCommerceSpecificType,String parentId,String id);

     String getPerPage(String WooCommerceType, int page, int amount);

     String getAll(String WooCommerceType, Map<String, String> params);

     String getAll(String WooCommerceType, String query);

     void delete(String WooCommerceType, String id);

}
