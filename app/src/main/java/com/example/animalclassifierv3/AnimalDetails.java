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
            "Tence fish",
            "Venomous. Time limit for death: 50 minutes.",
            "Tinca Tinca",
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
                            " It is notable for its size, with larger female individuals growing to 6.1 m (20 ft) in length and " +
                            "1,905–2,268 kg (4,200–5,000 lb) in weight at maturity. However, most are smaller;" +
                            " males measure 3.4 to 4.0 m (11 to 13 ft), and females measure 4.6 to 4.9 m (15 to 16 ft) on average." +
                            " According to a 2014 study, the lifespan of great white sharks is estimated to be as long as 70 years or more," +
                            " well above previous estimates, making it one of the longest lived cartilaginous fishes currently known." +
                            " According to the same study, male great white sharks take 26 years to reach sexual maturity, " +
                            "while the females take 33 years to be ready to produce offspring." +
                            " Great white sharks can swim at speeds of 25 km/h (16 mph)[10] for short bursts and to depths of " +
                            "1,200 m (3,900 ft)."

            },
            {
                    "3",
                    "Tiger shark",
                    "False",
                    "Galeocerdo cuvier",
                    "Not threatened",
                    "The tiger shark (Galeocerdo cuvier) is a species of requiem shark and the last extant member of the Family galeocerdonidae. It is a large macropredator, capable of attaining a length over 5 m (16 ft 5 in). Populations are found in many tropical and temperate waters, especially around central Pacific islands. Its name derives from the dark stripes down its body, which resemble a tiger's pattern, but fade as the shark matures.[5]\n" +
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
                            " and ostriches were present across Asia as far east as Mongolia during the Late Pleistocene and possibly into the Holocene. They lay the largest eggs of any living land animal. With the ability to run at 70 km/h (43.5 mph), " +
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
                    "11",
                    "Goldfinch",
                    "False",
                    "Carduelis carduelis",
                    "Least Concern ",
                    "goldfinch (Carduelis carduelis) is a small passerine bird in the finch family that is native to Europe, North Africa and western and central Asia. It has been introduced to other areas, including Australia, New Zealand and Uruguay.\n" +
                            "The breeding male has a red face with black markings around the eyes, and a black-and-white head. The back and flanks are buff or chestnut brown. The black wings have a broad yellow bar. The tail is black and the rump is white. Males and females are very similar, but females have a slightly smaller red area on the face." +

                    "Sociable, often breeding in loose colonies, they have a delightful liquid twittering song and call. Their long fine beaks allow them to extract otherwise inaccessible seeds from thistles and teasels. Increasingly they are visiting bird tables and feeders. In winter many UK goldfinches migrate as far south as Spain." +
                    "The goldfinch prefers open country where weeds thrive, such as fields, meadows, flood plains, as well as roadsides, orchards, and gardens. " +
                    "Goldfinches eat a variety of seeds from trees, weeds, and grasses. They also eat some insects, flower buds and berries while they feed on the ground, weed stalks and foliage"

            },

            {
                    "12",
                    "house finch",
                    "False",
                   "Carpodacus mexicanus",
                    "Least Concern ",
                   " goldfinch (Carduelis carduelis) is a small passerine bird in the finch family that is native to Europe, North Africa and western and central Asia. It has been introduced to other areas, including Australia, New Zealand and Uruguay.\n" +
                            "The breeding male has a red face with black markings around the eyes, and a black-and-white head. The back and flanks are buff or chestnut brown. The black wings have a broad yellow bar. The tail is black and the rump is white. Males and females are very similar, but females have a slightly smaller red area on the face." +
                    "Sociable, often breeding in loose colonies, they have a delightful liquid twittering song and call. Their long fine beaks allow them to extract otherwise inaccessible seeds from thistles and teasels. Increasingly they are visiting bird tables and feeders. In winter many UK goldfinches migrate as far south as Spain." +
                    "The goldfinch prefers open country where weeds thrive, such as fields, meadows, flood plains, as well as roadsides, orchards, and gardens. " +
                    "Goldfinches eat a variety of seeds from trees, weeds, and grasses. They also eat some insects, flower buds and berries while they feed on the ground, weed stalks and foliage",

            },

            {
                    "13",
                    "Junco",
                    "False",
                    "Passerina cyanea",
                    "Least concern",
                    "A junco, is a small North American bird in the New World sparrow. Junco systematics are still confusing after decades of research, with various authors accepting between three and twelve species. Despite having a name that appears to derive from the Spanish term for the plant genus Juncus , these birds are seldom found among rush plants, which prefer wet ground, while juncos prefer dry soil." +
                    "Juncos prefer to roost in evergreens at night but will also use tall grasses and brush piles. They return to the same roost location repeatedly and will share it with other flock mates, but they do not huddle together."+
                    "Juncos breed in forests across much of North America and at elevations ranging from sea level to more than 11,000 feet. They are often found in coniferous forests incuding pine, Douglas-fir, spruce, and fir, but also in deciduous forests such as aspen, cottonwood, oak, maple, and hickory." +
                    "Juncos feed mostly on the ground, eating weed and grass seeds, with a diet of mostly insects in the summer and seeds in the winter"
            },

            {
                    "14",
                    "American robin",
                    "False",
                    "Turdus migratorius",
                    "Least concern",
                    "The American robin is a migratory bird of the true thrush, the wider thrush family. It is named after the European robin[2] because of its reddish-orange breast, though the two species are not closely related, with the European robin belonging to the Old World flycatcher family. The American robin is widely distributed throughout North America, wintering from southern Canada to central Mexico and along the Pacific Coast." +
                    "The American robin is active mostly during the day, and on its winter grounds it assembles in large flocks at night to roost in trees in secluded swamps or dense vegetation." +
                    "American robins live in woodlands, suburban backyards, parks, and grasslands with shrubs. Robins can be found year-round in the continental United States, and some migrate north to spend summers in Alaska."+
                    "The American robin's diet generally consists of around 40 percent small invertebrates, such as earthworms, beetle grubs, caterpillars and grasshoppers, and 60 percent wild and cultivated fruits and berries."
            },

            {
                    "15",
                    "Bulbul",
                    "False",
                    "Pycnonotidae",
                    "Least concern",
                    "bulbul, any of about 140 species of birds of the family Pycnonotidae of Africa and Asia, including some called greenbuls and brownbuls. Members range in size from 14 to 28 cm long. They are active, noisy, plain-coloured birds that sometimes damage orchards." +
                    "The red-vented bulbul is vocal bird and has distinct calls for different acts such as greeting and begging, as well as two distinctive alarm calls" +
                    "Species of bulbuls occur in diverse tropical habitats, but not in deserts. They may occur in dense vegetation in tropical forests or in more open habitats, such as gardens in towns or even city parks." +
                    "Red-vented bulbuls feed on fruits, petals of flowers, nectar, insects and occasionally house geckos."
            },

            {
                    "16",
                    "Jay",
                    "False",
                    "Cyanocitta cristata",
                    "Least concern",
                    "Jays are nearly omnivorous; some are egg stealers, and many store seeds and nuts for winter use. They make a twiggy, cuplike nest in a tree. After breeding, most species are gregarious." +
                    "Jays are shy woodland birds, rarely moving far from cover  they are extremely intelligent. In fact, many scientists consider this Corvid family of birds to be the smartest animals on Earth." +
                    "Jays will only occur where there is plenty of cover, and favour mature deciduous woodland and in particular with oak trees." +
                    "Peanuts in any form—whole, shelled, or even peanut butter—are their favorites at backyard feeders."
            },

            {
                    "17",
                    "Chickadee",
                    "False",
                    "Poecile",
                    "Least concern",
                    "They are small-sized birds overall, usually having the crown of the head and throat patch distinctly darker than the body. They are at least 6 to 14 centimeters (2.4 to 5.5 inches) in size." +
                            "The habitat that chickadees prefer is mixed deciduous or coniferous forests, parks, open woods, cottonwood groves, willow thickets, and disturbed areas."
            },

            {
                    "18",
                    "Dipper",
                    "False",
                    "Cinclus Cinclidae",
                    "Least concern",
                    "Dippers are small, chunky, stout, short-tailed, short-winged, strong-legged birds.Dippers are found in suitable freshwater habitats in the highlands of the Americas, Europe and Asia."
            },

            {
                    "19",
                    "Kite",
                    "False",
                    "not an animal",
                    "not an animal",
                    "A kite is a tethered heavier-than-air or lighter-than-air craft with wing surfaces that react against the air to create lift and drag forces.people made it for enjoyment and fly it in the air"
            },

            {
                    "20",
                    "Bald eagle",
                    "False",
                    "Haliaeetus leucocephalus",
                    "Least concern",
                    "The bald eagle is an opportunistic feeder which subsists mainly on fish, which it swoops down upon and snatches from the water with its talons. It builds the largest nest of any North American bird and the largest tree nests ever recorded for any animal speciesThe bald eagle occurs during its breeding season in virtually any kind of American wetland habitat such as seacoasts, rivers, large lakes or marshes or other large bodies of open water with an abundance of fish."
            },

            {
                    "21",
                    "Vulture",
                    "False",
                    "Cathartes",
                    "Extinct",
                    "A vulture is a bird of prey that scavenges on carrion. There are 23 extant species of vulture (including Condors).[2] Old World vultures include 16 living species native to Europe, Africa, and Asia; New World vultures are restricted to " +
                            "North and South America and consist of seven identified species, all belonging to the Cathartidae. " +
                            "Vultures are widely distributed, but they are absent from Australia and most oceanic islands. Most vultures have broad food habits, consuming carrion, garbage, and even excrement, but rarely do they descend upon live animals. A few occasionally take helpless prey such as lambs and tortoises or, in the case of Andean condors, newborn calves."
            },

            {
                    "22",
                    "Great Grey Owl",
                    "False",
                    "Strix nebulosa",
                    "Least Concern",
                    "The great grey owl is a very large owl, documented as the world's largest species of owl by length. " +
                            "Adults have a large rounded head with a grey face and yellow eyes with darker circles around them. The underparts are light with dark streaks; the upper parts are grey with pale bars. This owl does not have ear tufts and has the largest facial disc of any raptor." +
                            "In northern areas their breeding habitat is often the dense coniferous forests of the taiga, near open areas, such as meadows or bogs."
            },

            {
                    "23",
                    "European fire salamander",
                    "Venomous. The fire salamander's primary alkaloid toxin, samandarin, causes strong muscle convulsions and hypertension combined with hyperventilation in all vertebrates.",
                    "Salamandra salamandra",
                    "Least concern",
                    "Fire salamanders live in the forests of central Europe and are more common in hilly areas. They prefer deciduous forests since they like to hide in fallen leaves and around mossy tree trunks. They need small brooks or ponds with clean water in their habitat for the development of the larvae. " +
                            "Males and females look very similar, except during the breeding season, when the most conspicuous difference is a swollen gland around the male's vent. This gland produces the spermatophore, which carries a sperm packet at its tip"
            },

            {
                    "24",
                    "Smooth newt",
                    "Venomous.  There is a risk that smooth newts could poison their predators (like cane toads do). Some salamanders produce a neurotoxin (tetrodotoxin) on their skin.",
                    "Triturus vulgaris",
                    "Least concern",
                    "Adult males of the smooth newt reach around 9–11 cm (3.5–4.3 in) head-to-tail length and are thus slightly larger than the females, which reach 8–9.5 cm (3.1–3.7 in). The body weight of adults varies between 0.3–5.2 g (0.011–0.183 oz), and decreases during the breeding season. The head is longer than it is wide, with 2–3 longitudinal grooves on the top, and the elongated snout is blunt in the male and rounded in the female. The skin is velvety and water-repellent on land but smooth during the aquatic phase; it contains mucus and toxin glands and its upper layer is shed off regularly." +
                            "Smooth newts eat insects, caterpillars, worms and slugs while on land, and crustaceans, molluscs and tadpoles when in the water. They are most active during the night."
            },

            {
                    "25",
                    "Smooth newt",
                    "Venomous.  There is a risk that smooth newts could poison their predators (like cane toads do). Some salamanders produce a neurotoxin (tetrodotoxin) on their skin.",
                    "Triturus vulgaris",
                    "Least concern",
                    "Adult males of the smooth newt reach around 9–11 cm (3.5–4.3 in) head-to-tail length and are thus slightly larger than the females, which reach 8–9.5 cm (3.1–3.7 in). The body weight of adults varies between 0.3–5.2 g (0.011–0.183 oz), and decreases during the breeding season. The head is longer than it is wide, with 2–3 longitudinal grooves on the top, and the elongated snout is blunt in the male and rounded in the female. The skin is velvety and water-repellent on land but smooth during the aquatic phase; it contains mucus and toxin glands and its upper layer is shed off regularly." +
                            "Smooth newts eat insects, caterpillars, worms and slugs while on land, and crustaceans, molluscs and tadpoles when in the water. They are most active during the night."
            },
            {
                    "26",
                    "Spotted salamander",
                    "Venomous.  There is a risk that smooth newts could poison their predators (like cane toads do). Some salamanders produce a neurotoxin (tetrodotoxin) on their skin.",
                    "Ambystoma mexicanum",
                    "Least concern",
                    "The spotted salamander usually lives in mature forests with ponds or ephemeral vernal pools for breeding sites.[10] Vernal pools are suitable breeding sites for these amphibians as they dry often enough to exclude fish that eat the salamander eggs and larvae, while retaining water long enough to allow amphibian larvae to complete development and metamorphose into terrestrial adults." +
                            "Spotted salamanders are fossorial, meaning they spend most of their time underground. They rarely come above ground, except after a rain or for foraging and breeding. During the winter, they brumate underground, and are not seen again until breeding season in early March–May."
            },

            {
                    "27",
                    "Bullfrog",
                    "False",
                    "Rana catesbeiana",
                    "Least concern",
                    "Adult American bullfrogs have voracious appetites and will eat anything they can fit into their mouths, including invertebrates, birds, bats, rodents, frogs, newts, lizards, snakes, and turtles." +
                            "The banded bullfrog lives at low altitudes and is found in both urban and rural settings, as well as in forest habitats. They bury themselves underground during dry periods and emerge after heavy rainfall to emit calls and breed."
            },

            {
                    "28",
                    "Tree frog",
                    "False",
                    "hyla arborea",
                    "Not extinct",
                    "Tree frogs are predators and their diet consists of insects, such as flies, ants, true bugs, bees, worms, beetles, isopods, wasps, spiders, and crickets. Keeping a frog healthy in captivity can be difficult because they don't have the same access to food as they would in the wild." +
                            "The common green treefrog occurs in all habitats from desert to coastal swamps, including dry vine thickets, but not dense tropical rainforest."
            },

            {
                    "29",
                    "Tailed frog",
                    "False",
                    "Ascaphus trui",
                    "Not Extinct",
                    " Thus, the tailed frogs exhibit internal fertilisation, rather than the external fertilisation found in other frogs. These frogs are primitive in having a greater number of vertebrae than other frogs, in lacking the ability to vocalise, and in possessing free ribs.\\\"\n" +
                            "Tailed Frogs live in and beside cool, clear mountain streams with year- round flow. All stages, from egg to adult, are able to tolerate only a narrow range of water temperatures. The eggs are most sensitive and can only survive in streams with highly oxygenated waters and temperatures of 5 to18. 5°C." +
                            "They eat insects and other invertebrates they catch in the water or on land nearby. They look for food at night."
            },

            {
                    "30",
                    "Loggerhead",
                    "false",
                    "Caretta caretta",
                    "Vulnerable ",
                    "The leatherback sea turtle (Dermochelys coriacea), sometimes called the lute turtle or leathery turtle or simply the luth, is the largest of all living turtles and the heaviest non-crocodilian reptile, reaching lengths of up to 1.8 metres (5 ft 11 in) and weights of 500 kilograms (1,100 lb)" +
                            "Leatherbacks spend most of their lives at sea and sometimes look for prey in coastal waters. Jellyfish make up the biggest portion of their diet, but they also eat seaweed, fish, crustaceans, and other marine invertebrates." +
                            "Like other sea turtles, the meat of leatherbacks can be toxic to humans and other animals."
            },

            {
                    "31",
                    "leatherback turtle",
                    "False",
                    "Dermochelys coriacea",
                    "Vulnerable",
                    "The leatherback sea turtle (Dermochelys coriacea), sometimes called the lute turtle or leathery turtle or simply the luth, is the largest of all living turtles and the heaviest non-crocodilian reptile, reaching lengths of up to 1.8 metres (5 ft 11 in) and weights of 500 kilograms (1,100 lb)" +
                            "Leatherbacks spend most of their lives at sea and sometimes look for prey in coastal waters. Jellyfish make up the biggest portion of their diet, but they also eat seaweed, fish, crustaceans, and other marine invertebrates." +
                            "Like other sea turtles, the meat of leatherbacks can be toxic to humans and other animals."
            },

            {
                    "32",
                    "Mud turtle",
                    "False",
                    "Kinosternon",
                    "Not Extinct",
                    "Mud turtles eat mostly invertebrates, fish, carrion, and plant matter. Most mud turtles are either carnivorous or omnivorous and eat mostly invertebrates, fish, carrion, and plant matter. Striped mud turtles eat insects, snails, fish, carrion, dried krill, plants, and algae. Yellow mud turtles are also omnivorous." +
                            "They can be found in fresh or brackish water, including marshes, small ponds, wet ditches and fields, and offshore islands."
            },

            {
                    "33",
                    "Terrapin",
                    "False",
                    "Malaclemys terrapin",
                    "Vulnerable",
                    "Terrapins are one of several small species of turtle (order Testudines) living in fresh or brackish water. Terrapins do not form a taxonomic unit and may not be closely related. Many belong to the families Geoemydidae and Emydidae." +
                            "Although terrapins generally prefer to eat fish and meats, they do also eat some green plants, found in marshy areas while in the wild. They prefer green leafy vegetables and grass." +
                            "Diamondback terrapins live in the brackish water of salt marshes, estuaries, and tidal creeks. They feed on fish, marine snails, crabs, marine and tidal mollusks, carrion, clams, and worms."
            },

            {
                    "34",
                    "Box Turtle",
                    "False",
                    "Terrapene",
                    "Not extinct",
                    "Most (80-90%) of the plant material fed to box turtles should be vegetables and flowers, and only 10-20% should be fruit. As a rule, dark, leafy greens should make up the largest part of the diet. Yellow, red, and orange vegetables can also be included." +
                            "Typically, however, box turtles are found in well-drained forest bottomlands and open deciduous forests. They will use wetland areas at various times during the season. During the hottest part of a summer day, they will wander to find springs and seepages where they can burrow into the moist soil."
            },

            {
                    "35",
                    "Green iguana",
                    "true. vanom is nearly harmless",
                    "Iguana iguana",
                    "Least concern",
                    "Green iguanas are large, typically green lizards, though they can sometimes be brown or almost black in color. Some adults can take on an orange or pink coloration during certain times of the year. Hatchling and young green iguanas usually have bright green coloration." +
                            "Iguanas are herbivorous, meaning they eat plants; specifically, they are folivores, meaning they eat leaves. In the wild, iguanas feed almost entirely on the leaves of trees and vines, plus some fruits and flowers." +
                            "The green iguana is wide ranging and can be found from Mexico through to Central and South America. They are seen as invasive animals in southern Florida and Hawaii."
            },

            {
                    "36",
                    "American chameleon",
                    "False",
                    "Anolis carolinensis",
                    "Least concern",
                    "small arboreal tropical American insectivorous lizards with the ability to change skin color. anole, Anolis carolinensis. iguanid, iguanid lizard - lizards of the New World and Madagascar and some Pacific islands; typically having a long tail and bright throat patch in males." +
                            "Chameleons eat fruits, vegetables, insects such as locusts, or leafy greens in the wild. In captivity, you may feed your chameleon some common foods such as mealworms or Dubia Roaches." +
                            "The green anole, or American Chameleon, is indigenous to the sub-tropical areas of the southern United States. "
            },

            {
                    "37",
                    "whiptail lizard",
                    "False",
                    "Teiidae",
                    "Not extinct",
                    "The desert grassland whiptail lizard is a relatively small reptile, whose size ranges from 2¾ inches (6.9 cm) to 5¼ inches (13.3 cm). Desert grassland whiptails are very long and slim, with a thin tail that is longer than their body length." +
                            "Whiptail lizards are opportunistic insectivores that will pursue whatever small invertebrates they can find. Termites, grasshoppers, and beetles are common choices regardless of a particular species' habitat — and some may feed on more dangerous prey like scorpions as well." +
                            ""
            },

            {
                    "38",
                    "agama",
                    "False",
                    "agama",
                    "Least concern",
                    "  "
            },

            {
                    "39",
                    "frilled lizard",
                    "False",
                    "Chlamydosaurus kingii",
                    "Least concern",
                    "frilled lizard, type of reptile found in Australia and New Guinea that can run standing up on its hind legs with its forelegs and tail in the air. The scaly membrane around its neck is used as a large part of the lizard's defensive posture." +
                            "They spend most of their lives in the trees, but descend occasionally to feed on ants and small lizards. Other menu items include spiders, cicadas, termites, and small mammals." +
                            "Frilled lizards, or frillnecks, are members of the dragon family that live in the tropical and warm temperate forests and savanna woodlands of northern Australia."
            },

            {
                    "40",
                    "Alligator lizard",
                    "False",
                    "Elgaria coerulea",
                    "Least concern",
                    "The alligator lizard has a triangular head and a prehensile tail that helps them climb and navigate through treetops. This species can grow up to about 9.8 inches (25 centimeters) long. These lizards are native to the Mexican states of Veracruz and Pueblo." +
                            "The alligator lizard is carnivorous, feeding on various invertebrate species, and occasionally on small, young mammals and birds. Of their invertebrate prey, insects and their larvae, especially ground beetles, grasshopper and crickets, are prominent in their diet."
            },

            {
                    "41",
                    "Gila monster",
                    "True. small amount of venom on his vite",
                    "Heloderma suspectum",
                    "Near threatened",
                    "Gila monsters are heavy-bodied lizards covered with beadlike scales, called osteoderms, that are black and yellow or pink covering all but their belly. The Gila monster is venomous; its venom is made by a row of glands in the lizard's lower jaw." +
                            " Its name comes from the Gila River, where the lizards are common. Gila monsters are desert dwellers, living near washes and arroyos and in semiarid rocky regions of desert scrub or grasslands. Gila monsters also seem to prefer rocky foothills and avoid open flats and agricultural areas."
            },

            {
                    "42",
                    "Green lizard",
                    "False",
                    "Lacerta viridis",
                    "Least concern",
                    "Other Names Chameleon Description. The green anole is a common lizard, slender in build, with a narrow head and a long, slender tail that can be twice as long as the rest of the animal. Color can vary from gray-brown, to brown, to bright green. Each animal can change its color to blend with surroundings." +
                            "In fact, these lizards are beneficial, as they do feed on a wide variety of small insects such as crickets, cockroaches, moths, grubs, beetles, flies and grasshoppers. They do not chew their food but swallow it whole. Anoles grow to 5-7 inches in length." +
                            "The green anole lives in habitats with very high humidity. It can be found in swamps, forests, wooded beaches and other ar"
            },

            {
                    "43",
                    "African chameleon",
                    "False",
                    "Chamaeleo africanus",
                    "Least concern",
                    "The African chameleon is a slow-moving, laterally flattened species growing to a maximum length of 46 cm (18 in). It has bulbous eyes which can move independently of each other and a prehensile tail." +
                            "Fast firing tongue. Chameleons generally eat insects such as locusts, mantids, grasshoppers, stick insects, and crickets. Some larger chameleons also eat small birds and other lizards." +
                            "Chameleons mostly live in the rain forests and deserts of Africa. The color of their skin helps them blend in with their habitats. Chameleons that hang out in trees are usually green."
            },

            {
                    "44",
                    "Komodo dragon",
                    "True. Time limit for an adult human is 1 hours",
                    "Varanus komodoensis",
                    "Endangered",
                    "Komodo dragons are large lizards with long tails, strong and agile necks, and sturdy limbs. Their tongues are yellow and forked. Adults are an almost-uniform stone color with distinct, large scales, while juveniles may display a more vibrant color and pattern." +
                            "Preferring the tropical forests, dragons can also be seen on land or near water, clocking up kilometres daily in search for food. Komodo dragons are carnivores, and they eat any kind of meat but mostly feed on carrion. They feed on small lizards, snakes and birds."
            },

            {
                    "45",
                    "African crocodile",
                    "",
                    "Crocodylus niloticus",
                    "",
                    ""
            },

            {
                    "46",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "47",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "48",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "49",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "50",
                    "",
                    "",
                    "",
                    "",
                    ""
            },


            {
                    "51",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "52",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "53",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "54",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "55",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "56",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "57",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "58",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "59",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "60",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "61",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "62",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "63",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "64",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "65",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "66",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "67",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "68",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "69",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "70",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "71",
                    "",
                    "",
                    "",
                    "",
                    ""
            },
            {
                    "72",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "73",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "74",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "75",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "76",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "77",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "78",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "79",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "80",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "81",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "82",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "83",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "84",
                    "",
                    "",
                    "",
                    "",
                    ""
            },

            {
                    "",
                    "",
                    "",
                    "",
                    "",
                    ""
            }








    };


}
