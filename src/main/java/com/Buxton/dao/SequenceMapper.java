package com.Buxton.dao;

import com.Buxton.domain.Sequence;
import org.springframework.stereotype.Repository;

@Repository
public interface SequenceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Tue Feb 18 14:56:26 CST 2020
     */
    int deleteByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Tue Feb 18 14:56:26 CST 2020
     */
    int insert(Sequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Tue Feb 18 14:56:26 CST 2020
     */
    int insertSelective(Sequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Tue Feb 18 14:56:26 CST 2020
     */
    Sequence selectByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Tue Feb 18 14:56:26 CST 2020
     */
    int updateByPrimaryKeySelective(Sequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sequence_info
     *
     * @mbg.generated Tue Feb 18 14:56:26 CST 2020
     */
    int updateByPrimaryKey(Sequence record);

    Sequence getSequenceByName(String name);
}