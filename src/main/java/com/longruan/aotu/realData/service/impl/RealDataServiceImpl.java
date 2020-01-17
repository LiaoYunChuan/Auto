package com.longruan.aotu.realData.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.longruan.aotu.realData.mapper.RealDataMapper;
import com.longruan.aotu.realData.model.RealData;
import com.longruan.aotu.realData.model.RealtimeData;
import com.longruan.aotu.realData.service.RealDataService;
import org.springframework.stereotype.Service;

@Service
public class RealDataServiceImpl extends ServiceImpl<RealDataMapper, RealtimeData> implements RealDataService {
}
