package br.com.danielsan.node

import br.com.danielsan.data.datasources.GithubUserDataSource
import br.com.danielsan.data.Platform
import br.com.danielsan.domain.UserSearchUseCase
import br.com.danielsan.presentation.UserSearchPresenter
import br.com.danielsan.presentation.UserSearchView
import br.com.danielsan.presentation.models.User
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import sorted

class MainView : UserSearchView {
    override fun showUser(user: User) = println(user)
}

suspend fun main(args: Array<String>) = coroutineScope {
    println(Platform().getName())

    for (arg in args) {
        println(arg)
    }

    println(sorted(arrayOf(1, 2, 3)))
    println(sorted(arrayOf(3, 1, 2)))

    val presenter = UserSearchPresenter(
        UserSearchUseCase(GithubUserDataSource()),
        MainView()
    )

    println("===========================")
    val deferred = async { presenter.onUserToSearch("danielsanfr") }
    println("===========================")

    deferred.await()
}
