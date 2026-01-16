// ToDo: Uncomment the code below to test the data class
//import data_class_example.User
//
//fun main() {
//    val user = User(firstName = "mourad", lastName = "dayef", age = 22)
//    println(user.name)
//    println(user.isAdult)
//}
//
// ToDo: Uncomment the code below to test inheritance using interface
//import inheritance_using_interface_example.Doc
//import inheritance_using_interface_example.Eng
//import inheritance_using_interface_example.Person
//
//fun main() {
//    val users: List<Person> = listOf(
//        Eng(field = "Software", age = 22, firstName = "mourad"),
//        Doc(speciality = "Dental", age = 22, firstName = "ashraf"),
//    )
//    for (user in users) {
//        user.lastName = "dayef"
//        println("----------------------------------------------------------------")
//        println(user.name)
//        println("Is adult: ${user.isAdult}")
//        println(user.work())
//        println(user.introduce())
//    }
//    println("----------------------------------------------------------------")
//}
//
// ToDo: Uncomment the code below to test inheritance using abstract
//import inheritance_using_abstract_example.Doc
//import inheritance_using_abstract_example.Eng
//import inheritance_using_abstract_example.Person
//
//fun main() {
//    val users: List<Person> = listOf(
//        Eng(field = "Software", age = 22, firstName = "mourad"),
//        Doc(speciality = "Dental", age = 22, firstName = "ashraf"),
//    )
//    for (user in users) {
//        user.lastName = "dayef"
//        println("----------------------------------------------------------------")
//        println(user.name)
//        println("Is adult: ${user.isAdult}")
//        println(user.work())
//        println(user.introduce())
//    }
//    println("----------------------------------------------------------------")
//}
//
// ToDo: Uncomment the code below to test inheritance using open
//import inheritance_using_open_example.Doc
//import inheritance_using_open_example.Eng
//import inheritance_using_open_example.Person
//
//fun main() {
//    val users: List<Person> = listOf(
//        Eng(field = "Software", age = 22, firstName = "mourad"),
//        Doc(speciality = "Dental", age = 22, firstName = "ashraf"),
//    )
//    for (user in users) {
//        user.lastName = "dayef"
//        println("----------------------------------------------------------------")
//        println(user.name)
//        println("Is adult: ${user.isAdult}")
//        println(user.work())
//        println(user.introduce())
//    }
//    println("----------------------------------------------------------------")
//}
//
// ToDo: Uncomment the code below to test the enum class
//import enum_class_example.Month
//
//fun main() {
//    val month: Month = selectMonth()
//    println("${month.name}: ${month.title} - ${month.subTitle}\nDescription: ${month.description}")
//}
//
//fun selectMonth(): Month {
//    while (true) {
//        print("Enter month number: ")
//        val monthNumber = readln().trim().toIntOrNull()
//
//        val month = when (monthNumber) {
//            1 -> Month.JAN
//            2 -> Month.FEB
//            3 -> Month.MAR
//            4 -> Month.APR
//            5 -> Month.MAY
//            6 -> Month.JUN
//            7 -> Month.JUL
//            8 -> Month.AUG
//            9 -> Month.SEP
//            10 -> Month.OCT
//            11 -> Month.NOV
//            12 -> Month.DEC
//            else -> null
//        }
//
//        if (month != null) {
//            return month
//        }
//
//        println("Invalid month number, please enter a number between 1 and 12")
//    }
//}