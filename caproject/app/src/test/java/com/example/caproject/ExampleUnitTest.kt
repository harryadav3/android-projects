package com.example.caproject

import android.util.Log
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    fun my() {
        assertTrue(false);
    }

    fun division() {
        val numerator = 68
        var denominator = 4

        repeat(5) {

            Log.v("","${numerator/denominator}")
            denominator--;
        }
    }
}