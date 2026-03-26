package oop_000000996731_AryakaAlif_week2

import java.util.Scanner

class Student(
    val name: String,
    val nim: String,
    var major: String,
    var gpa: Double = 0.0 // Default Argument
) {

    init {
        // Validasi di dalam class
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }

    // Secondary Constructor (tetap jalan, otomatis pakai gpa = 0.0)
    constructor(name: String, nim: String) : this(name, nim, "Non-Matriculated") {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
    }

    fun displayData() {
        println("Nama   : $name")
        println("NIM    : $nim")
        println("Jurusan: $major")
        println("IPK    : $gpa")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM: ")
    val nim = scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        print("Masukkan IPK (kosongkan jika tidak ada): ")
        val inputGpa = scanner.nextLine()

        val student = if (inputGpa.isEmpty()) {
            Student(name, nim, major) // pakai default gpa = 0.0
        } else {
            Student(name, nim, major, inputGpa.toDouble())
        }

        println("\nData Mahasiswa:")
        student.displayData()
    }
}