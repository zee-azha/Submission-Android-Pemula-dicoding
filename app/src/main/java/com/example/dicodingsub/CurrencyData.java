package com.example.dicodingsub;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CurrencyData {
    private static String[] currencyName={
            "Rupiah",
            "Baht",
            "Renminbi",
            "Poundsterling",
            "Yen",
            "US Dollar",
            "Singapore Dollar",
            "Rupee",
            "Ringgit",
            "Euro"
    };
    private static String[] CurrencyDetail={
         "adalah mata uang resmi Indonesia. Mata uang ini dicetak dan diatur penggunaannya oleh Bank Indonesia dengan kode ISO 4217 IDR.",
         "adalah mata uang resmi Thailand. Penerbitan mata uang ini merupakan tanggung jawab Bank of Thailand. Satu baht dibagi menjadi 100 satang",
         "adalah mata uang Republik Rakyat Tiongkok. Mata uang ini dicetak dan diatur penggunaannya oleh Bank Rakyat Tiongkok. Renminbi pernah dipatok pada nilai 8,28 terhadap dolar AS selama 11 tahun hingga 21 Juli 2005.",
         "adalah mata uang Britania Raya. Selain di Britania Raya, Pound sterling juga digunakan di Kepulauan Falkland, Gibraltar, Guernsey, Jersey, Kepulauan Falkland, dan lain-lain.",
          "Adalah mata uang Jepang Pemerintah Jepang menetapkan mata uang Yen sejak 27 Juni 1871 berdasarkan Shinka jōrei (peraturan pemerintahan tentang mata uang baru). Sebagai lambang digunakan tanda ¥ dan menurut ISO 4217 dilambangkan sebagai JPY.",
           "Adalah mata uang resmi Amerika Serikat. Dolar AS juga digunakan secara luas di dunia internasional sebagai kurs cadangan devisa di luar AS. ",
            " adalah mata uang negara Singapura. Mata uang ini dicetak dan diatur penggunaannya oleh Otoritas Moneter Singapura. Satu dolar Singapura dibagi menjadi 100 sen.",
           "adalah nama untuk jenis mata uang yang digunakan di beberapa negara, seperti: India, Pakistan, Sri Lanka, Nepal, Mauritius, dan Seychelles. Pada masa lalu, rupee juga merupakan mata uang yang digunakan di negara-negara Myanmar, Jerman dan jajahan Inggris di selatan Afrika. ",
            "Ringgit atau juga dikenal sebagai Ringgit Malaysia adalah unit mata uang Malaysia dengan kode mata uang MYR. Ringgit dapat dipecah menjadi 100 sen dan mempunyai pecahan uang kertas bernilai RM100, RM50, RM20, RM10, RM5, RM2, RM1; serta koin 50 sen, 20 sen, 10 sen, 5 sen, dan 1 sen. Nama \"Ringgit\" berasal dari sisi bergigi uang perak Spanyol yang digunakan secara luas pada zaman dahulu.",
         "adalah mata uang yang dipakai di 19 negara anggota Uni Eropa. Secara giral, mata uang ini mulai dipakai sejak tanggal 1 Januari 1999, tetapi secara fisik baru dipakai pada tanggal 1 Januari 2002. Uang kertas Euro di mana-mana rupanya sama, tetapi uang logamnya di belakang berbeda-beda."

   };
    private static int[] image={
            R.drawable.rupiah,
            R.drawable.baht,
            R.drawable.rmb,
            R.drawable.poundsterling,
            R.drawable.yen,
            R.drawable.usd,
            R.drawable.sgd,
            R.drawable.rupee,
            R.drawable.ringgit,
            R.drawable.euro

    };

    static ArrayList<Currency> getListData() {
        ArrayList<Currency> list = new ArrayList<>();
        for (int position = 0; position < currencyName.length; position++) {
           Currency currency = new Currency();
            currency.setUang(currencyName[position]);
            currency.setDetail(CurrencyDetail[position]);
            currency.setImg(image[position]);
            list.add(currency);
        }
        return list;
    }
}
