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

    // ... (setelah input NIM dan validasi panjang NIM) ...

    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine() // Consume newline

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        // Memanggil Primary Constructor
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

    } else if (type == 2) {
        // Memanggil Secondary Constructor, jurusan otomatis "Non-Matriculated"
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")

    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }
}

