package hexlet.code;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tet {
    private static final List<String> FREE_DOMAINS = List.of(
            "gmail.com",
            "yandex.ru",
            "hotmail.com",
            "yahoo.com"
    );

    public static void getFreeDomainsCount(List<String> emails) {
        var domains = emails.stream().map(email -> email.split("@")[1]).toList();
        System.out.println(domains);
    }
}