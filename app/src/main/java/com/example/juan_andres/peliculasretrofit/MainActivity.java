package com.example.juan_andres.peliculasretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    PeliculasService apiInterface;
    TextView  responseTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInterface = APIClient.getClient().create(PeliculasService.class);
        responseTextView=(TextView) findViewById(R.id.resultados);
        /**
         GET List Resources
         **/
        Call call = apiInterface.getListPeliculas();
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {

                List<Peliculas> resource = (List<Peliculas>) response.body();
                Log.d("TAG",response.code()+"");
                responseTextView.setText(resource.toString());
  Toast.makeText(getApplicationContext(), response.toString(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call call, Throwable t) {
                Log.d("TAG",t.getMessage()+"");
                call.cancel();
            }
        });


    }
}
