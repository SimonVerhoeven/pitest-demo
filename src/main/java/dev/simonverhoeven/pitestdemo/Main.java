package dev.simonverhoeven.pitestdemo;

public interface Main {
    int decay_per_year = 5;

    public static int calculateSize(boolean alive, int initialSize, boolean acceleratedGrowth, boolean badWeather, int growthPerYear, int years) {
        final int decayPerYear = 5;

        if (!alive) {
            return initialSize - decayPerYear * years;
        }

        int growth = growthPerYear;
        if (badWeather) {
            --growth;
        }

        if (acceleratedGrowth) {
            growth = growth * 2;
        }

        return initialSize + growth * years;

    }
}
