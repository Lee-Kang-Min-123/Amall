package com.deu.Amall.service;

import java.util.List;

import com.deu.Amall.domain.ProductVO;
 
public interface ProductService {
 
    
    List<ProductVO> listProduct();
    ProductVO detailProduct(int productId);
    void updateProduct(ProductVO vo);
    void insertProduct(ProductVO vo);
	void deleteProduct(int productId);
}