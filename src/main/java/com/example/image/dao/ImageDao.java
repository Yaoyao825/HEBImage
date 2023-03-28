package com.example.image.dao;

import com.example.image.entity.Image;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * image(Image)accesses by database
 *
 * @author lydia.zhang
 * @since 2023-03-26 14:27:53
 */
public interface ImageDao {

    /**
     * use id to search in database
     *
     * @param id primary key
     * @return object
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
