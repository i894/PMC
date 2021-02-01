//package com.example.memo;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import com.example.pmc.R;
//
//public class Location_List_Activity extends AppCompatActivity {
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.location_list);
//
//        Button location_add_BT = (Button)findViewById(R.id.location_add_BT);
//
//        location_add_BT.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), Location_Add_Activity.class);
//                startActivity(intent);
//                finish();
//            }
//
//        });
//
//    }
//}