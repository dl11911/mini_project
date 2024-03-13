package com.i.minishopping.product.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.i.minishopping.product.bean.ProductDTO;
import com.i.minishopping.product.dao.ProductDAO;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductSelectService implements ProductService {

    private final ProductDAO productDAO;
    @Override
    public void execute() {
        System.out.println();

        List<ProductDTO> list = productDAO.getProductList();
        System.out.println("일련번호\t재품명\t가격\t\t브랜드\t\t카테고리\t\t등록자\t\t등록시간\t\t\t\t좋아요");
        for(ProductDTO productDTO : list){
            System.out.println(" " + productDTO.getProductId() + "\t\t"
                             + productDTO.getPdName() + "\t\t"
                             + productDTO.getPdPrice() + "\t\t"
                             + productDTO.getBrandId() + "\t\t\t"
                             + productDTO.getPdCategory() + "\t\t\t"
                             + productDTO.getCreatedWho() + "\t\t"
                             + productDTO.getCreatedAt() + "\t\t"
                             + productDTO.getCountLove());

        } // for

    } // execute

}

