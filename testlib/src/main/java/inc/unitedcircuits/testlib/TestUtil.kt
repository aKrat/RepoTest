package inc.unitedcircuits.testlib

import android.util.Log

class TestUtil {
    companion object {
        fun logEvent(event: Event) {
            Log.e(event.type.name, event.message)
        }
    }
}