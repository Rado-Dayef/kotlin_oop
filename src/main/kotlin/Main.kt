/// ToDo: Uncomment the code below to test the data class
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