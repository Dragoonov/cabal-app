package com.cabal.app.database.repository

import com.cabal.app.database.entities.User
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppRepository @Inject constructor(
        private val localRepository: LocalRepository,
        private val remoteRepository: FirebaseRepository): Repository {

    private val currentRepository = localRepository

    override fun checkIfUserLoggedIn(id: String): Single<Boolean> = currentRepository.checkIfUserLoggedIn(id)

    override fun getUserById(id: String): Single<User> = currentRepository.getUserById(id)

    override fun updateUser(user: User): Completable = currentRepository.updateUser(user)

    override fun createUser(user: User) = currentRepository.createUser(user)

    fun saveCoordinates(pair: Pair<Double, Double>) {
       // User.loggedUser?.coordinates = doubleArrayOf(pair.first, pair.second)
    }
}