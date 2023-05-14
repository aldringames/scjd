package com.aldringames.scjd

import android.content.Context
import androidx.annotation.NonNull;
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.aldringames.scjd.di.components.AppComponent
import com.aldringames.scjd.di.components.DaggerAppComponent
import com.aldringames.scjd.di.modules.AppModule
import curtains.Curtains
import curtains.OnKeyEventListener
import curtains.OnRootViewsChangedListener
import curtains.OnTouchEventListener
import curtains.keyEventInterceptors
import curtains.phoneWindow
import curtains.touchEventInterceptors
import curtains.windowAttachCount
import curtains.windowType
import curtains.wrappedCallback
import timber.log.Timber

class App : MultiDexApplication() {
	private var TAG: String? = App::class.java.name
	//private var app: App
	private lateinit var appComponent: AppComponent
	
	/* companion object {
		@NonNull
		@JvmStatic
		fun getInstance(): App {
			return null
		}
	} */
	
	override fun onCreate() {
		super.onCreate()
		
		if (BuildConfig.DEBUG) {
			Timber.plant(Timber.DebugTree())
		}
		
		appComponent = DaggerAppComponent.builder()
		    .appModule(AppModule(this))
		    .build()
		appComponent.inject(this)
		
		Curtains.onRootViewsChangedListeners += OnRootViewsChangedListener { view, added ->
			val verb = if (added) "added" else "removed"
			Timber.d(TAG, "Root view: $verb ${view.windowType} ${view.phoneWindow} ${ view.phoneWindow?.callback.wrappedCallback}  $view")
			if (added) {
				view.phoneWindow?.let { window ->
					if (view.windowAttachCount == 0) {
						window.touchEventInterceptors += OnTouchEventListener { motionEvent ->
							Timber.d(TAG, "$window received $motionEvent")
						}
						window.keyEventInterceptors += OnKeyEventListener { keyEvent ->
							Timber.d(TAG, "$window received $keyEvent")
						}
					}
				}
			}
		}
	}
	
	override fun attachBaseContext(base: Context) {
		super.attachBaseContext(base)
		MultiDex.install(base)
	}
}
