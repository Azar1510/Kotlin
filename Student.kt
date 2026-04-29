data class Student(val name: String, val age: Int, val grade: String)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.name)
        val age = findViewById<EditText>(R.id.age)
        val grade = findViewById<EditText>(R.id.grade)
        val result = findViewById<TextView>(R.id.result)

        findViewById<Button>(R.id.showBtn).setOnClickListener {
            val student = Student(name.text.toString(), age.text.toString().toInt(), grade.text.toString())
            result.text = student.toString()
        }
    }
}
