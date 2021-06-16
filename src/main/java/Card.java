import java.util.Objects;

/**
 * @Author dell
 * @Date 2021/4/26 15:41
 * @Version 1.0
 */

public class Card {

    private String CHEAPISH;

    private String DAYS;


    public Card(String CHEAPISH, String DAYS) {
        this.CHEAPISH = CHEAPISH;
        this.DAYS = DAYS;
    }

    public Card() {
    }

    public String getCHEAPISH() {
        return CHEAPISH;
    }

    public void setCHEAPISH(String CHEAPISH) {
        this.CHEAPISH = CHEAPISH;
    }

    public String getDAYS() {
        return DAYS;
    }

    public void setDAYS(String DAYS) {
        this.DAYS = DAYS;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Card card = (Card) o;
        return Objects.equals(CHEAPISH, card.CHEAPISH);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CHEAPISH);
    }


    @Override
    public String toString() {
        return "Card{" +
                "CHEAPISH='" + CHEAPISH + '\'' +
                ", DAYS='" + DAYS + '\'' +
                '}';
    }
}
