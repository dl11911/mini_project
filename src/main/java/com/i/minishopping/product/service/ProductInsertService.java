package com.i.minishopping.product.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.i.minishopping.product.bean.ProductDTO;
import com.i.minishopping.product.dao.ProductDAO;

import java.util.Scanner;

@Service
@RequiredArgsConstructor
public class ProductInsertService implements ProductService {
    private final ProductDTO productDTO;
    private final ProductDAO productDAO;
    @Override
    public void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("제품명 입력 : ");
        String pd_name = sc.next();
        System.out.print("가격 입력 : ");
        int pd_price = sc.nextInt();
        System.out.print("브랜드 입력 : ");
        Long brand_id = sc.nextLong();
        System.out.print("카테고리 입력 : ");
        String pd_category = sc.next();
        System.out.print("등록자 입력 : ");
        Long created_who = sc.nextLong();

        productDTO.setPdName(pd_name);
        productDTO.setPdPrice(pd_price);
        productDTO.setBrandId(brand_id);
        productDTO.setPdCategory(pd_category);
        productDTO.setCreatedWho(created_who);
        System.out.println(productDTO.getPdName());
        productDAO.writeProduct(productDTO);

        System.out.println("데이터가 저장됐습니다.");
    }
}
