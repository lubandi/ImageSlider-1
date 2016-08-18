package com.example.hp.imageslider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

public class MainActivity extends AppCompatActivity {
    private SliderLayout sliderLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sliderLayout = (SliderLayout) findViewById(R.id.sld_NgocTrinh);
        addSlider();

    }
    private void addSlider(){
        TextSliderView ngoctrinh = new TextSliderView(this);
        TextSliderView ngoctrinh01 = new TextSliderView(this);
        ngoctrinh.description("ngoc trinh").image(R.drawable.ngoctrinh);
        ngoctrinh01.description("ngoc trinh").image(R.drawable.ngoctrinh01);
        sliderLayout.addSlider(ngoctrinh);
        sliderLayout.addSlider(ngoctrinh01);
    }
}
