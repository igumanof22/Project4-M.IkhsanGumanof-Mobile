package com.example.project4_mikhsangumanof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button btnProses;
    RadioButton rbAtm, rbCash, rbCredit;
    Spinner spinSatuan;
    EditText editNama, editJumlah, editHarga;
    RadioGroup rgBayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNama = findViewById(R.id.editBrg);
        editJumlah = findViewById(R.id.editJumlah);
        editHarga = findViewById(R.id.editHarga);
        spinSatuan = findViewById(R.id.spinSatuan);
        rgBayar = findViewById(R.id.rgBayar);
        rbAtm = findViewById(R.id.rbATM);
        rbCash = findViewById(R.id.rbCash);
        rbCredit = findViewById(R.id.rbCredit);
        btnProses = findViewById(R.id.btnProses);

        btnProses.setOnClickListener(new ProsesTransaksi());
    }

    private class ProsesTransaksi implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            double jumlah=0, harga=0, total=0;
            String nama,satuan,jenisBayar="";

            jumlah = Double.parseDouble(editJumlah.getText().toString());
            harga = Double.parseDouble(editHarga.getText().toString());
            satuan = spinSatuan.getSelectedItem().toString();
            nama = editNama.getText().toString();
            if (rbAtm.isChecked()){
                jenisBayar = rbAtm.getText().toString();
            } else if (rbCash.isChecked()){
                jenisBayar = rbCash.getText().toString();
            } else if (rbCredit.isChecked()){
                jenisBayar = rbCredit.getText().toString();
            }

            total = jumlah*harga;

            Intent intent = new Intent(MainActivity.this,OutputActivity.class);
            intent.putExtra("output","Detail Transaksi : "+
                    "\n-----------------------------"+
                    "\nNama Barang : "+nama+
                    "\nJumlah Beli : "+jumlah+
                    "\nHarga Barang : "+harga+
                    "\nJenis Satuan : "+satuan+
                    "\nJenis Pembayaran : "+jenisBayar+
                    "\nTotal Bayar : "+total);
            startActivity(intent);
        }
    }
}
