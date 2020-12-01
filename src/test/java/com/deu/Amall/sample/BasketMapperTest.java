package com.deu.Amall.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.deu.Amall.dao.BasketMapper;
import com.deu.Amall.domain.BasketVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BasketMapperTest {
	
	@Autowired
	private BasketMapper basketmapper; //BasketMapper.java 인터페이스
	
	//회원가입 테스트
	@Test
	public void insert() throws Exception{
		
		BasketVO Basket = new BasketVO();
		
		Basket.setUserId("spring_test"); //회원번호
		Basket.setProductId(1); //상품번호
		Basket.setProductPrice(1000); //상품가격
		Basket.setQty(20); //수량
		Basket.setInsrtUserId("test");
		
		basketmapper.insert(Basket);
	}

}
