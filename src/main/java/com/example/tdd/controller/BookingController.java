package com.example.tdd.controller;

import com.example.tdd.entity.Origin;
import com.example.tdd.entity.Travel;
import com.example.tdd.services.OriginsService;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/")
public class BookingController {

    @GetMapping("origins")
    public List<Origin> getOrigins() {
        return OriginsService.origins;
    }

    @PostMapping("travels")
    public List<Travel> getTravels(@RequestBody String body) throws ParseException {
        String strDate = (body.split("=|&"))[1];
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = formatter.parse(strDate);
        Date now = new Date();
        long days = ChronoUnit.DAYS.between(now.toInstant(), date.toInstant());
        long prevDays = days - 3;
        return List.of(
                new Travel(1, "Iberia", "324123MN", date, 120, 2, true, 124.56),
                new Travel(2, "Vueling", "3154PO", date, 54.3, 1, false, 67.79),
                new Travel(3, "Ryanair", "75168WE", date, 79.9, 0, true, 98.99)
        );
    }

    @PostMapping("testtravels")
    public void testTravels(@RequestBody Map<String, Object> body) {
        System.out.println(body);
    }
}
