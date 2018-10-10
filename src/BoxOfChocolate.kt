package choco
import java.util.*

open class RandomBox <T> (private val buffer : ArrayList <T>) {
    fun pickone(): T? {
        if (buffer.size > 0) {
            return buffer.removeAt(Random().nextInt(buffer.size))
        }

        return null
    }
}

