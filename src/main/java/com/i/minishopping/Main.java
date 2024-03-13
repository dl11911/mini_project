package com.i.minishopping;

import com.i.minishopping.product.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.i.minishopping.user.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Scanner;



@Configuration
@ComponentScan(basePackages = "com.i.minishopping")
public class Main {

    private static UserService userService;
    private static ProductService productService;
    public void menu(ApplicationContext applicationContext){
        Scanner scan = new Scanner(System.in);
        // num = 1 : user, num = 2 : product
        int num = 2;
        choseMenu(applicationContext, num);

    } // menu

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("root-context.xml");
        Main main = (Main)applicationContext.getBean("main");
        main.menu(applicationContext);

        System.out.println("\n프로그램 종료합니다");
    } // main

    public void choseMenu(ApplicationContext applicationContext, int n){
        Scanner scan = new Scanner(System.in);
        int num;
        if(n==1){
            while(true) {
                System.out.println();
                System.out.println("1. 입력");
                System.out.println("2. 출력");
                System.out.println("3. 수정");
                System.out.println("4. 삭제");
                System.out.println("5. 끝");
                System.out.println("번호 입력 : ");
                num = scan.nextInt();
                switch (num) {
                    case 1:
                        userService = (UserService) applicationContext.getBean("userInsertService");
                        break;
                    case 2:
                        userService = (UserService) applicationContext.getBean("userSelectService");
                        break;
                    case 3:
                        userService = (UserService) applicationContext.getBean("userUpdateService");
                        break;
                    case 4:
                        userService = (UserService) applicationContext.getBean("userDeleteService");
                        break;
                    case 5:
                        break;
                } // switch

                userService.execute();
            }
        } // while
        if(n==2){
            while(true) {
                System.out.println();
                System.out.println("1. 입력");
                System.out.println("2. 출력");
                System.out.println("3. 수정");
                System.out.println("4. 삭제");
                System.out.println("5. 끝");
                System.out.println("번호 입력 : ");
                num = scan.nextInt();
                switch (num) {
                    case 1:
                        productService = (ProductService) applicationContext.getBean("productInsertService");
                        break;
                    case 2:
                        productService = (ProductService) applicationContext.getBean("productSelectService");
                        break;
                    case 3:
                        productService = (ProductService) applicationContext.getBean("productUpdateService");
                        break;
                    case 4:
                        productService = (ProductService) applicationContext.getBean("productDeleteService");
                        break;
                    case 5:
                        break;
                } // switch

                productService.execute();
            }
        } // while

    } // menu

} // end class
