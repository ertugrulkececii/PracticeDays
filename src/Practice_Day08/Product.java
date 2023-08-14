package Practice_Day08;

public class Product {
    // Bir "Product" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
// Bu constructor, ürün adını, fiyatını ve stok adedini alacak şekilde tasarlanmalıdır.
// Aynı zamanda, bu constructor içinden "display" adında bir metodu çağırarak ürün bilgilerini ekrana yazdırın.

// Örnek çıktı:
// Ürün Adı: Laptop, Fiyat: 4000.0 TL, Stok: 15 adet

    String name;
    double price;
    int stock;


    public Product(String name,double price,int stock){
        this.name=name;
        this.price=price;
        this.stock=stock;
        display();
    }

    private void display() {
        System.out.println(" Urun adi: "+ name+"\n Urun fiyati: "+price+ "$\n Urun adedi: "+ stock);
    }

    public static void main(String[] args) {
        Product product= new Product("Nissan micra",2750, 100);

        Product urun2=new Product("Macbook Pro", 55999.99,2);
    }
}
