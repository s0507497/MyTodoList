package com.student.mytodolist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write a message to the database
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("message")

        myRef.setValue("Hello, World!")
    }
}
