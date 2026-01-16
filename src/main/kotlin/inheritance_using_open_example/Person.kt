package inheritance_using_open_example

open class Person {
    open val age: Int = 0
    open var lastName: String = ""
    open val jobTitle: String = ""
    open val firstName: String = ""

    val isAdult: Boolean get() = age >= 18

    val name: String get() = "${firstName.capitalizeText()} ${lastName.capitalizeText()}".trim()

    open fun work(): String {
        return "$name is working as $jobTitle"
    }

    open fun introduce(): String {
        return "Hi, my name is $name and I work as $jobTitle"
    }

    fun String.capitalizeText(): String {
        return this.trim().lowercase().replaceFirstChar { it.uppercase() }
    }
}