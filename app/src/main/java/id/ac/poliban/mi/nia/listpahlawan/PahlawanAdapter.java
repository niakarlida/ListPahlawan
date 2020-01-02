package id.ac.poliban.mi.nia.listpahlawan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class PahlawanAdapter extends BaseAdapter {
    private List<Pahlawan> data = new ArrayList<>();

    public PahlawanAdapter(List<Pahlawan> data){
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgPahlawan;
        TextView tvNamaPahlawan;
        TextView tvAsalPahlawan;

        convertView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_pahlawan, parent, false);

        imgPahlawan = convertView.findViewById(R.id.img_pahlawan);
        tvNamaPahlawan = convertView.findViewById(R.id.tv_nama_pahlawan);
        tvAsalPahlawan = convertView.findViewById(R.id.tv_asal_pahlawan);

        Glide.with(parent.getContext())
                .load(data.get(position).getGambarPahlawan())
                .apply(new RequestOptions().override(60, 60))
                .into(imgPahlawan);
        tvNamaPahlawan.setText(data.get(position).getNamaPahlawan());
        tvAsalPahlawan.setText(data.get(position).getAsalPahlawan());

        return convertView;
    }
}
