object Versions {
	const val androidGradle     =  "7.4.2"
	const val kotlin            = "1.8.21"
	const val desugarJdkLibs    =  "2.0.3"
	const val androidxAppcompat =  "1.6.1"
	const val androidxMultidex  =  "2.0.1"
	const val googleMaterial    =  "1.9.0"
	const val dagger            = "2.46.1"
	const val timber            =  "5.0.1"
	const val coroutines        =  "1.7.1"
	const val curtains          =  "1.2.4"
	const val leakcanary        =   "2.10"
}

object Deps {
	const val androidGradle     =                "com.android.tools.build:gradle:${Versions.androidGradle}"
	const val kotlinStdlibJdk8  =              "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
	const val kotlinGradle      =            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
	const val desugarJdkLibs    =           "com.android.tools:desugar_jdk_libs:${Versions.desugarJdkLibs}"
	const val androidxAppcompat =                      "androidx.appcompat:appcompat:${Versions.appcompat}"
	const val androidxMultidex  =                         "androidx.multidex:multidex:${Versions.multidex}"
	const val googleMaterial    =               "com.google.android.material:material:${Versions.material}"
	const val dagger            =                             "com.google.dagger:dagger:${Versions.dagger}"
	const val daggerCompiler    =                    "com.google.dagger:dagger-compiler:${Versions.dagger}"
	const val timber            =                        "com.jakewharton.timber:timber:${Versions.timber}"
	const val coroutinesJdk8    =    "org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:${Versions.coroutines}"
	const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
	const val coroutinesTest    =    "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
	const val curtains          =                     "com.squareup.curtains:curtains:${Versions.curtains}"
	const val leakcanary        =       "com.squareup.leakcanary:leakcanary-android:${Versions.leakcanary}"
}
