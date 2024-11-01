package BankaProgrami;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Musteri {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> hesapHareketleri = new ArrayList<>();
    private int ID;
    private String Isim;
    private String Soyisim;
    private int bakiye;
    private String Iban;
    private String Kart_Numarasi;
    private String Kart_Sifresi;
    private String Kullanici_Adi;
    private String Sifre;
    private String Yas;
    private boolean Is_Durumu;
    private int Borc;
    private int Kredi_Skoru;
    private int Kredi_Tarihi;
    private int Gelir;
    private double Faiz = 4.55 ;
    private boolean Dongu = true;



    public Musteri(int ID, String Isim, String Soyisim, int bakiye, String Iban, String Kart_Numarasi,
                   String Kart_Sifresi, String Kullanici_Adi, String Sifre, String Yas, boolean Is_Durumu, int Borc, int Kredi_Skoru, int Kredi_Tarihi,
                   int Gelir) {
        this.ID = ID;
        this.Isim = Isim;
        this.Soyisim = Soyisim;
        this.bakiye = bakiye;
        this.Iban = Iban;
        this.Kart_Numarasi = Kart_Numarasi;
        this.Kart_Sifresi = Kart_Sifresi;
        this.Kullanici_Adi = Kullanici_Adi;
        this.Sifre = Sifre;
        this.Yas = Yas;
        this.Is_Durumu = Is_Durumu;
        this.Borc = Borc;
        this.Kredi_Skoru = Kredi_Skoru;
        this.Kredi_Tarihi = Kredi_Tarihi;
        this.Gelir = Gelir;
    }

    public void hesapHareketiEkleme(String hareket){
        hesapHareketleri.add(hareket);
    }

    public double getFaiz() {
        return Faiz;
    }

    public void setFaiz(double faiz) {
        Faiz = faiz;
    }

    public int getGelir() {
        return Gelir;
    }

    public void setGelir(int gelir) {
        Gelir = gelir;
    }

    public int getID() {
        return ID;
    }

    public int getKredi_Tarihi() {
        return Kredi_Tarihi;
    }

    public void setKredi_Tarihi(int kredi_Tarihi) {
        Kredi_Tarihi = kredi_Tarihi;
    }

    public int getBorc() {
        return Borc;
    }

    public void setBorc(int borc) {
        Borc += borc;
    }

    public int getKrediSkoru() {
        return Kredi_Skoru;
    }

    public void setKrediSkoru(int krediSkoru) {
        Kredi_Skoru = krediSkoru;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getIsim() {
        return Isim;
    }

    public void setIsim(String isim) {
        Isim = isim;
    }

    public String getSoyisim() {
        return Soyisim;
    }

    public void setSoyisim(String soyisim) {
        Soyisim = soyisim;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye += bakiye;
    }

    public String getIban() {
        return Iban;
    }

    public void setIban(String iban) {
        Iban = iban;
    }

    public String getKart_Numarasi() {
        return Kart_Numarasi;
    }

    public void setKart_Numarasi(String kart_Numarasi) {
        Kart_Numarasi = kart_Numarasi;
    }

    public String getKart_Sifresi() {
        return Kart_Sifresi;
    }

    public void setKart_Sifresi(String kart_Sifresi) {
        Kart_Sifresi = kart_Sifresi;
    }

    public String getKullanici_Adi() {
        return Kullanici_Adi;
    }

    public void setKullanici_Adi(String kullanici_Adi) {
        Kullanici_Adi = kullanici_Adi;
    }

    public String getSifre() {
        return Sifre;
    }

    public void setSifre(String sifre) {
        Sifre = sifre;
    }

    public String getYas() {
        return Yas;
    }

    public void setYas(String yas) {
        Yas = yas;
    }

    public boolean isIs_Durumu() {
        return Is_Durumu;
    }

    public void setIs_Durumu(boolean is_Durumu) {
        Is_Durumu = is_Durumu;
    }

    public void paraYatir(){
        Dongu = true;
        while (Dongu){
            System.out.println("Ne kadar para yatırmak istiyorsunuz = ");
            int YatirilanTutar = scanner.nextInt();
            bakiye += YatirilanTutar;
            System.out.println("Yeni bakiyeniz = " + bakiye);
            hesapHareketleri.add("Para Yatırılma işlemi uygulandı \nYatırılan tutar = " + YatirilanTutar);
            System.out.println("Bu menüden çıkmak istiyorsanız lütfen q'ya basınız");
            if (scanner.next().equals("q")){
                Dongu = false;
            }
        }
}

    public void paraCek (){
        Dongu = true;
        while (Dongu){
        System.out.println("Hesabınızda bulunan bakiyeniz = " + bakiye);
        System.out.println("Ne kadar para çekmek istiyorsunuz = ");
        int tutar = scanner.nextInt();
        if (tutar <= 5000){
            System.out.println("Bir günde 5000'tl den fazla para çekemezsiniz");
        }
        else {
            if (bakiye < tutar){
                System.out.println("Çekmek istediğiniz tutar kadar paranız bulunmamaktadır.");
            }
            else {
                bakiye -= tutar;
                System.out.println(tutar + " TL para çekildi \nYeni bakiyeniz = " + bakiye);
                hesapHareketleri.add("Para çekilme işlemi uygulandı \nÇekilen tutar = " + tutar);
            }
        }
            System.out.println("Bu menüden çıkmak istiyorsanız lütfen q'ya basınız");
        if (scanner.next().equals("q")){
            Dongu = false;
            System.out.println("Bir üst menüye yönlendiriliyorsunuz");
        }
    }
    }

    public void paraYolla(){
        Dongu = true;
        while (Dongu){
            System.out.println("Lütfen para yollamak istediğiniz kullanıcının ibanını giriniz");
            String iban = scanner.nextLine();
            if (!ibanKontrol(iban)){
                boolean icDongu = true;
                while (icDongu){
                    System.out.println("Lütfen geçerli bir iban giriniz");
                    iban = scanner.nextLine();
                    if (ibanKontrol(iban)){
                        icDongu = false;
                    }
                }
            }
            System.out.println("Lütfen göndermek istediğiniz tutarı giriniz");
            int gonderilecekTutar = scanner.nextInt();
            scanner.nextLine();
        if (gonderilecekTutar > bakiye){
            System.out.println("Yetersiz bakiye");
        }
        else {
            if (gonderilecekTutar < 0){
                gonderilecekTutar *= -1;
            }
            System.out.println("Girdiğiniz ibana " + gonderilecekTutar + " tl yollandı");
            bakiye -= gonderilecekTutar;
            System.out.println("Yeni bakiyeniz = " + bakiye);
            hesapHareketleri.add("Para yollama işlemi uygulandı \nYollanan tutar = " + gonderilecekTutar);
        }
            System.out.println("Bu menüden çıkmak istiyorsanız lütfen q'ya basınız");
        if (scanner.next().equals("q")){
            Dongu = false;
            System.out.println("Bir üst menüye yönlendiriliyorsunuz");
        }
    }
    }

    public boolean ibanKontrol (String iban){
        iban=iban.toUpperCase(Locale.ROOT);
        String kontrol ="ABCÇDEFGĞHIİJKLMNOPRSŞTUÜVYZQWX";
        String[] alfabe = new String[kontrol.length()];
        for (int i= 0; i < kontrol.length();i++){
            alfabe[i] = String.valueOf(kontrol.charAt(i));
        }
        boolean ibanCheck = false;
        for (int i = 0; i < iban.length();i++) {
            for (int j = 0; j < alfabe.length;j++){
                if (String.valueOf(iban.charAt(i)).equals(alfabe[j])){
                    ibanCheck = true;
                }
            }
        }
        if ((!(iban.startsWith("TR"))) || (iban.length() !=26) || ibanCheck){

            System.out.println("Geçersiz iban girişi");
            return false;
        }
        return true;
    }

    public void krediCek(int cekilmekIstenenTutar){
        krediSkoruHesaplama(cekilmekIstenenTutar);
        System.out.println("Bankamızın uyguladığı faiz oranı = " + Faiz);
        System.out.println("Bu faiz oranı ile " + cekilmekIstenenTutar + " tutarı çekerseniz geri ödeyeceğiniz tutar = " + (cekilmekIstenenTutar * Faiz));
        System.out.println("Bu şartları kabul ediyor musunuz \nEvet\nHayır");
        String kabul = scanner.next();
        kabul= kabul.toUpperCase();
        if (kabul.equals("EVET")){
            if (Kredi_Skoru > 60){
                System.out.println("Kredi çekmenizin önünde herhangi bir engel gözükmüyor. Çekmek istediğiniz kredi tutarı hesabınıza yatırılmıştır");
                bakiye += cekilmekIstenenTutar;
                Borc += (int) Math.ceil((cekilmekIstenenTutar * Faiz));
                hesapHareketleri.add("Kredi çekilme işlemi uygulandı \nÇekilen kredi tutarı = " + cekilmekIstenenTutar);
            }
            else {
                System.out.println("Kredi skorunuz yeterli değil. Üzgünüz kredi veremiyoruz size");
            }
        }
        else {
            System.out.println("Kredi çekme bölümünden çıkılıyor");
        }

    }
    public void krediSkoruHesaplama(int cekilmekIstenenKredi){
        if (Kredi_Tarihi > 1){
            Kredi_Skoru += 25;
        }
        if (Gelir > (cekilmekIstenenKredi/12)){
            Kredi_Skoru += 20;
        }
        if (Borc > 0){
            Kredi_Skoru -= 15;
        }
        if (Is_Durumu){
            Kredi_Skoru +=10;
        }
        if (Kredi_Tarihi > 0){
            Kredi_Skoru += 15;
        }
    }
    public void borcOdeme(){
        if (Borc>0){
        Dongu = true;
        while (Dongu){
        System.out.println("Güncel borç miktarınız = " + Borc);
        System.out.println("Borcunuzun ne kadarını ödemek isterseniz");
        int borcOdeme = scanner.nextInt();
        if (borcOdeme > bakiye){
            System.out.println("Hesabınızda ödemek istediğiniz miktar kadar nakit bulunmamaktadır.\nLütfen ilk başta para yatırınız");
        }
        else {
            Borc -= borcOdeme;
            bakiye -= borcOdeme;
            System.out.println("Kalan borcunuz = " + Borc);
            System.out.println("Ödediğiniz miktardan sonra kalan hesap bakiyeniz = " + bakiye);
            hesapHareketleri.add("Borc odeme işlemi uygulandı \nOdenen borc miktarı = " + borcOdeme);
        }
            System.out.println("Bu menüden çıkmak istiyorsanız lütfen q'ya basınız");
            if (scanner.next().equals("q")){
                Dongu = false;
                System.out.println("Bir üst menüye yönlendiriliyorsunuz");
            }
        }
    }else {
            System.out.println("Borcunuz bulunmamaktadır");
        }
    }
    public void hesapHareketleriniBastirma(){
        for (int i = 0; i < hesapHareketleri.size(); i++){
            hesapHareketleri.get(i);
        }
    }
}


