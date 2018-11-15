package view;

import model.entity.Room;

import java.util.List;

public class PrintRoom {

    public static void printRoom (List<Room> roomList){

        for (Room room: roomList){
            System.out.println(
                    " length = " + room.getLength()+
                    " height = "+ room.getHeight()+
                    " width = " + room.getWidth()+
                    " needs " + room.getSquare() + " square meters of wallpaper"
            );
        }
    }
}
