package com.example.image.service;

import com.example.image.entity.Image;
import com.example.image.request.ImageRequest;

import java.util.List;

/**
 * image(Image)service
 *
 * @author lydia.zhang
 * @since 2023-03-26 14:27:53
 */
public interface ImageService {

    /**
     * search data result through id
     *
     * @param id primary key
     * @return actual data
     */
    Image queryById(Integer id);


    List<Image> queryAll();

    /**
     * newly added data
     *
     * @param image object
     * @return object
     */
    Image insert(ImageRequest image) throws ServiceUnavailableException, IOException;


    List<Image> selectByLabelList(String objects);

}
