package oop_000000996731_AryakaAlif_week2

import java.util.Scanner

class Student(val name: String, val nim: String, val major: String) {

    init {
        // Validasi di dalam class
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }

    fun displayData() {
        println("Nama   : $name")
        println("NIM    : $nim")
        println("Jurusan: $major")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM: ")
    val nim = scanner.nextLine()

    // Validasi di sisi pemanggil (Main)
    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        val student = Student(name, nim, major)
        println("\nData Mahasiswa:")
        student.displayData()
    }
}