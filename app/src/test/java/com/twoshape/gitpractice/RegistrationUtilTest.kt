package com.twoshape.gitpractice

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{


    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Atiq",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Curl",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Atiq",
            "",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password and confirmed password repeated incorrectly returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Atiq",
            "abc",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than two digits returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Atiq",
            "abc1",
            "abc1"
        )

        assertThat(result).isFalse()
    }

}