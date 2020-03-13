package cn.kobe.mapper;

import cn.kobe.beanVo.BuyVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuyVoMapper {
    List<BuyVo> searchSuccessBuy(String studentId);
}