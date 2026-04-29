class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = "Welcome to Android!"
        val num = 10

        val tv = findViewById<TextView>(R.id.textView)

        if (num > 5) {
            tv.text = message
        } else {
            tv.text = "Number too small"
        }
    }
}
