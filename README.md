# HEBImage
This is a sample REST API written per the spec provided.

It contains the following endpoints:

GET /images
• Returns HTTP 200 OK with a JSON response containing image details for all images including their metadata if available

GET /images?objects="dog,cat"
• Returns a HTTP 200 OK with a JSON response body containing image details for images that have been tagged with any of the objects listed

GET /images/{imageId}
• Returns HTTP 200 OK with a JSON response containing image details for the specified image

POST /images
• Posts a JSON request object which must include an base64 encoded image (no Data URI Scheme) or URL. The request may also include an optional label for the image, and an optional field to enable object detection. • Returns a HTTP 200 OK with a JSON response body including image details for the created image.

## Requirements


Java


Maven


Database(I used MySQL Workbench)


Postman

## Steps


Clone project


Run the image.sql


Use Postman to call different API endpoints


