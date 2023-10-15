package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.order.Order;

public class PriceDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP)
        {
            return discountFixAmount;
        }
        return 0;
    }
}
