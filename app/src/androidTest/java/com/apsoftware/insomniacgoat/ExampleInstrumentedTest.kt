package com.apsoftware.insomniacgoat

import androidx.test.platform.app.InstrumentationRegistry

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.runners.JUnit4

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(JUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        var appContext = InstrumentationRegistry.getInstrumentation().context
        assertEquals("com.apsoftware.insomniacgoat", appContext.packageName)
    }
}
