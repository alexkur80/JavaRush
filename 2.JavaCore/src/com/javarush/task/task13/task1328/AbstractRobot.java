package com.javarush.task.task13.task1328;

import java.util.Random;

public abstract class AbstractRobot implements Attackable, Defensable {
    private static int hitCount;

    public static int getHitCount() {
        return hitCount;
    }

    public static void setHitCount(int hitCount) {
        AbstractRobot.hitCount = hitCount;
    }

    public abstract String getName();

    public BodyPart defense() {

        Random hitRandom = new Random();
        int minStrike = 0;
        int maxStrike = 3;

        setHitCount(minStrike + hitRandom.nextInt(maxStrike));

        BodyPart defendedBodyPart = null;

        //  hitCount = hitCount + 2;
        setHitCount(getHitCount() + 2);

        if (getHitCount() == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (getHitCount() == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (getHitCount() == 3) {
            defendedBodyPart = BodyPart.ARM;
        } else if (getHitCount() == 4) {
            // hitCount = 0;
            setHitCount(0);

            defendedBodyPart = BodyPart.CHEST;
        }

        return defendedBodyPart;
    }

    public BodyPart attack() {

        Random hitRandom = new Random();
        int minStrike = 0;
        int maxStrike = 4;

        // hitCount = minStrike + hitRandom.nextInt(maxStrike);
        setHitCount(minStrike + hitRandom.nextInt(maxStrike));

        BodyPart attackedBodyPart = null;

        //hitCount = hitCount + 1;
        setHitCount(getHitCount() + 1);

        if (getHitCount() == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (getHitCount() == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (getHitCount() == 3) {
            attackedBodyPart = BodyPart.LEG;
        } else if (getHitCount() == 4) {
            //hitCount = 0;
            setHitCount(0);
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }
}