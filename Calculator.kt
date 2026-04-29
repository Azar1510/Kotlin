class MainActivity : AppCompatActivity() {

    fun add(a: Double, b: Double) = a + b
    fun sub(a: Double, b: Double) = a - b
    fun mul(a: Double, b: Double) = a * b
    fun div(a: Double, b: Double) = a / b

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n1 = findViewById<EditText>(R.id.num1)
        val n2 = findViewById<EditText>(R.id.num2)
        val result = findViewById<TextView>(R.id.result)

        findViewById<Button>(R.id.addBtn).setOnClickListener {
            result.text = add(n1.text.toString().toDouble(), n2.text.toString().toDouble()).toString()
        }

        findViewById<Button>(R.id.subBtn).setOnClickListener {
            result.text = sub(n1.text.toString().toDouble(), n2.text.toString().toDouble()).toString()
        }

        findViewById<Button>(R.id.mulBtn).setOnClickListener {
            result.text = mul(n1.text.toString().toDouble(), n2.text.toString().toDouble()).toString()
        }

        findViewById<Button>(R.id.divBtn).setOnClickListener {
            result.text = div(n1.text.toString().toDouble(), n2.text.toString().toDouble()).toString()
        }
    }
}
