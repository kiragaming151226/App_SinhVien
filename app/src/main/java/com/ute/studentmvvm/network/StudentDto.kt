package com.ute.studentmvvm.network

import com.google.gson.annotations.SerializedName
import com.ute.studentmvvm.model.Student

/** Data Transfer Object cho JSON trả về từ REST API. */
data class StudentDto(
    @SerializedName("id") val id: Int = 0,
    @SerializedName("full_name") val fullName: String = "",
    @SerializedName("student_code") val studentCode: String = "",
    @SerializedName("email") val email: String = "",
    @SerializedName("gpa") val gpa: Double = 0.0,
    @SerializedName("major") val major: String? = null
)

/** Chuyển DTO (mạng) sang Entity (Room). */
fun StudentDto.toEntity(): Student = Student(
    id = id,
    fullName = fullName,
    studentCode = studentCode,
    email = email,
    gpa = gpa,
    major = major ?: "Công Nghệ Thông Tin"
)
