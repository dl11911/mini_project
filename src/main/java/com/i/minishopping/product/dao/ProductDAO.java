package com.i.minishopping.product.dao;

import com.i.minishopping.product.bean.ProductDTO;

import java.util.List;

public interface ProductDAO {
    void writeProduct(ProductDTO productDTO);

    List<ProductDTO> getProductList();

    void updateProduct(ProductDTO productDTO);

    void deleteProduct(ProductDTO productDTO);
}
