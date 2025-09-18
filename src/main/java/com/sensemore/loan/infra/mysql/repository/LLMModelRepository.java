package com.sensemore.loan.infra.mysql.repository;

import com.sensemore.loan.infra.mysql.entity.LLMModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Mapper
public interface LLMModelRepository {
    
    /**
     * 插入新记录（动态插入，null值不插入）
     */
    int insert(LLMModel llmModel);
    
    /**
     * 插入新记录（选择性插入，null值不插入）
     */
    int insertSelective(LLMModel llmModel);
    
    /**
     * 根据ID删除
     */
    int deleteById(Long id);
    
    /**
     * 根据key删除
     */
    int deleteByKey(String key);
    
    /**
     * 批量删除
     */
    int deleteByIds(@Param("ids") List<Long> ids);
    
    /**
     * 更新记录
     */
    int updateById(LLMModel llmModel);
    
    /**
     * 动态更新（只更新非空字段）
     */
    int updateByIdSelective(LLMModel llmModel);
    
    /**
     * 根据ID查询
     */
    LLMModel selectById(Long id);
    
    /**
     * 根据key查询
     */
    LLMModel selectByKey(String key);
    
    /**
     * 根据分组查询
     */
    List<LLMModel> selectByGroup(String group);
    
    /**
     * 根据归属查询
     */
    List<LLMModel> selectByBelong(String belong);
    
    /**
     * 查询所有记录
     */
    List<LLMModel> selectAll();
    
    /**
     * 分页查询
     */
    List<LLMModel> selectByPage(@Param("offset") int offset, @Param("limit") int limit);
    
    /**
     * 统计总数
     */
    long count();
    
    /**
     * 条件查询
     */
    List<LLMModel> selectByCondition(@Param("key") String key, 
                                   @Param("group") String group, 
                                   @Param("belong") String belong);
}