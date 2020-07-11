package br.com.danielsan.jvm

import br.com.danielsan.data.Platform
import br.com.danielsan.data.datasources.GithubUserDataSource
import br.com.danielsan.domain.UserSearchUseCase
import br.com.danielsan.presentation.UserSearchPresenter
import br.com.danielsan.presentation.UserSearchView
import br.com.danielsan.presentation.models.User
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlin.system.exitProcess

class MainView : UserSearchView {
    override fun showUser(user: User) = println(user)
}

suspend fun main(args: Array<String>) = coroutineScope<Unit> {
    println(Platform().getName())

    for (arg in args) {
        println(arg)
    }

    val presenter = UserSearchPresenter(
            UserSearchUseCase(GithubUserDataSource()),
            MainView()
    )

    println("===========================")
    val deferred = async { presenter.onUserToSearch("danielsanfr") }
    println("===========================")

    deferred.await()
    // If you don't use this the application will continue to run because of the use of Coroutines.
    exitProcess(0)
}
