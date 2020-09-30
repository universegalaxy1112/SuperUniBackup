package com.uni.julio.superplus.viewmodel;

import com.uni.julio.superplus.databinding.ActivityMultiSeasonDetailBinding;
import com.uni.julio.superplus.listeners.EpisodeLoadListener;
import com.uni.julio.superplus.model.Movie;
import com.uni.julio.superplus.model.Serie;

public interface EpisodeDetailsViewModelContract {
    interface View extends Lifecycle.View {

        void onPlaySelected(Movie movie, int fromStart, int seasonPosition);
        void finishActivity();
        void showMovieDetails(Serie movie , int maincategory);

    }

    //this will have methods that the activity/fragment will call from the ViewModel
    interface ViewModel extends Lifecycle.ViewModel {
        void showMovieDetails(Serie movie, ActivityMultiSeasonDetailBinding movieDetailsBinding, int mainCategoryId, EpisodeLoadListener episodeLoadListener);
    }
}