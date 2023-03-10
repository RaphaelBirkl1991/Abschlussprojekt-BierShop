package com.example.backend;


import com.example.backend.entity.Kunde;
import com.example.backend.entity.Produkt;
import com.example.backend.entity.Stellenangebot;
import com.example.backend.repository.KundenRepository;
import com.example.backend.repository.ProduktRepository;
import com.example.backend.repository.StellenangebotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class BackendApplication {

    @Autowired
    KundenRepository kundenRepository;
    @Autowired
    private ProduktRepository produktRepository;


    @Autowired
    private StellenangebotRepository stellenangebotRepository;

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);


    }

    @Bean
    CommandLineRunner runner() {
        return args -> {

            // Dummy Kundenobjekte

            Kunde kunde1 = new Kunde("Anton", "Mayer", "Kölner Platz", 12, 80804, "München", "anton.mayer@gmail.com", "017662750204");
            Kunde kunde2 = new Kunde("Frederike", "Leitgeb", "Jahnstraße", 40, 74598, "Pfaffenhofen/Ilm", "frederike.leitgeb@web.de", "015790099075");
            Kunde kunde3 = new Kunde("Bernhard", "Lehmann", "Sendlingerstraße", 27, 80335, "München", "bernhardt.lehmann@gmx.de", "07549950306");
            Kunde kunde4 = new Kunde("Hannelore", "Engelhardt", "Scheidplatz", 7, 865542, "München", "hannelore.engelhadt@gmail.de", "015717780830");
            Kunde kunde5 = new Kunde("Hermann", "Hesse", "Marienstraße", 78, 35648, "Köln", "hermann.hesse@hotmail.de", "01758951430");
            Kunde kunde6 = new Kunde("Berta", "Schmidt", "Paulstraße", 12, 78945, "Regensburg", "berta.schmidt@web.com", "0157184925");
            Kunde kunde7 = new Kunde("Kristine", "Hoyer", "Kloppstockstraße", 4, 80804, "München", "tine.hoyer@gmail.de", "01767777333");
            Kunde kunde8 = new Kunde("Raphael", "Birkl", "Telschowstraße", 47, 89745, "Garching b. München", "raphael.pascal@gmail.com", "017662750204");
            Kunde kunde9 = new Kunde("Max", "Wedemann", "An der Reeperbahn", 7, 58852, "Hamburg", "shark.max@hotmail.com", "01765898745");
            Kunde kunde10 = new Kunde("Georgi", "Sandurkov", "Am Goldstrand", 13, 12456, "Plovdiv", "georgi.sitztamstrand@bulgariamail.bu", "+456985995789");
            Kunde kunde11 = new Kunde("Mathilda", "Maier", "Gabisstraße", 19, 77877, "Berlin", "mathilda.maier@gmx.de", "0187878474");
            Kunde kunde12 = new Kunde("Wolfgang", "Biehler", "Substitutionsstraße", 12, 88787, "Frankfurt", "wolfi.dealerFFM@gmx.to", "01745987340");

            kundenRepository.save(kunde1);
            kundenRepository.save(kunde2);
            kundenRepository.save(kunde3);
            kundenRepository.save(kunde4);
            kundenRepository.save(kunde5);
            kundenRepository.save(kunde6);
            kundenRepository.save(kunde7);
            kundenRepository.save(kunde8);
            kundenRepository.save(kunde9);
            kundenRepository.save(kunde10);
            kundenRepository.save(kunde11);
            kundenRepository.save(kunde12);

            Produkt klostergoldHell = new Produkt("Klostergold Hell", 19.80, 4.5, "Vollbier", 0.5, "Hefe, reife Birne, Mandarine ",
                    "keine Bittere", "Grillen, Sommerfest, Feierabend, Frühschoppen", " Brauwasser, Weizenmalz, Gerstenmalz, Hopfen, Hopfenauszug, Hefe", "Kloster Scheyern ist heute" +
                    "in Bayern eine von wenigen authentischen Klosterbrauereien. Die Mönche leben dort – wie seit Jahrhunderten – " +
                    "in weltlicher Abgeschiedenheit. Hier haben die Scheyerner Klosterbiere ihre Wurzeln. Sie stehen auch für die " +
                    "Güte ihrer überregional angebotenen Biere der Marke Kloster Scheyern ein, die bei der Tucher Privatbrauerei nach speziellen " +
                    "Vorgaben und mit Gottes Segen in Lizenz produziert werden. Überlieferte Rezepturen und ausgewählte Zugaben bürgen für den authentischen " +
                    "Geschmack und höchste Qualität.", "https://www.klosterbrauerei-scheyern.de/wp-content/uploads/sites/2/2020/11/Kloster_Scheyern_Gold-Hell_05l.png");

            produktRepository.save(klostergoldHell);


            Produkt augustinerEdelstoff = new Produkt("Augustiner Edelstoff", 22.10, 3.8, "Vollbier", 0.5, "Hopfig bis malzig", "kaum wahrnehmbare Bittere ", "Sommerfest, gesellige Runde, Frühschoppen", "Wasser, Gerstenmalz, Hopfen", "Der Edelstoff steht klar mit einem satten Gelb" +
                    " im Glas und ein Duft nach Honig und zitrusartigen Orangennoten erfreuen die Nase. Weich im Antrunk, entwickelt er seinen erfrischenden " +
                    "Charakter auf der Zunge mit fein säuerlichen Hopfennoten, die die grundlegende Malzaromatik sogar noch hervorheben, ohne dass das Export " +
                    "seinen Charakter verliert. Ein elegantes und würziges Export", "https://gefako-bierentdecker-m1webservice.azurewebsites.net/Images/Article/medium/aa3a7ef8-bc89-4468-9538-3a4a1f05d4b9");

            produktRepository.save(augustinerEdelstoff);


            Produkt jaegerbierFreising = new Produkt("Hofbrauhaus Freising Jägerbier", 18.60, 4.7, "Vollbier", 0.5, "Biskuit, Getreide, Zitrusnote ", "mild, dezent bitter", "Feierabend, TV Abend, Frühschoppen ",
                    "Wasser, Gerstenmalz, Hopfen", "Ein sehr ausbalanciertes helles Exportbier auf Höchststufe." +
                    " Leuchtend gelb mit einer beeindruckenden Schaumkrone umspielt ein schöner Duft nach frischem Brot und süßem Honig die Nase. Im Geschmack liegt der " +
                    "Schwerpunkt deutlich auf einem wunderbar facettenreich gestaltetem Malzkörper. Das lebendige Finish ist elegant und wenig Hopfenbitter. ", "https://gefako-bierentdecker-m1webservice.azurewebsites.net/Images/Article/medium/6e8a00b4-07bb-4485-b31d-7599d38ff6d2");

            produktRepository.save(jaegerbierFreising);


            Produkt alpirsbacherKlosterDunkel = new Produkt("Alpirsbacher Kloster Dunkel", 23.00, 5.2, "Vollbier", 0.5, "Karamell, Röstbittere, Nuss",
                    "angenehme Röstmalzbittere", "Grillen, Seele baumeln lassen, Kamingespräch", " Wasser, Gerstenmalz, Hopfen", "Etwas flüchtig zeigt sich der mittelporig und anhaftende Schaum." +
                    " Um so kräftiger strahlt das glanzfeine Kastanienbraun aus dem Glase. Deutliche Karamellnoten gepaart mit Röstaromen sowie Vanille und Schokolade." +
                    " Der Antrunk ruht in sich. Die Aromen von Karamell wiederholen sich mit nussigen Anklängen und einer Röstbittere, die auch den Nachtrunk dominiert. ", "https://gefako-bierentdecker-m1webservice.azurewebsites.net/Images/Article/medium/ba3267d5-0142-4d4b-b6d5-8490d1439266");

            produktRepository.save(alpirsbacherKlosterDunkel);


            Produkt weltenburgerKlosterHefe = new Produkt("Weltenburger Kloster Hefe", 20.00, 5.4, "Vollbier", 0.5, "Banane, Zitrone, Gewürznelke", "kaum Bittere zu schmecken", "Sommerfest, gesellige Runde, Party",
                    "Wasser, Gerstenmalz, Hopfen", "Die kompakte helle Schaumkrone und die hefetrübe goldgelbe Farbe" +
                    " erfreuen das Auge. Ein fruchtiger Geruch mit Noten von Banane und Gewürznelken kitzelt die Nase bevor das Bier in einem erfrischenden milden Antrunk mit Noten von Banane," +
                    " Zitrone und Gewürznelke die Zunge berührt. Malzigsüße und hefefruchtige Akzente von Banane, und Toastbrot werden zum Abgang unterlegt von einer zitronig-frischen Hopfennote.", "https://gefako-bierentdecker-m1webservice.azurewebsites.net/Images/Article/medium/4d3c9923-d8c4-4d80-8fac-1a90212cf9c0");

            produktRepository.save(weltenburgerKlosterHefe);


            Produkt schorndorferTreibstoff = new Produkt("Schorndorfer Treibstoff", 21.50, 5.2, "Vollbier", 0.5, "frisch gebackenes Weißbrot, Blütenhonig, Zitrone", "Zitrusfrische Hopfenbittere im Abgang",
                    "Picknick, Feierabend, TV Abend", "Hopfen, Malz, Wasser", "Mit seiner satten goldgelben Farbe, seiner naturbelassenen, unfiltrierten " +
                    "Optik und einem porigen, anhaftenden Schaum lädt der Schorndorfer Treibstoff zum Trinken ein. Dezente Malzaromen, unterlegt mit einer fruchtigen Note nach Quitte, steigen" +
                    " zusammen mit süßen Honigtönen in die Nase. Der Antrunk ist mild und fein moussierend und lässt den Aromen im Mund allen Platz, sich zu entfalten. Diese sind geprägt durch" +
                    " leicht süßliche Noten nach Blütenhonig sowie Töne nach frisch gebackenem Weißbrot. Eine hopfenbasierte Zitrusaromatik rundet das Bier ab, das mit einer sehr dezenten Bittere " +
                    "langsam ausklingt.", "https://gefako-bierentdecker-m1webservice.azurewebsites.net/Images/Article/medium/0df1ed8e-5e9f-4577-b5b8-09c46fb51454");

            produktRepository.save(schorndorferTreibstoff);


            Produkt zwiefalterKloster = new Produkt("Zwiefalter Klosterbräu Hefeweizen naturtrüb", 20.50, 4.8, "Vollbier", 0.5, "Weißbrot, Wiesenkräuter, weich, Birne",
                    "dezent, gut eingebunden", "Picknick, gesellige Runde, Frühschoppen", "Wasser, Hopfen, Gerstenmalz", "Optisch imponiert das Weißbier mit einem schönen weißen Schaum," +
                    " der lange anhält. In der Nase spielen Aromen von frischer Hefe, Weissbrot, etwas Nelke und blumige Töne. Sehr spritzig und schlank macht es beim Trinken durch das CO2 einen leicht" +
                    " säuerlichen Eindruck, der schön durch milde getreidige und nelkenartige Noten ergänzt wird. Auch der Hopfen kommt schön zum Vorschein und gibt Struktur. Die typischen Fruchtaromen" +
                    " bleiben sehr dezent.", "https://gefako-bierentdecker-m1webservice.azurewebsites.net/Images/Article/medium/df97183d-14b8-4866-9090-c65804223e90");

            produktRepository.save(zwiefalterKloster);
//
//
            Produkt gansbraeu = new Produkt("Gansbräu Rotbier", 24.00, 5.00, "Vollbier", 0.5, "Zartbitterschokolade, Kandiszucker, Trockenfrüchte", "feine Röstbittere im Nachtrunk",
                    "Hochzeit, Seele baumeln lassen, Kamingespräch, TV Abend ", "Wasser, Gerstenmalz, Hopfen",
                    "Dieses Rotbier weist neben seiner schönen, klaren Kupferfarbe und dem feinporigen Schaum eine kräftige" + " Malzaromatik nach Karamellbonbon und Zartbitterschokolade auf. Weich im Antrunk, verteilt sich dieses Rotbier" +
                            " cremig auf der Zunge und erfreut mit seinen herrlich schokoladigen Tönen, abgerundet durch einen Strauß " +
                            "verschiedener Trocken- und Rumtopffrüchte und dem angenehmen Hauch von Kandiszucker. Auch die feine Röstbittere" +
                            " am Ende ist wahrnehmbar und bildet einen sehr guten Ausgleich zu der malzigen Süße.", "https://gefako-bierentdecker-m1webservice.azurewebsites.net/Images/Article/medium/a18888f4-d939-463a-9efe-2a6ea30879df");

            produktRepository.save(gansbraeu);


            Produkt andechserBergbock = new Produkt("Andechser Bergbock Hell", 21.00, 6.9, "Vollbier", 0.5, "Honig, getoastetes Brot, Heu, etwas Alkohol",
                    "sehr dezente Bittere, leicht nachklingend", "gesellige Runde, Hochzeit, Seele baumeln lassen", "Hopfen, Gerstenmalz, Wasser", "Der helle Bergbock der Klosterbrauerei Andechs ist ein Bier, welches seinen Alkoholgehalt" +
                    " nicht versteckt. Goldgelb und klar leuchtete es im Glas. Der Schaum verschwindet schnell und kleine, feine Bläschen steigen auf. Orange, etwas Mandel und auch der Alkohol melden sich " +
                    "in der Nase und der erste Schluck ist Honigsüß. Getoastetes Brot, Heu und wieder eine deutliche Alkohlnote machen diesen Bock etwas kantig. Eine feine Perlage umspielt die Zunge und der " +
                    "kräftige Körper trägt die Restsüße wunderbar zum nächsten Schluck.", "https://gefako-bierentdecker-m1webservice.azurewebsites.net/Images/Article/medium/ee6c472f-36fa-4f0f-9471-1e0679062906");

            produktRepository.save(andechserBergbock);


            Produkt aktienLandbier = new Produkt("Aktien Landbier fränkisch Dunkel", 20.00, 5.3, "Vollbier", 0.5, "Röstmalz, Karamell, etwas dunkle Schokolade", "etwas nachklingende Röstmalzbirne", "Picknick, erstes Date, Kindergeburtstag",
                    "Hopfen, Malz, Wasser", "Das Bayreuther Aktien Landbier Dunkel ist ein wunderbar klar braun leuchtendes " +
                    "Bier mit einer tollen, stabilen beigen Schaumkrone. Der Geruch ist röstig, nach dunklem Brot und etwas süß nach Karamell. Der Antrunk bestätigt die Nase nach Röstmalz, etwas süßem Karamell" +
                    " und dazu dunkle Schokolade. Der Eindruck ist mild und die Kohlensäure erfrischt und eine feine Bittere klingt etwas nach. ", "https://gefako-bierentdecker-m1webservice.azurewebsites.net/Images/Article/medium/aad4edd9-6ed8-453b-bf58-80d14f65c14f");

            produktRepository.save(aktienLandbier);


            Produkt schoenbusch = new Produkt("Schönbusch Horst Hell", 21.50, 5.0, "Vollbier", 0.5, "Röstmalze, Bananenbrot mit Kürbis", "dezent-vollmundig", "Kommunion, Kantine", "Hopfen, Malz, Wasser", "Spannender Name für ein Bier! Da ist man doch umso mehr gespannt, wie es schmeckt! Das helle Lagerbier " +
                    "der Schönbuch Braumanufaktur aus Böblingen hat eine glanzfeine, satte goldgelbe Farbe und bildet einen schneeweißen und feinporigen Schaum aus. Ganz dem Stil gerecht ist die Aromatik in der" +
                    " Nase sehr mild und besticht mit aromatischen Malznoten nach Getreide. Nach einem erfrischenden und moussierenden Antrunk findet sich ein milder, angenehmer Malzkörper mit frischen floralen " +
                    "Hopfenakzenten im Mund wieder und unterstützt den leichten Charakter des Bieres. Ausgewogen und mit einer dezenten Herbe klingt das Bier aus.", "https://gefako-bierentdecker-m1webservice.azurewebsites.net/Images/Article/medium/5661b93c-58ea-42f9-b0d0-2f7eca18f52d");

            produktRepository.save(schoenbusch);

            Produkt mayersBrauwerk = new Produkt("Mayers Brauwerk Schiller", 20.00, 4.8, "Vollbier", 0.5, "Leichtes Hopfenaroma mir Lemon-Squeezy", "stark bitter", "Notartermin, beim Programmieren, Zahnarztbesuch", "Hopfen, Gerstenmalz, Wasser",
                    "Das Bier mit seinem hellen Bernsteinton wird im Licht mit goldenen Reflexen durchzogen. " +
                            "Es bildet sich cremefarbener Schaum, der sich an den leuchtenden Körper schmiegt. Karamellige Malznoten mit süßlich-weichen Komponenten nach Sahnekaramell und Kandiszucker eröffnen den" +
                            " Haupttrunk. Der vollmundige und sanfte Körper wirkt durch die feinperlige Kohlensäure erfrischend. Die Bittere ist gut eingebettet und klingt langsam bis zum Abgang aus. ", "https://gefako-bierentdecker-m1webservice.azurewebsites.net/Images/Article/medium/3a570fbc-3681-447d-840d-ce70a9b1bcb9");

            produktRepository.save(mayersBrauwerk);


//            STELLENANGEBOTE

            Stellenangebot bierfahrerBeifahrer = new Stellenangebot ("Bierfahrer-Beifahrer", "Die Tätigkeit als Bierfahrer Beifahrer gilt ale einer der besten Berufe in Bayern. Bierfahrer stehen im Ruf selbst gerne etwas zu trinken. Natürlich ist das bei uns nicht der Fall. Der Bierfahrer muss jedeerzeit komplett nüchtern sein. " +
                    "bei der BIERSCHOLLE gilt ein strenge 0 ‰ Regel für alle unsere Fahrer. Nur so kann die Sicherheit im Straßenverkehr gewährleistet werden und unsere Bierfahrer-Beifahrer kommen sicher an ihr Ziel! Der Bierfahrer Beifahrer jedoch kann sich gerne - wenn dies in Maßen geschieht- einen erfrischenden Hopfentrunk zu Gemüte führen." +
                    "Der Bierfahrer Beifahrer ist wie bereits erwähnt ein landläufiger Traumberuf im Freistaat. Weiter unten findest du einen entsprechenden Link :) Wenn du stark bist und gerne körperlich arbeitest kannst du als Bierfahrer-Beifahrer viel spaß haben. Du arbeitest von Montag bis Freitags und wenn du und dein Fahrer ein eingespieltes Team seid, habt ihr meistens schon etwas früher" +
                    "Deierabend. Unsere Routen sind human geplant! Du trittst für die BIERSCHOLLE täglich mit Kunden in Kontakt und bist unser Aushängeschild beim Kunden.", "Kraft, Ausdauer, Hilfsbreitschaft, gute Laune", "Trinkgeld, angenehmes Arbeitsumfeld, Freiheit bei der Einteilung des Arbeitstages, Kundenkontakt", "gestern", 54000, "https://www.youtube.com/watch?v=mwcGVoQ23Oc", "Großraum München" );

            stellenangebotRepository.save(bierfahrerBeifahrer);


        Stellenangebot biertester = new Stellenangebot("Biertester", "Du bist ein echter Bierkenner? Dann brauchen wir deine Experitse und deine Geschmacksknospen. Als Biertester verkostest du täglich unsere Produkte und gibst uns Feedback zu Qualität, Geschmack, Güte und weiteren Details unserer Biere. Du füllst nach der Verkostung Feedbackbögen aus und reportest direkt an die Geschäftsleitung wenn " +
                "eines unserer Produkte mal nicht so gut schmecken sollte. Du bist DER zentrale Punkt um unsere Qualitätsstandards zu halten. Du kannst sowohl in-office als auch remote arbeiten. Neben Bier trinken überwachst du unsere Brauereien und hast die Freiheit bei allen unseren Zulieferern unangemeldet aufzuschalgen und einen Schluck zu nehmen. " +
                "Wichtig ist uns das du bereits viel Erfahrung im Biertrinken mitbringst aber diesen anspruchsvollen Job gleichzeiti ernst nimmst. Richtig bist du bei uns wenn du verantwortungscoll genießt und diese Stelle nicht reinen -Trinkerjob- siehst.", "Guter Geschmackssinn, Verantwortungsbewusstsein, Flexibilität, selbständiges Arbeiten", "Freie Zeiteinteilung, Dienstwagen (auch zur privaten Nutzung), Home Office mäglich",
                "01.04.2023", 60000, "https://www.die-biertester.de/", "Bundesweit");

        stellenangebotRepository.save(biertester);

        Stellenangebot gabelstaplerfahrer = new Stellenangebot("Gabelstaplerfahrer", "Für unser Logistikzentrum suchen wir einen  zverlässigen Mitarbeiter in der Warendisposition. Du besitzt den Staplerführerschein und hast Freude daran mit zwei Zacken durch unsere modernen Lagerhallen zu düsen? Dann bist du hier genau richtig. Zu deinen Aufgaben gehört es, unsere Kostbare Ware einzulagern und auf unsere Bier-LKW zu verladen. " +
                "Zur Verfügung steht dir unser modernes Lagermanagement System, für welches du extra geschult wirst. So bekommst du deine Verlagerungsaufträge direkt auf dein Display im modernen ReachStacker.", "Staplerführerschein, Erfahrung im Staplerfahren, Lernbereitschaft, (im Idealfall heißt du Klaus)", "Um die Ecke Driften, Socail events, Zusätzliche betriebliche Unfallversicherung durch uns", "01.05.2023", 56000, "https://www.youtube.com/watch?v=xzS5xdSeS10", "Garching b. München");

        stellenangebotRepository.save(gabelstaplerfahrer);
        };
    }
}





