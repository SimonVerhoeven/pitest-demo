package dev.simonverhoeven.pitestdemo;

public interface Main {

    public static int calculate(boolean alive, boolean acceleratedGrowth, boolean badWeather, int growthPerYear, int years) {
        if (!alive) {
            return 0;
        }

        int growth = growthPerYear;
        if (badWeather) {
            --growth;
        }

        if (acceleratedGrowth) {
            growth = growth * 2;
        }

        return growth * years;

    }
}
