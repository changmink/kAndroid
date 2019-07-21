package dev.changmin.android.kotlin.simplepuzzle

import android.content.Context
import android.widget.ImageButton

class ChangeImageButton(context: Context?) : ImageButton(context) {
    var state: Int = 0
    lateinit var imageList : List<Int>

    constructor(context: Context?, imageList:List<Int>) : this(context) {
        this.imageList = imageList
    }

}