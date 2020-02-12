package com.cabal.app.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.cabal.app.after_register_mvvm.AfterRegisterViewModel
import com.cabal.app.welcome_mvvm.WelcomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(AfterRegisterViewModel::class)
    internal abstract fun postAfterRegisterViewModel(viewModel: AfterRegisterViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(WelcomeViewModel::class)
    internal abstract fun postWelcomeViewModel(viewModel: WelcomeViewModel): ViewModel
}