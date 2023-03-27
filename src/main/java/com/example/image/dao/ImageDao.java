package com.example.image.dao;

import com.example.image.entity.Image;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * image(Image)表数据库访问层
 *
 * @author lydia.zhang
 * @since 2023-03-26 14:27:53
 */
public interface ImageDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Image queryById(Integer id);


    List<Image> selectByLabelList(@Param("labelList") List<String> labelList);

    /**
     * query based on lable
     *
     *
     * @return object
     */
    List<Image> queryAll();

    /**
     * newly added data
     *
     * @param image obejct
     * @return affected rows
     */
    int insert(Image image);



}