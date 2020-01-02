 package id.ac.poliban.mi.nia.listpahlawan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

 public class MainActivity extends AppCompatActivity {
     private List<Pahlawan> pahlawans = new ArrayList<>();
     private ListView lvPahlawan;
     private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvPahlawan = findViewById(R.id.listview);


       pahlawans.addAll(DataPahlawan.getPahlawans());
        adapter = new PahlawanAdapter(pahlawans);

        lvPahlawan.setAdapter(adapter);

        lvPahlawan.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("Informasi : ")
                    .setMessage(pahlawans.get(position).getDeskripsiPahlawan())
                    .setPositiveButton("OK", null).show();
        });

    }
}
