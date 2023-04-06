# AATODEV2_HORSPOOL_ARAMA_ALGORITMASI
Algoritma Analizi ve Tasarımı Ödevi

Burada yer alan bir Horspool algoritmasıdır bu algoritma bir metin içindeki girdiğimiz kelimeyi arayan ve içerisinde kaç tane o kelimeden olduğunu gösteren bir arama 
algoritmasıdır.

Horspool algoritması, önceden hesaplanan desenin sağdan soldan kaçıncı indekste olduğunu tutan bir dizi kullanarak arama işlemini gerçekleştirir. Bu sayede, bir kez 
önişleme adımı yaparak her seferinde metindeki belirli bir sayıda karakteri kontrol eder ve gereksiz karşılaştırmaları önler.

-En iyi zaman karmaşıklığı : En iyi durumda Horspool algoritmasının zaman karmaşıklığı O(n/m) olabilir. Burada, desen metnin içinde sadece bir kez geçer ve desenin 
uzunluğu, metnin uzunluğunun bir kısmı kadardır. Bu durumda, önişleme adımının hesaplama maliyeti göz ardı edilebilir düzeydedir ve algoritma çok hızlı çalışır.

-En kötü zaman karmaşıklığı : En Kötü durumda Horspool algoritmasının zaman karmaşıklığı O(nm) olabilir. Burada, n ve m sırasıyla metnin ve desenin uzunluğunu temsil eder. 
Bu durumda, desen metnin her karakteri ile eşleşmiyor ve desenin metin içinde bulunmadığı son karaktere kadar ilerlemek zorunda kalınıyor.

-Orta zaman karmaşıklığı : Ortalama durumda Horspool algoritması genellikle O(n) zaman karmaşıklığına sahiptir. Bu, desenin ve metnin uzunluğu arasındaki orantıya bağlı 
olarak değişebilir, ancak algoritmanın önişleme adımı sayesinde performansı genellikle iyi olur.
