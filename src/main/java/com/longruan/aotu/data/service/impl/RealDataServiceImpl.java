package com.longruan.aotu.data.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.longruan.aotu.data.mapper.RealDataMapper;
import com.longruan.aotu.data.model.RealtimeData;
import com.longruan.aotu.data.service.RealDataService;
import org.springframework.stereotype.Service;

@Service
public class RealDataServiceImpl extends ServiceImpl<RealDataMapper, RealtimeData> implements RealDataService {
}
