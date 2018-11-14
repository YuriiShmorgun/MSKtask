package model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class Room {

    private Integer length;
    private Integer width;
    private Integer height;


    public Integer getSquare(){
        return length*width*2+width*height*2+height*length*2;
    }
}
