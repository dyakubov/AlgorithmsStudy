package lesson5;

class Exponentiation {

    float getExp(float i, float exp){
        if (exp == 1 || i == 0) {
            return i;
        } else if (exp < 0){
            return 1 / (i * getExp(i, Math.abs(exp + 1)));
        } else if (exp == 0){
            return 1;
        }

        return i * getExp(i, exp - 1f);
    }
}
