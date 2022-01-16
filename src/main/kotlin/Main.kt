
fun main() {
    val time: Int = 121// in secounds
    val name = "Oleg"
    agoToText(time)
}

fun agoToText(time: Int) {
    when(time > -1) {
        time <= 1 -> println("Online")
        time < 61 -> println("был(а) в сети только что")
        time < 360 -> showMins(time)          //println("  x   минут назад")
        time < 8640 -> showTime(time)
        time < 17280 -> println("был(а) в сети сегодня")
        time < 25920 -> println("был(а) в сети вчера")
        time > 25920 -> println("был(а) в сети давно")
    }
}

fun showMins(time: Int){
    val minutes = time / 60.toInt()
    val someMins = minutes % 10
    when (minutes < 61){
        someMins == 1 -> println("был(а) в сети $minutes минуту назад")
        someMins == 2 || someMins == 3 || someMins == 4  -> println("был(а) в сети $minutes минуты назад")
        minutes < 61 -> println("был(а) в сети $minutes минут назад")
    }
}

fun showTime(time: Int){
    val hours = time / 360 .toInt()
    val someHours = hours % 10
    when (hours > 0) {
        someHours == 1 -> println("был(а) в сети $hours час назад")
        someHours == 2 || someHours == 3 || someHours == 4 -> println("был(а) в сети $hours часа назад")
        hours > 0 -> println("был(а) в сети $hours часов назад")
    }
}