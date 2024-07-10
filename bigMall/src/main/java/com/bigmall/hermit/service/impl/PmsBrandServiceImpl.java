package com.bigmall.hermit.service.impl;

import com.bigmall.hermit.mmg.mapper.PmsBrandMapper;
import com.bigmall.hermit.mmg.model.PmsBrand;
import com.bigmall.hermit.mmg.model.PmsBrandExample;
import com.bigmall.hermit.service.PmsBrandService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    @Autowired
    private PmsBrandMapper brandMapper;


    @Override
    public int create(PmsBrand brand) {
        return brandMapper.insertSelective(brand);

    }

    @Override
    public int update(Long id, PmsBrand brand) {
        brand.setId(id);
        return brandMapper.updateByPrimaryKeySelective(brand);
    }

    @Override
    public int delete(Long id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PmsBrand getItem(Long id) {
        return brandMapper.selectByPrimaryKey(id);

    }

    @Override
    public List<PmsBrand> list(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return brandMapper.selectByExample(new PmsBrandExample());
    }

    @Override
    public List<PmsBrand> listAll() {
        return brandMapper.selectByExample(new PmsBrandExample());
    }
}
