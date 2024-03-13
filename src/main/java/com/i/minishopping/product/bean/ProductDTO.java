package com.i.minishopping.product.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Setter
@Getter
@Component
public class ProductDTO {
    private Long product_id;
    private String pd_name;
    private int pd_price;
    private Long brand_id;
    private String pd_category;
    private Long created_who;
    private LocalDateTime created_at;
    private int count_love;

    @Override
    public String toString() {
        return product_id + "\t"
                + pd_name + "\t"
                + pd_price + "\t"
                + brand_id + "\t"
                + pd_category + "\t"
                + created_who + "\t"
                + created_at + "\t"
                + count_love;
    }
}
