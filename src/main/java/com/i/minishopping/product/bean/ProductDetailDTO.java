package com.i.minishopping.product.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class ProductDetailDTO {
    private long product_id;
    private String size;
    private int pd_before_count;
    private int pd_sell_count;

    @Override
    public String toString() {
        return product_id + "\t" + size + "\t" + pd_before_count + "\t" + pd_sell_count;
    }
}