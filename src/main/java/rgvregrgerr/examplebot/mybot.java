package rgvregrgerr.examplebot;

import com.google.gson.Gson;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendAudio;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Audio;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import quron.btgbtg.AyahsItem;
import quron.btgbtg.Data;
import quron.btgbtg.Quron13;
import quron.btgbtg.SurahsItem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.function.BiConsumer;


public class mybot extends TelegramLongPollingBot {
    private String manzil(String valiue) {
        String Al_Faatiha = "Al_Faatiha";
        String Al_Baqara = "Al_Baqara";
        String Aal_i_Imraan = "Aal_i_Imraan";
        String AAn_Nisaa = "AAn_Nisaa";
        String Al_Maaida = "Al_Maaida";
        String Al_Anaam = "Al_Anaam";
        String AlAraaf = "AlAraaf";
        String Al_Anfaal = "Al_Anfaal";
        String AtTawba = "AtTawba";
        String Yunus = "Yunus";
        String Hud = "Hud";
        String Yusuf = "Yusuf";
        String Ar_Rad = "Ar_Rad";
        String Ibrahim = "Ibrahim";
        String Al_Hijr = "Al_Hijr";
        String An_Nahl = "An_Nahl";
        String Al_Israa = "Al_Israa";
        String Al_Kahf = "Al_Kahf";
        String Maryam = "Maryam";
        String Taa_Haa = "Taa_Haa";
        String Al_Anbiyaa = "Al_Anbiyaa";
        String Al_Hajj = "Al_Hajj";
        String Al_Muminoon = "Al_Muminoon";
        String An_Noor = "An_Noor";
        String Al_Furqaan = "Al_Furqaan";
        String Ash_Shuaraa = "Ash_Shuaraa";
        String An_Naml = "An_Naml";
        String Al_Qasas = "Al_Qasas";
        String Al_Ankaboot = "Al_Ankaboot";
        String Ar_Room = "Ar_Room";
        String Luqman = "Luqman";
        String As_Sajda = "As_Sajda";
        String Al_Ahzaab = "Al_Ahzaab";
        String Saba = "Saba";
        String Faatir = "Faatir";
        String Yaseen = "Yaseen";
        String As_Saaffaat = "As_Saaffaat";
        String Saad = "Saad";
        String Az_Zumar = "Az_Zumar";
        String Ghafir = "Ghafir";
        String Fussilat = "Fussilat";
        String Ash_Shura = "Ash_Shura";
        String Az_Zukhruf = "Az_Zukhruf";
        String Ad_Dukhaan = "Ad_Dukhaan";
        String Al_Jaathiya = "Al_Jaathiya";
        String Al_Ahqaf = "Al_Ahqaf";
        String Muhammad = "Muhammad";
        String Al_Fath = "Al_Fath";
        String Al_Hujuraat = "Al_Hujuraat";
        String Qaaf = "Qaaf";
        String Adh_Dhaariyat = "Adh_Dhaariyat";
        String At_Tur = "At_Tur";
        String An_Najm = "An_Najm";
        String Al_Qamar = "Al_Qamar";
        String Ar_Rahmaan = "Ar_Rahmaan";
        String Al_Waaqia = "Al_Waaqia";
        String Al_Hadid = "Al_Hadid";
        String Al_Mujaadila = "Al_Mujaadila";
        String Al_Hashr = "Al_Hashr";
        String Al_Mumtahana = "Al_Mumtahana";
        String As_Saff = "As_Saff";
        String Al_Jumua = "Al_Jumua";
        String Al_Munaafiqoon = "Al_Munaafiqoon";
        String At_Taghaabun = "At_Taghaabun";
        String At_Talaaq = "At_Talaaq";
        String At_Tahrim = "At_Tahrim";
        String Al_Mulk = "Al_Mulk";
        String Al_Qalam = "Al_Qalam";
        String Al_Haaqqa = "Al_Haaqqa";
        String Al_Maaarij = "Al_Maaarij";
        String Nooh = "Nooh";
        String Al_Jinn = "Al_Jinn";
        String Al_Muzzammil = "Al_Muzzammil";
        String Al_Muddaththir = "Al_Muddaththir";
        String Al_Qiyaama = "Al_Qiyaama";
        String Al_Insaan = "Al_Insaan";
        String Al_Mursalaat = "Al_Mursalaat";
        String An_Naba = "An_Naba";
        String An_Naaziaat = "An_Naaziaat";
        String Abasa = "Abasa";
        String At_Takwir = "At_Takwir";
        String Al_Infitaar = "Al_Infitaar";
        String Al_Mutaffifin = "Al_Mutaffifin";
        String Al_Inshiqaaq = "Al_Inshiqaaq";
        String Al_Burooj = "Al_Burooj";
        String At_Taariq = "At_Taariq";
        String Al_Alaa = "Al_Alaa";
        String Al_Ghaashiya = "Al_Ghaashiya";
        String Al_Fajr = "Al_Fajr";
        String Al_Balad = "Al_Balad";
        String Ash_Shams = "Ash_Shams";
        String Al_Lail = "Al_Lail";
        String Ad_Dhuhaa = "Ad_Dhuhaa";
        String Ash_Sharh = "Ash_Sharh";
        String At_Tin = "At_Tin";
        String Al_Alaq = "Al_Alaq";
        String Al_Qadr = "Al_Qadr";
        String Al_Bayyina = "Al_Bayyina";
        String Az_Zalzala = "Az_Zalzala";
        String Al_Aadiyaat = "Al_Aadiyaat";
        String Al_Qaaria = "Al_Qaaria";
        String At_Takaathur = "At_Takaathur";
        String Al_Asr = "Al_Asr";
        String Al_Humaza = "Al_Humaza";
        String Al_Fil = "Al_Fil";
        String Quraish = "Quraish";
        String Al_Maaun = "Al_Maaun";
        String Al_Kawthar = "Al_Kawthar";
        String Al_Kaafiroon = "Al_Kaafiroon";
        String An_Nasr = "An_Nasr";
        String Al_Masad = "Al_Masad";
        String Al_Ikhlaas = "Al_Ikhlaas";
        String Al_Falaq = "Al_Falaq";
        String An_Naas = "An_Naas";
        String v = "";
        String d = "";
        Map<String, String> suras = new HashMap<>();
        suras.put(Al_Faatiha, "https://t.me/QiroatlarTv/8490");
        suras.put(Al_Baqara, "https://t.me/QiroatlarTv/8599");
        suras.put(Aal_i_Imraan, "https://t.me/QiroatlarTv/8683");
        suras.put(AAn_Nisaa, "https://t.me/QiroatlarTv/8771");
        suras.put(Al_Maaida, "https://t.me/QiroatlarTv/8871");
        suras.put(Al_Anaam, "https://t.me/QiroatlarTv/9012");
        suras.put(AlAraaf, "https://t.me/QiroatlarTv/9155");
        suras.put(Al_Anfaal, "https://t.me/QiroatlarTv/9304");
        suras.put(AtTawba, "https://t.me/QiroatlarTv/9415");
        suras.put(Yunus, "https://t.me/QiroatlarTv/9524");
        suras.put(Hud, "https://t.me/QiroatlarTv/9642");
        suras.put(Yusuf, "https://t.me/QiroatlarTv/9744");
        suras.put(Ar_Rad, "https://t.me/QiroatlarTv/9871");
        suras.put(Ibrahim, "https://t.me/QiroatlarTv/9957");
        suras.put(Al_Hijr, "https://t.me/QiroatlarTv/10049");
        suras.put(An_Nahl, "https://t.me/QiroatlarTv/10150");
        suras.put(Al_Israa, "https://t.me/QiroatlarTv/10199");
        suras.put(Al_Kahf, "https://t.me/QiroatlarTv/10277");
        suras.put(Maryam, "https://t.me/QiroatlarTv/10389");
        suras.put(Taa_Haa, "https://t.me/QiroatlarTv/10474");
        suras.put(Al_Anbiyaa, "https://t.me/QiroatlarTv/10563");
        suras.put(Al_Hajj, "https://t.me/QiroatlarTv/10663");
        suras.put(Al_Muminoon, "https://t.me/QiroatlarTv/10738");
        suras.put(An_Noor, "https://t.me/QiroatlarTv/10830");
        suras.put(Al_Furqaan, "https://t.me/QiroatlarTv/10899");
        suras.put(Ash_Shuaraa, "https://t.me/QiroatlarTv/10983");
        suras.put(An_Naml, "https://t.me/QiroatlarTv/11065");
        suras.put(Al_Qasas, "https://t.me/QiroatlarTv/11151");
        suras.put(Al_Ankaboot, "https://t.me/QiroatlarTv/11252");
        suras.put(Ar_Room, "https://t.me/QiroatlarTv/11342");
        suras.put(Luqman, "https://t.me/QiroatlarTv/11437");
        suras.put(As_Sajda, "https://t.me/QiroatlarTv/11575");
        suras.put(Al_Ahzaab, "https://t.me/QiroatlarTv/11665");
        suras.put(Saba, "https://t.me/QiroatlarTv/11780");
        suras.put(Faatir, "https://t.me/QiroatlarTv/11918");
        suras.put(Yaseen, "https://t.me/QiroatlarTv/12045");
        suras.put(As_Saaffaat, "https://t.me/QiroatlarTv/12157");
        suras.put(Saad, "https://t.me/QiroatlarTv/12261");
        suras.put(Az_Zumar, "https://t.me/QiroatlarTv/12349");
        suras.put(Ghafir, "https://t.me/QiroatlarTv/12442");
        suras.put(Fussilat, "https://t.me/QiroatlarTv/12588");
        suras.put(Ash_Shura, "https://t.me/QiroatlarTv/12704");
        suras.put(Az_Zukhruf, "https://t.me/QiroatlarTv/12838");
        suras.put(Ad_Dukhaan, "https://t.me/QiroatlarTv/12903");
        suras.put(Al_Jaathiya, "https://t.me/QiroatlarTv/13000");
        suras.put(Al_Ahqaf, "https://t.me/QiroatlarTv/13127");
        suras.put(Muhammad, "https://t.me/QiroatlarTv/13258");
        suras.put(Al_Fath, "https://t.me/QiroatlarTv/13401");
        suras.put(Al_Hujuraat, "https://t.me/QiroatlarTv/13492");
        suras.put(Qaaf, "https://t.me/QiroatlarTv/13674");
        suras.put(Adh_Dhaariyat, "https://t.me/QiroatlarTv/13725");
        suras.put(At_Tur, "https://t.me/QiroatlarTv/13850");
        suras.put(An_Najm, "https://t.me/QiroatlarTv/13984");
        suras.put(Al_Qamar, "https://t.me/QiroatlarTv/14110");
        suras.put(Ar_Rahmaan, "https://t.me/QiroatlarTv/14249");
        suras.put(Al_Waaqia, "https://t.me/QiroatlarTv/14420");
        suras.put(Al_Hadid, "https://t.me/QiroatlarTv/14599");
        suras.put(Al_Mujaadila, "https://t.me/QiroatlarTv/14776");
        suras.put(Al_Hashr, "https://t.me/QiroatlarTv/14925");
        suras.put(Al_Mumtahana, "https://t.me/QiroatlarTv/15069");
        suras.put(As_Saff, "https://t.me/QiroatlarTv/15182");
        suras.put(Al_Jumua, "https://t.me/QiroatlarTv/15326");
        suras.put(Al_Munaafiqoon, "https://t.me/QiroatlarTv/15469");
        suras.put(At_Taghaabun, "https://t.me/QiroatlarTv/15603");
        suras.put(At_Talaaq, "https://t.me/QiroatlarTv/15704");
        suras.put(At_Tahrim, "https://t.me/QiroatlarTv/15830");
        suras.put(Al_Mulk, "https://t.me/QiroatlarTv/15935");
        suras.put(Al_Qalam, "https://t.me/QiroatlarTv/16053");
        suras.put(Al_Haaqqa, "https://t.me/QiroatlarTv/16201");
        suras.put(Al_Maaarij, "https://t.me/QiroatlarTv/16310");
        suras.put(Nooh, "https://t.me/QiroatlarTv/16399");
        suras.put(Al_Jinn, "https://t.me/QiroatlarTv/16461");
        suras.put(Al_Muzzammil, "https://t.me/QiroatlarTv/16585");
        suras.put(Al_Muddaththir, "https://t.me/QiroatlarTv/16713");
        suras.put(Al_Qiyaama, "https://t.me/QiroatlarTv/16836");
        suras.put(Al_Insaan, "https://t.me/QiroatlarTv/16994");
        suras.put(Al_Mursalaat, "https://t.me/QiroatlarTv/17099");
        suras.put(An_Naba, "https://t.me/QiroatlarTv/17266");
        suras.put(An_Naaziaat, "https://t.me/QiroatlarTv/17323");
        suras.put(Abasa, "https://t.me/QiroatlarTv/17424");
        suras.put(At_Takwir, "https://t.me/QiroatlarTv/17547");
        suras.put(Al_Infitaar, "https://t.me/QiroatlarTv/17670");
        suras.put(Al_Mutaffifin, "https://t.me/QiroatlarTv/17798");
        suras.put(Al_Inshiqaaq, "https://t.me/QiroatlarTv/17941");
        suras.put(Al_Burooj, "https://t.me/QiroatlarTv/18046");
        suras.put(At_Taariq, "https://t.me/QiroatlarTv/18157");
        suras.put(Al_Alaa, "https://t.me/QiroatlarTv/18282");
        suras.put(Al_Ghaashiya, "https://t.me/QiroatlarTv/18459");
        suras.put(Al_Fajr, "https://t.me/QiroatlarTv/18594");
        suras.put(Al_Balad, "https://t.me/QiroatlarTv/18717");
        suras.put(Ash_Shams, "https://t.me/QiroatlarTv/18841");
        suras.put(Al_Lail, "https://t.me/QiroatlarTv/18993");
        suras.put(Ad_Dhuhaa, "https://t.me/QiroatlarTv/19130");
        suras.put(Ash_Sharh, "https://t.me/QiroatlarTv/19243");
        suras.put(At_Tin, "https://t.me/QiroatlarTv/19376");
        suras.put(Al_Alaq, "https://t.me/QiroatlarTv/19515");
        suras.put(Al_Qadr, "https://t.me/QiroatlarTv/19630");
        suras.put(Al_Bayyina, "https://t.me/QiroatlarTv/19769");
        suras.put(Az_Zalzala, "https://t.me/QiroatlarTv/19917");
        suras.put(Al_Aadiyaat, "https://t.me/QiroatlarTv/20062");
        suras.put(Al_Qaaria, "https://t.me/QiroatlarTv/20197");
        suras.put(At_Takaathur, "https://t.me/QiroatlarTv/20353");
        suras.put(Al_Asr, "https://t.me/QiroatlarTv/20523");
        suras.put(Al_Humaza, "https://t.me/QiroatlarTv/20648");
        suras.put(Al_Fil, "https://t.me/QiroatlarTv/20780");
        suras.put(Quraish, "https://t.me/QiroatlarTv/20921");
        suras.put(Al_Maaun, "https://t.me/QiroatlarTv/21064");
        suras.put(Al_Kawthar, "https://t.me/QiroatlarTv/21158");
        suras.put(Al_Kaafiroon, "https://t.me/QiroatlarTv/21285");
        suras.put(An_Nasr, "https://t.me/QiroatlarTv/21428");
        suras.put(Al_Masad, "https://t.me/QiroatlarTv/21570");
        suras.put(Al_Ikhlaas, "https://t.me/QiroatlarTv/21711");
        suras.put(Al_Falaq, "https://t.me/QiroatlarTv/21851");
        suras.put(An_Naas, "https://t.me/QiroatlarTv/21982");


        String value = "";
        for (Map.Entry<String, String> entry : suras.entrySet()) {
            if (entry.getKey().equals(valiue)) {
                value = entry.getValue();
            }

        }
        return value;
    }

    List<TelegramUsers> telegramUsers = new ArrayList<>();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage()) {
            long chatid = update.getMessage().getChatId();
            TelegramUsers telegramUser = saveuser(chatid);
            if (update.hasMessage()) {
                Message message = update.getMessage();
                if (message.hasText()) {
                    String text = message.getText();
                    if (text.equals("/start")) {
                        SendMessage sendMessage = new SendMessage();
                        sendMessage.setText("Assalomu alaykum ! \n" +
                                "Ism familyangizni kiriting");
                        sendMessage.setChatId(chatid);
                        try {
                            execute(sendMessage);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        telegramUser.setStep(botconstant.ENTER_NAME);
                    } else if (telegramUser.getStep().equals(botconstant.ENTER_NAME)) {
                        try {
                            telegramUser.setFullname(text);
                            SendMessage sendMessage = new SendMessage();
                            sendMessage.setText("surani tanlang");
                            sendMessage.setChatId(chatid);
                            int n = 0;
                            suranom[] values = suranom.values();
                            ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                            List<KeyboardRow> keyboard = new ArrayList<>();
                            for (int i = 0; i < 38; i++) {
                                KeyboardRow row = new KeyboardRow();
                                for (int j = 0; j < 3; j++) {
                                    row.add(new KeyboardButton(values[n].toString()));
                                    n++;
                                }
                                keyboard.add(row);
                            }
                            replyKeyboardMarkup.setKeyboard(keyboard);
                            replyKeyboardMarkup.setResizeKeyboard(true);
                            replyKeyboardMarkup.setOneTimeKeyboard(false);
                            replyKeyboardMarkup.setSelective(true);
                            sendMessage.setReplyMarkup(replyKeyboardMarkup);
                            execute(sendMessage);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        telegramUser.setStep(botconstant.SELECT_LANG);
                    } else if (telegramUser.getStep().equals(botconstant.WRITE_MSG)) {
                        telegramUser.setMsg(text);
                    } else if (telegramUser.getStep().equals(botconstant.SELECT_LANG)) {
                        String data = message.getText();
                        urlmanzillar urlmanzillar = new urlmanzillar();
                        for (suranom value : suranom.values())
                            if (data.equals(value.toString())) {
                                try {
                                    SendAudio sendAudio = new SendAudio();
                                    String manzill = urlmanzillar.manzil(value.toString());
                                    sendAudio.setAudio(new InputFile(manzill));
                                    sendAudio.setChatId(chatid); // chatId is the identifier of the chat where you want to send the audio
                                    sendAudio.setCaption("Surah " + value + " by Mishary Rashid Alafasy");
                                    execute(sendAudio); // execute the request and get the response
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                    }
                }
            }

        }
    }


    private TelegramUsers saveuser(long chatid) {
        for (TelegramUsers user : telegramUsers) {
            if (user.getChatid() == chatid)
                return user;
        }
        TelegramUsers user1 = new TelegramUsers();
        user1.setChatid(chatid);
        telegramUsers.add(user1);
        return user1;
    }

    private void sendtext(long chatid, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText(text);
        sendMessage.setChatId(chatid);
        try {
            execute(sendMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public String getBotUsername() {
        return "birinchiloyihabot_bot";
    }

    @Override
    public String getBotToken() {
        return "7132531285:AAH-s69UUFsUSywGihMTYP0PatTz2PrMm6E";
    }

}
