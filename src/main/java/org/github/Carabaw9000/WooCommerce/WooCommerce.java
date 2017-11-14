package org.github.Carabaw9000.WooCommerce;

/**
 * Created by kenneth on 2017/08/05.
 */
public enum WooCommerce {

    COUPONS("coupons/"),
    CUSTOMERS("customers/"),
    ORDERS("orders/"),
    PRODUCTS("products/"),

    //--------------------------CAN BE USED,BUT NOT TESTED YET-----------------------------//
    PRODUCTS_ATTRIBUTES("products/attributes/"),
    PRODUCTS_CATEGORIES("products/categories/"),
    PRODUCTS_SHIPPING_CLASSES("products/shipping_classes/"),
    PRODUCTS_TAGS("products/tags/"),
    REPORTS("reports/"),
    SALES_REPORTS("reports/sales"),
    TOP_SELLERS_REPORTS("reports/top_sellers/"),
    TAX_RATES("taxes/"),
    TAX_CLASSES("taxes/classes/"),
    WEBHOOKS("webhooks/"),
    SETTINGS("settings/"),
    PAYMENT_GATEWAYS("settings/"),
    SHIPPING_ZONES("shipping/zones/"),
    SHIPPING_METHODS("shipping_methods/"),
    SYSTEM_STATUS("system_status/"),
    SYSTEM_STATUS_TOOLS("system_status/tools/");
    //------------------------------------------------------------------------------------//

    private String value;

    WooCommerce(String value){this.value = value;}

    public String getValue(){
        return value;
    }
}

