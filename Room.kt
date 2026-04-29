saveBtn.setOnClickListener {
    Thread {
        db.userDao().insert(User(1, "John"))
    }.start()
}
