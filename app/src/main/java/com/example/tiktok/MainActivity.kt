package com.example.tiktok


import Models.Batafsil
import Models.Xatolar
import MyDate.Batafsil_object.bataflis_list
import MyDate.Index
import MyDate.Xatolar_object.xatolar_list
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.tiktok.Adapter.MyAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadDate()


        listview.setOnItemClickListener { parent, view, position, id ->
            Index.index_position = position
            startActivity(Intent(this, BatafsilActivity::class.java))
        }
    }

    private fun loadDate() {
        var adapter: MyAdapter
        var tartib = 0
        xatolar_list.add(Xatolar(++tartib, R.drawable.profile, "Xar xil mavzularda ijod qilish"))
        xatolar_list.add(Xatolar(++tartib, R.drawable.contents, "Jinnicha ko’chirishlar"))
        xatolar_list.add(Xatolar(++tartib, R.drawable.analiz, "Analiz qilmaslik-Ya’ni tahlil"))
        xatolar_list.add(Xatolar(++tartib, R.drawable.jonli_efir, "Jonli efirga chiqmasligingiz"))
        xatolar_list.add(Xatolar(++tartib, R.drawable.active, "Kamdan-kam active bo'lishingiz"))
        xatolar_list.add(Xatolar(++tartib, R.drawable.izoh, "Izohlarga javob bermaslik"))
        xatolar_list.add(Xatolar(++tartib, R.drawable.insta, "Ishonchsiz Givlarda qatnashmang"))
        xatolar_list.add(Xatolar(++tartib, R.drawable.video_ochirish, "Videolarni o'chirish va yashirish"))
        xatolar_list.add(Xatolar(++tartib, R.drawable.boglanmang, "TikTokga judayam qattiq bog'lanib qolmang"))
        xatolar_list.add(Xatolar(++tartib, R.drawable.tiktok, "Kim uchun video olayotganingizni unutmang"))

        bataflis_list.add(Batafsil("Profilingizni dabdala qilishning hojati yo'q." +
                " Nima uchun? Tiktok algoritmi sizni kimga ko'rsatishni tushunmaydi." +
                "Turli xil mavzulardagi videolarni suratga olish orqali siz algoritmni o'zingiz uchun kerakli" +
                " auditoriyani izlashiga to'sqinlik qilasiz. Aniq mavzuni" +
                " aniqlang va hozziroq xarakatlaning"))
        bataflis_list.add(Batafsil("To'liq nusxa ko'chirish nima? bu siz boshqalarning " +
                "videolarini bittadan nusxa ko'chirishda. Tik Tok - bu " +
                "videoxosting xizmati bo'lib, u nusxalashga " +
                "asoslangan, odamlar tendentsiyalarni takrorlaydi va " +
                "hokazo, lekin sizning videolaringiz ko'p ko'rilishi " +
                "uchun siz o'zingiz g'oyani taklif qilishingiz kerak, ya'ni " +
                "mualliflik mazmunini yaratishingiz kerak . Tasavvur " +
                "qiling, 10 000 kishi xuddi shu narsani suratga oladi, " +
                "keyin siz ham xuddi shu narsani suratga olishni " +
                "boshlaysiz, odamlar o'sha narsani tomosha qilish " +
                "uchun qiziqishsiz bo'lib qolishadi, shuning uchun " +
                "mualliflik huquqi mazmuni har doim ko'proq " +
                "ko'ruvchilar va obunachilarga ega bo'ladi."))
        bataflis_list.add(Batafsil("Videolaringizni tahlil qilish juda muhim, bu nima? " +
                "Aytaylik, siz 15 ta videoni suratga oldingiz, " +
                "shulardan qaysi biri juda ko'p ko'rishga, qaysi biri " +
                "kam ko'rilganiga qarang, shunda siz nima tortishish " +
                "kerakligini, nima keladi va nima bo'lmasligini " +
                "tushunasiz. 50k yoki 100k"))
        bataflis_list.add(Batafsil("Jonli translyatsiya 1000 ta obunachida mavjud, " +
                "aksariyat tikuvchilar jonli efirga chiqmaslikda katta " +
                "xatoga yo'l qo'yishadi. nega? Birinchidan, bu sizning " +
                "auditoriyangizning ishonchini oshiradi, agar siz " +
                "o'zingizning xizmatlaringiz yoki mahsulotingizni " +
                "sotmoqchi bo'lsangiz, unda odamlar sizga ishonishlari " +
                "kerak. Ikkinchidan, siz tinglovchilarning sadoqatini " +
                "oshirasiz, bu nima? Bu sizning obunachingiz Muxlisga " +
                "aylanganda, odamlar sizni ta'qib qilishni boshlaydilar " +
                "va shunga o'xshash tarkibni suratga olgan boshqa " +
                "Tiktokerga bormaydilar."))
        bataflis_list.add(Batafsil("Siz har kuni video yuklashingiz kerak! Agar siz tezkor  " +
                "rivojlanishni istasangiz, har kuni, kamida bitta videoni eslang,  " +
                "keyin bir oy davomida kuniga 5-10 ta videoni ko'ring va  " +
                "obunachilar ko'payishini ko'rasiz.  " +
                "O'zingizni tashlash juda keng tarqalgan xatodir  " +
                "bir necha hafta davomida hisob qaydnomasi, agar siz bir, ikki  " +
                "yoki uch kunlik xabarni yubormasangiz, bu odatiy holdir, ammo  " +
                "agar siz bir oy davomida hisobingizni tark etsangiz, faollik  " +
                "pasayadi va sizning obunachilaringiz sizni TikTokda ko'rishmaydi  " +
                "va sizni unutishadi"))
        bataflis_list.add(Batafsil("Eng boshidanoq, har bir videongiz ostidagi har bir " +
                "komentlarga javob berishingiz kerak. Nima uchun? " +
                "Obunachilar siz ko'rgan narsalarni ko'rishlari uchun " +
                "ular sizga minnatdor bo'lishadi, ular sizning " +
                "muxlislaringizga aylanishadi va sizni juda uzoq vaqt " +
                "kuzatib borishadi. Obunachilaringiz ko'p bo'lganida " +
                "ham, sharhlarga javob berishingiz kerak. Yodingizda " +
                "bo'lsin!"))
        bataflis_list.add(Batafsil("Instagramdagi kabi tiktokda hech qanday hikoya va " +
                "postlar bo'lmaganligi sababli, odamlar sizni har kuni " +
                "ko'rishmaydi va siz har kuni ularning ko'zlari oldida " +
                "miltillab turishingizga to'g'ri keladi.Shuning uchun, siz " +
                "Instagram-ni yuklab olishingiz kerak.Instagram-ni " +
                "qo'shimcha ravishda topish mumkin. Bundan tashqari, " +
                "tiktok yordamida instangizni bepul ko’tarishingiz " +
                "mumkin"))
        bataflis_list.add(Batafsil("Videolarni o'chirganingiz va yashirganingiz uchun, albatta," +
                "sizga tenevoy ban berilmaydi, lekin nega ularni yashirish" +
                "kerak?\n" +
                "Ehtimol, 2-5 kun ichida u o'z prasmotrlarini yig’ar?" +
                "Yuklaganingizdan bir necha soat o'tgach videoni yashirmang /" +
                "o'chirmang. Ehtimol, u ko'plab prasmotrlar olishi mumkin."))
        bataflis_list.add(Batafsil("Albatta, Tik Tok - bu ajoyib ijtimoiy tarmoq va u juda katta\n" +
                "imkoniyatlarga ega, ammo bunga jiddiy ahamiyat bermang. Bu " +
                "shunchaki vosita. Agar siz tiktokga jiddiy yondoshsangiz, ko'p " +
                "marta ko'rilmagan boshqa videodan keyin tushkunlikka tushasiz. " +
                "Agar bilmasangiz, tiktok qoidalariga ko'ra, sizning hisob " +
                "qaydnomangiz sizga tegishli emas. Tiktok uni istalgan vaqtda hech " +
                "qanday sabab ko'rsatmasdan olib tashlashi mumkin. Shuning " +
                "uchun hisobingizga jiddiy ahamiyat bermang.\n " +
                "«Hoziroq TikTokdan foyda olishni o’rganing»"))
        bataflis_list.add(Batafsil("Agar siz maqsadli auditoriyangizni aniqlamagan " +
                "bo'lsangiz - bu sizning kontentingiz bilan qiziqadigan " +
                "odamlardir, ehtimol sizning videolaringiz ozgina foyda " +
                "oladi, chunki siz kimga suratga tushishni va ular nimaga " +
                "qiziqishini bilmayapsiz. O'ylab ko'ring bu kimlar? " +
                "videolaringiz kimni qiziqtiradi? ular necha yoshda? ular " +
                "nimaga qiziqishadi? ularning muammolari qanday? balki " +
                "ularni videolaringiz bilan hal qilishingiz mumkin. Ayniqsa, " +
                "siz ma'lum bir mavzu bo'yicha mutaxassis bo'lsangiz, " +
                "unda maqsadli auditoriyangizni aniqlash kerak!"))


        adapter = MyAdapter(this, xatolar_list)
        listview.adapter = adapter


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu1, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about -> {
                startActivity(Intent(this, IlovaHaqida::class.java))
            }
        }
        return super.onOptionsItemSelected(item)
    }

}