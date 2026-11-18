# Rapor

**Ad Soyad:** Talha Eren Cevik
**Numara:** 748

## 1. Algoritma Açıklaması
<!-- Programın nasıl çalıştığını adım adım, kendi cümlelerinizle yazın. -->
Programa önce gerekli bilgileri tanımladık ve ardından kullanıcıya 4 seçenek sunuyor bakiye görüntüleme para çekme yatırma ve çıkış diye ve kullanıcı çıkışa basmadıkça her işlemin sonunda 
while döngüsü ile bu işlemlerin tekrar ekrana yansıtılmasını sağladık.

## 2. Girdi - İşlem - Çıktı

**Girdiler:**
-secim tutar

**İşlemler:**
-bakiye belirlenmesi 
-toplam yatırılan para
-toplam cekilen para
-islem sayisi
**Çıktılar:**
-bakiye
-toplam yatırılan para
-toplam cekilen para
-islem sayisi

## 3. Sözde Kod (Pseudocode)

```
1.BASLA bakiye 10 bin işlem sayısı toplam yatırma/cekme=0 menüyü göster ve seçimi al
2.secim 1 ise bakiye göster secim 2 ise para yatır 0 ve daha az ise hata ver secim 3 ise para cek tutae 0 ve az ise yada bakiyeden daha fazla ise hata ver secim 4 ise çıkışa yönlendir
3.secim 4 değilse menüyü tekrar göster eğer 4 ise son bakiyeyi,islem sayısını,toplam yatırmayı,toplam cekmeyi göster ve BİTİR
```

## 4. Akış Şeması


<img width="1553" height="660" alt="Screenshot 2026-11-18 152117" src="https://github.com/user-attachments/assets/43f29d86-3328-4831-9266-e8deb892f3f8" />
<img width="1318" height="773" alt="Screenshot 2026-11-18 152149" src="https://github.com/user-attachments/assets/fb8698cf-ce3c-4d95-aa54-45f2c0396d9e" />

## 5. Test Senaryoları (en az 8)

| No | Yapılan işlem / girdi | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 1 |1 |bakiye=10.000 |bakiye=10.000  |evet |
| 2 |2 ve 200tl ve 1 |bakiye=10.200 |bakiye=10.200 | evet|
| 3 |3 ve 5000tl ve 1 | bakiye=5.000|bakiye=5.000 | evet|
| 4 |4 |Kalan Bakiye: 10000.0 Yapilan islem sayisi: 0 Toplam yatirilan para: 0.0 toplam cekilen para: 0.0 ATM'den cikis yapiliyor... |Kalan Bakiye: 10000.0 Yapilan islem sayisi: 0 Toplam yatirilan para: 0.0 toplam cekilen para: 0.0 ATM'den cikis yapiliyor... |evet |
| 5 |2 ve -1000tl |HATA |HATA | evet|
| 6 |3 ve 12.000tl |HATA |HATA | evet|
| 7 |2 VE 0 TL |HATA |HATA |evet |
| 8 |2 ve 1000tl ve 3 2000tl ve 4 | Kalan Bakiye: 90000 Yapilan islem sayisi: 2 Toplam yatirilan para: 1000 toplam cekilen para: 2000 ATM'den cikis yapiliyor...| Kalan Bakiye: 90000 Yapilan islem sayisi: 2 Toplam yatirilan para: 1000 toplam cekilen para: 2000 ATM'den cikis yapiliyor...|evet |
