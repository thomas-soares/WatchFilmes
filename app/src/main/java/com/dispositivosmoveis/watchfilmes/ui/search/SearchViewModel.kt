package com.dispositivosmoveis.watchfilmes.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dispositivosmoveis.watchfilmes.repository.Repository
import com.dispositivosmoveis.watchfilmes.repository.models.Popular

class SearchViewModel: ViewModel() {

    private var repository: Repository? = null
    private var movies = MutableLiveData<Popular>()

    init {
        repository = Repository()
    }

    fun searchMovie(value: String): LiveData<Popular> {
        movies = repository?.searchMovies(value) as MutableLiveData<Popular>
        return movies
    }
}