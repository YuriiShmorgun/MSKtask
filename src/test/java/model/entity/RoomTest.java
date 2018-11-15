package model.entity;

import org.junit.*;

import static org.junit.Assert.*;

public class RoomTest {

    @Test
    public void getSquare() {
    }

    @Test
    public void builder() {
        Room room = Room.builder().height(2)
                .length(2)
                .width(2)
                .build();
        assertEquals(2, room.getHeight());
        assertEquals(2, room.getLength());
        assertEquals(2, room.getWidth());
    }

    @Test
    public void calculateTest1 (){
        Room room = Room.builder().width(1)
                .height(2)
                .length(3)
                .build();
        assertEquals(0, room.getSquare());
    }
}