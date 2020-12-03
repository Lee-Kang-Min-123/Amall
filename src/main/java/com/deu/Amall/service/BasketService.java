package com.deu.Amall.service;

import java.util.List;

import com.deu.Amall.domain.BasketVO;
import com.deu.Amall.util.PubMap;
 
public interface BasketService {
    void insert(BasketVO dto); //장바구니 추가
    List<PubMap> listBasket(String userId); //장바구니 목록
    void delete(int productId); //장바구니 개별 삭제
    void deleteAll(String userId); //장바구니 비우기
    void update(int productId); 
    int sumMoney(String userId); //장바구니 금액 합계
}