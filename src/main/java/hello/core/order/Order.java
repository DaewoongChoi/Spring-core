package hello.core.order;

public class Order {

   private Long memberId;

   private String itemName;

   private int productPrice;

   private int discountPrice;

    public Order(Long memberId, String itemName, int productPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.productPrice = productPrice;
        this.discountPrice = discountPrice;
    }

    public int calculatePrice(){
        return productPrice - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", productPrice=" + productPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
