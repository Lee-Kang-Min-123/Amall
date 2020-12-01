package com.deu.Amall.dao;

import java.util.List;

import com.deu.Amall.domain.BasketVO;
import com.deu.Amall.util.PubMap;
 
public interface BasketMapper {
	
    void insert(BasketVO Basket); //장바구니 추가
    List<PubMap> listCart(String user_id); //장바구니 목록
    void delete(int product_id); //장바구니 개별 삭제
    void deleteAll(String user_id); //장바구니 비우기
    void update(int product_id); 
    int sumMoney(String user_id); //장바구니 금액 합계
    void updateCart(BasketVO Basket); //장바구니 수정 
    void modifyCart(BasketVO Basket);
    
}