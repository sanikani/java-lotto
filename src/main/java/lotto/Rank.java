package lotto;

import java.util.Arrays;

public enum Rank {
    FIRST(2_000_000_000, 6, false),
    SECOND(30_000_000, 5, true),
    THIRD(1_500_000, 5, false),
    FOURTH(50_000, 4, false),
    FIFTH(5_000, 3, false),
    DEFAULT(0, 0, false);

    private final int prize;
    private final int count;
    private final boolean hasBonusNumber;

    Rank(int prize, int count, boolean hasBonusNumber) {
        this.prize = prize;
        this.count = count;
        this.hasBonusNumber = hasBonusNumber;
    }

    public static Rank findRanking(int cnt, boolean hasBonusNumber) {
        return Arrays.stream(Rank.values())
                .filter(ranking -> ranking.count == cnt && ranking.hasBonusNumber == hasBonusNumber)
                .findAny()
                .orElse(DEFAULT);
    }

    public int getPrize() {
        return prize;
    }

    public int getCount() {
        return count;
    }

    public boolean isHasBonusNumber() {
        return hasBonusNumber;
    }
}
