# 🎟️ Event Ticket Booking System

## 📖 Deskripsi
Program ini dibuat sebagai bagian dari **Tugas 2 Modul 3 - Pemrograman Lanjut**.  
Aplikasi ini berfungsi untuk menampilkan informasi event, harga tiket, dan harga setelah diskon.  
Program juga memungkinkan pelanggan untuk memesan tiket event.

## 🧠 Konsep yang Diterapkan
- **Inheritance (Pewarisan):** `Event` mewarisi atribut dari `BaseEvent`.
- **Interface:** `Ticketable` memastikan bahwa `Event` memiliki method `showEvent()`.
- **Encapsulation:** Atribut di `BaseEvent` dilindungi dengan getter dan setter.
- **Polymorphism:** Method `showEvent()` diimplementasikan secara spesifik di `Event`.

## 🚀 Cara Menjalankan
1. Jalankan file `MainApp.java` di IntelliJ IDEA.
2. Program akan menampilkan detail event dan hasil pemesanan tiket.

## 💻 Contoh Output

````
Event Name: Valorant Championship 
Date: 2025-11-02
Ticket Price: Rp 200000.0
Discounted Price: Rp 170000.0
Raihan booked a ticket for Valorant Championship
Customer: Raihan
Event: Valorant Championship
Date: 2025-11-02