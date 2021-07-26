package by.slavintodron.androidintership_1.model.tests

import kotlin.random.Random

class TestFile(){
    val data: ByteArray? = ByteArray(500) { Random.nextInt(255).toByte() }

    fun getFileSize(): Int? {
        return data?.size
    }
}