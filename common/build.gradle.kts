plugins {
	id("com.android.library")
	kotlin("multiplatform")
}

kotlin {
	android {
		compilations.all {
			kotlinOptions {
				jvmTarget = "1.8"
			}
		}
	}
	
	listOf(iosX64(), iosArm64()).forEach {
		it.binaries.framework {
			baseName = "shared"
		}
	}
	
	sourceSets {
		val commonMain by getting {
			dependencies {
				implementation(Deps.kotlinStdlibJdk8)
				implementation(Deps.coroutinesJdk8)
			}
		}
		
		val commonTest by getting {
			dependencies {
				implementation(Deps.kotlinTest)
				implementation(Deps.coroutinesTest)
			}
		}
		
		val androidMain by getting {
			dependencies {
				implementation(Deps.coroutinesAndroid)
			}
		}
		
		// val androidTest by getting
		val iosX64Main by getting
		val iosArm64Main by getting
	}
}

android {
	namespace = "com.aldringames.scjd"
	compileSdk = 33
    defaultConfig {
		minSdk = 21
		targetSdk = 33
	}
}
