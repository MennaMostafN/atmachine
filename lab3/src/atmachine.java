public class atmachine {
    public float accbalance = 0;
    public boolean authentic = false;
    public boolean cardvalidity = true;
    public boolean passvalidity = true;

    public String enterCard() {
        if (cardvalidity) {
            return "Validated card";
        } else {
            return "Card not validated";
        }
    }

    public String enterPassword() {
        if (cardvalidity) {
            System.out.println("Enter Password");
            if (passvalidity) {
                authentic = true;
                return "Successful login";
            } else {
                return "Wrong password";
            }
        } else {
            return "Enter card first";
        }
    }

    public String deposit(float money) {
        if (authentic) {
            if (money >= 50 && money <= 50000) {
                accbalance += money;
                return "Successful deposit";
            } else {
                return "Enter valid amount";
            }
        } else {
            return "Not allowed";
        }
    }

    public String withdraw(float amount) {
        if (authentic) {
            if (amount <= accbalance) {
                accbalance -= amount;
                return "Successful withdraw";
            } else {
                return "Not enough balance";
            }
        } else {
            return "Not allowed";
        }
    }

    public String removeCard() {
        if (cardvalidity) {
            return "Card removed";
        } else {
            return "Not allowed";
        }
    }
}

