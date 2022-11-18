package com.example.tdd.services;

import com.example.tdd.entity.Destination;
import com.example.tdd.entity.Origin;

import java.util.List;

public class OriginsService {
    public static List<Origin> origins = List.of(
            new Origin(1, "Madrid", List.of(
                    new Destination(1, "New York"),
                    new Destination(2, "Japan"),
                    new Destination(3, "Thailand")
            )),
            new Origin(2, "Barcelona", List.of(
                    new Destination(1, "Pekín"),
                    new Destination(2, "Quito"),
                    new Destination(3, "Washington DC")
            )),
            new Origin(3, "Sevilla", List.of(
                    new Destination(1, "Paris"),
                    new Destination(2, "Londres"),
                    new Destination(3, "Madrid")
            )),
            new Origin(4, "Málaga", List.of(
                    new Destination(1, "Praga"),
                    new Destination(2, "Varsovia"),
                    new Destination(3, "Dublín")
            )),
            new Origin(5, "Jerez", List.of(
                    new Destination(1, "Madrid"),
                    new Destination(2, "Barcelona"),
                    new Destination(3, "París")
            ))
    );
}
