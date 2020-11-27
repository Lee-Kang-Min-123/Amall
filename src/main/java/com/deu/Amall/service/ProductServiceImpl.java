package com.deu.Amall.service;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.deu.Amall.dao.ProductMapper;
import com.deu.Amall.domain.ProductVO;


import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
@Primary
//@Repository("ProductServiceImpl")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductService productservice;
// 상품목록
	@Override
	public List<ProductVO> listProduct() {
		// TODO Auto-generated method stub
		return productservice.listProduct();
	}
	//상품상세
	@Override
	public ProductVO detailProduct(int productId) {
		// TODO Auto-generated method stub
		return productservice.detailProduct(productId);
	}
	//상품수정
	@Override
	public void updateProduct(ProductVO vo) {
		// TODO Auto-generated method stub
	}
	//상품삭제
	
	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertProduct(ProductVO vo) {
		// TODO Auto-generated method stub
		
	}
}