package com.example.profile_edit;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSubmit = findViewById(R.id.btn_dob);

        // Khởi tạo Calendar để lấy ngày hiện tại
        final Calendar calendar = Calendar.getInstance();

        btnSubmit.setOnClickListener(v -> {
            // Lấy năm, tháng, ngày hiện tại
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            // Tạo DatePickerDialog
            DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this,
                    (view, selectedYear, selectedMonth, selectedDay) -> {
                        // Định dạng ngày tháng
                        String selectedDate = selectedDay + "/" + (selectedMonth + 1) + "/" + selectedYear;
                        // Hiển thị ngày đã chọn lên Button
                        btnSubmit.setText(selectedDate);
                        // Hiển thị thông báo
                        Toast.makeText(MainActivity.this, "Ngày đã chọn: " + selectedDate, Toast.LENGTH_SHORT).show();
                    }, year, month, day);

            // Hiển thị DatePickerDialog
            datePickerDialog.show();
        });
    }
}
