package model.entity;

import model.entity.Room;
import org.junit.*;

import static org.junit.Assert.*;

public class RoomTest {


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
    public void calculateTest (){
        Room room = Room.builder().width(1)
                .height(2)
                .length(3)
                .build();
        assertEquals(3, room.getSquare());
    }

    @Test
    public void nullTest (){
        Room room = Room.builder().width(4)
                .length(5)
                .build();
        assertEquals(4, room.getSquare());
    }
}