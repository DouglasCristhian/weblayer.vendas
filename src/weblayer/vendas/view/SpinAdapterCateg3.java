package weblayer.vendas.view;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class SpinAdapterCateg3 extends ArrayAdapter<weblayer.vendas.DTO.Categ3DTO>{

    private Context context;
    private weblayer.vendas.DTO.Categ3DTO[] values;

    public SpinAdapterCateg3(Context context, int textViewResourceId, weblayer.vendas.DTO.Categ3DTO[] values) {
        super(context, textViewResourceId, values);
        this.context = context;
        this.values = values;
    }

    public int getCount(){
       return values.length;
    }

    public weblayer.vendas.DTO.Categ3DTO getItem(int position){
       return values[position];
    }

    public long getItemId(int position){
       return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView label = new TextView(context);
        label.setTextColor(Color.BLACK);
        label.setText(values[position].getds_nome());
        return label;
    }

    @Override
    public View getDropDownView(int position, View convertView,
            ViewGroup parent) {
        TextView label = new TextView(context);
        label.setTextColor(Color.BLACK);
        label.setText(values[position].getds_nome());
        return label;
    }
}