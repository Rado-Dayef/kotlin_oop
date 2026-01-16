package inheritance_using_abstract_example

abstract class Person {
    abstract val age: Int
    abstract var lastName: String
    abstract val jobTitle: String
    abstract val firstName: String

    val isAdult: Boolean get() = age >= 18

    val name: String get() = "${firstName.capitalizeText()} ${lastName.capitalizeText()}".trim()

    fun work(): String {
        return "$name is working as $jobTitle"
    }

    abstract fun introduce(): String

    fun String.capitalizeText(): String {
        return this.trim().lowercase().replaceFirstChar { it.uppercase() }
    }
}