package lesson5;

class MyPow {

    static float pow(float i, float exp){
        if (exp == 1 || i == 0) {
            return i;
        } else if (exp < 0){
            return 1 / (i * pow(i, Math.abs(exp + 1)));
        } else if (exp == 0){
            return 1;
        }

        return i * pow(i, exp - 1f);
    }
}
