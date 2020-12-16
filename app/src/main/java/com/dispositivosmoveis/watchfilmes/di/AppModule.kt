package com.dispositivosmoveis.watchfilmes.di

import com.dispositivosmoveis.watchfilmes.ui.categoryFilms.CategoryFilmsViewModel
import com.dispositivosmoveis.watchfilmes.ui.detail.MovieDetailViewModel
import com.dispositivosmoveis.watchfilmes.ui.home.HomeViewModel
import com.dispositivosmoveis.watchfilmes.ui.login.LoginViewModel
import com.dispositivosmoveis.watchfilmes.ui.search.SearchViewModel
import com.dispositivosmoveis.watchfilmes.ui.splash.SplashViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel {
        SplashViewModel()
    }

    viewModel {
        LoginViewModel(context = androidContext())
    }

    viewModel {
        HomeViewModel()
    }

    viewModel {
        MovieDetailViewModel()
    }

    viewModel {
        CategoryFilmsViewModel()
    }

    viewModel {
        SearchViewModel()
    }
}