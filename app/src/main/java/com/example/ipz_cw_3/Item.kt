package com.example.ipz_cw_3

class Item(val day: Int, val title: String = "Day $day", description: String = "This is description $day.") {

    val randomImageRes = listOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
    ).random()

}