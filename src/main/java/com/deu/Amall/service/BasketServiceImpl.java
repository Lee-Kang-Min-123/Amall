package com.deu.Amall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.deu.Amall.dao.BasketMapper;
import com.deu.Amall.dao.OrderMapper;
import com.deu.Amall.domain.BasketVO;
import com.deu.Amall.util.PubMap;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
 
@Log4j
@Service
@AllArgsConstructor
@Primary
public class BasketServiceImpl implements BasketService {
    
    @Autowired
    BasketMapper basketMapper;
    
    @Override
    public void insert(BasketVO dto) {
    	
    	log.info(dto);
    	dto.setInsrtUserId(dto.getUserId());
    	
    	basketMapper.insert(dto);
    }
 
    @Override
    public List<PubMap> listBasket(String userId) {
        return basketMapper.listBasket(userId);
    }
 
    @Override
    public void delete(int productId) {
    	basketMapper.delete(productId);
    }
 
    @Override
    public void deleteAll(String userId) {
    	basketMapper.deleteAll(userId);
    }
 
    @Override
    public void update(int productId) {     
 
    }
 
    @Override
    public int sumMoney(String userId) {
        return basketMapper.sumMoney(userId);
    }
 
}