package inheritance_using_interface_example

interface Person {
    val age: Int
    var lastName: String
    val jobTitle: String
    val firstName: String

    val isAdult: Boolean get() = age >= 18

    val name: String get() = "${firstName.capitalizeText()} ${lastName.capitalizeText()}".trim()

    fun work(): String {
        return "$name is working as $jobTitle"
    }

    fun introduce(): String {
        return "Hi, my name is $name and I work as $jobTitle"
    }

    fun String.capitalizeText(): String {
        return this.trim().lowercase().replaceFirstChar { it.uppercase() }
    }
}