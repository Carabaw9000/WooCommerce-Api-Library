package org.github.Carabaw9000.WooCommerce;

/**
 * Created by kenneth on 2017/08/08.
 */
public enum WooCommerceSpecific {

        ORDER_NOTES("orders/_/notes/"),
        PRODUCT_VARIATIONS("products/_/variations/");

        private String value;

        WooCommerceSpecific(String value){this.value = value;}

        public String getValue(){return value;}
}
