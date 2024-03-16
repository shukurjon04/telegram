package quron.btgbtg;

import com.google.gson.Gson;
import rgvregrgerr.examplebot.botQuary;
import rgvregrgerr.examplebot.suranom;
import rgvregrgerr.examplebot.urlmanzillar;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.alquran.cloud/v1/quran/ar.alafasy");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader reader1 = new BufferedReader(reader);
            String row;
            StringBuilder builder = new StringBuilder();
            while ((row = reader1.readLine()) != null) {
                System.out.println(builder);
                builder.append(row);
            }
            Gson gson = new Gson();
            Quron13 quron13 = gson.fromJson(builder.toString(), Quron13.class);
            List<String> oyatlar = new ArrayList<>();
            List<SurahsItem> surahsItems = quron13.getData().getSurahs();
            Map<String, String> map = new HashMap<>();
            int son = 1;
            for (SurahsItem surahsItem : surahsItems) {
                String som = "";
                if (son < 10) {
                    som = "00" + son;
                } else if (son < 100) {
                    som = "0" + son;
                } else {
                    som = String.valueOf(son);
                }
                String manzil = "https://islom.ziyouz.com/quran/" + som + ".mp3";
                map.put(surahsItem.getEnglishName(), manzil);
                son++;
            }
           /* for (Map.Entry<String, String> entry : map.entrySet()) {
                String s = entry.getKey() + ":" + entry.getValue();
                System.out.println(s);
            }
            */
            urlmanzillar  urlmanzillar = new urlmanzillar();
            System.out.println(urlmanzillar);
            for (suranom value : suranom.values()) {
                System.out.println(value);
            }


        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }
}
