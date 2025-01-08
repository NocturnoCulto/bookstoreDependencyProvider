package pl.umkworkshop.bookstoreDependencyProvider.services.description

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component
import pl.umkworkshop.bookstoreDependencyProvider.services.description.model.DescriptionDTO

@Component
class DescriptionProvider {

    private val descriptionMap: MutableMap<Long, DescriptionDTO> = mutableMapOf()

    fun getDescriptionById(id: Long): DescriptionDTO {
        return descriptionMap[id] ?: descriptionMap[123L]!!
    }

    @PostConstruct
    fun fillDescriptions2() {
        descriptionMap[123L] = DescriptionDTO(
            123L,
            "Hobbit to powieść fantasy autorstwa J.R.R. Tolkiena, opowiadająca o przygodach Bilba Bagginsa, który wyrusza na wyprawę, aby pomóc krasnoludom odzyskać ich królestwo.",
            "Hobbit, czyli tam i z powrotem to powieść fantasy autorstwa J.R.R. Tolkiena, opublikowana po raz pierwszy w 1937 roku. Książka opowiada o przygodach Bilba Bagginsa, hobbita, który wyrusza na wyprawę z grupą krasnoludów, aby odzyskać ich królestwo spod władzy smoka Smauga. W trakcie podróży Bilbo napotyka wiele niebezpieczeństw i odkrywa w sobie odwagę, której nigdy wcześniej nie podejrzewał. Powieść jest prequelem do trylogii Władca Pierścieni i wprowadza czytelników do świata Śródziemia."
        )
        descriptionMap[125L] = DescriptionDTO(
            125L,
            "Władca Pierścieni to epicka powieść fantasy autorstwa J.R.R. Tolkiena, składająca się z trzech tomów: Drużyna Pierścienia, Dwie Wieże i Powrót Króla.",
            "Władca Pierścieni to epicka powieść fantasy autorstwa J.R.R. Tolkiena, opublikowana w latach 1954-1955. Składa się z trzech tomów: Drużyna Pierścienia, Dwie Wieże i Powrót Króla. Książka opowiada o podróży Froda Bagginsa, hobbita, który musi zniszczyć Jedyny Pierścień, aby uratować Śródziemie przed złem Saurona. W trakcie podróży Frodo jest wspierany przez Drużynę Pierścienia, w skład której wchodzą przedstawiciele różnych ras Śródziemia. Powieść jest uważana za jedno z najważniejszych dzieł literatury fantasy i miała ogromny wpływ na rozwój gatunku."
        )
        descriptionMap[127L] = DescriptionDTO(
            127L,
            "Silmarillion to zbiór mitopoeicznych opowieści autorstwa J.R.R. Tolkiena, które stanowią tło dla wydarzeń opisanych w Hobbicie i Władcy Pierścieni.",
            "Silmarillion to zbiór mitopoeicznych opowieści autorstwa J.R.R. Tolkiena, opublikowany pośmiertnie w 1977 roku przez jego syna Christophera Tolkiena. Książka zawiera historie o stworzeniu świata, bogach i pierwszych wiekach Śródziemia. Centralnym elementem opowieści są Silmarile, trzy klejnoty stworzone przez elfa Fëanora, które stają się przyczyną wielu konfliktów i wojen. Silmarillion stanowi tło dla wydarzeń opisanych w Hobbicie i Władcy Pierścieni, a także wprowadza czytelników do bogatej mitologii i historii Śródziemia."
        )
        descriptionMap[129L] = DescriptionDTO(
            129L,
            "Quo vadis to powieść historyczna autorstwa Henryka Sienkiewicza, opowiadająca o prześladowaniach chrześcijan w starożytnym Rzymie za czasów cesarza Nerona.",
            "Quo vadis to powieść historyczna autorstwa Henryka Sienkiewicza, opublikowana po raz pierwszy w 1896 roku. Książka opowiada o miłości rzymskiego patrycjusza Marka Winicjusza do chrześcijanki Ligii na tle prześladowań chrześcijan w starożytnym Rzymie za czasów cesarza Nerona. Powieść ukazuje brutalność i dekadencję rzymskiego imperium, a także siłę i odwagę pierwszych chrześcijan. Quo vadis zdobyło międzynarodową sławę i przyczyniło się do przyznania Sienkiewiczowi Nagrody Nobla w dziedzinie literatury w 1905 roku."
        )
        descriptionMap[130L] = DescriptionDTO(
            130L,
            "Potop to druga część Trylogii Henryka Sienkiewicza, opowiadająca o wydarzeniach związanych z najazdem szwedzkim na Polskę w XVII wieku.",
            "Potop to druga część Trylogii Henryka Sienkiewicza, opublikowana po raz pierwszy w latach 1886-1887. Powieść opowiada o wydarzeniach związanych z najazdem szwedzkim na Polskę w XVII wieku, znanym jako Potop szwedzki. Głównym bohaterem jest Andrzej Kmicic, który przechodzi wewnętrzną przemianę z awanturnika i zdrajcy w bohatera narodowego. Powieść ukazuje heroizm i poświęcenie Polaków w obronie ojczyzny oraz ich walkę o wolność i niepodległość. Potop jest uważany za jedno z najważniejszych dzieł literatury polskiej i stanowi ważny element polskiego dziedzictwa kulturowego."
        )
        descriptionMap[131L] = DescriptionDTO(
            131L,
            "Krzyżacy to powieść historyczna autorstwa Henryka Sienkiewicza, opowiadająca o konflikcie między Polską a Zakonem Krzyżackim w XV wieku.",
            "Krzyżacy to powieść historyczna autorstwa Henryka Sienkiewicza, opublikowana po raz pierwszy w 1900 roku. Książka opowiada o konflikcie między Polską a Zakonem Krzyżackim w XV wieku, ze szczególnym uwzględnieniem bitwy pod Grunwaldem w 1410 roku. Głównymi bohaterami są Zbyszko z Bogdańca i Danusia Jurandówna, których losy splatają się z wydarzeniami historycznymi. Powieść ukazuje heroizm i poświęcenie Polaków w walce z Krzyżakami oraz ich dążenie do obrony ojczyzny. Krzyżacy są uważani za jedno z najważniejszych dzieł literatury polskiej i stanowią ważny element polskiego dziedzictwa kulturowego."
        )
        descriptionMap[132L] = DescriptionDTO(
            132L,
            "Pan Wołodyjowski to trzecia część Trylogii Henryka Sienkiewicza, opowiadająca o losach Michała Wołodyjowskiego, małego rycerza, w XVII-wiecznej Polsce.",
            "Pan Wołodyjowski to trzecia część Trylogii Henryka Sienkiewicza, opublikowana po raz pierwszy w latach 1887-1888. Powieść opowiada o losach Michała Wołodyjowskiego, zwanego małym rycerzem, który walczy w obronie Polski przed najazdami tatarskimi i tureckimi w XVII wieku. Głównym wątkiem jest miłość Wołodyjowskiego do Krystyny Drohojowskiej oraz jego heroiczne czyny na polu bitwy. Powieść ukazuje heroizm i poświęcenie Polaków w obronie ojczyzny oraz ich walkę o wolność i niepodległość. Pan Wołodyjowski jest uważany za jedno z najważniejszych dzieł literatury polskiej i stanowi ważny element polskiego dziedzictwa kulturowego."
        )
        descriptionMap[135L] = DescriptionDTO(
            135L,
            "Ogniem i mieczem to pierwsza część Trylogii Henryka Sienkiewicza, opowiadająca o wydarzeniach związanych z powstaniem Chmielnickiego w XVII wieku.",
            "Ogniem i mieczem to pierwsza część Trylogii Henryka Sienkiewicza, opublikowana po raz pierwszy w latach 1884-1886. Powieść opowiada o wydarzeniach związanych z powstaniem Chmielnickiego w XVII wieku, które miało na celu wyzwolenie Ukrainy spod władzy Rzeczypospolitej. Głównymi bohaterami są Jan Skrzetuski, Helena Kurcewiczówna i Bohdan Chmielnicki, których losy splatają się z wydarzeniami historycznymi. Powieść ukazuje heroizm i poświęcenie Polaków w walce z Kozakami oraz ich dążenie do obrony ojczyzny. Ogniem i mieczem jest uważane za jedno z najważniejszych dzieł literatury polskiej i stanowi ważny element polskiego dziedzictwa kulturowego."
        )
        descriptionMap[140L] = DescriptionDTO(
            140L,
            "Krew elfów to powieść fantasy autorstwa Andrzeja Sapkowskiego, pierwsza część sagi o wiedźminie Geralcie z Rivii.",
            "Krew elfów to powieść fantasy autorstwa Andrzeja Sapkowskiego, opublikowana po raz pierwszy w 1994 roku. Jest to pierwsza część sagi o wiedźminie Geralcie z Rivii, który walczy z potworami i stara się chronić młodą księżniczkę Ciri przed niebezpieczeństwami. Powieść ukazuje świat pełen magii, politycznych intryg i konfliktów między różnymi rasami. Krew elfów zdobyła uznanie czytelników i krytyków, a także przyczyniła się do międzynarodowej popularności serii o wiedźminie."
        )
        descriptionMap[145L] = DescriptionDTO(
            145L,
            "Czas pogardy to druga część sagi o wiedźminie Geralcie z Rivii autorstwa Andrzeja Sapkowskiego, opowiadająca o dalszych losach Geralta i Ciri.",
            "Czas pogardy to powieść fantasy autorstwa Andrzeja Sapkowskiego, opublikowana po raz pierwszy w 1995 roku. Jest to druga część sagi o wiedźminie Geralcie z Rivii, który walczy z potworami i stara się chronić młodą księżniczkę Ciri przed niebezpieczeństwami. Powieść ukazuje świat pełen magii, politycznych intryg i konfliktów między różnymi rasami. Czas pogardy zdobył uznanie czytelników i krytyków, a także przyczynił się do międzynarodowej popularności serii o wiedźminie."
        )
        descriptionMap[150L] = DescriptionDTO(
            150L,
            "Chrzest ognia to trzecia część sagi o wiedźminie Geralcie z Rivii autorstwa Andrzeja Sapkowskiego, opowiadająca o dalszych losach Geralta i Ciri.",
            "Chrzest ognia to powieść fantasy autorstwa Andrzeja Sapkowskiego, opublikowana po raz pierwszy w 1996 roku. Jest to trzecia część sagi o wiedźminie Geralcie z Rivii, który walczy z potworami i stara się chronić młodą księżniczkę Ciri przed niebezpieczeństwami. Powieść ukazuje świat pełen magii, politycznych intryg i konfliktów między różnymi rasami. Chrzest ognia zdobył uznanie czytelników i krytyków, a także przyczynił się do międzynarodowej popularności serii o wiedźminie."
        )
        descriptionMap[155L] = DescriptionDTO(
            155L,
            "Wieża Jaskółki to czwarta część sagi o wiedźminie Geralcie z Rivii autorstwa Andrzeja Sapkowskiego, opowiadająca o dalszych losach Geralta i Ciri.",
            "Wieża Jaskółki to powieść fantasy autorstwa Andrzeja Sapkowskiego, opublikowana po raz pierwszy w 1997 roku. Jest to czwarta część sagi o wiedźminie Geralcie z Rivii, który walczy z potworami i stara się chronić młodą księżniczkę Ciri przed niebezpieczeństwami. Powieść ukazuje świat pełen magii, politycznych intryg i konfliktów między różnymi rasami. Wieża Jaskółki zdobyła uznanie czytelników i krytyków, a także przyczyniła się do międzynarodowej popularności serii o wiedźminie."
        )
        descriptionMap[160L] = DescriptionDTO(
            160L,
            "Pani Jeziora to piąta i ostatnia część sagi o wiedźminie Geralcie z Rivii autorstwa Andrzeja Sapkowskiego, opowiadająca o dalszych losach Geralta i Ciri.",
            "Pani Jeziora to powieść fantasy autorstwa Andrzeja Sapkowskiego, opublikowana po raz pierwszy w 1999 roku. Jest to piąta i ostatnia część sagi o wiedźminie Geralcie z Rivii, który walczy z potworami i stara się chronić młodą księżniczkę Ciri przed niebezpieczeństwami. Powieść ukazuje świat pełen magii, politycznych intryg i konfliktów między różnymi rasami. Pani Jeziora zdobyła uznanie czytelników i krytyków, a także przyczyniła się do międzynarodowej popularności serii o wiedźminie."
        )
    }
}