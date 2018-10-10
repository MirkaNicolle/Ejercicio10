package choco

class ForrestGump <T> (val life : RandomBox <T>) {
    var isRunning: Boolean = false
    fun runForrest() {
        isRunning = true
    }

    fun sayTheLineForrest(): String {
        val picked = life.pickone()

        if (picked == null) {
            return "Life sucks :("
        }

        return "Life is like a box of chocolates: \n$picked"
    }
}
