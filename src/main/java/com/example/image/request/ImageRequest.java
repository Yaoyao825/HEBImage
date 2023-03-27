package com.example.image.request;

/**
 * @author lydia.zhang
 * @date 2023/3/26 15:07
 */
public class ImageRequest {

    private String imageUrl;

    private String imageLabel;

    private Boolean identificationPicture;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageLabel() {
        return imageLabel;
    }

    public void setImageLabel(String imageLabel) {
        this.imageLabel = imageLabel;
    }

    public Boolean getIdentificationPicture() {
        return identificationPicture;
    }

    public void setIdentificationPicture(Boolean identificationPicture) {
        this.identificationPicture = identificationPicture;
    }
}
