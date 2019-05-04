package com.heylhh.sell.service;

import com.heylhh.sell.dto.OrderDTO;

public interface PayService {

    void create(OrderDTO orderDTO);
}