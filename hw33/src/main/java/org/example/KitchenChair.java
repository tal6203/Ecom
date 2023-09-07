package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KitchenChair  extends Chair{
    private boolean adjustments;
    private boolean spinning;
    private static boolean discount = true;
    private int discountAmount;


    public KitchenChair(String model, int numberOfLegs, Float price,boolean adjustments,boolean spinning,int discountAmount) {
        super(model, numberOfLegs, price);
        this.adjustments = adjustments;
        this.spinning = spinning;
        this.discountAmount = discountAmount;
    }

    public boolean GetDiscount(){
        return discount;
    }

    @Override
    public String printChair() {
        String format = String.format("[Chair: %s][Kitchen chair: adjustments: %s,spinning: %s,discount: %s,discountAmount: %d]", super.printChair(), this.adjustments, this.spinning, GetDiscount(), getDiscountAmount());
        return format;
    }

    public Float calculatePrice(int numberOfChairs) {
        if (true == GetDiscount()) {
            Float calculationDiscount = (getPrice() * getDiscountAmount())/100;
            float forOnePic =  getPrice() - calculationDiscount;
            return forOnePic * numberOfChairs;
        }
        else {
            return calculatePrice(numberOfChairs);
        }
    }
    }


