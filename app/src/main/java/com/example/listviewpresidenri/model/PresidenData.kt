package com.example.listviewpresidenri.model
import com.example.listviewpresidenri.R
object PresidenData {
    private val presidenName = arrayOf(
        "Soekarno",
        "Soeharto",
        "BJ.Habibie",
        "Gusdur",
        "Megawati",
        "Susilo Bambang Yudhoyono",
        "Jokowi"
    )

    private val detail = arrayOf(
        "Soekarno adalah yang pertama kali mencetuskan konsep mengenai Pancasila sebagai dasar negara Indonesia dan ia sendiri yang menamainya.",
        "Sebelum menjadi presiden, Soeharto adalah pemimpin militer pada masa pendudukan Jepang dan Belanda, dengan pangkat terakhir Mayor Jenderal.",
        "B.J. Habibie merupakan satu-satunya Presiden yang berasal dari etnis Gorontalo, Sulawesi dari garis keturunan Ayahnya yang berasal dari Kabila, Gorontalo dan etnis Jawa dari ibunya yang berasal dari Yogyakarta.",
        "Gus Dur (lahir di Jombang, Jawa Timur, 7 September 1940 – meninggal di Jakarta, 30 Desember 2009 pada umur 69 tahun) adalah tokoh Muslim Indonesia dan pemimpin politik yang menjadi Presiden Indonesia yang keempat dari tahun 1999 hingga 2001.",
        "Megawati Soekarnoputri atau biasa disapa dengan panggilan Mbak Mega (lahir di Yogyakarta, 23 Januari 1947; umur 72 tahun) adalah Presiden Indonesia yang kelima yang menjabat sejak 23 Juli 2001 sampai 20 Oktober 2004.",
        "Susilo Bambang Yudhoyono, M.A., GCB., AC.(lahir di Tremas, Arjosari, Pacitan, Jawa Timur, Indonesia, 9 September 1949; umur 70 tahun) adalah Presiden Indonesia ke-6 yang menjabat sejak 20 Oktober 2004 hingga 20 Oktober 2014",
        "Ir. H. Joko Widodo atau Jokowi (lahir di Surakarta, Jawa Tengah, 21 Juni 1961; umur 58 tahun) adalah Presiden ke-7 Indonesia yang mulai menjabat sejak 20 Oktober 2014."
    )

    private val presidenPoster = intArrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.bj_habibie,
        R.drawable.abdurrahman_wahid,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi

    )

    val listPresiden: ArrayList<Presiden>
        get() {
            val list = arrayListOf<Presiden>()
            for (position in presidenName.indices) {
                val presiden = Presiden()
                presiden.name = presidenName[position]
                presiden.detail = detail[position]
                presiden.poster = presidenPoster[position]
                list.add(presiden)
            }
            return list
        }
}