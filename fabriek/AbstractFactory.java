package fabriek;

import auto.Auto;

public interface AbstractFactory {
    public Auto createCabrio(boolean stoelverwarming);
    public Auto createF1(boolean spoiler);
}
