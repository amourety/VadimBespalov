package models;

import lombok.*;
/**
 * Created by amour on 18.09.2018.
 */

@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString

public class Invoice {
    private Long id;
    private Long idOfUser;
    private String date;
    private Double sum;
}
