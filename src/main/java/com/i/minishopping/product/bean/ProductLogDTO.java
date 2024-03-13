package com.i.minishopping.product.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Setter
@Getter
@Component
public class ProductLogDTO {
    private Long product_id;
    private String size;
    private int count;
    private Long created_who;
    private LocalDateTime created_at;

    @Override
    public String toString() {
        return product_id + "\t"
                + size + "\t"
                + count + "\t"
                + created_who + "\t"
                + created_at;
    }
}