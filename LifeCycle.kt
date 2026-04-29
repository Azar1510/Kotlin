val tv = findViewById<TextView>(R.id.textView)

override fun onResume() {
    super.onResume()
    tv.text = "onResume"
}
