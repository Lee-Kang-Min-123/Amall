package com.deu.Amall.service;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.deu.Amall.dao.ProductMapper;
import com.deu.Amall.domain.ProductVO;
import com.deu.Amall.util.PubMap;

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
	private ProductMapper mapper;
// 상품목록
	@Override
	public List<PubMap> getAllProducts() {
		// TODO Auto-generated method stub
		return mapper.getAllProducts();
	}

	@Override
	public void insertProduct(ProductVO vo) {
		// TODO Auto-generated method stub
		mapper.insert(vo);
		
	}
}