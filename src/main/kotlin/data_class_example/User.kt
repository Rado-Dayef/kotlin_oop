package data_class_example

data class User(val age: Int, val firstName: String, val lastName: String) {

    val isAdult: Boolean = age < 18

    val name: String = "${firstName.capitalizeText()} ${lastName.capitalizeText()}".trim()

    fun String.capitalizeText(): String {
        return this.trim().lowercase().replaceFirstChar { it.uppercase() }
    }
}