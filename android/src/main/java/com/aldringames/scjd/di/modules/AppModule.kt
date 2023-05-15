package com.aldringames.scjd.di.modules

import android.app.Application
import android.content.Context
import com.aldringames.scjd.App
import com.aldringames.scjd.di.ApplicationContext
import dagger.Module
import dagger.Provides

@Module
class AppModule(private val app: App) {
	@Provides
	fun provideApplication(): Application = app
	
    @ApplicationContext
    @Provides
    fun provideContext(): Context = app
	
}
