import java.awt.event.KeyEvent

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main(args: Array<String>) {
    println("Welcome to Mobile Application Development (MAP711S)!");

    //Program II
    fun converter(Celsius: Int, Fahrenheit: Double = 2.8) {
        println("Fahrenheit: "+ Celsius * Fahrenheit);
    };
    //Calling the coverter func
    converter(32);

    //Program III
    var i = 0;
    while( i <= 20){
        println("*".repeat(i));
        i++;
    };

    //Program IV
    val disciples = listOf("Peter", "Andrew", "James", "John", "Philip", "Bartholomew", "Thomas", "Mathew", "Judas");
    for (disciple in disciples) {
        var count = 0;
        if(disciple == "Judas"){
            count++;
            println(count);
        };
    };
    //Program V
    class wheel(airtime: Int){
        var spins: Int = 0;
        val voucher = airtime;


        fun setSpins(){
            when(voucher){
                5 -> spins = 1;
                10 -> spins = 2;
                20 -> spins = 3;
                50 -> spins = 5;
            }
        };
        fun spin(): Int{
            var num = (1..5).random();
            spins -= 1;
            if (num == 1){
                println("Outcome: "+num+", Congradurations you're eligible to participate in the live draw!!")
            }else{
                println("Outcome: "+num+", Oops try spin again :-()");
            };
            return num;
        }
    }
    val wheel1 = wheel(20);
    wheel1.setSpins()
    wheel1.spin()
//    println("===PRESS 'ENTER' TO SPIN===");
//    fun onKeyUp(keyCode: Int, event: KeyEvent): Boolean{
//        return when (keycode) {
//            KeyEvent.KEYCODE_ENTER -> {
//                if(wheel1.spins !== 0){
//                    wheel1.spin()
//                }
//                true
//            }
//        }
//    }
}


