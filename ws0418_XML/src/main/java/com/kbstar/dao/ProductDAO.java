package com.kbstar.dao;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements MyDao<String, ProductDTO> {
    @Override
    public void insert(ProductDTO productDTO) {
        System.out.println("Inserted" + productDTO);
    }

    @Override
    public void delete(String s) {
        System.out.println("Deleted" + s);
    }

    @Override
    public void update(ProductDTO productDTO) {
        System.out.println("Updated" + productDTO);
    }

    @Override
    public ProductDTO select(String s) {
        ProductDTO product = null;
        product = new ProductDTO("id01","bread",500);
        return product;
    }

    @Override
    public List<ProductDTO> select() {
        List<ProductDTO> list = new ArrayList<>();
        list.add(new ProductDTO("id01","bread",500));
        list.add(new ProductDTO("id02","bread2",600));
        list.add(new ProductDTO("id03","bread3",700));
        return list;
    }
}
