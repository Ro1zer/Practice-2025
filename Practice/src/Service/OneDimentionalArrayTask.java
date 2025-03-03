package Service;

/**
 * Обчислити сеpеднє аpифметичне значення та кількість елементів масиву
 * A(n) (0<=n<=80), які більші за задане число F.
 */
public class OneDimentionalArrayTask {
    private float[] array = new float[80];
    private float F = 0.0f;
    private int freeIndex = 0;
    private int countOfValues = 0;
    private float middle = 0.0f;

    public boolean put(final float number) {
        if(!isValidNumber(number)) {
            System.out.println("Wrong argument, expected the number of range from 0 to 80, but was: " + number);
            return false;
        }
        else if (freeIndex == array.length) {
            System.out.println("Array full");
            return false;
        }
        array[freeIndex] = number;
        freeIndex += 1;
        return true;
    }

    public void calculate(final float F) {
        this.F = F;
        float sumOfValues = 0.0f;
        for(float temp : array) {
            if (temp > F) {
                sumOfValues += temp;
                countOfValues++;
            }
        }
        middle =  sumOfValues / (float) countOfValues;
        print();
    }

    public void print() {
        System.out.println("[Array]");
        for (int i = 0; i < freeIndex; i++) {
            System.out.println("["+i+"]" + " = " + array[i]);
        }
        System.out.println("[F]: " + F);
        System.out.println("[Middle]: " + middle);
        System.out.println("[A(i) > F]: " + countOfValues);
    }

    private boolean isEmptyArray() {
        return freeIndex == 0;
    }
    public int getLength() {
        return array.length;
    }
    private boolean isValidNumber(final float number) {
        return number >= 0 && number <= 80;
    }
}
