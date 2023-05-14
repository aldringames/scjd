package com.aldringames.scjd.di.components

import android.content.Context
import com.aldringames.scjd.App
import com.aldringames.scjd.di.ApplicationContext
import com.aldringames.scjd.di.modules.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
	
	fun inject(app: App)
	
	@ApplicationContext
    fun getApplicationContext(): Context
    
}
