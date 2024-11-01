package BankaProgrami;

public class Ogrenci extends Musteri{
    private String okulAdi;
    private int okulNumarasi;
    private double okulOrtalamasi;
    private boolean ilDisiOkumaDurumu;
    private int bursHakki = 1;

    public Ogrenci(int ID, String Isim, String Soyisim, int bakiye, String Iban, String Kart_Numarasi, String Kart_Sifresi, String Kullanici_Adi, String Sifre, String Yas,
                   boolean Is_Durumu, int Borc, int Kredi_Skoru, int Kredi_Tarihi, int Gelir, String okulAdi, int okulNumarasi,
                   boolean ilDisiOkumaDurumu, double okulOrtalamasi) {

        super(ID, Isim, Soyisim, bakiye, Iban, Kart_Numarasi, Kart_Sifresi, Kullanici_Adi, Sifre, Yas, Is_Durumu, Borc, Kredi_Skoru, Kredi_Tarihi, Gelir);
        this.okulAdi = okulAdi;
        this.okulNumarasi = okulNumarasi;
        this.ilDisiOkumaDurumu = ilDisiOkumaDurumu;
        this.okulOrtalamasi = okulOrtalamasi;
    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public int getOkulNumarasi() {
        return okulNumarasi;
    }

    public void setOkulNumarasi(int okulNumarasi) {
        this.okulNumarasi = okulNumarasi;
    }

    public double getOkulOrtalamasi() {
        return okulOrtalamasi;
    }

    public void setOkulOrtalamasi(double okulOrtalamasi) {
        this.okulOrtalamasi = okulOrtalamasi;
    }

    public boolean isIlDisiOkumaDurumu() {
        return ilDisiOkumaDurumu;
    }

    public void setIlDisiOkumaDurumu(boolean ilDisiOkumaDurumu) {
        this.ilDisiOkumaDurumu = ilDisiOkumaDurumu;
    }

    public void bursBasvurusu(){
        if (bursHakki == 1){
            if (okulOrtalamasi <= 4 && okulOrtalamasi >= 3.5){
                System.out.println("Burs kazanmaya hak kazandınız \nHesabınıza burs paranız yatırılıyor");
                setBakiye(1000);
                hesapHareketiEkleme("Burs basvurma işlemi uygulandı");
                bursHakki--;
            }
            else if (okulOrtalamasi>4){
                System.out.println("Üzgünüz ama bursiyerlerimiz 4'lük ortalama sistemi ile değerlendiriyoruz ve sizin girdiğiniz ortalama 4'lük ortalama sistemine uygun değil");
            }
            else {
                System.out.println("Üzgünüz ortalamanız yeterli değil");
            }
        }
        else System.out.println("Zaten bir kere burs aldınız bizden ikinci kez alamazsınız");
    }
    @Override
     public void krediCek(int cekilmekIstenenTutar){
        krediSkoruHesaplama(cekilmekIstenenTutar);
        System.out.println("Bankamızın uyguladığı faiz oranı = " + ((getFaiz()*80)/100));
        System.out.println("Bu faiz oranı ile " + cekilmekIstenenTutar + " tutarı çekerseniz geri ödeyeceğiniz tutar = " + (cekilmekIstenenTutar * ((getFaiz()*80)/100)));
        System.out.println("Bu şartları kabul ediyor musunuz \nEvet\nHayır");
        String kabul = scanner.next();
        kabul= kabul.toUpperCase();
        if (kabul.equals("EVET")){
            if (getKrediSkoru() > 60){
                System.out.println("Kredi çekmenizin önünde herhangi bir engel gözükmüyor. Çekmek istediğiniz kredi tutarı hesabınıza yatırılmıştır");
                setBakiye(cekilmekIstenenTutar);
                setBorc((int) Math.ceil((cekilmekIstenenTutar * ((getFaiz()*80)/100))));
                hesapHareketleri.add("Düşük faizli kredi çekilme işlemi uygulandı \nÇekilen kredi tutarı = " + cekilmekIstenenTutar);
            }
            else {
                System.out.println("Kredi skorunuz yeterli değil. Üzgünüz kredi veremiyoruz size");
            }
        }
        else {
            System.out.println("Kredi çekme bölümünden çıkılıyor");
        }
    }
    public void yurtBasvurusu(){
        
    }
}
