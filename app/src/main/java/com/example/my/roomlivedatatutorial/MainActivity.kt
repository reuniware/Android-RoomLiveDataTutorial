package com.example.my.roomlivedatatutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get data access object (for accessing data in database)
        var userDao = AppDatabase.getDatabase(applicationContext).getUserDao()

        var userViewModel = UserViewModel(application)
        userViewModel.getAllUsers().observe(this, Observer<List<User>>() {
            editText.setText(editText.text.toString() + " observer : nb records = " + userDao.getAllUsers().size + " ; ")
        })

        button2.setOnClickListener {
            Toast.makeText(applicationContext, "Processing", Toast.LENGTH_SHORT).show()

            var users: List<User> = userDao.getAllUsers()

            editText.setText(editText.text.toString() + " Inserting new user ; ")
            var nbUsers = users.size
            editText.setText(editText.text.toString() + "nb users in db = " + nbUsers + " ; ")


            var newUser = User(0,"testFirstName","testLastName")
            userDao.insertUsers(newUser)
        }

    }
}
