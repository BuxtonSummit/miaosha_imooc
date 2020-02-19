package com.Buxton.dao;

import com.Buxton.domain.Promo;
import org.springframework.stereotype.Repository;

@Repository
public interface PromoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Wed Feb 19 11:13:15 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Wed Feb 19 11:13:15 CST 2020
     */
    int insert(Promo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Wed Feb 19 11:13:15 CST 2020
     */
    int insertSelective(Promo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Wed Feb 19 11:13:15 CST 2020
     */
    Promo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Wed Feb 19 11:13:15 CST 2020
     */
    int updateByPrimaryKeySelective(Promo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promo
     *
     * @mbg.generated Wed Feb 19 11:13:15 CST 2020
     */
    int updateByPrimaryKey(Promo record);

    Promo selectByItemId(Integer itemId);
}