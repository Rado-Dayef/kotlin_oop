package inheritance_using_interface_example

class Doc(
    override val age: Int,
    val speciality: String,
    override val firstName: String,
    override var lastName: String = "",
    override val jobTitle: String = "Doctor"
) : Person {

    override fun work(): String {
        return "$name is working as *$jobTitle*"
    }

    override fun introduce(): String {
        return "Hi, I'm Dr.$name, specialized in $speciality"
    }
}