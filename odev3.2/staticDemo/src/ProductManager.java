public class ProductManager {
    public void add(Product product){
      // ProductValidator validator = new ProductValidator();
       if(ProductValidator.isValid(product)) {
           System.out.println("eklendi");
       }else {
           System.out.println("ürün bilgileri eklenemedi");
       }

     //  ProductValidator validator = new ProductValidator();
      // validator.bisey();
    }
}
