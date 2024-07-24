package com.example.fxmemorygame;


import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

import java.net.URL;
import java.util.*;


public class HelloController implements Initializable {

    Image img1, img2, img3, img4, img5, img6, img7, img8, img17;


    Boolean isStartClicked = false;
    List<Image> pictures = new ArrayList<>();
    List<Image> pictures2 = new ArrayList<>();
    List<ImageView> imageViews = new ArrayList<>();


    ImageView firstClickedImage;
    ImageView secondClickedImage;
    ImageView thirdClickedImage;

    ImageView imageView;

    int clickCount = 0;


    @FXML
    private Button btn1;

    @FXML
    private Label lbl1;
    @FXML
    private ImageView imgV1, imgV2, imgV3, imgV4, imgV5, imgV6, imgV7, imgV8, imgV9, imgV10, imgV11, imgV12, imgV13, imgV14, imgV15, imgV16;


    @FXML
    void start(ActionEvent event) {

        lbl1.setText("GAME ON!!");
        setCards();
        clickCount = 0;
        isStartClicked = true;
        resetTheGame();
    }



    @FXML
    void clicks(MouseEvent event) {



        try {

            imageView = (ImageView) event.getSource();


    if (isStartClicked && clickCount <= 3 && imageView.getImage().equals(img17) ) {


        if (imageView.getId().equals("imgV1")) {
            imageView.setImage(pictures2.get(0));
            clickCount++;
            checkImages();

        }

        if (imageView.getId().equals("imgV2")) {
            imageView.setImage(pictures.get(0));
            clickCount++;
            checkImages();
        }

        if (imageView.getId().equals("imgV3")) {
            imageView.setImage(pictures2.get(1));
            clickCount++;
            checkImages();
        }
        if (imageView.getId().equals("imgV4")) {
            imageView.setImage(pictures.get(1));
            clickCount++;
            checkImages();
        }
        if (imageView.getId().equals("imgV5")) {
            imageView.setImage(pictures2.get(2));
            clickCount++;
            checkImages();
        }
        if (imageView.getId().equals("imgV6")) {
            imageView.setImage(pictures.get(2));
            clickCount++;
            checkImages();
        }
        if (imageView.getId().equals("imgV7")) {
            imageView.setImage(pictures2.get(3));
            clickCount++;
            checkImages();
        }
        if (imageView.getId().equals("imgV8")) {
            imageView.setImage(pictures.get(3));
            clickCount++;
            checkImages();
        }
        if (imageView.getId().equals("imgV9")) {
            imageView.setImage(pictures2.get(4));
            clickCount++;
            checkImages();
        }
        if (imageView.getId().equals("imgV10")) {
            imageView.setImage(pictures.get(4));
            clickCount++;
            checkImages();
        }
        if (imageView.getId().equals("imgV11")) {
            imageView.setImage(pictures2.get(5));
            clickCount++;
            checkImages();
        }
        if (imageView.getId().equals("imgV12")) {
            imageView.setImage(pictures.get(5));
            clickCount++;
            checkImages();
        }
        if (imageView.getId().equals("imgV13")) {
            imageView.setImage(pictures2.get(6));
            clickCount++;
            checkImages();
        }
        if (imageView.getId().equals("imgV14")) {
            imageView.setImage(pictures.get(6));
            clickCount++;
            checkImages();
        }
        if (imageView.getId().equals("imgV15")) {
            imageView.setImage(pictures2.get(7));
            clickCount++;
            checkImages();
        } else if (imageView.getId().equals("imgV16")) {
            imageView.setImage(pictures.get(7));
            clickCount++;
            checkImages();
        }



    }
              }catch (Exception e){
            lbl1.setText("GAME ");

    }
    }
            @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

                img1 = new Image(getClass().getResourceAsStream("/image/good.jpg"));
                img2 = new Image(getClass().getResourceAsStream("/image/disappointed.jpg"));
                img3 = new Image(getClass().getResourceAsStream("/image/happy.jpg"));
                img4 = new Image(getClass().getResourceAsStream("/image/sleepy.jpg"));
                img5 = new Image(getClass().getResourceAsStream("/image/time.jpg"));
                img6 = new Image(getClass().getResourceAsStream("/image/tired.jpg"));
                img7 = new Image(getClass().getResourceAsStream("/image/twoBeers.jpg"));
                img8 = new Image(getClass().getResourceAsStream("/image/Thanks.jpg"));
                img17 = new Image(getClass().getResourceAsStream("/image/big_red_button.jpg"));





        imageViews.add(imgV1);
        imageViews.add(imgV2);
        imageViews.add(imgV3);
        imageViews.add(imgV4);
        imageViews.add(imgV5);
        imageViews.add(imgV6);
        imageViews.add(imgV7);
        imageViews.add(imgV8);
        imageViews.add(imgV9);
        imageViews.add(imgV10);
        imageViews.add(imgV11);
        imageViews.add(imgV12);
        imageViews.add(imgV13);
        imageViews.add(imgV14);
        imageViews.add(imgV15);
        imageViews.add(imgV16);

        pictures.add(img1);
        pictures.add(img2);
        pictures.add(img3);
        pictures.add(img4);
        pictures.add(img5);
        pictures.add(img6);
        pictures.add(img7);
        pictures.add(img8);

        pictures2.add(img1);
        pictures2.add(img2);
        pictures2.add(img3);
        pictures2.add(img4);
        pictures2.add(img5);
        pictures2.add(img6);
        pictures2.add(img7);
        pictures2.add(img8);

    }


    public void setCards(){


        Collections.shuffle(pictures);
        Collections.shuffle(pictures2);



    }
    public void resetTheGame(){

        for (ImageView imageView : imageViews) {
            imageView.setImage(img17);

        }

        clickCount = 0;
    }


    private void checkImages() {
        if (clickCount == 1) {
            firstClickedImage = imageView;
        } else if (clickCount == 2) {
            secondClickedImage = imageView;
            if (areEqual(firstClickedImage, secondClickedImage)) {
                lbl1.setText("It's a match!");
                clickCount = 0;
            } else {
                lbl1.setText("No match, try again.");
                PauseTransition pause = new PauseTransition(Duration.seconds(1));
                pause.setOnFinished(e -> {
                    firstClickedImage.setImage(img17);
                    secondClickedImage.setImage(img17);
                    clickCount = 0;
                });
                pause.play();
            }
        }
    }

    public boolean areEqual(ImageView image1, ImageView image2){

        return image1.getImage().toString().equals(image2.getImage().toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HelloController that = (HelloController) o;
        return Objects.equals(img1, that.img1) && Objects.equals(img2, that.img2) && Objects.equals(img3, that.img3) && Objects.equals(img4, that.img4) && Objects.equals(img5, that.img5) && Objects.equals(img6, that.img6) && Objects.equals(img7, that.img7) && Objects.equals(img8, that.img8);
    }

    @Override
    public int hashCode() {
        return Objects.hash(img1, img2, img3, img4, img5, img6, img7, img8);
    }
}//END


