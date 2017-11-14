package org.github.Carabaw9000.WooCommerce;

import java.util.Map;

/**
 * Created by kenneth on 2017/08/05.
 */
public interface OnlineStore {

     void update(WooCommerce type, String id, String query);

     void update(WooCommerce type, String id, Map<String, String> params);

     void updateSpecific(WooCommerceSpecific type, String parentId, String id, String query);

     void create(WooCommerce type, Map<String, String> parameters);

     void create(WooCommerce type, String query);

     String get(WooCommerce type, String productId);

     String getSpecific(WooCommerceSpecific type, String parentId, String id);

     String getPerPage(WooCommerce type, int page, int amount);

     String getAll(WooCommerce type, Map<String, String> params);

     String getAll(WooCommerce type, String query);

     void delete(WooCommerce type, String id);

     void deleteSpecific(WooCommerceSpecific type, String parentId, String id);

}
