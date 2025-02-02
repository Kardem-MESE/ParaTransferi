# ParaTransferi

ParaTransferi, bankacılık işlemleri için geliştirilmiş bir otomasyon test projesidir. Bu proje, Java ve Selenium kullanarak para transferi işlemlerini test etmeyi amaçlamaktadır.

## 📌 Proje İçeriği
Bu proje, aşağıdaki test senaryolarını içermektedir:
- Para transferi işleminin başarılı olup olmadığının kontrolü
- Hatalı girişlerin ve sınır durumlarının test edilmesi
- UI ve fonksiyonel testlerin gerçekleştirilmesi
- Raporlama ve log mekanizmalarının kullanımı

## 🚀 Teknolojiler
Projede kullanılan başlıca teknolojiler:
- **Java** (Test otomasyonu dili)
- **Selenium WebDriver** (Web uygulamalarını test etmek için)
- **TestNG / JUnit** (Test çerçeveleri)
- **Allure Report** (Test raporlama aracı)
- **Maven** (Bağımlılık yönetimi ve proje yapısı)

## 📂 Kurulum
Projeyi yerel ortamınıza klonlamak için aşağıdaki adımları izleyebilirsiniz:

```sh
# Depoyu klonlayın
git clone https://github.com/Kardem-MESE/ParaTransferi.git

# Proje dizinine gidin
cd ParaTransferi

# Gerekli bağımlılıkları yükleyin
mvn clean install
```

## 🛠️ Kullanım
Projeyi çalıştırmak için aşağıdaki komutu kullanabilirsiniz:

```sh
mvn test
```

Test sonuçlarını Allure raporlarıyla görmek için:
```sh
allure serve target/allure-results
```

## 📌 Katkıda Bulunma
Eğer projeye katkıda bulunmak isterseniz, aşağıdaki adımları takip edebilirsiniz:
1. **Fork** yapın
2. Yeni bir **branch** oluşturun (`feature-xyz` gibi)
3. Değişikliklerinizi yapın ve commitleyin (`git commit -m 'Yeni özellik eklendi'`)
4. **Push** yapın (`git push origin feature-xyz`)
5. Pull Request açın

## 📄 Lisans
Bu proje MIT lisansı ile lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına göz atabilirsiniz.

---

📧 **İletişim:**
Herhangi bir sorunuz veya öneriniz varsa, GitHub Issues bölümünden veya doğrudan benimle iletişime geçebilirsiniz!


