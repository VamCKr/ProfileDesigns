package com.appsnipp.profiledesigns;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {
    ImageView reg_icon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        reg_icon=findViewById(R.id.register_number_edit_icon);
        reg_icon.setClickable(true);
        reg_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Edit icon is Clicked",Toast.LENGTH_LONG).show();
            }
        });
    }
}
