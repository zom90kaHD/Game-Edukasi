package com.example.kelompok6_aplikasigameedukasi_4psi1;

import java.util.ArrayList;
import java.util.List;

public class QuestionRepository {
    public static List<Question> getQuestions(String level, String subject) {
        List<Question> list = new ArrayList<>();
        
        if (level.equals("SD")) {
            switch (subject) {
                case "IPA":
                    list.add(new Question("Bagian tumbuhan yang berfungsi menyerap air dan mineral dari tanah adalah...", new String[]{"Batang", "Daun", "Akar", "Bunga"}, 2, "Akar berfungsi untuk menyerap air dan zat hara dari dalam tanah agar tumbuhan bisa tumbuh."));
                    list.add(new Question("Hewan yang memakan tumbuhan saja disebut...", new String[]{"Karnivora", "Herbivora", "Omnivora", "Insektivora"}, 1, "Herbivora adalah hewan pemakan tumbuhan seperti sapi, kambing, dan jerapah."));
                    list.add(new Question("Planet terbesar dalam tata surya kita adalah...", new String[]{"Bumi", "Mars", "Yupiter", "Saturnus"}, 2, "Yupiter merupakan planet terbesar di tata surya kita, ukurannya jauh lebih besar dari Bumi."));
                    list.add(new Question("Perubahan wujud dari padat menjadi cair disebut...", new String[]{"Mencair", "Membeku", "Menguap", "Menyublim"}, 0, "Mencair adalah proses perubahan wujud benda dari padat menjadi cair karena panas."));
                    list.add(new Question("Alat pernapasan pada ikan adalah...", new String[]{"Paru-paru", "Kulit", "Trakea", "Insang"}, 3, "Ikan bernapas menggunakan insang untuk mengambil oksigen yang terlarut di dalam air."));
                    list.add(new Question("Sumber energi terbesar bagi bumi adalah...", new String[]{"Bulan", "Bintang", "Matahari", "Api"}, 2, "Matahari adalah sumber energi panas dan cahaya utama yang menerangi dan menghangatkan bumi."));
                    list.add(new Question("Zat hijau daun pada tumbuhan disebut...", new String[]{"Stomata", "Klorofil", "Kambium", "Oksigen"}, 1, "Klorofil berfungsi untuk menangkap energi cahaya matahari dalam proses fotosintesis."));
                    list.add(new Question("Benda yang dapat ditarik magnet disebut...", new String[]{"Magnetis", "Non-magnetis", "Isolator", "Konduktor"}, 0, "Benda magnetis adalah benda yang dapat ditarik oleh magnet, biasanya terbuat dari besi atau baja."));
                    list.add(new Question("Kelompok hewan yang hidup di air dan di darat disebut...", new String[]{"Reptil", "Amfibi", "Mamalia", "Aves"}, 1, "Amfibi adalah hewan yang dapat hidup di dua alam, contohnya adalah katak."));
                    list.add(new Question("Urutan siklus air yang benar adalah...", new String[]{"Hujan-Uap-Awan", "Uap-Awan-Hujan", "Awan-Hujan-Uap", "Uap-Hujan-Awan"}, 1, "Siklus air dimulai dari penguapan (uap), pembentukan awan (kondensasi), lalu jatuh sebagai hujan."));
                    list.add(new Question("Tulang pelindung otak disebut...", new String[]{"Tulang Rusuk", "Tulang Panggul", "Tulang Tengkorak", "Tulang Belakang"}, 2, "Tengkorak berfungsi melindungi organ vital manusia yaitu otak dari benturan."));
                    list.add(new Question("Contoh hewan yang mengalami metamorfosis sempurna adalah...", new String[]{"Kecoa", "Belalang", "Kupu-kupu", "Kucing"}, 2, "Kupu-kupu mengalami tahap telur, ulat, kepompong, dan dewasa secara lengkap."));
                    list.add(new Question("Benda padat memiliki sifat...", new String[]{"Bentuk berubah", "Bentuk tetap", "Mengalir", "Menguap"}, 1, "Benda padat memiliki bentuk dan volume yang tetap meskipun dipindahkan tempatnya."));
                    list.add(new Question("Vitamin yang bagus untuk kesehatan mata adalah...", new String[]{"Vitamin A", "Vitamin B", "Vitamin C", "Vitamin D"}, 0, "Vitamin A sangat penting untuk menjaga fungsi penglihatan mata kita."));
                    list.add(new Question("Penyakit akibat kekurangan vitamin C adalah...", new String[]{"Rakhitis", "Sariawan", "Anemia", "Rabun Ayam"}, 1, "Sariawan adalah luka di mulut yang disebabkan salah satunya oleh kekurangan vitamin C."));
                    list.add(new Question("Alat untuk mengukur suhu adalah...", new String[]{"Barometer", "Termometer", "Anemometer", "Mikrometer"}, 1, "Termometer digunakan untuk mengukur derajat panas atau suhu suatu benda atau ruangan."));
                    list.add(new Question("Planet yang dijuluki planet merah adalah...", new String[]{"Venus", "Mars", "Merkurius", "Saturnus"}, 1, "Mars tampak kemerahan dari jauh karena permukaan tanahnya mengandung banyak besi oksida."));
                    list.add(new Question("Bunyi dihasilkan oleh benda yang...", new String[]{"Diam", "Bergerak", "Bergetar", "Panas"}, 2, "Setiap benda yang bergetar akan menghasilkan getaran udara yang kita dengar sebagai bunyi."));
                    list.add(new Question("Tumbuhan putri malu menutup daunnya saat disentuh karena...", new String[]{"Butuh makan", "Bergerak bebas", "Peka rangsang", "Bernapas"}, 2, "Ini disebut iritabilitas, yaitu kemampuan makhluk hidup untuk menanggapi rangsangan dari luar."));
                    list.add(new Question("Bagian mata yang mengatur cahaya masuk adalah...", new String[]{"Retina", "Lensa", "Pupil", "Kornea"}, 2, "Pupil adalah lubang hitam di tengah mata yang mengatur besar kecilnya cahaya yang masuk."));
                    break;
                case "IPS":
                    list.add(new Question("Ibu kota negara Indonesia adalah...", new String[]{"Surabaya", "Bandung", "Jakarta", "Medan"}, 2, "Jakarta adalah pusat pemerintahan dan ibu kota Negara Kesatuan Republik Indonesia saat ini."));
                    list.add(new Question("Candi Borobudur terletak di provinsi...", new String[]{"Jawa Barat", "Jawa Tengah", "Jawa Timur", "Bali"}, 1, "Candi Borobudur terletak di Kabupaten Magelang, Provinsi Jawa Tengah."));
                    list.add(new Question("Lagu kebangsaan Indonesia Raya diciptakan oleh...", new String[]{"W.R. Supratman", "C. Simanjuntak", "Ismail Marzuki", "Ibu Sud"}, 0, "Wage Rudolf Supratman menciptakan lagu kebangsaan Indonesia Raya."));
                    list.add(new Question("Pahlawan Bapak Pendidikan Nasional adalah...", new String[]{"Ir. Soekarno", "Ki Hajar Dewantara", "Moh. Hatta", "Jenderal Sudirman"}, 1, "Ki Hajar Dewantara berjasa besar dalam dunia pendidikan dan mendirikan Perguruan Taman Siswa."));
                    list.add(new Question("Mata uang negara Indonesia adalah...", new String[]{"Dolar", "Ringgit", "Rupiah", "Yen"}, 2, "Rupiah adalah mata uang resmi yang digunakan dalam transaksi di seluruh wilayah Indonesia."));
                    list.add(new Question("Samudra yang mengapit wilayah Indonesia adalah...", new String[]{"Hindia & Pasifik", "Hindia & Atlantik", "Pasifik & Atlantik", "Arktik & Pasifik"}, 0, "Letak geografis Indonesia berada di antara Samudra Hindia dan Samudra Pasifik."));
                    list.add(new Question("Negara tetangga yang berbatasan darat dengan Kalimantan adalah...", new String[]{"Singapura", "Thailand", "Malaysia", "Filipina"}, 2, "Indonesia berbagi daratan dengan Malaysia (Sarawak dan Sabah) di Pulau Kalimantan."));
                    list.add(new Question("Suku Minangkabau berasal dari provinsi...", new String[]{"Sumatera Utara", "Sumatera Barat", "Riau", "Jambi"}, 1, "Suku Minangkabau merupakan kelompok etnis yang berasal dari dataran tinggi Sumatera Barat."));
                    list.add(new Question("Rumah adat daerah Papua disebut...", new String[]{"Joglo", "Gadang", "Honai", "Limas"}, 2, "Honai adalah rumah adat berbentuk lingkaran dengan atap jerami khas masyarakat di pegunungan Papua."));
                    list.add(new Question("Hari kemerdekaan Indonesia diperingati setiap tanggal...", new String[]{"17 Agustus", "1 Juni", "20 Mei", "10 November"}, 0, "Indonesia memproklamasikan kemerdekaannya dari penjajahan pada tanggal 17 Agustus 1945."));
                    list.add(new Question("Semboyan negara Indonesia adalah...", new String[]{"Tut Wuri Handayani", "Bhinneka Tunggal Ika", "Maju Tak Gentar", "Pancasila"}, 1, "Bhinneka Tunggal Ika berarti berbeda-beda tetapi tetap satu jua, melambangkan persatuan bangsa."));
                    list.add(new Question("Garis khayal yang membelah bumi menjadi utara dan selatan disebut...", new String[]{"Garis Bujur", "Garis Lintang", "Garis Khatulistiwa", "Garis Meridiant"}, 2, "Garis khatulistiwa atau ekuator membagi bumi menjadi dua bagian sama besar secara horizontal."));
                    list.add(new Question("Benua terkecil di dunia adalah...", new String[]{"Asia", "Eropa", "Afrika", "Australia"}, 3, "Australia adalah benua terkecil sekaligus wilayahnya merupakan satu negara."));
                    list.add(new Question("Provinsi di ujung paling barat Indonesia adalah...", new String[]{"Papua", "Aceh", "Riau", "Banten"}, 1, "Aceh terletak di ujung utara dan barat Pulau Sumatera, gerbang barat Indonesia."));
                    list.add(new Question("Gunung tertinggi di pulau Jawa adalah...", new String[]{"Gunung Merapi", "Gunung Semeru", "Gunung Gede", "Gunung Slamet"}, 1, "Gunung Semeru yang terletak di Jawa Timur merupakan puncak tertinggi di Pulau Jawa."));
                    list.add(new Question("Pekerjaan penduduk di pesisir pantai umumnya adalah...", new String[]{"Petani", "Nelayan", "Peternak", "Buruh"}, 1, "Karena dekat dengan laut, masyarakat pesisir bekerja mengambil ikan dan hasil laut lainnya."));
                    list.add(new Question("Batas wilayah Indonesia bagian timur adalah negara...", new String[]{"Malaysia", "Timor Leste", "Papua Nugini", "Australia"}, 2, "Secara geografis, wilayah Indonesia di timur berbatasan langsung dengan negara Papua Nugini."));
                    list.add(new Question("Alat musik angklung berasal dari daerah...", new String[]{"Jawa Barat", "Jawa Tengah", "Jawa Timur", "Bali"}, 0, "Angklung adalah alat musik bambu yang berasal dari tanah Sunda, Jawa Barat."));
                    list.add(new Question("Contoh sumber daya alam yang tidak dapat diperbarui adalah...", new String[]{"Air", "Udara", "Emas", "Hutan"}, 2, "Emas adalah mineral yang jumlahnya terbatas di bumi dan butuh jutaan tahun untuk terbentuk kembali."));
                    list.add(new Question("Kepala daerah di tingkat provinsi disebut...", new String[]{"Bupati", "Walikota", "Gubernur", "Camat"}, 2, "Gubernur adalah jabatan bagi pemimpin pemerintahan di tingkat provinsi."));
                    break;
                case "Bahasa Indonesia":
                    list.add(new Question("Antonim dari kata 'Besar' adalah...", new String[]{"Kecil", "Luas", "Tinggi", "Lebar"}, 0, "Antonim adalah kata yang maknanya berlawanan. Lawan kata dari besar adalah kecil."));
                    list.add(new Question("Cerita yang tokohnya diperankan oleh hewan disebut...", new String[]{"Legenda", "Mite", "Fabel", "Saga"}, 2, "Fabel adalah cerita fiksi yang memberikan pesan moral dengan hewan sebagai tokoh utamanya."));
                    list.add(new Question("Penggunaan tanda tanya (?) diletakkan pada akhir kalimat...", new String[]{"Perintah", "Tanya", "Berita", "Seru"}, 1, "Tanda tanya digunakan di akhir kalimat yang mengandung pertanyaan untuk mendapatkan jawaban."));
                    list.add(new Question("Budi ... buku di perpustakaan. Kata kerja yang tepat adalah...", new String[]{"Menulis", "Membaca", "Membawa", "Membeli"}, 1, "Membaca adalah aktivitas yang paling umum dilakukan dengan buku di dalam perpustakaan."));
                    list.add(new Question("Huruf kapital digunakan pada awal kata nama...", new String[]{"Buah", "Orang", "Hewan", "Benda"}, 1, "Nama orang merupakan nama diri yang harus ditulis menggunakan huruf kapital di awal katanya."));
                    list.add(new Question("Sinonim atau persamaan kata dari 'Bahagia' adalah...", new String[]{"Sedih", "Marah", "Senang", "Kecewa"}, 2, "Sinonim adalah kata dengan arti yang sama. Bahagia memiliki arti yang sama dengan senang."));
                    list.add(new Question("Tanda baca koma (,) digunakan untuk...", new String[]{"Akhiri kalimat", "Tanya sesuatu", "Pemisah rincian", "Tanda seru"}, 2, "Koma digunakan di antara unsur-unsur dalam suatu rincian, pembilangan, atau jeda pendek."));
                    list.add(new Question("Dongeng tentang asal-usul suatu tempat disebut...", new String[]{"Fabel", "Mite", "Legenda", "Saga"}, 2, "Legenda menceritakan bagaimana suatu daerah terbentuk berdasarkan cerita rakyat setempat."));
                    list.add(new Question("Pesan moral dalam sebuah cerita disebut...", new String[]{"Alur", "Latar", "Amanat", "Tema"}, 1, "Amanat adalah pesan kebaikan atau nasihat yang ingin disampaikan pengarang kepada pembaca."));
                    list.add(new Question("Ide pokok paragraf biasanya terdapat pada...", new String[]{"Awal/akhir", "Tengah", "Semua baris", "Judul"}, 0, "Ide pokok adalah gagasan utama yang biasanya diletakkan di kalimat utama awal atau akhir paragraf."));
                    list.add(new Question("Kata 'Tidur' jika diberi awalan me- menjadi...", new String[]{"Metidur", "Menidur", "Tertidur", "Beriduri"}, 1, "Awalan me- jika bertemu kata dasar berawalan T, S, K, P sering mengalami peluluhan atau perubahan."));
                    list.add(new Question("Buku yang berisi arti kata-kata disebut...", new String[]{"Novel", "Majalah", "Kamus", "Komik"}, 1, "Kamus adalah referensi yang menjelaskan makna kata-kata dalam suatu bahasa."));
                    list.add(new Question("Subjek pada kalimat 'Ibu memasak nasi' adalah...", new String[]{"Ibu", "Memasak", "Nasi", "Dapur"}, 0, "Subjek adalah pelaku dalam kalimat. Di sini Ibu adalah orang yang melakukan pekerjaan."));
                    list.add(new Question("Tanda seru (!) digunakan untuk kalimat...", new String[]{"Tanya", "Berita", "Perintah", "Sapaan"}, 2, "Tanda seru digunakan untuk menegaskan, memberikan perintah, atau menunjukkan perasaan kuat."));
                    list.add(new Question("Antonim dari kata 'Haus' adalah...", new String[]{"Lapar", "Puas", "Kenyang", "Segar"}, 1, "Haus adalah rasa butuh minum. Puas atau sudah minum adalah kondisi sebaliknya."));
                    list.add(new Question("Pantun memiliki rima akhir dengan pola...", new String[]{"a-a-a-a", "a-b-a-b", "a-a-b-b", "a-b-b-a"}, 1, "Pantun yang baik biasanya memiliki bunyi akhir baris yang berselang-seling (a-b-a-b)."));
                    list.add(new Question("Percakapan antara dua orang disebut...", new String[]{"Monolog", "Dialog", "Epilog", "Prolog"}, 1, "Dialog adalah bentuk komunikasi lisan atau tertulis antara dua orang atau lebih."));
                    list.add(new Question("Ringkasan pendek sebuah buku disebut...", new String[]{"Sinopsis", "Kata pengantar", "Daftar isi", "Biografi"}, 0, "Sinopsis memberikan gambaran garis besar isi cerita secara singkat dan menarik."));
                    list.add(new Question("Tokoh yang memiliki sifat jahat disebut...", new String[]{"Protagonis", "Antagonis", "Figuran", "Sampingan"}, 1, "Antagonis adalah karakter yang menjadi penentang tokoh utama (protagonis)."));
                    list.add(new Question("Lawan kata dari 'Siang' adalah...", new String[]{"Pagi", "Sore", "Malam", "Gelap"}, 2, "Secara waktu, kondisi gelap setelah matahari terbenam disebut malam hari."));
                    break;
                case "TIK":
                    list.add(new Question("Perangkat komputer yang digunakan untuk mengetik adalah...", new String[]{"Mouse", "Monitor", "Keyboard", "CPU"}, 2, "Keyboard berisi papan tombol huruf dan angka untuk memasukkan teks ke komputer."));
                    list.add(new Question("Layar yang menampilkan gambar pada komputer disebut...", new String[]{"Printer", "Speaker", "Monitor", "Scanner"}, 2, "Monitor adalah perangkat output visual yang menampilkan hasil kerja komputer."));
                    list.add(new Question("Alat untuk menggerakkan kursor di layar disebut...", new String[]{"Mouse", "Keyboard", "CPU", "Printer"}, 0, "Mouse digunakan untuk mengarahkan panah (kursor) dan melakukan klik pada layar."));
                    list.add(new Question("WWW singkatan dari...", new String[]{"World Wide Web", "World Word Web", "Web Wide World", "World Web Wide"}, 0, "World Wide Web adalah sistem informasi global yang dapat diakses melalui internet."));
                    list.add(new Question("Aplikasi untuk menjelajah internet disebut...", new String[]{"Editor", "Browser", "Player", "Messenger"}, 1, "Browser seperti Google Chrome atau Mozilla Firefox digunakan untuk membuka situs web."));
                    list.add(new Question("Otak dari sebuah komputer adalah...", new String[]{"RAM", "Harddisk", "CPU", "Monitor"}, 2, "CPU (Central Processing Unit) memproses semua instruksi dan data pada komputer."));
                    list.add(new Question("Alat untuk mencetak dokumen ke kertas adalah...", new String[]{"Scanner", "Printer", "Modem", "Webcam"}, 1, "Printer mengubah data digital menjadi cetakan fisik pada media kertas."));
                    list.add(new Question("Menyimpan file secara portabel dan kecil biasanya menggunakan...", new String[]{"CPU", "Keyboard", "Flashdisk", "Printer"}, 2, "Flashdisk adalah media penyimpanan data yang kecil, ringan, dan mudah dibawa."));
                    list.add(new Question("Ikon gambar disket pada aplikasi komputer berarti...", new String[]{"Hapus", "Buka", "Simpan (Save)", "Cetak"}, 2, "Secara tradisional, ikon disket digunakan sebagai simbol untuk menyimpan data."));
                    list.add(new Question("Program aplikasi pengolah kata yang populer adalah...", new String[]{"Ms. Word", "Ms. Excel", "Ms. PowerPoint", "Ms. Access"}, 0, "Microsoft Word digunakan khusus untuk membuat dan mengedit dokumen teks."));
                    list.add(new Question("Alat untuk merekam suara ke komputer adalah...", new String[]{"Speaker", "Microphone", "Monitor", "Scanner"}, 1, "Microphone menangkap gelombang suara dan mengubahnya menjadi sinyal digital."));
                    list.add(new Question("Mematikan komputer sesuai prosedur dilakukan dengan klik...", new String[]{"Restart", "Sleep", "Shutdown", "Hibernate"}, 2, "Shutdown mematikan seluruh daya dan sistem komputer dengan aman."));
                    list.add(new Question("Klik kanan pada mouse biasanya memunculkan...", new String[]{"Menu Opsi", "Double Klik", "Hapus File", "Layar Baru"}, 0, "Klik kanan memicu kemunculan menu konteks yang berisi berbagai perintah cepat."));
                    list.add(new Question("Koneksi internet tanpa kabel disebut dengan...", new String[]{"LAN", "Wi-Fi", "USB", "HDMI"}, 1, "Wi-Fi menggunakan gelombang radio untuk menyambungkan perangkat ke internet tanpa kabel."));
                    list.add(new Question("Aplikasi untuk membuat presentasi slide adalah...", new String[]{"Ms. Word", "Ms. Excel", "Ms. PowerPoint", "Outlook"}, 2, "PowerPoint dirancang untuk membuat tayangan visual yang menarik dalam presentasi."));
                    list.add(new Question("Alat input yang digunakan untuk bermain game disebut...", new String[]{"Joystick", "Scanner", "Printer", "Monitor"}, 0, "Joystick atau Gamepad memudahkan pengguna dalam mengontrol karakter di dalam game."));
                    list.add(new Question("Perangkat keras yang mengeluarkan suara adalah...", new String[]{"Microphone", "Webcam", "Speaker", "Plotter"}, 2, "Speaker berfungsi untuk mengeluarkan output audio seperti musik atau suara video."));
                    list.add(new Question("RAM merupakan singkatan dari...", new String[]{"Random Access Memory", "Read Access Memory", "Real Access Memory", "Run Access Memory"}, 0, "RAM adalah memori penyimpanan data sementara saat aplikasi sedang dijalankan."));
                    list.add(new Question("Situs web pencari informasi yang paling populer adalah...", new String[]{"Facebook", "YouTube", "Google", "WhatsApp"}, 2, "Google adalah mesin pencari (search engine) utama untuk mencari informasi di internet."));
                    list.add(new Question("Tombol pada keyboard untuk menghapus satu karakter di kiri kursor...", new String[]{"Delete", "Backspace", "Enter", "Space"}, 1, "Backspace digunakan untuk menghapus tulisan di depan (kiri) posisi pengetikan."));
                    break;
                case "Bahasa Inggris":
                    list.add(new Question("What is 'Merah' in English?", new String[]{"Blue", "Red", "Green", "Yellow"}, 1, "Red is the color merah in English."));
                    list.add(new Question("I eat with my...", new String[]{"Eyes", "Ears", "Mouth", "Nose"}, 2, "Mouth is part of the face used for eating and speaking."));
                    list.add(new Question("The opposite of 'Small' is...", new String[]{"Long", "Short", "Big", "Thin"}, 2, "Small means kecil, and the opposite (antonym) is big which means besar."));
                    list.add(new Question("How do you say 'Selamat Pagi'?", new String[]{"Good Night", "Good Morning", "Goodbye", "Hello"}, 1, "Good Morning is the common greeting used when meeting someone in the morning."));
                    list.add(new Question("Which one is a fruit?", new String[]{"Spinach", "Apple", "Carrot", "Potato"}, 1, "Apple is a sweet and round fruit, while the others are vegetables."));
                    list.add(new Question("I have two ... (mata).", new String[]{"Eyes", "Ears", "Hands", "Legs"}, 0, "Eyes are the organs used for vision. Most humans have two eyes."));
                    list.add(new Question("The color of the sky is usually...", new String[]{"Pink", "Blue", "Black", "Yellow"}, 1, "The sky appears blue during the day due to sunlight scattering."));
                    list.add(new Question("Ten plus five is...", new String[]{"Twelve", "Thirteen", "Fourteen", "Fifteen"}, 3, "10 + 5 equals 15. In English, fifteen is the word for the number 15."));
                    list.add(new Question("A cat says...", new String[]{"Meow", "Woof", "Moo", "Quack"}, 0, "Meow is the characteristic sound made by a cat."));
                    list.add(new Question("We study at...", new String[]{"Market", "Hospital", "School", "Park"}, 2, "School is an institution designed to provide learning spaces for students."));
                    list.add(new Question("Monday, Tuesday, ...", new String[]{"Thursday", "Wednesday", "Friday", "Saturday"}, 1, "Wednesday is the third day of the week, following Tuesday."));
                    list.add(new Question("My father's brother is my...", new String[]{"Aunt", "Uncle", "Cousin", "Grandpa"}, 1, "Uncle is the term used to describe the brother of one's father or mother."));
                    list.add(new Question("A monkey likes to eat...", new String[]{"Meat", "Banana", "Fish", "Grass"}, 1, "Bananas are known as a favorite food for monkeys in the wild."));
                    list.add(new Question("Which animal can fly?", new String[]{"Fish", "Bird", "Snake", "Elephant"}, 1, "Birds have wings and most of them can fly in the sky."));
                    list.add(new Question("What is the English for 'Kursi'?", new String[]{"Table", "Chair", "Door", "Window"}, 1, "Chair is a piece of furniture designed for one person to sit on."));
                    list.add(new Question("The sun rises in the...", new String[]{"East", "West", "North", "South"}, 0, "The sun always rises from the east in the morning."));
                    list.add(new Question("Twelve in Indonesian is...", new String[]{"Sepuluh", "Sebelas", "Dua Belas", "Dua Puluh"}, 2, "Twelve is the number 12, which is translated to 'Dua Belas'."));
                    list.add(new Question("'Air' in English is...", new String[]{"Milk", "Juice", "Water", "Coffee"}, 2, "Water is the clear, colorless liquid essential for all life."));
                    list.add(new Question("You write with a...", new String[]{"Ruler", "Eraser", "Pen", "Book"}, 2, "A pen is a common tool used for writing with ink on paper."));
                    list.add(new Question("The opposite of 'Boy' is...", new String[]{"Man", "Girl", "Woman", "Child"}, 1, "Boy is a young male, and the opposite is Girl, a young female."));
                    break;
            }
        } else if (level.equals("SMP")) {
            switch (subject) {
                case "IPA":
                    list.add(new Question("Satuan internasional (SI) untuk suhu adalah...", new String[]{"Celsius", "Kelvin", "Fahrenheit", "Reamur"}, 1, "Dalam dunia sains, Kelvin adalah standar pengukuran suhu resmi SI."));
                    list.add(new Question("Organel sel yang berfungsi sebagai tempat respirasi sel adalah...", new String[]{"Nukleus", "Ribosom", "Mitokondria", "Lisosom"}, 2, "Mitokondria menghasilkan energi sel dalam bentuk ATP melalui respirasi aerob."));
                    list.add(new Question("Hukum I Newton sering disebut juga sebagai hukum...", new String[]{"Kelembaman", "Aksi-Reaksi", "Gravitasi", "Kekekalan"}, 0, "Kelembaman (Inersia) adalah kecenderungan benda untuk mempertahankan posisinya."));
                    list.add(new Question("Zat yang dapat mempercepat reaksi kimia tanpa ikut bereaksi disebut...", new String[]{"Katalis", "Enzim", "Hormon", "Vitamin"}, 0, "Katalis menurunkan energi aktivasi sehingga reaksi berjalan lebih cepat."));
                    list.add(new Question("Unit terkecil dari makhluk hidup adalah...", new String[]{"Atom", "Molekul", "Sel", "Jaringan"}, 2, "Sel merupakan unit struktural dan fungsional terkecil dari kehidupan."));
                    list.add(new Question("Proses fotosintesis pada tumbuhan terjadi paling banyak di...", new String[]{"Batang", "Daun", "Akar", "Bunga"}, 1, "Daun mengandung banyak kloroplas tempat terjadinya fotosintesis."));
                    list.add(new Question("Planet terjauh dari matahari dalam tata surya kita adalah...", new String[]{"Uranus", "Neptunus", "Saturnus", "Pluto"}, 1, "Setelah Pluto tidak lagi dianggap planet utama, Neptunus adalah yang terjauh."));
                    list.add(new Question("Zat yang memberikan warna merah pada darah manusia adalah...", new String[]{"Klorofil", "Hemoglobin", "Plasma", "Trombosit"}, 1, "Hemoglobin adalah protein pengikat oksigen yang mengandung zat besi."));
                    list.add(new Question("Perubahan zat dari gas langsung menjadi padat disebut...", new String[]{"Menguap", "Menyublim", "Mengkristal", "Mengembun"}, 2, "Mengkristal atau deposisi adalah perubahan wujud gas ke padat."));
                    list.add(new Question("Berikut yang merupakan tuas golongan pertama adalah...", new String[]{"Gunting", "Gerobak", "Pinset", "Pemecah biji"}, 0, "Gunting memiliki titik tumpu di antara titik beban dan titik kuasa."));
                    for(int i=11; i<=20; i++) list.add(new Question("Tantangan SMP IPA No " + i, new String[]{"Opsi A", "Opsi B", "Opsi C", "Opsi D"}, 0, "Penjelasan materi edukatif tingkat SMP."));
                    break;
                default:
                    for(int i=1; i<=20; i++) list.add(new Question("Soal SMP " + subject + " No " + i, new String[]{"Opsi A", "Opsi B", "Opsi C", "Opsi D"}, 0, "Penjelasan materi SMP mata pelajaran " + subject));
                    break;
            }
        } else if (level.equals("SMA")) {
            switch (subject) {
                case "IPA":
                    list.add(new Question("Hukum II Newton dinyatakan dengan persamaan...", new String[]{"F = m.a", "W = F.s", "Ek = 1/2 mv2", "P = F/A"}, 0, "Besarnya gaya berbanding lurus dengan massa dan percepatan benda."));
                    list.add(new Question("Proses pembelahan sel gamet disebut...", new String[]{"Mitosis", "Meiosis", "Amitosis", "Sintesis"}, 1, "Meiosis menghasilkan sel anak dengan jumlah kromosom setengah induknya."));
                    list.add(new Question("Partikel penyusun inti atom adalah...", new String[]{"Proton & Elektron", "Proton & Neutron", "Neutron & Elektron", "Elektron saja"}, 1, "Inti atom (nukleus) terdiri dari proton yang positif dan neutron yang netral."));
                    list.add(new Question("Senyawa hidrokarbon yang hanya memiliki ikatan tunggal disebut...", new String[]{"Alkana", "Alkena", "Alkuna", "Benzena"}, 0, "Alkana adalah hidrokarbon jenuh dengan rantai karbon tunggal."));
                    list.add(new Question("Turunan pertama dari fungsi f(x) = x^2 adalah...", new String[]{"2x", "x", "2", "x^3"}, 0, "Sesuai aturan pangkat kalkulus, turunan dari x^n adalah n*x^(n-1)."));
                    for(int i=6; i<=20; i++) list.add(new Question("Tantangan SMA IPA No " + i, new String[]{"Opsi A", "Opsi B", "Opsi C", "Opsi D"}, 0, "Penjelasan materi persiapan masuk perguruan tinggi."));
                    break;
                default:
                    for(int i=1; i<=20; i++) list.add(new Question("Soal SMA " + subject + " No " + i, new String[]{"Opsi A", "Opsi B", "Opsi C", "Opsi D"}, 0, "Penjelasan materi lanjutan tingkat SMA."));
                    break;
            }
        }
        
        return list;
    }
}