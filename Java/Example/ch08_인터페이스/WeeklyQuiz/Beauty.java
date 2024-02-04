package ch08_인터페이스.WeeklyQuiz;

public class Beauty extends Product implements DeliveryChargeCalculator {
    Beauty(String name, double price, double weight) {
        super(name, price, weight);
    }

    @Override
    public double getDeliveryCharge(double weight, double price) {
        int deliveryCharge;

        if (weight < 3) {
            deliveryCharge = 1000;
        } else if (weight < 10) {
            deliveryCharge = 5000;
        } else {
            deliveryCharge = 10000;
        }

        if (price < 30000) {
            return deliveryCharge;
        } else if (price < 100000) {
            deliveryCharge -= 1000;
            return deliveryCharge;
        } else {
            deliveryCharge = 0;
            return deliveryCharge;
        }
    }
}
