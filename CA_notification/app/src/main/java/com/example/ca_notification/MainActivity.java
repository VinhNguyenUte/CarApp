package com.example.ca_notification;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button viewDetailButton1 = findViewById(R.id.view_detail_button1);
        Button viewDetailButton2 = findViewById(R.id.view_detail_button2);
        Button viewDetailButton3 = findViewById(R.id.view_detail_button3);

        // Tạo OnClickListener chung cho tất cả các nút
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Gọi phương thức hiển thị BottomSheet
                showBottomSheet();
            }
        };

        // Gán sự kiện chung cho các nút
        viewDetailButton1.setOnClickListener(clickListener);
        viewDetailButton2.setOnClickListener(clickListener);
        viewDetailButton3.setOnClickListener(clickListener);
    }

    // Phương thức để hiển thị BottomSheet
    private void showBottomSheet() {
        // Tạo BottomSheetDialog
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(MainActivity.this);

        // Gán layout cho BottomSheet
        View bottomSheetView = getLayoutInflater().inflate(R.layout.bottom_sheet_layout, null);
        bottomSheetDialog.setContentView(bottomSheetView);

        // Hiển thị BottomSheet
        bottomSheetDialog.show();
    }
}
