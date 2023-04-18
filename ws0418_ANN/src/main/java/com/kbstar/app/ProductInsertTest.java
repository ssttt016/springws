package com.kbstar.app;

import com.kbstar.dto.ProductDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductInsertTest {

    public static void main(String[] args) {
        ApplicationContext factory =
                new ClassPathXmlApplicationContext("spring.xml");

        MyService<String, ProductDTO> service =
                (MyService<String, ProductDTO>) factory.getBean("pservice");

        ProductDTO p = new ProductDTO("id01", "bread", 500);
        service.register(p);

        p = new ProductDTO("id01","bread2",600);
        service.modify(p);
    }
}
