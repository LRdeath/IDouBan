package io.github.weizc.idouban.movies;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import io.github.weizc.idouban.HomeActivity;
import io.github.weizc.idouban.R;
import io.github.weizc.idouban.model.HotMoviesData;
import io.github.weizc.idouban.model.IDouBanManager;
import io.github.weizc.idouban.model.IDouBanService;
import io.github.weizc.idouban.model.Movie;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends Fragment {
    private List<Movie> movies;
    private RecyclerView mRecyclerView;

    public MoviesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        loadMoves(new Callback<HotMoviesData>() {
            @Override
            public void onResponse(Call<HotMoviesData> call, Response<HotMoviesData> response) {
                Log.d(HomeActivity.TAG,"onResponse ---- ThreadId:"+Thread.currentThread().getId());
                movies = response.body().getMovies();
                for (Movie movie : movies) {
                    Log.d(HomeActivity.TAG,"\n"+ movie.getTitle());
                }
            }

            @Override
            public void onFailure(Call<HotMoviesData> call, Throwable t) {
                Log.d(HomeActivity.TAG,"onFailure ---- ThreadId:"+Thread.currentThread().getId()+
                        "\nError:"+t.getMessage());
            }
        });

    }

    private void loadMoves(Callback<HotMoviesData> callback) {
        IDouBanService iDouBanService = IDouBanManager.getiDouBanService();
        iDouBanService.searchHotMovesData().enqueue(callback);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_movies, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.rv_movie);
        MoviesAdapter adapter = new MoviesAdapter()
        return view;
    }
    //movie's adapter and Holder
    static class MoviesAdapter extends RecyclerView.Adapter<MoviesHolder>{
        private List<Movie> moves;
        private Context context;
        private int layoutid;

        public MoviesAdapter(List<Movie> moves, int layoutid, Context context) {
            this.moves = moves;
            this.layoutid = layoutid;
            this.context = context;
        }


        @Override
        public MoviesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(MoviesHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return moves.size();
        }
    }

    private static class MoviesHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public MoviesHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
