package com.longruan.aotu.realData.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.longruan.aotu.realData.model.RealData;
import com.longruan.aotu.realData.model.RealtimeData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RealDataMapper extends BaseMapper<RealtimeData> {
}
