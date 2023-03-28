package com.example.image.service.impl;

import com.example.image.dao.ImageDao;
import com.example.image.entity.Image;
import com.example.image.request.ImageRequest;
import com.example.image.service.ImageService;
import com.google.cloud.vision.v1.AnnotateImageRequest;
import com.google.cloud.vision.v1.AnnotateImageResponse;
import com.google.cloud.vision.v1.EntityAnnotation;
import com.google.cloud.vision.v1.Feature;
import com.google.cloud.vision.v1.ImageAnnotatorClient;
import com.google.protobuf.ByteString;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * image(Image)service implementation
 *
 * @author lydia.zhang
 * @since 2023-03-26 14:27:53
 */
@Service("imageService")
public class ImageServiceImpl implements ImageService {
    @Resource
    private ImageDao imageDao;

    /**
     * search data result through id
     *
     * @param id key
     * @return object
     */
    @Override
    public Image queryById(Integer id) {
        return this.imageDao.queryById(id);
    }



    @Override
    public List<Image> queryAll() {
        return imageDao.queryAll();
    }

    /**
     * newly added
     *
     *
     * @return object
     */
    @Override
    public Image insert(ImageRequest imageRequest) {
        Image image = new Image();
        if (imageRequest.getIdentificationPicture() != null && !imageRequest.getIdentificationPicture()) {
            //Image object detection can be performed using any API
            /**
            try (ImageAnnotatorClient vision = ImageAnnotatorClient.create()) {
                byte[] data = Files.readAllBytes(Paths.get(imageRequest.getImageUrl()));
                Image img = Image.newBuilder().setContent(ByteString.copyFrom(data)).build();
                Feature feat = Feature.newBuilder().setType(Feature.Type.LABEL_DETECTION).build();
                AnnotateImageRequest request = AnnotateImageRequest.newBuilder().addFeatures(feat).setImage(img).build();
                AnnotateImageResponse response = vision.annotateImage(request);

                StringBuilder objects = new StringBuilder();
                for (EntityAnnotation annotation : response.getLabelAnnotationsList()) {
                    objects.append(annotation.getDescription()).append(",");
                }

                if (objects.length() > 0) {
                    objects.deleteCharAt(objects.length() - 1);
                }

                image.setImageObjects(objects.toString());
            } catch (Exception e) {
                // Handle exception
            } */
        }
        image.setImageLabel(imageRequest.getImageLabel());
        image.setImageUrl(imageRequest.getImageUrl());
        image.setCreateTime(new Date());
        this.imageDao.insert(image);
        return image;
    }



    @Override
    public   List<Image> selectByLabelList(String objects){
        String[] labelList = objects.split(",");
        return this.imageDao.selectByLabelList(Arrays.asList(labelList));
    }

}
