package com.example.image.controller;


import com.example.image.entity.Image;
import com.example.image.request.ImageRequest;
import com.example.image.service.ImageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.naming.ServiceUnavailableException;
import java.io.IOException;
import java.util.List;


/**
 * image(Image) control layer
 *
 * @author lydia.zhang
 * @since 2023-03-26 14:27:53
 */
@RestController
public class ImageController {
    /**
     * object
     */
    @Resource
    private ImageService imageService;


    /**
     * search data through key
     *
     * @param id primary key
     * @return data record
     */
    @GetMapping("images/{imagesId}")
    public ResponseEntity<Image> selectOne(@PathVariable("imagesId") Integer id) {
        return ResponseEntity.ok(this.imageService.queryById(id));
    }

    @GetMapping("images")
    public ResponseEntity<List<Image>> selectByLabel(@RequestParam(required = false) String objects) {
        if (objects == null) {
            return ResponseEntity.ok(this.imageService.queryAll());
        }
        return ResponseEntity.ok(this.imageService.selectByLabelList(objects));
    }

    @PostMapping("images")
    public ResponseEntity<Image> postImage(@RequestBody ImageRequest request) throws ServiceUnavailableException, IOException {
        Image image = imageService.insert(request);
        return ResponseEntity.ok(image);
    }


}
