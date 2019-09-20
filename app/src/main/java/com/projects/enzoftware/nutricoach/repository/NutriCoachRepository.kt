package com.projects.enzoftware.nutricoach.repository

import com.projects.enzoftware.nutricoach.network.response.LoginResponse

interface NutriCoachRepository {
    fun login(email: String, password: String, callback: NutriCoachCallback<LoginResponse>)
    fun register(
        email: String,
        password: String,
        firstName: String,
        lastName: String,
        callback: NutriCoachCallback<String>
    )
}

interface NutriCoachCallback<in T> {
    fun onSuccess(t: T?)
    fun onError()
}