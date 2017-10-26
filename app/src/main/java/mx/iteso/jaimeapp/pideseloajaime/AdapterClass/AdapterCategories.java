package mx.iteso.jaimeapp.pideseloajaime.AdapterClass;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import mx.iteso.jaimeapp.pideseloajaime.Beans.Categories;
import mx.iteso.jaimeapp.pideseloajaime.R;

/**
 * Created by Alex Mora on 26/10/2017.
 */

public class AdapterCategories extends RecyclerView.Adapter<AdapterCategories.ViewHolder> implements View.OnClickListener{
    private ArrayList<Categories> dataSet;
    private Context context;

    public AdapterCategories(Context context, ArrayList<Categories> dataSet){
        this.dataSet = dataSet;
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categories, parent, false);
        ViewHolder mviewHolder = new ViewHolder(view);
        return mviewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.categoryImage.setImageResource(R.drawable.vodka);
        holder.categoryName.setText(dataSet.get(position).getCategoryName());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public void onClick(View view){
       // Intent intent = new Intent(context, Activity.class);
       // context.startActivity(intent);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView categoryImage;
        public TextView categoryName;

        public ViewHolder(View itemView) {
            super(itemView);

            categoryImage = (ImageView) itemView.findViewById(R.id.fragment_imageCategory);
            categoryName = (TextView) itemView.findViewById(R.id.fragment_textCategory);

        }
    }
}