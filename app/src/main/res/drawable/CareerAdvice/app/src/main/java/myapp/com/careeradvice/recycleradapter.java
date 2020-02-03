
package myapp.com.careeradvice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class recycleradapter extends RecyclerView.Adapter<recyclerAdapter.ViewHolder>{

    Context context;
    int resource;
    ArrayList<Model> objects;

    public recycleradapter(Context context, int resource, ArrayList<Model> objects) {
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(resource,parent,false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model mRef = objects.get(position);

        //3. To Set Data on View from Object
        holder.imageView.setBackgroundResource(mRef.getImage());
        holder.txtTopic.setText(mRef.getTopic());
        holder.txtView.setText(mRef.getView());
        holder.c1.setCardBackgroundColor(mRef.getColor());

    }

    @Override
    public int getItemCount() {
        return objects.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
         ImageView imageView;
         TextView txtTopic,txtView;
         CardView c1,c2,c3;

         public ViewHolder(@NonNull View itemView) {
             super(itemView);
             c1=itemView.findViewById(R.id.cardviewone);
             c2=itemView.findViewById(R.id.cardviewtwo);
             c3=itemView.findViewById(R.id.cardviewthree);
             imageView=itemView.findViewById(R.id.imageview);
             txtTopic=itemView.findViewById(R.id.txttopic);
             txtView=itemView.findViewById(R.id.txtview);
         }
     }



}