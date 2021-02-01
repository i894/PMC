//package com.example.memo;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.example.pmc.R;
//
//public class Location_Add_Activity extends AppCompatActivity {
//
//
////    @Override
////    public void onBackPressed() {
////        //super.onBackPressed();
////        Intent intent = new Intent(getApplicationContext(), Location_List_Activity.class);
////        startActivity(intent);
////        finish();
////    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.location_add);
//
//        Button location_register_BT = (Button)findViewById(R.id.location_register_BT);
//        ImageView find_address1 = (ImageView)findViewById(R.id.find_address_BT1);
//        TextView find_address2 = (TextView)findViewById(R.id.find_address_BT2);
//
//        location_register_BT.setOnClickListener(new Button.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), Location_List_Activity.class);
//                startActivity(intent);
//                finish();
//            }
//        });
//
//        find_address2.setOnClickListener(new TextView.OnClickListener(){
//            @Override
//            public void onClick(View v) {
////                Intent intent = new Intent(getApplicationContext(), Location_Map_Activity.class);
////                startActivity(intent);//               finish();
//            }
//        });
//    }
//}