lifecycleScope.launch {
    val data = api.getPosts()
    dataView.text = data.toString()
}
