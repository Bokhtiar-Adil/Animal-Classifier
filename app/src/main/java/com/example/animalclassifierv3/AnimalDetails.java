package com.example.animalclassifierv3;


import java.util.ArrayList;

public class AnimalDetails {
    public static final String[] OPTIONS = new String[]{
            "Serial",
            "Name",
            "Alert",
            "Scientific Name",
            "Conservation Status",
            "Description"
    };

    public static final String[] Dummy = new String[]{
            "0",
            "Name of the animal",
            "False",
            "Tinca tinca",
            "Least Concern",
            "The tench or doctor fish (Tinca tinca) is a fresh- and brackish-water fish of the order Cypriniformes found throughout " +
                    "Eurasia from Western Europe including the British Isles east into Asia as far as the Ob and Yenisei Rivers.",

    };

    public static String[][] DETAILS = new String[][]{
            {
                "0",
                    "Tence fish",
                    "Venomous. Time limit for death: 50 minutes.",
                    "Tinca Tinca",
                    "Least Concern",
                    "The tench or doctor fish (Tinca tinca) is a fresh- and brackish-water fish of the order Cypriniformes found throughout Eurasia from Western Europe including the British Isles east into Asia as far as the Ob and Yenisei Rivers.[3] It is also found in Lake Baikal." +
                            "It normally inhabits slow-moving freshwater habitats, particularly lakes and lowland rivers."
            },
            {
                "1",
                    "Goldfish.",
                    "False",
                    "Carassius auratus",
                    "Least Concern",
                    "The goldfish (Carassius auratus) is a freshwater fish in the family Cyprinidae of order Cypriniformes." +
                            "It is commonly kept as a pet in indoor aquariums, and is one of the most popular aquarium fish." +
                            " Goldfish released into the wild have become an invasive pest in parts of North America.[4]\n" +
                            "\n" + "Native to East Asia, the goldfish is a relatively small member of the carp family " +
                            "(which also includes the Prussian carp and the crucian carp)." +
                            " It was first selectively bred for color in imperial China more than 1,000 years ago," +
                            " and several distinct breeds have since been developed. Goldfish breeds vary greatly in size, body shape," +
                            " fin configuration, and coloration (various combinations of white, yellow, orange, red, brown, and black are known)"

            },
            {
                "2",
                    "White shark",
                    "False",
                    "Carcharodon carcharias",
                    "Threatened",
                    "The great white shark (Carcharodon carcharias), also known as the white shark, white pointer, or simply great white, " +
                            "is a species of large mackerel shark which can be found in the coastal surface waters of all the major oceans." +
                            " It is notable for its size, with larger female individuals growing to 6.1 m (20 ft) in length and " +
                            "1,905–2,268 kg (4,200–5,000 lb) in weight at maturity. However, most are smaller;" +
                            " males measure 3.4 to 4.0 m (11 to 13 ft), and females measure 4.6 to 4.9 m (15 to 16 ft) on average." +
                            " According to a 2014 study, the lifespan of great white sharks is estimated to be as long as 70 years or more," +
                            " well above previous estimates, making it one of the longest lived cartilaginous fishes currently known." +
                            " According to the same study, male great white sharks take 26 years to reach sexual maturity, " +
                            "while the females take 33 years to be ready to produce offspring." +
                            " Great white sharks can swim at speeds of 25 km/h (16 mph)[10] for short bursts and to depths of " +
                            "1,200 m (3,900 ft)."

            },
            {
                "3",
                    "Tiger shark",
                    "False",
                    "Galeocerdo cuvier",
                    "Not threatened",
                    "The tiger shark (Galeocerdo cuvier) is a species of requiem shark and the last extant member of the Family galeocerdonidae. It is a large macropredator, capable of attaining a length over 5 m (16 ft 5 in). Populations are found in many tropical and temperate waters, especially around central Pacific islands. Its name derives from the dark stripes down its body, which resemble a tiger's pattern, but fade as the shark matures.[5]\n" +
                            "\n" +
                            "The tiger shark is a solitary, mostly nocturnal hunter. It is notable for having the widest food spectrum of all sharks, with a range of prey " +
                            "that includes crustaceans, fish, seals, birds, squid, turtles, sea snakes, dolphins, and even other smaller sharks. It also has a reputation as a \"garbage eater\"," +
                            " consuming a variety of inedible, man-made objects that linger in its stomach. Though apex predators, tiger sharks are sometimes taken as prey by groups of killer whales." +
                            " It is considered a near threatened species because of finning and fishing by humans.\n" +
                            "\n" + "The tiger shark is second only to the great white in recorded fatal attacks on humans, but these events are still exceedingly rare."
            },
            {
                "4",
                    "Hammerhead shark",
                    "False",
                    "Sphyrnidae",
                    "Not threatened",
                    "The hammerhead sharks are a group of sharks that form the family Sphyrnidae, so named for" +
                            " the unusual and distinctive structure of their heads, which are flattened and " +
                            "laterally extended into a \"hammer\" shape called a cephalofoil. Most hammerhead " +
                            "species are placed in the genus Sphyrna, while the winghead shark is placed in its own genus, Eusphyra. Many different, but not necessarily mutually exclusive, functions have been postulated for the cephalofoil, including sensory reception, manoeuvering, and prey manipulation. The cephalofoil gives the shark superior binocular vision and depth perception.[1]\n" +
                            "\n" +"Hammerheads are found worldwide in warmer waters along coastlines and " +
                            "continental shelves. Unlike most sharks, some hammerhead species usually swim in schools during the day, becoming solitary hunters at night. "

            },
            {
                "5",
                    "Electric ray",
                    "False",
                    "Torpediniformes",
                    "Threatened",
                    "The electric rays are a group of rays, flattened cartilaginous fish with enlarged pectoral fins, composing the order Torpediniformes /tɔːrˈpɛdɪnɪfɔːrmiːz/. They are known for being capable of producing an electric discharge, ranging from 8 to 220 volts, depending on species, used to stun prey and for defense.[2] There are 69 species in four families.\n" +
                            "\n" +
                            "Perhaps the best known members are those of the genus Torpedo. The torpedo undersea weapon is named after it. The name comes from the Latin torpere, " +
                            "'to be stiffened or paralyzed', from the effect on someone who touches the fish"
            },
            {
                "6",
                    "Stingray",
                    "Venomous. Not deadly.",
                    "Myliobatoidei",
                    "Threatened",
                    "Stingrays are a group of sea rays, which are cartilaginous fish related to sharks. They are classified in the suborder Myliobatoidei of the order Myliobatiformes and consist of eight families: Hexatrygonidae (sixgill stingray), Plesiobatidae (deepwater stingray), Urolophidae (stingarees), Urotrygonidae (round rays), Dasyatidae (whiptail stingrays), Potamotrygonidae (river stingrays), Gymnuridae (butterfly rays) and Myliobatidae (eagle rays).[1][2] There are about 220 known stingray species organized into 29 genera.\n" +
                            "\n" +
                            "Stingrays are common in coastal tropical and subtropical marine waters throughout the world. Some species, such as the thorntail stingray (Dasyatis thetidis), are found in warmer temperate oceans and others, such as the deepwater stingray (Plesiobatis daviesi), are found in the deep ocean. The river stingrays and a number of whiptail stingrays (such as the Niger stingray (Fontitrygon garouaensis)) are restricted to fresh water. Most myliobatoids are demersal (inhabiting the next-to-lowest zone in the water column), " +
                            "but some, such as the pelagic stingray and the eagle rays, are pelagic."
            },
            {
                "7",
                    "Cock",
                    "False",
                    "Gallus gallus domesticus",
                    "Domesticated",
                    "The chicken (Gallus gallus domesticus) is a domesticated junglefowl species, with attributes of wild species such as the grey and the Ceylon junglefowl[1] that are originally from Southeastern Asia. Rooster or cock is a term for an adult male bird, and a younger male may be called a cockerel. A male that has been castrated is a capon. An adult female bird is called a hen and a sexually immature female is called a pullet. Humans now keep chickens primarily as a source of food (consuming both their meat and eggs) and as pets. " +
                            "Traditionally they were also bred for cockfighting, which is still practiced in some places."
            },
            {
                "8",
                    "Hen",
                    "False",
                    "Gallus gallus domesticus",
                    "Domesticated",
                    "The chicken (Gallus gallus domesticus) is a domesticated junglefowl species, with attributes of wild species such as the grey and the Ceylon junglefowl[1] that are originally from Southeastern Asia. Rooster or cock is a term for an adult male bird, and a younger male may be called a cockerel. A male that has been castrated is a capon. An adult female bird is called a hen and a sexually immature female is called a pullet. Humans now keep chickens primarily as a source of food (consuming both their meat and eggs) and as pets. " +
                            "Traditionally they were also bred for cockfighting, which is still practiced in some places."

            },
            {
                "9",
                    "Ostrich",
                    "False",
                    "Struthio camelus",
                    "Not threatened",
                    "Ostriches are large flightless birds of the genus Struthio in the order Struthioniformes, part of the infra-class " +
                            "Palaeognathae, a diverse group of flightless birds also known as ratites that includes the emus," +
                            " rheas, and kiwis. There are two living species of ostrich: the common ostrich, native to large areas of sub-Saharan Africa and the Somali ostrich, native to the Horn of Africa.[2] The common ostrich was also historically native to the Arabian Peninsula," +
                            " and ostriches were present across Asia as far east as Mongolia during the Late Pleistocene and possibly into the Holocene. They lay the largest eggs of any living land animal. With the ability to run at 70 km/h (43.5 mph), " +
                            "they are the fastest birds on land. They are farmed worldwide, particularly for their feathers as they are used as decoration and feather dusters. " +
                            "Their skin is also used for leather products. They are the heaviest living birds."
            },
            {
                "10",
                    "Brambling bird",
                    "False",
                    "Fringilla montifringilla",
                    "Least concern",
                    "This bird is widespread, in the breeding season, throughout the forests of northern Europe and east " +
                            "across the Palearctic. It is migratory, wintering in southern Europe, North Africa, " +
                            "northern India, northern Pakistan, China, and Japan. It frequently strays into Alaska during" +
                            "migration and there are scattered records across the northern United States and southern Canada.[8] The global population of bramblings is about 100 to 200 million, with a decreasing trend.[1]\n" +
                            "\n" +
                            "Open coniferous or birch woodland is favoured for breeding."
            },
            {
                "291",
                    "Lion",
                    "False",
                    "Panthera leo",
                    "Vulnerable",
                    "The lion (Panthera leo) is a large cat of the genus Panthera native to Africa and India. It has a muscular, broad-chested body, short, " +
                            "rounded head, round ears, and a hairy tuft at the end of its tail. It is sexually dimorphic; adult male lions are larger than females " +
                            "and have a prominent mane. It is a social species, forming groups called prides. A lion's pride consists of a few adult males, " +
                            "related females, and cubs. Groups of female lions usually hunt together, preying mostly on large ungulates. " +
                            "The lion is an apex and keystone predator; although some lions scavenge when opportunities occur and have been known to hunt humans, the species typically does not actively seek out and prey on humans.\n" +
                            "The lion inhabits grasslands, savannas and shrublands. It is usually more diurnal than other wild cats, but when persecuted, it adapts to being active at night and at twilight. During the Neolithic period, the lion ranged throughout Africa and Eurasia from Southeast Europe to India, " +
                            "but it has been reduced to fragmented populations in sub-Saharan Africa and one population in western India. It has been listed as Vulnerable on the IUCN Red List since 1996 because populations in African countries have declined by about 43% since the early 1990s. " +
                            "Lion populations are untenable outside designated protected areas. " +
                            "Although the cause of the decline is not fully understood, habitat loss and conflicts with humans are the greatest causes for concern.\n" +
                            "One of the most widely recognised animal symbols in human culture, the lion has been extensively depicted in sculptures and paintings, " +
                            "on national flags, and in contemporary films and literature. Lions have been kept in menageries since the time of the Roman Empire and have been " +
                            "a key species sought for exhibition in zoological gardens across the world since the late 18th century. Cultural depictions of lions w" +
                            "ere prominent in Ancient Egypt, and depictions have occurred in virtually all ancient and medieval cultures in the lion's " +
                            "historic and current range. "
            }

    };


}
