package inheritance_using_abstract_example

class Eng(
    val field: String,
    override val age: Int,
    override val firstName: String,
    override var lastName: String = "",
    override val jobTitle: String = "Engineer"
) : Person() {

    override fun introduce(): String {
        return "Hi, I'm Eng.$name, specialized in $field"
    }
}