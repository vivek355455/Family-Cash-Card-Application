package example.cashcard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/cashcards")
public class CashCardController {

    @GetMapping("/{requestedId}")
    public ResponseEntity<CashCard> findById() {
        CashCard cashCard = new CashCard(1000L, 123.45);
        return ResponseEntity.ok(cashCard);
    }
}
