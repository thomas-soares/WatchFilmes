package com.dispositivosmoveis.watchfilmes

import android.app.Application
import com.dispositivosmoveis.watchfilmes.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class AppApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@AppApplication)
            modules(appModule)
        }
    }
}