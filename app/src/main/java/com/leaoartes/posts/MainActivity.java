package com.leaoartes.posts;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.leaoartes.posts.R;

import static com.leaoartes.posts.R.id.mContent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void images(View view) {

        String[] posts = {"Canadá sonho", "Canadá iremos", "Canadá é logo ali", "Canadá próxima parada"};
        int[] image = {R.drawable.post1, R.drawable.post2, R.drawable.post3, R.drawable.post4};

        int number = 0;

        while (number < posts.length) {

            //TextView text = findViewById(R.id.textView);

            TextView tv = new TextView(this);
            tv.setText(posts[number]);
            tv.setGravity(Gravity.CENTER);
            LinearLayout linearLayoutText = findViewById(mContent);
            linearLayoutText.addView(tv);

            ImageView fotos = new ImageView(this);
            fotos.setImageResource(image[number]);
            LinearLayout linearLayoutImage = findViewById(mContent);
            linearLayoutImage.addView(fotos);

            number++;

        }
        //Drawable drawable = getResources().getDrawable(R.drawable.lighthouse);
        //ImageView pro = findViewById(R.id.imageView);
        //pro.setImageDrawable(drawable);



    }
}

