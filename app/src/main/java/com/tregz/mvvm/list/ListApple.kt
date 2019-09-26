package com.tregz.mvvm.list

import com.tregz.mvvm.data.DataApple
import com.tregz.mvvm.view.ViewApple

class ListApple(private val view: ViewApple) {

    private val list = mutableListOf<DataApple>()
    private val set = mutableSetOf<DataApple>()
    private val map = mutableMapOf<Int, DataApple>()

    fun add(apple: DataApple) {
        list.add(apple)
        set.add(apple)
        map[map.size] = apple
        view.onAppleCreated(apple, list.size, set.size)
    }

}