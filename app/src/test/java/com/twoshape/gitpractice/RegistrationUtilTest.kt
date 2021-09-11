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

    @Test
    fun `fib of 0 return 0 return true`(){
        val result = RegistrationUtil.fib(0)

        assertThat(result).isEqualTo(0L)
    }

    @Test
    fun `fib of 1 return 1 return true`(){
        val result = RegistrationUtil.fib(1)

        assertThat(result).isEqualTo(1L)
    }

    @Test
    fun `fib of n return fib(n-1) + fib(n-2) return true`(){

        val n = 500000000
        val result_n = RegistrationUtil.fib(n)
        val result_1 = RegistrationUtil.fib(n-1)
        val result_2 = RegistrationUtil.fib(n-2)

        assertThat(result_n).isEqualTo(result_1+result_2)
    }

}