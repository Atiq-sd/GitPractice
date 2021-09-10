package com.twoshape.gitpractice

object RegistrationUtil {

    val exixtingUsers = listOf("Peter","Curl")

    /**
     * the input is not valid if....
     * ...the username/password is empty
     * ...the username is already taken
     * ...the confirmed password is not the same as the real password
     * ...the password contains less than two digits
     */

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        return true
    }



}