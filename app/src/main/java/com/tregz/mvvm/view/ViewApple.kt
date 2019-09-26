package com.tregz.mvvm.view

import com.tregz.mvvm.data.DataApple

interface ViewApple {

    fun onAppleCreated(apple: DataApple, listSize: Int, setSize: Int)

}