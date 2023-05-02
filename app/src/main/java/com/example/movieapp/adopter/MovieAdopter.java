package com.example.movieapp.adopter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;


import com.example.movieapp.R;
import com.example.movieapp.model.MovieModel;

import java.util.List;

    public class MovieAdopter extends RecyclerView.Adapter<MovieAdopter.MovieViewHolder> {


        private List<MovieModel> movieModelList;

        public MovieAdopter(List<MovieModel> MovieModelList) {

            this.movieModelList = MovieModelList;


        }


        @NonNull
        @Override
        public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
            return new MovieViewHolder(view);
        }


        @Override
        public void onBindViewHolder(@NonNull MovieAdopter.MovieViewHolder holder, int position) {



      /*      MovieModel daysModel=movieModelList.get(position);

          Glide
                  .with(holder.itemView.getContext())
                  .load(daysModel.getImageUrl())
                    .centerCrop()
                    .placeholder(R.drawable.workout)
                    .into(holder.dayCard);*/

            //  holder.movieWork.setText(MovieModel.getMovieName());

        }

        @Override
        public int getItemCount () {
              return movieModelList.size();

        }

        public class MovieViewHolder extends RecyclerView.ViewHolder {



            public MovieViewHolder(@NonNull View itemView) {
                super(itemView);


            }

        }

    }

