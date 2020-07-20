package homework.erunda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DomesticCat {
    private final String name;
    private double weight;
    private boolean isPretty;
}
