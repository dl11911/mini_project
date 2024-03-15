package com.i.minishopping;

import com.i.minishopping.product.service.ProductService;
import com.i.minishopping.user.service.LoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.i.minishopping.user.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Scanner;



@Configuration
/*@ComponentScan(basePackages = "com.i.minishopping")*/
public class Main {

    private static UserService userService;
    private static LoginService loginService;
    private static ProductService productService;
    public void menu(ApplicationContext applicationContext){
        Scanner scan = new Scanner(System.in);
        // num = 1 : user, num = 2 : product
        int num = 1;
        choseMenu(applicationContext, num);

    } // menu

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("root-context.xml");
        Main main = (Main)applicationContext.getBean("main");
        main.menu(applicationContext);

        System.out.println("\n프로그램을 종료합니다. ^^7");
    } // main

    public void choseMenu(ApplicationContext applicationContext, int n){
        Scanner scan = new Scanner(System.in);
        // 메뉴 선택 변수
        int num = 0;
        if(n == 1){
            while(true) { // 사용자가 '끝'을 선택할 때까지 계속 실행
                System.out.println();
                System.out.println("1. 입력");
                System.out.println("2. 출력");
                System.out.println("3. 수정");
                System.out.println("4. 삭제");
                System.out.println("5. 로그인");
                System.out.println("6. 끝");
                System.out.println("번호 입력 : ");
                num = scan.nextInt();
                switch (num) {
                    case 1:
                        userService = (UserService)applicationContext.getBean("userInsertService");
                        userService.execute();
                        break;
                    case 2:
                        userService = (UserService)applicationContext.getBean("userSelectService");
                        userService.execute();
                        break;
                    case 3:
                        userService = (UserService)applicationContext.getBean("userUpdateService");
                        userService.execute();
                        break;
                    case 4:
                        userService = (UserService)applicationContext.getBean("userDeleteService");
                        userService.execute();
                        break;
                    case 5:
                        System.out.println("이메일 입력: ");
                        String userEmail = scan.next();
                        System.out.println("비밀번호 입력: ");
                        String password = scan.next();
                        loginService = (LoginService)applicationContext.getBean("userLoginService");
                        boolean success = loginService.login(userEmail, password);
                        if(success) {
                            System.out.println("로그인 성공!");
                        } else {
                            System.out.println("로그인 실패.");
                        }
                        break;
                    case 6:
                        System.out.println("메뉴 선택을 종료합니다.");
                        return; // '끝' 선택 시 메뉴 선택 종료
                    default:
                        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                        break;
                } // switch
            } // while

    }
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

        if(n==3){
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
                        userService = (UserService) applicationContext.getBean("userDetailInsertService");
                        break;
                    case 2:
                        userService = (UserService) applicationContext.getBean("userDetailSelectService");
                        break;
                    case 3:
                        userService = (UserService) applicationContext.getBean("userDetailUpdateService");
                        break;
                    case 4:
                        userService = (UserService) applicationContext.getBean("userDetailDeleteService");
                        break;
                    case 5:
                        break;
                } // switch

                userService.execute();
            }
        } // while
    } // menu

} // end class
