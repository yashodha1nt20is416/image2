package com.example.img1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
 ImageView imageView;
 Button change;
int flag = 1;
 @Override
protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 imageView = findViewById(R.id.myImg);
 change = findViewById(R.id.click);
 change.setOnClickListener(new View.OnClickListener() {
 @Override
public void onClick(View view) {
 if(flag==1){
 imageView.setImageResource(R.drawable.ch1);
 flag=2 ;
 }else {
 imageView.setImageResource(R.drawable.ch2);
 flag = 1;
 } }
 });
 }
}
