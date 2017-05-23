package io.github.weizc.idouban.movies;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import io.github.weizc.idouban.R;
import io.github.weizc.idouban.model.Movie;

/**
 * Created by Vzc on 2017/5/23.
 */

public class DetailMovieActivity extends Activity{
    private Movie movie;
    private ImageView imageView;
    private TextView name;
    private TextView o_name;
    private TextView artist;
    private TextView director;
    private TextView time;
    private TextView genre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);
        Intent intent = getIntent();
        movie = (Movie) intent.getSerializableExtra("movie");
        imageView = (ImageView) findViewById(R.id.detail_img);
        Picasso.with(this)
                .load(movie.getImages().getLarge())
                .placeholder(R.mipmap.ic_launcher)
                .into(imageView);
        name = (TextView) findViewById(R.id.detail_name);
        name.setText(movie.getTitle());
        o_name = (TextView) findViewById(R.id.detail_other_name);
        o_name.setText(movie.getTitle());
        artist = (TextView) findViewById(R.id.detail_artist);
        List<Movie.CastsBean> artists = movie.getCasts();
        String s ="";
        for (Movie.CastsBean art :
                artists) {
            s+=" "+art.getName();
        }
        artist.setText(s);
        List<Movie.DirectorsBean> dirs = movie.getDirectors();
        s ="";
        for (Movie.DirectorsBean dir :
                dirs) {
            s+=" "+dir.getName();
        }
        director = (TextView) findViewById(R.id.detail_director);
        director.setText(s);
        time = (TextView) findViewById(R.id.detail_time);
        time.setText(movie.getYear());
        genre = (TextView) findViewById(R.id.detail_genre);
        genre.setText(movie.getGenres().toString());

    }
}
