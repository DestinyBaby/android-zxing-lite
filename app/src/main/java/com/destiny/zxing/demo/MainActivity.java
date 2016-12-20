package com.destiny.zxing.demo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;

import com.destiny.zxing.CaptureActivity;
import com.destiny.zxing.encode.QRCodeEncoder;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.et_content)
    EditText contentEdt;

    @BindView(R.id.iv_qr)
    ImageView qrImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_scan)
    void doScan() {
        startActivity(new Intent(this, CaptureActivity.class));
    }

    @OnClick(R.id.btn_create)
    void doCreateQR() {
        String content = contentEdt.getText().toString().trim();

        try {
            Bitmap bitmap = QRCodeEncoder.encodeAsBitmap(content, 400);
            qrImg.setImageBitmap(bitmap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
