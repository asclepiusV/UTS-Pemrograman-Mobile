 package com.example.utspemrogramanmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.utspemrogramanmobile.databinding.ActivityMainBinding
import com.example.utspemrogramanmobile.databinding.CardListBinding


 class MainActivity : AppCompatActivity(), MovieClickListener {
    private lateinit var recyclerView: RecyclerView
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        movieListing()

        val mainActivity = this
        binding.recylerView.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = MovieAdapter(movielist, mainActivity)
        } }

     override fun onClick(movieModel: MovieModel) {
         val intent =Intent(applicationContext, DetailActivity::class.java)
         intent.putExtra(MOVIE_EXTRA, movieModel.id)
         startActivity(intent)
     }
 }
     private fun movieListing()
     {
         val movie1 = MovieModel(
             R.drawable.thebatman,
             "The Batman",
             "Action, Mystery",
             "2022",
             "Ketika Riddler, seorang pembunuh berantai yang sadis mulai membunuh tokoh-tokoh politik penting di Gotham, Batman dituntut untuk menyelidiki korupsi tersembunyi di kota itu dan mempertanyakan keterlibatan keluarganya.",
             "mqqft2x_Aa4"
         )
         movielist.add(movie1)

         val movie2 = MovieModel(
             R.drawable.gundamhathaway,
             "Mobile Suit Gundam: Hathaway",
             "Action, Military, SCI-FI",
             "2021",
             "Federasi Bumi juga mulai kembali menerima Republik Zeon dan mulai memberlakukan ‘Perburuan Manusia’. Federasi membentuk sebuah unit khusus untuk mendeportasi warga sipil ke luar angkasa. Di tengah-tengah kekacauan tersebut, kelompok anti-federasi mulai berkembang untuk melawan korupsi dari Federasi Bumi. Ada sebuah kelompok pemberontak bernama Mafty yang dipimpin oleh Hathaway Noa. Meskipun melakukan tindakan terorisme kepada pejabat federasi, para rakyat tetap mendukung Hathaway. Lantas, apakah Hathaway berhasil menjatuhkan kekuasaan Federasi Bumi untuk kehidupan manusia yang lebih baik?",
             "3BJ51sNNkqU"
         )
         movielist.add(movie2)

         val movie3 = MovieModel(
             R.drawable.oppenheimer,
             "Oppenheimer",
             "Action, Military, History",
             "2023",
             "Film ini bercerita tentang seorang fisikawan teoretis bernama J. Robert Oppenheimer, manajer Laboratorium Los Alamos saat melakukan Proyek Manhattan dan kontribusinya yang mengarah pada penciptaan bom atom.",
             "bK6ldnjE3Y0"
         )
         movielist.add(movie3)

         val movie4 = MovieModel(
             R.drawable.helloworld,
             "Hello World",
             "Drama, Romance, SCI-FI",
             "2019",
             "Hello World bercerita tentang seorang remaja bernama Naomi Katagaki yang tidak memiliki pendirian yang kuat. Suatu hari, ia bertemu dengan seorang pria yang hanya dapat ia lihat. Pria ini mengaku sebagai Naomi 10 tahun yang akan datang dan ingin mengubah masa lalu untuk menyelamatkan Ruri Ichigyo, yang nantinya akan menjadi pacar Naomi.",
             "shoWFRnNoWw"
         )
         movielist.add(movie4)

         val movie5 = MovieModel(
             R.drawable.dungeonsanddragons,
             "Dungeons & Dragons: Honor Among Thieves",
             "Action, Fantasy",
             "2023",
             "Seorang pencuri yang menawan dan sekelompok petualang yang tidak mungkin melakukan pencurian epik untuk mengambil peninggalan yang hilang, tetapi keadaan menjadi serba salah ketika mereka berhadapan dengan orang yang salah. Dungeons & Dragons: Honor Among Thieves menghadirkan dunia yang kaya dan semangat menyenangkan dari game roleplaying legendaris ke layar lebar dalam petualangan yang lucu dan penuh aksi.",
             "IiMinixSXII"
         )
         movielist.add(movie5)

         val movie6 = MovieModel(
             R.drawable.johnwick4,
             "John Wick: Chapter 4",
             "Action, Drama, Neo-noir",
             "2023",
             "John Wick (Keanu Reeves) menemukan jalan untuk mengalahkan The High Table. Tapi sebelum dia bisa mendapatkan kebebasannya, Wick harus berhadapan dengan musuh baru dengan aliansi yang kuat di seluruh dunia! Memaksanya mengubah teman lama menjadi musuh.",
             "qEVUtrk8_B4"
         )
         movielist.add(movie6)

         val movie7 = MovieModel(
             R.drawable.topgunmaverick,
             "Top Gun: Maverick",
             "Action, Military",
             "2023",
             "Kapten Pete 'Maverick' Mitchell merupakan salah satu pilot top Angkatan Udara. Setelah lebih dari 30 tahun mengabdi, Maverick merasa bahwa menjadi seorang pilot Angkatan Udara merupakan tempat yang tepat untuknya.\n" +
                     "\n" +
                     "Meskipun Maverick merupakan seorang pilot yang top, ia tidak pernah menginginkan pangkat yang tinggi.\n" +
                     "Dan Maverick juga menghindari segala promosi agar ia tidak dapat naik pangkat.\n" +
                     "\n" +
                     "Suatu ketika, Laksamana Cyclone direkomendasikan oleh Laksamana Iceman untuk merekrut Kapten Maverick.\n" +
                     "Nantinya, Kapten Maverick akan melatih detasemen lulusan Top Gun untuk sebuah misi khusus. Misi khusus ini belum pernah terjadi sebelumnya.\n" +
                     "\n" +
                     "Saat melatih detasemen lulusan Top Gun, Maverick bertemu dengan Letnan Rooster. Letnan Rooster merupakan anak dari Letnan Goose yang tidak lain adalah teman dekat Maverick.\n" +
                     "\n" +
                     "Maverick tenggelam dalam ketakutan akan keberhasilan misi ini yang dapat mengorbankan detasemen lulusan Top Gun yang Ia latih. Maverick pun harus menghadapi ketakutannya agar misi khusus tersebut berhasil dan detasemen lulusan Top Gun selamat.",
             "giXco2jaZ_4"
         )
         movielist.add(movie7)

         val movie8 = MovieModel(
             R.drawable.shazam,
             "Shazam! Fury of the Gods",
             "Action, Adventure",
             "2023",
             "Film Shazam! Fury of the Gods menceritakan tentang petualangan remaja yatim piatu, Billy Batson (Asher Ange) yang mendapat kekuatan super setelah menemui penyihir tempat mistis bernama Rock of Eternity. Berawal dari Hespera dan Kalypso yang datang ke sebuah museum. Mereka mengambil tongkat sihir yang dipatahkan Billy di film pertama. \n" +
                     "Setelah mereka mendapatkannya, Hespera dan Kalypso memaksa penyihir Shazam! untuk dapat menyatukan tongkat sihir itu agar lebih kuat. Tongkat itu akan dipakai untuk membalas kematian ayah mereka. Ketiganya juga ingin merebut kekuatan keluarga Shazam!.\n" +
                     "Hingga pada akhirnya muncul lah musuh baru bernama The Daughter of Atlas yang ingin menghancurkan dunia dan merebut kekuatan yang dimiliki Billy. Kalypso (Lucy Liu), Hespera (Helen Mirren), dan Anthea sangat kesal karena merasa kekuatan sejati dewa malah jatuh ke tangan remaja tanggung alih-alih digunakan untuk sesuatu yang lebih besar.\n" +
                     "Karena hal tersebut Kalypso dan Hespera ingin merebut kekuatan Shazam Family yang berada di diri Billy dan keluarga adopsinya. Dengan kekuatan dewa atlas dan senjata suci yang dibuat oleh Hephaestus, Kalypso dan Hespera berusaha untuk menghancurkan dunia sekaligus untuk merebut kembali kekuatan dari manusia di bumi. ",
             "Zi88i4CpHe4"
         )
         movielist.add(movie8)

         val movie9 = MovieModel(
             R.drawable.blackadam,
             "Black Adam",
             "Action, Adventure",
             "2022",
             "Lima ribu tahun yang lalu, seorang budak dari Kahndaq bernama Teth-Adam (Dwayne Johnson) mendapat kekuatan super dari para dewa Mesir. Ia diberi kekuatan itu untuk membebaskan rakyat Kahndaq dari perbudakan yang merajalela.\n" +
                     "Black Adam Banyak Lepas Adegan Sadis Demi Bisa Rating 13+\n" +
                     "Namun, Teth-Adam justru tidak mampu mengendalikan diri saat membantu rakyat Kahndaq merdeka. Ia pun dipenjara oleh penyihir kuno bernama Shazam karena dianggap tidak layak memiliki kekuatan super tersebut.\n" +
                     "Di masa kini, Kahndaq ternyata belum benar-benar merdeka karena kini dijajah oleh organisasi kriminal Intergang. Teth-Adam pun hanya menjadi legenda yang tidak diketahui keberadaannya.\n" +
                     "Hingga suatu hari seorang pejuang revolusi bernama Adrianna Tomaz (Sarah Shahi) menemukan jejak kuburan Teth-Adam saat diburu kawanan Intergang.\n",
             "X0tOpBuYasI"
         )
         movielist.add(movie9)

         val movie10 = MovieModel(
             R.drawable.kingsglaive,
             "Kingsglaive: Final Fantasy XV",
             "Fantasy, Adventure",
             "2016",
             "Perang besar tiada akhir berkecamuk antara pihak kekaisaran Niflheim dengan kerajaan Lucis. Satu per satu wilayah kekuasaan Lucis jatuh tak berdaya di hadapan kekuatan dari kekaisaran Niflheim. Dengan teknologi Magitech yang dimiliki, kekaisaran Niflheim mampu menyudutkan pasukan Lucis. Kerajaan Lucis pun berada di ambang kekalahan dengan hanya memiliki satu wilayah pertahanan terakhir, ibukota Insomnia. Insomnia merupakan pertahanan terakhir Lucis yang tak bisa ditembus oleh Niflheim berkat perlindungan dari kekuatan kristal pelindung yang dikendalikan oleh raja Regis Lucis Caelum (disuarakan oleh Sean Bean), raja dari kerajaan Lucis.\n" +
                     "Pada 12 tahun lalu, keluarga kerajaan Lucis mendatangi wilayah kekuasan Niflheim, Tenebrae untuk mencari obat bagi penyakit yang diderita oleh Noctis Lucis Caelum, pangeran kerajaan Lucis. Disana keluarga kerajaan Lucis disambut oleh keluarga penguasa dari Tenebrae, di saat itulah Noctis bertemu dengan putri Lunafreya (disuarakan oleh Lena Headey). Namun ditengah kunjungan tersebut, pasukan Niflheim datang menyerang hendak menghabisi keluarga kerajaan Lucis. Raja Regis beserta Noctis berhasil menyelamatkan diri namun putri Lunafreya ditahan oleh pihak Niflheim.\n" +
                     "Belasan tahun berlalu, perang antara Niflheim dan Lucis tak berujung. Untuk itu raja Regis membentuk sebuah pasukan khusus kerajaan yang bernama Kingsglaive. Pasukan khusus Kingsglaive merupakan pasukan yang dibekali oleh kekuatan sihir dari raja Regis untuk melindungi kerajaan. Namun ditengah kemelut yang terjadi, raja Regis dihadapkan dengan pilihan sulit. Suatu hari utusan kerajaan Niflheim datang dan merencanakan pernikahan antara putri Lunafreya dengan pangeran Noctis, dengan syarat Lucis harus menyerahkan wilayah kekuasaan kepada pihak Niflheim. Nyx Ulric (disuarakan oleh Aaron Paul) dan para pasukan Kingsglaive lainnya bertekad untuk tetap melindungi wilayah kerajaan Lucis menghadapi setiap ancaman yang datang.",
             "iP8EgMUVmwk"
         )
         movielist.add(movie10)

         val movie11 = MovieModel(
             R.drawable.pussinboots,
             "Puss in Boots: The Last Wish",
             "Comedy, Adventure",
             "2022",
             "Puss in Boots menemukan fakta bahwa kecintaannya pada petualangan telah merenggut nyawanya: dia telah menghabiskan delapan dari sembilan nyawanya. Puss kini memulai petualangan epik untuk menemukan harapan terakhir untuk memulihkan sembilan nyawanya.",
             "Y5zqweZAEKI"
         )
         movielist.add(movie11)

         val movie12 = MovieModel(
             R.drawable.supermario,
             "The Super Mario Bros. Movie",
             "Comedy, Adventure",
             "2023",
             "Super Mario Bros. adalah film animasi berdasarkan petualangan Mario dan kawan-kawannya. Mario dan Luigi merupakan tukang ledeng bersaudara yang bekerja di bawah tanah untuk memperbaiki saluran air. Namun tiba-tiba keduanya dibawa oleh pipa misterius dan pergi berpetualang ke dunia lain.\n" +
                     "Mario dan Luigi berpisah dalam dunia lain tersebut, sehingga Mario berusaha menemukan Luigi yang diculik oleh Raja Koopas. Proses pencarian saudaranya ini membutuhkan waktu lama, namun Mario mendapatkan bantuan dari penduduk Kerajaan Jamur bernama Toad dan petualangan mereka dimulai.\n",
             "TnGl01FkMMo"
         )
         movielist.add(movie12)

         val movie13 = MovieModel(
             R.drawable.spiderverse,
             "Spider-Man: Across the Spider-Verse",
             "Action, Adventure",
             "2023",
             "Sekuel Spider-Man ini akan menceritakan kisah dari Miles Morales yang bertemu dan bersatu kembali dengan Gwen Stacy. Ia terlempar melintasi Multiverse dan bertemu dengan tim Spider-People yang mempunyai tugas dalam melindungi keberadaannya.\n" +
                     "Namun ketika Miles mengunjungi multiverse tersebut terdapat suatu bentrok para pahlawan mengenai cara menangani ancaman baru. Maka dari itu Miles menemukan dirinya diadu dengan Spider lain.\n" +
                     "Karena hal tersebut Miles juga harus mencari kembali sebuah arti menjadi pahlawan dimana untuk mendapatkan tujuannya agar bisa menyelamatkan orang-orang terutama orang yang paling dicintainya.",
             "cqGjhVJWtEg"
         )
         movielist.add(movie13)

         val movie14 = MovieModel(
             R.drawable.badguys,
             "The Bad Guys",
             "Comedy, Adventure",
             "2022",
             "Geng yang beranggotakan Mr. Wolf, Mr. Snake, Mr. Shark, Mr. Piranha, dan Mrs. Tarantula ini berjanji akan menjadi orang baik setelah polisi berhasil menangkap mereka. Mereka berusaha mengubah persepsi masyarakat yang menganggap bahwa mereka adalah hewan jahat abadi karena jenis mereka yang berbahaya. Namun, dengan banyaknya pengalaman kejahatan mereka, The Bad Guys memanfaatkan kemampuan mereka untuk membuat dunia percaya bahwa mereka sudah berubah menjadi lebih baik. Akan tetapi, seiring berjalannya waktu, Mr. Wolf berpikir bahwa tidak ada salahnya untuk benar-benar menjadi orang baik. Terlebih lagi, Mr. Wolf merindukan perasaan yang selalu dipendamnya, yaitu perasaan ingin diterima di masyarakat. Namun, siapa sangka, perubahan yang dialami Mr. Wolf itu mengancam persahabatannya dengan keempat temannya. Lantas, apakah Mr. Wolf akan tetap menjadi penipu demi mempertahankan persahabatannya? Atau ia akan berusaha membujuk teman-temannya?\n",
             "m8Xt0yXaDPU"
         )
         movielist.add(movie14)

         val movie15 = MovieModel(
             R.drawable.morbius,
             "Morbius",
             "Action, Fantasy",
             "2022",
             "Sinopsis Morbius berpusat di sekitar karakter Dr. Michael Morbius, ahli biologi dan biokimia Yunani yang menderita penyakit darah langka. Dia mencoba obat berbahaya yang justru mengubahnya jadi seperti vampir.\n" +
                     "Saat bepergian ke New York, Morbius berusaha menemukan obat untuk penyakit langka yang dideritanya seumur hidup. Untuk melakukan itu, Morbius bereksperimen dengan pengobatan radikal yang melibatkan DNA kelelawar vampir dan terapi kejut listrik.\n" +
                     "Alih-alih sembuh, Morbius malah menderita penyakit yang jauh lebih buruk, membuatnya haus darah seperti vampir. Namun dia juga mendapatkan kemampuan persis makhluk supernatural tersebut.",
             "oZ6iiRrz1SY"
         )
         movielist.add(movie15)


    /*  Template data
         val movie = MovieModel(
             R.drawable ,
             "",
             "",
             "",
             ""
         )
         movielist.add(movie)
         */
 }