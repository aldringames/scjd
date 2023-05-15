package com.aldringames.scjd.di

import javax.inject.Scope
import kotlin.reflect.KClass

abstract class AppScope private constructor()

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class SingleIn(val value: KClass<*>)
