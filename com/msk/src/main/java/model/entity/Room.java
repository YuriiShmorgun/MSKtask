package model.entity;

import lombok.Builder;
import lombok.Getter;

import java.util.Arrays;


@Getter
@Builder
public class Room {

    private static final double METERS_ON_FEET = 0.3048;

    @Builder.Default private int length = 0;
    @Builder.Default private int width = 0;
    @Builder.Default private int height = 0;

    public int getSquare(){

        double squareFeet;

        double [] roomsPart = {
                length*METERS_ON_FEET*width*METERS_ON_FEET,
                width*METERS_ON_FEET*height*METERS_ON_FEET,
                height*METERS_ON_FEET*length*METERS_ON_FEET};

        Arrays.sort(roomsPart);
        squareFeet = roomsPart[0]*3+roomsPart[1]*2+roomsPart[2]*2;

        return (int)Math.ceil(squareFeet);
    }
}
