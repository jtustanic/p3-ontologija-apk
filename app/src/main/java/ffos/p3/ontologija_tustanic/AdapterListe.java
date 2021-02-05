package ffos.p3.ontologija_tustanic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class AdapterListe extends RecyclerView.Adapter<AdapterListe.Red> {

    private List<Ontologija> podaci;
    private List<Ontologija> podaciTemp;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    public AdapterListe(Context context) {
        this.mInflater = LayoutInflater.from(context);
        podaci = new ArrayList<>();
    }

    @Override
    public Red onCreateViewHolder(ViewGroup roditelj, int viewType) {
        podaciTemp = new ArrayList<>(podaci);
        View view = mInflater.inflate(R.layout.red_liste, roditelj, false);
        return new Red(view);
    }

    @Override
    public void onBindViewHolder(Red red, int position) {

        Ontologija o = podaci.get(position);
        red.ime_nakladnika.setText(o.getIme_nakladnika());
        red.mjesto_izdanja.setText(o.getMjesto_izdanja());
        red.jePreveo.setText(o.getJePreveo());
        red.jePrevedeno.setText(o.getJePrevedeno());
        red.zaradioJe.setText(String.valueOf(o.getZaradioJe()));

    }

    @Override
    public int getItemCount() {
        return podaci==null ? 0 : podaci.size();
    }

    public class Red extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView ime_nakladnika;
        private TextView mjesto_izdanja;
        private TextView jePreveo;
        private TextView jePrevedeno;
        private TextView zaradioJe;

        Red(View itemView) {
            super(itemView);
            ime_nakladnika = itemView.findViewById(R.id.ime_nakladnika);
            mjesto_izdanja = itemView.findViewById(R.id.mjesto_izdanja);
            jePreveo = itemView.findViewById(R.id.jePreveo);
            jePrevedeno = itemView.findViewById(R.id.jePrevedeno);
            zaradioJe = itemView.findViewById(R.id.zaradioJe);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    public Ontologija getItem(int id) {
        return podaci.get(id);
    }

    public void setPodaci(List<Ontologija> itemList) {
        this.podaci = itemList;
    }

    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

}
