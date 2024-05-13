package com.example.wazitoecommerce.data

import android.app.ProgressDialog
import android.content.Context
import android.widget.Toast
import androidx.navigation.NavHostController
import com.example.wazitoecommerce.models.User
import com.example.wazitoecommerce.navigation.ROUT_ADDPRODUCT
import com.example.wazitoecommerce.navigation.ROUT_HOME
import com.example.wazitoecommerce.navigation.ROUT_LOGIN
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class AuthViewModel(var navController:NavHostController, var context:Context) {
    val mAuth:FirebaseAuth
    val progress:ProgressDialog

    init {
        mAuth = FirebaseAuth.getInstance()
        progress = ProgressDialog(context)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")
    }
    fun signup(name:String, email:String, password:String){
        progress.show()
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
            var userId = mAuth.currentUser!!.uid
            var userProfile = User(name, email, password, userId)
            // Create a reference table called Users inside of the Firebase database
            var usersRef = FirebaseDatabase.getInstance().getReference()
                                    .child("Users/$userId")
            usersRef.setValue(userProfile).addOnCompleteListener {
                progress.dismiss()
                if (it.isSuccessful){
                    Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                    navController.navigate(ROUT_LOGIN)
                }else{
                    Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    fun login(email: String, password: String){
        progress.show()
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
            progress.dismiss()
            if (it.isSuccessful){
                Toast.makeText(this.context, "Success", Toast.LENGTH_SHORT).show()
                navController.navigate(ROUT_ADDPRODUCT)
            }else{
                Toast.makeText(this.context, "Error", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun logout(){
        mAuth.signOut()
        navController.navigate(ROUT_LOGIN)
    }

    fun isLoggedIn(): Boolean = mAuth.currentUser != null
}