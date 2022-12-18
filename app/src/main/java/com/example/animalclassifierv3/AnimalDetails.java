package com.example.animalclassifierv3;


import java.util.ArrayList;

public class AnimalDetails {
        public static final String[] OPTIONS = new String[]{
                "Serial",
                "Name",
                "Alert",
                "Scientific Name",
                "Conservation Status",
                "Description",
                "Bangla alert",
                "Bangla description"
        };

        public static final String[] Dummy = new String[]{
                "291",
                "Dummy",
                "Dummy",
                "Dummy dummy",
                "Dummy",
                "This is dummy description. This is dummy description.This is dummy description. This is dummy description." +
                        "This is dummy description. This is dummy description. This is dummy description. This is dummy description."
        };

        public static String[][] DETAILS = new String[][]{
                {
                        "0",
                        "Tence fish",
                        "Venomous. Time limit for death: 50 minutes.",
                        "Tinca Tinca",
                        "Least Concern",
                        "The tench or doctor fish (Tinca tinca) is a fresh- and brackish-water fish of the order Cypriniformes found throughout Eurasia from Western Europe including the British Isles east into Asia as far as the Ob and Yenisei Rivers.[3] It is also found in Lake Baikal." +
                                "It normally inhabits slow-moving freshwater habitats, particularly lakes and lowland rivers.",
                        "বিষাক্ত। ৫০ মিনিটের মধ্যে মৃত্যু ঘটতে পারে।",
                        "টেঞ্চ বা ডক্টর ফিশ (টিনকা টিনকা) হল সাইপ্রিনিফর্মের একটি তাজা- এবং লোনা-জলের মাছ যা ইউরেশিয়া জুড়ে পশ্চিম ইউরোপ থেকে ব্রিটিশ দ্বীপপুঞ্জ সহ পূর্ব এশিয়া পর্যন্ত ওব এবং ইয়েনিসেই নদী পর্যন্ত পাওয়া যায়। " +
                                "এটি বৈকাল হ্রদেও পাওয়া যায়। এটি সাধারণত ধীর গতির মিঠা পানির আবাসস্থল, বিশেষ করে হ্রদ এবং নিম্নভূমি নদীতে বাস করে।"
                },
                {
                        "1",
                        "Goldfish.",
                        "False",
                        "Carassius auratus",
                        "Least concern",
                        "The goldfish (Carassius auratus) is a freshwater fish in the family Cyprinidae of order Cypriniformes." +
                                "It is commonly kept as a pet in indoor aquariums, and is one of the most popular aquarium fish." +
                                " Goldfish released into the wild have become an invasive pest in parts of North America." +
                                "Native to East Asia, the goldfish is a relatively small member of the carp family " +
                                "(which also includes the Prussian carp and the crucian carp)." +
                                " It was first selectively bred for color in imperial China more than 1,000 years ago," +
                                " and several distinct breeds have since been developed. Goldfish breeds vary greatly in size, body shape," +
                                " fin configuration, and coloration (various combinations of white, yellow, orange, red, brown, and black are known)",
                        "অবিষাক্ত",
                        "গোল্ডফিশ (ক্যারাসিয়াস অরাটাস) হল সাইপ্রিনিফর্মের সাইপ্রিনিডি পরিবারের একটি মিঠা পানির মাছ।" +
                                "এটি সাধারণত ইনডোর অ্যাকোয়ারিয়ামে পোষা প্রাণী হিসাবে রাখা হয় এবং এটি সবচেয়ে জনপ্রিয় অ্যাকোয়ারিয়াম মাছগুলির মধ্যে একটি।" +
                                "বনে ছেড়ে দেওয়া গোল্ডফিশ উত্তর আমেরিকার কিছু অংশে আক্রমণকারী কীট হয়ে উঠেছে।" +
                                "পূর্ব এশিয়ার আদিবাসী, গোল্ডফিশ কার্প পরিবারের একটি অপেক্ষাকৃত ছোট সদস্য" +
                                "যার মধ্যে প্রুশিয়ান কার্প এবং ক্রুসিয়ান কার্পও রয়েছে)।" +
                                "১০০০ বছরেরও বেশি আগে সাম্রাজ্য চীনে এটি প্রথম বেছে বেছে রঙের জন্য প্রজনন করা হয়েছিল," +
                                "এবং এর পর থেকে বেশ কয়েকটি স্বতন্ত্র জাত তৈরি করা হয়েছে। গোল্ডফিশের জাতগুলি আকার, শরীরের আকারে ব্যাপকভাবে পরিবর্তিত হয়," +
                                "ফিন কনফিগারেশন, এবং রঙ (সাদা, হলুদ, কমলা, লাল, বাদামী এবং কালো বিভিন্ন সমন্বয় পরিচিত)"

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
                                "1,200 m (3,900 ft).",
                        "অবিষাক্ত",
                        "মহান সাদা হাঙর (Carcharodon carcharias), যা হোয়াইট হাঙ্গর, হোয়াইট পয়েন্টার বা সহজভাবে মহান সাদা নামেও পরিচিত বড় ম্যাকেরেল হাঙরের একটি প্রজাতি যা সমস্ত প্রধান মহাসাগরের উপকূলীয় পৃষ্ঠের জলে পাওয়া যায়। " +
                                "এটি তার আকারের জন্য উল্লেখযোগ্য, বড় মহিলা ব্যক্তিদের দৈর্ঘ্য 6.1 মিটার (20 ফুট) পর্যন্ত বৃদ্ধি পায় এবং 1,905-2,268 কেজি (4,200-5,000 পাউন্ড) পরিপক্কতার সময় ওজন।" +
                                " তবে, বেশিরভাগই ছোট; পুরুষদের পরিমাপ 3.4 থেকে 4.0 মিটার (11 থেকে 13 ফুট), এবং মহিলারা 4.6 থেকে 4.9 মিটার (15 থেকে 16 ফুট) গড়ে। " +
                                "2014 সালের একটি সমীক্ষা অনুসারে, মহান সাদা হাঙরের জীবনকাল 70 বছর বা তার বেশি হতে পারে বলে অনুমান করা হয়। পূর্ববর্তী অনুমানের উপরে, এটি বর্তমানে পরিচিত সবচেয়ে " +
                                "দীর্ঘজীবী কার্টিলাজিনাস মাছগুলির মধ্যে একটি। একই সমীক্ষা অনুসারে, পুরুষ মহান সাদা হাঙর যৌন পরিপক্কতা পেতে 26 বছর সময় নেয়, যদিও নারীদের সন্তান উৎপাদনের জন্য " +
                                "প্রস্তুত হতে 33 বছর সময় লাগে। দারুণ সাদা হাঙররা 25 কিমি/ঘন্টা (16 মাইল প্রতি ঘণ্টা) [10] গতিতে সাঁতার কাটতে পারে এবং এর গভীরতায় 1,200 মি (3,900 ফুট)।"

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
                                "\n" + "The tiger shark is second only to the great white in recorded fatal attacks on humans," +
                                "but these events are still exceedingly rare.",
                        "অবিষাক্ত",
                        "বাঘ হাঙর (গ্যালিওসারডো কুভিয়ার) হল রিকুয়েম হাঙরের একটি প্রজাতি এবং গ্যালিওসারডোনিডি পরিবারের সর্বশেষ বর্তমান সদস্য। এটি একটি বড় ম্যাক্রোপ্রিডেটর, যা 5 মিটার (16 ফুট 5 ইঞ্চি) এর বেশি দৈর্ঘ্য অর্জন করতে সক্ষম। জনসংখ্যা অনেক গ্রীষ্মমন্ডলীয় এবং নাতিশীতোষ্ণ জলে, বিশেষ করে মধ্য প্রশান্ত মহাসাগরীয় দ্বীপের চারপাশে পাওয়া যায়। এর নামটি এর শরীরের নিচের কালো ডোরা থেকে এসেছে, যা একটি বাঘের প্যাটার্নের মতো, কিন্তু হাঙ্গর পরিপক্ক হওয়ার সাথে সাথে বিবর্ণ হয়ে যায়।" +
                                "                                টাইগার হাঙ্গর হল একটি নির্জন, বেশিরভাগ নিশাচর শিকারী। এটি শিকারের একটি পরিসর সহ সমস্ত হাঙ্গরের বিস্তৃত খাদ্য বর্ণালী থাকার জন্য উল্লেখযোগ্য" +
                                "                                যার মধ্যে রয়েছে ক্রাস্টেসিয়ান, মাছ, সীল, পাখি, স্কুইড, কচ্ছপ, সামুদ্রিক সাপ, ডলফিন এবং এমনকি অন্যান্য ছোট হাঙ্গর। এটি একটি আবর্জনা ভক্ষক হিসেবেও খ্যাতি রয়েছে," +
                                "                                বিভিন্ন রকমের অখাদ্য, মনুষ্যসৃষ্ট বস্তু গ্রাস করে যা এর পেটে থাকে। যদিও সর্বোচ্চ শিকারী, বাঘ হাঙরকে কখনও কখনও ঘাতক তিমির দল শিকার হিসাবে গ্রহণ করে।\" +\n" +
                                "                                মানুষ দ্বারা ফিনিং এবং মাছ ধরার কারণে এটি একটি প্রায় বিপন্ন প্রজাতি হিসাবে বিবেচিত হয়৷" +
                                "                                মানুষের উপর নথিভুক্ত মারাত্মক আক্রমণের ক্ষেত্রে বাঘ হাঙ্গর মহান সাদার পরেই দ্বিতীয় স্থানে রয়েছে," +
                                "                                কিন্তু এই ঘটনাগুলি এখনও অত্যন্ত বিরল।"

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
                                "continental shelves. Unlike most sharks, some hammerhead species usually swim in schools during the day, " +
                                "becoming solitary hunters at night. ",
                        "অবিষাক্ত",

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
                                "'to be stiffened or paralyzed', from the effect on someone who touches the fish",
                        "অবিষাক্ত",
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
                                "but some, such as the pelagic stingray and the eagle rays, are pelagic.",
                        "বিষাক্ত, তবে ঘাতক নয়।",
                },
                {
                        "7",
                        "Cock",
                        "False",
                        "Gallus gallus domesticus",
                        "Domesticated",
                        "The chicken (Gallus gallus domesticus) is a domesticated junglefowl species, with attributes of wild species such as the grey and the Ceylon junglefowl[1] that are originally from Southeastern Asia. Rooster or cock is a term for an adult male bird, and a younger male may be called a cockerel. A male that has been castrated is a capon. An adult female bird is called a hen and a sexually immature female is called a pullet. Humans now keep chickens primarily as a source of food (consuming both their meat and eggs) and as pets. " +
                                "Traditionally they were also bred for cockfighting, which is still practiced in some places.",
                        "অবিষাক্ত"
                },
                {
                        "8",
                        "Hen",
                        "False",
                        "Gallus gallus domesticus",
                        "Domesticated",
                        "The chicken (Gallus gallus domesticus) is a domesticated junglefowl species, with attributes of wild species such as the grey and the Ceylon junglefowl[1] that are originally from Southeastern Asia. Rooster or cock is a term for an adult male bird, and a younger male may be called a cockerel. A male that has been castrated is a capon. An adult female bird is called a hen and a sexually immature female is called a pullet. Humans now keep chickens primarily as a source of food (consuming both their meat and eggs) and as pets. " +
                                "Traditionally they were also bred for cockfighting, which is still practiced in some places.",
                        "অবিষাক্ত",

                },
                {
                        "9",
                        "Ostrich",
                        "False",
                        "Struthio camelus",
                        "Not threatened",
                        "Ostriches are large flightless birds of the genus Struthio in the order Struthioniformes, part of the infra-class Palaeognathae, a diverse group of flightless birds also known as ratites that includes the emus, rheas, and kiwis. There are two living species of ostrich: the common ostrich, native to large areas of sub-Saharan Africa and the Somali ostrich, native to the Horn of Africa.  The common ostrich was also historically native to the Arabian Peninsula, and ostriches were present across Asia as far east as Mongolia during the Late Pleistocene and possibly into the Holocene. They lay the largest eggs of any living land animal. With the ability to run at 70 km/h (43.5 mph), they are the fastest birds on land. They are farmed worldwide, particularly for their feathers as they are used as decoration and feather dusters. Their skin is also used for leather products. They are the heaviest living birds.\\n\\n\\n== Taxonomic history ==\\nThe genus Struthio was first described by Carl Linnaeus in 1758. The genus was used by Linnaeus and other early taxonomists to include the emu, rhea, and cassowary, until they each were placed in their own genera.",
                        "অবিষাক্ত",
                        "উটপাখি হ'ল স্ট্রুথিও গোত্রের স্ট্রুথিওনিফর্মের ক্রমানুসারে বড় উড়ন্ত পাখি, যা ইনফ্রা-শ্রেণির প্যালেওগনাথায়ের অংশ, উড়ন্ত পাখিদের একটি বৈচিত্র্যময় দল যা রেটাইট নামেও পরিচিত যার মধ্যে ইমু, রিয়া এবং কিউই রয়েছে। উটপাখির দুটি জীবন্ত প্রজাতি রয়েছে: সাধারণ উটপাখি, সাব-সাহারান আফ্রিকার বৃহৎ অঞ্চলের স্থানীয় এবং সোমালি উটপাখি, আফ্রিকার হর্নের স্থানীয়। সাধারণ উটপাখিও ঐতিহাসিকভাবে আরব উপদ্বীপের স্থানীয় ছিল এবং উটপাখিরা প্লিসটোসিনের শেষের দিকে এবং সম্ভবত হলসিনে মঙ্গোলিয়া পর্যন্ত এশিয়া জুড়ে উপস্থিত ছিল। তারা যে কোনো জীবন্ত স্থল প্রাণীর মধ্যে সবচেয়ে বড় ডিম পাড়ে। 70 কিমি/ঘন্টা (43.5 মাইল) বেগে দৌড়ানোর ক্ষমতা সহ, তারা ভূমিতে সবচেয়ে দ্রুততম পাখি। এগুলি বিশ্বব্যাপী চাষ করা হয়, বিশেষ করে তাদের পালকের জন্য কারণ এগুলি সাজসজ্জা এবং পালক ঝাড়ন হিসাবে ব্যবহৃত হয়। তাদের চামড়া চামড়াজাত পণ্যের জন্যও ব্যবহৃত হয়। তারা সবচেয়ে ভারী জীবন্ত পাখি। শ্রেণীবিন্যাস ইতিহাস স্ট্রুথিও জিনাসটি কার্ল লিনিয়াস দ্বারা 1758 সালে প্রথম বর্ণনা করা হয়েছিল। লিনিয়াস এবং অন্যান্য প্রাথমিক শ্রেণীবিন্যাসবিদরা এমু, রিয়া এবং ক্যাসোওয়ারি অন্তর্ভুক্ত করার জন্য জিনাসটি ব্যবহার করেছিলেন, যতক্ষণ না তাদের প্রত্যেককে তাদের নিজস্ব বংশে স্থাপন করা হয়েছিল।"

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
                                "Open coniferous or birch woodland is favoured for breeding.",
                        "অবিষাক্ত",
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
                                "Goldfinches eat a variety of seeds from trees, weeds, and grasses. They also eat some insects, " +
                                "flower buds and berries while they feed on the ground, weed stalks and foliage",
                        "অবিষাক্ত",

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
                                "Goldfinches eat a variety of seeds from trees, weeds, and grasses. They also eat some insects, " +
                                "flower buds and berries while they feed on the ground, weed stalks and foliage",
                        "অবিষাক্ত",

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
                                "Juncos feed mostly on the ground, eating weed and grass seeds, with a diet of mostly insects in the summer and " +
                                "seeds in the winter",
                        "অবিষাক্ত",
                },

                {
                        "15",
                        "American robin",
                        "False",
                        "Turdus migratorius",
                        "Least concern",
                        "The American robin is a migratory bird of the true thrush, the wider thrush family. It is named after the European robin[2] because of its reddish-orange breast, though the two species are not closely related, with the European robin belonging to the Old World flycatcher family. The American robin is widely distributed throughout North America, wintering from southern Canada to central Mexico and along the Pacific Coast." +
                                "The American robin is active mostly during the day, and on its winter grounds it assembles in large flocks at night to roost in trees in secluded swamps or dense vegetation." +
                                "American robins live in woodlands, suburban backyards, parks, and grasslands with shrubs. Robins can be found year-round in the continental United States, and some migrate north to spend summers in Alaska."+
                                "The American robin's diet generally consists of around 40 percent small invertebrates, such as earthworms, " +
                                "beetle grubs, caterpillars and grasshoppers, and 60 percent wild and cultivated fruits and berries.",
                        "অবিষাক্ত",
                },

                {
                        "16",
                        "Bulbul",
                        "False",
                        "Pycnonotidae",
                        "Least concern",
                        "bulbul, any of about 140 species of birds of the family Pycnonotidae of Africa and Asia, including some called greenbuls and brownbuls. Members range in size from 14 to 28 cm long. They are active, noisy, plain-coloured birds that sometimes damage orchards." +
                                "The red-vented bulbul is vocal bird and has distinct calls for different acts such as greeting and begging, as well as two distinctive alarm calls" +
                                "Species of bulbuls occur in diverse tropical habitats, but not in deserts. They may occur in dense vegetation in tropical forests or in more open habitats, such as gardens in towns or even city parks." +
                                "Red-vented bulbuls feed on fruits, petals of flowers, nectar, insects and occasionally house geckos.",
                        "অবিষাক্ত",
                },

                {
                        "17",
                        "Jay",
                        "False",
                        "Cyanocitta cristata",
                        "Least concern",
                        "Jays are nearly omnivorous; some are egg stealers, and many store seeds and nuts for winter use. They make a twiggy, cuplike nest in a tree. After breeding, most species are gregarious." +
                                "Jays are shy woodland birds, rarely moving far from cover  they are extremely intelligent. In fact, many scientists consider this Corvid family of birds to be the smartest animals on Earth." +
                                "Jays will only occur where there is plenty of cover, and favour mature deciduous woodland and in particular with oak trees." +
                                "Peanuts in any form—whole, shelled, or even peanut butter—are their favorites at backyard feeders.",
                        "অবিষাক্ত",
                },

                {
                        "19",
                        "Chickadee",
                        "False",
                        "Poecile",
                        "Least concern",
                        "They are small-sized birds overall, usually having the crown of the head and throat patch distinctly darker than the body. They are at least 6 to 14 centimeters (2.4 to 5.5 inches) in size." +
                                "The habitat that chickadees prefer is mixed deciduous or coniferous forests, parks, open woods, " +
                                "cottonwood groves, willow thickets, and disturbed areas.",
                        "অবিষাক্ত",
                },

                {
                        "20",
                        "Dipper",
                        "False",
                        "Cinclus Cinclidae",
                        "Least concern",
                        "Dippers are small, chunky, stout, short-tailed, short-winged, strong-legged birds.Dippers are found in suitable freshwater " +
                                "habitats in the highlands of the Americas, Europe and Asia.",
                        "অবিষাক্ত",
                },
                {
                        "22",
                        "Bald eagle",
                        "False",
                        "Haliaeetus leucocephalus",
                        "Least concern",
                        "The bald eagle is an opportunistic feeder which subsists mainly on fish, which it swoops down upon and snatches " +
                                "from the water with its talons. It builds the largest nest of any North American bird and the " +
                                "largest tree nests ever recorded for any animal speciesThe bald eagle occurs during its " +
                                "breeding season in virtually any kind of American wetland habitat such as seacoasts, " +
                                "rivers, large lakes or marshes or other large bodies of open water with an abundance of fish.",
                        "অবিষাক্ত",
                },

                {
                        "23",
                        "Vulture",
                        "False",
                        "Cathartes",
                        "Extinct",
                        "A vulture is a bird of prey that scavenges on carrion. There are 23 extant species of vulture (including Condors).[2] Old World vultures include 16 living species native to Europe, Africa, and Asia; New World vultures are restricted to " +
                                "North and South America and consist of seven identified species, all belonging to the Cathartidae. " +
                                "Vultures are widely distributed, but they are absent from Australia and most oceanic islands. " +
                                "Most vultures have broad food habits, consuming carrion, garbage, and even excrement, " +
                                "but rarely do they descend upon live animals. A few occasionally take helpless prey such as lambs and tortoises or, " +
                                "in the case of Andean condors, newborn calves.",
                        "অবিষাক্ত",
                },

                {
                        "24",
                        "Great Grey Owl",
                        "False",
                        "Strix nebulosa",
                        "Least Concern",
                        "The great grey owl is a very large owl, documented as the world's largest species of owl by length. " +
                                "Adults have a large rounded head with a grey face and yellow eyes with darker circles around them. The underparts are light with dark streaks; the upper parts are grey with pale bars. This owl does not have ear tufts and has the largest facial disc of any raptor." +
                                "In northern areas their breeding habitat is often the dense coniferous forests of the taiga, " +
                                "near open areas, such as meadows or bogs.",
                        "অবিষাক্ত",
                },

                {
                        "25",
                        "European fire salamander",
                        "Venomous. The fire salamander's primary alkaloid toxin, samandarin, causes strong muscle convulsions and hypertension combined with hyperventilation in all vertebrates.",
                        "Salamandra salamandra",
                        "Least concern",
                        "The fire salamander (Salamandra salamandra) is a common species of salamander found in Europe. It is black with yellow spots or stripes to a varying degree; some specimens can be nearly completely black while on others the yellow is dominant. Shades of red and orange may sometimes appear, either replacing or mixing with the yellow according to subspecies. This bright coloration is highly conspicuous and acts to deter predators by honest signalling of its toxicity (aposematism) Fire salamanders can have a very long lifespan; one specimen lived for more than 50 years in Museum Koenig, a German natural history museum. Fire salamanders live in the forests of central Europe and are more common in hilly areas. They prefer deciduous forests since they like to hide in fallen leaves and around mossy tree trunks. They need small brooks or ponds with clean water in their habitat for the development of the larvae. Whether on land or in water, fire salamanders are inconspicuous. They spend much of their time hidden under wood or other objects. They are active in the evening and the night, but on rainy days they are active in the daytime as well.The diet of the fire salamander consists of various insects, spiders, millipedes, centipedes, earthworms and slugs, but they also occasionally eat newts and young frogs.",
                        "বিষাক্ত। ক্ষারকীয় বিষ 'সামান্দারিন' যা মাংসপেশীর খিচুনি, উচ্চ রক্তচাপ ও হাপানীর সৃষ্টি করে।",
                        "ফায়ার স্যালামান্ডার (স্যালামান্দ্রা সালাম্যান্ড্রা) হল ইউরোপে পাওয়া সালামন্ডারের একটি সাধারণ প্রজাতি। এটি হলুদ দাগ বা বিভিন্ন ডিগ্রী ডোরা সঙ্গে কালো; কিছু নমুনা প্রায় সম্পূর্ণ কালো হতে পারে যখন অন্যদের উপর হলুদ প্রভাবশালী। লাল এবং কমলা রঙের ছায়া কখনও কখনও প্রদর্শিত হতে পারে, হয় প্রতিস্থাপন বা উপ-প্রজাতি অনুসারে হলুদের সাথে মিশ্রিত হয়। এই উজ্জ্বল রঙ অত্যন্ত সুস্পষ্ট এবং এর বিষাক্ততার সৎ সংকেত দ্বারা শিকারীকে আটকাতে কাজ করে (অ্যাপোসেমেটিজম) ফায়ার সালাম্যান্ডারদের জীবনকাল খুব দীর্ঘ হতে পারে; একটি নমুনা জার্মান প্রাকৃতিক ইতিহাস জাদুঘর কোয়েনিগে 50 বছরেরও বেশি সময় ধরে বেঁচে ছিল। ফায়ার সালাম্যান্ডাররা মধ্য ইউরোপের বনাঞ্চলে বাস করে এবং পাহাড়ি এলাকায় বেশি দেখা যায়। তারা পর্ণমোচী বন পছন্দ করে কারণ তারা পতিত পাতা এবং শ্যাওলা গাছের কাণ্ডের চারপাশে লুকিয়ে থাকতে পছন্দ করে। লার্ভা বিকাশের জন্য তাদের বাসস্থানে পরিষ্কার জল সহ ছোট খাল বা পুকুর প্রয়োজন। স্থলে হোক বা জলে, ফায়ার স্যালাম্যান্ডারগুলি অদৃশ্য। তারা তাদের বেশিরভাগ সময় কাঠ বা অন্যান্য বস্তুর নিচে লুকিয়ে কাটায়। তারা সন্ধ্যায় এবং রাতে সক্রিয় থাকে, কিন্তু বৃষ্টির দিনে তারা দিনের বেলাও সক্রিয় থাকে। ফায়ার স্যালামান্ডারের খাদ্যে বিভিন্ন পোকামাকড়, মাকড়সা, মিলিপিডস, সেন্টিপিডস, কেঁচো এবং স্লাগ থাকে, তবে তারা মাঝে মাঝে নিউটসও খায়। এবং তরুণ ব্যাঙ।"
                },

                {
                        "24",
                        "Smooth newt",
                        "Venomous.  Some salamanders produce a neurotoxin (tetrodotoxin) on their skin.",
                        "Triturus vulgaris",
                        "Least concern",
                        "Adult males of the smooth newt reach around 9–11 cm (3.5–4.3 in) head-to-tail length and are thus slightly larger than the females, which reach 8–9.5 cm (3.1–3.7 in). The body weight of adults varies between 0.3–5.2 g (0.011–0.183 oz), and decreases during the breeding season. The head is longer than it is wide, with 2–3 longitudinal grooves on the top, and the elongated snout is blunt in the male and rounded in the female. The skin is velvety and water-repellent on land but smooth during the aquatic phase; it contains mucus and toxin glands and its upper layer is shed off regularly." +
                                "Smooth newts eat insects, caterpillars, worms and slugs while on land, and crustaceans, " +
                                "molluscs and tadpoles when in the water. They are most active during the night.",
                        "বিষাক্ত। কিছু সালামান্ডার তাদের ত্বকে নিউরোটক্সিন তৈরি করে।",

                },

                {
                        "25",
                        "Smooth newt",
                        "Venomous.  Some salamanders produce a neurotoxin (tetrodotoxin) on their skin.",
                        "Triturus vulgaris",
                        "Least concern",
                        "Adult males of the smooth newt reach around 9–11 cm (3.5–4.3 in) head-to-tail length and are thus slightly larger than the females, which reach 8–9.5 cm (3.1–3.7 in). The body weight of adults varies between 0.3–5.2 g (0.011–0.183 oz), and decreases during the breeding season. The head is longer than it is wide, with 2–3 longitudinal grooves on the top, and the elongated snout is blunt in the male and rounded in the female. The skin is velvety and water-repellent on land but smooth during the aquatic phase; it contains mucus and toxin glands and its upper layer is shed off regularly." +
                                "Smooth newts eat insects, caterpillars, worms and slugs while on land, and crustaceans, " +
                                "molluscs and tadpoles when in the water. They are most active during the night.",
                        "বিষাক্ত। কিছু সালামান্ডার তাদের ত্বকে নিউরোটক্সিন তৈরি করে।",
                },
                {
                        "26",
                        "Spotted salamander",
                        "Venomous.  Some salamanders produce a neurotoxin (tetrodotoxin) on their skin.",
                        "Ambystoma mexicanum",
                        "Least concern",
                        "The spotted salamander usually lives in mature forests with ponds or ephemeral vernal pools for breeding sites.[10] Vernal pools are suitable breeding sites for these amphibians as they dry often enough to exclude fish that eat the salamander eggs and larvae, while retaining water long enough to allow amphibian larvae to complete development and metamorphose into terrestrial adults." +
                                "Spotted salamanders are fossorial, meaning they spend most of their time underground. " +
                                "They rarely come above ground, except after a rain or for foraging and breeding. " +
                                "During the winter, they brumate underground, and are not seen again until breeding season in early March–May.",
                        "বিষাক্ত। কিছু সালামান্ডার তাদের ত্বকে নিউরোটক্সিন তৈরি করে।",
                },

                {
                        "27",
                        "Bullfrog",
                        "False",
                        "Rana catesbeiana",
                        "Least concern",
                        "Adult American bullfrogs have voracious appetites and will eat anything they can fit into their mouths, including invertebrates, birds, bats, rodents, frogs, newts, lizards, snakes, and turtles." +
                                "The banded bullfrog lives at low altitudes and is found in both urban and rural settings, " +
                                "as well as in forest habitats. They bury themselves underground during dry periods and emerge " +
                                "after heavy rainfall to emit calls and breed.",
                        "অবিষাক্ত।",
                },

                {
                        "28",
                        "Tree frog",
                        "False",
                        "hyla arborea",
                        "Not extinct",
                        "Tree frogs are predators and their diet consists of insects, such as flies, ants, true bugs, bees, worms, beetles, isopods, wasps, spiders, and crickets. Keeping a frog healthy in captivity can be difficult because they don't have the same access to food as they would in the wild." +
                                "The common green treefrog occurs in all habitats from desert to coastal swamps, " +
                                "including dry vine thickets, but not dense tropical rainforest.",
                        "অবিষাক্ত।",
                },

                {
                        "29",
                        "Tailed frog",
                        "False",
                        "Ascaphus trui",
                        "Not Extinct",
                        " Thus, the tailed frogs exhibit internal fertilisation, rather than the external fertilisation found in other frogs. These frogs are primitive in having a greater number of vertebrae than other frogs, in lacking the ability to vocalise, and in possessing free ribs.\\\"\n" +
                                "Tailed Frogs live in and beside cool, clear mountain streams with year- round flow. All stages, from egg to adult, are able to tolerate only a narrow range of water temperatures. The eggs are most sensitive and can only survive in streams with highly oxygenated waters and temperatures of 5 to18. 5°C." +
                                "They eat insects and other invertebrates they catch in the water or on land nearby. They look for food at night.",
                        "অবিষাক্ত।",
                },

                {
                        "30",
                        "Loggerhead",
                        "false",
                        "Caretta caretta",
                        "Vulnerable ",
                        "The leatherback sea turtle (Dermochelys coriacea), sometimes called the lute turtle or leathery turtle or simply the luth, is the largest of all living turtles and the heaviest non-crocodilian reptile, reaching lengths of up to 1.8 metres (5 ft 11 in) and weights of 500 kilograms (1,100 lb)" +
                                "Leatherbacks spend most of their lives at sea and sometimes look for prey in coastal waters. Jellyfish make up the biggest portion of their diet, but they also eat seaweed, fish, crustaceans, and other marine invertebrates." +
                                "Like other sea turtles, the meat of leatherbacks can be toxic to humans and other animals.",
                        "অবিষাক্ত।",
                },

                {
                        "31",
                        "leatherback turtle",
                        "False",
                        "Dermochelys coriacea",
                        "Vulnerable",
                        "The leatherback sea turtle (Dermochelys coriacea), sometimes called the lute turtle or leathery turtle or simply the luth, is the largest of all living turtles and the heaviest non-crocodilian reptile, reaching lengths of up to 1.8 metres (5 ft 11 in) and weights of 500 kilograms (1,100 lb)" +
                                "Leatherbacks spend most of their lives at sea and sometimes look for prey in coastal waters. Jellyfish make up the biggest portion of their diet, but they also eat seaweed, fish, crustaceans, and other marine invertebrates." +
                                "Like other sea turtles, the meat of leatherbacks can be toxic to humans and other animals.",
                        "অবিষাক্ত।",
                },

                {
                        "32",
                        "Mud turtle",
                        "False",
                        "Kinosternon",
                        "Not Extinct",
                        "Mud turtles eat mostly invertebrates, fish, carrion, and plant matter. Most mud turtles are either carnivorous or omnivorous and eat mostly invertebrates, fish, carrion, and plant matter. Striped mud turtles eat insects, snails, fish, carrion, dried krill, plants, and algae. Yellow mud turtles are also omnivorous." +
                                "They can be found in fresh or brackish water, including marshes, small ponds, wet ditches and fields, and offshore islands.",
                        "অবিষাক্ত।",
                },

                {
                        "33",
                        "Terrapin",
                        "False",
                        "Malaclemys terrapin",
                        "Vulnerable",
                        "Terrapins are one of several small species of turtle (order Testudines) living in fresh or brackish water. Terrapins do not form a taxonomic unit and may not be closely related. Many belong to the families Geoemydidae and Emydidae." +
                                "Although terrapins generally prefer to eat fish and meats, they do also eat some green plants, found in marshy areas while in the wild. They prefer green leafy vegetables and grass." +
                                "Diamondback terrapins live in the brackish water of salt marshes, estuaries, and tidal creeks. " +
                                "They feed on fish, marine snails, crabs, marine and tidal mollusks, carrion, clams, and worms.",
                        "অবিষাক্ত।",
                },

                {
                        "34",
                        "Box Turtle",
                        "False",
                        "Terrapene",
                        "Not extinct",
                        "Most (80-90%) of the plant material fed to box turtles should be vegetables and flowers, and only 10-20% should be fruit. As a rule, dark, leafy greens should make up the largest part of the diet. Yellow, red, and orange vegetables can also be included." +
                                "Typically, however, box turtles are found in well-drained forest bottomlands and open deciduous forests. " +
                                "They will use wetland areas at various times during the season. " +
                                "During the hottest part of a summer day, they will wander to find springs and seepages where they can burrow into the moist soil.",
                        "অবিষাক্ত।",
                },

                {
                        "35",
                        "Green iguana",
                        "Venomous but nearly harmless",
                        "Iguana iguana",
                        "Least concern",
                        "Green iguanas are large, typically green lizards, though they can sometimes be brown or almost black in color. Some adults can take on an orange or pink coloration during certain times of the year. Hatchling and young green iguanas usually have bright green coloration." +
                                "Iguanas are herbivorous, meaning they eat plants; specifically, they are folivores, meaning they eat leaves. In the wild, iguanas feed almost entirely on the leaves of trees and vines, plus some fruits and flowers." +
                                "The green iguana is wide ranging and can be found from Mexico through to Central and South America. " +
                                "They are seen as invasive animals in southern Florida and Hawaii.",
                        "বিষাক্ত তবে ক্ষতিকর নয়।",
                },

                {
                        "36",
                        "American chameleon",
                        "False",
                        "Anolis carolinensis",
                        "Least concern",
                        "small arboreal tropical American insectivorous lizards with the ability to change skin color. anole, Anolis carolinensis. iguanid, iguanid lizard - lizards of the New World and Madagascar and some Pacific islands; typically having a long tail and bright throat patch in males." +
                                "Chameleons eat fruits, vegetables, insects such as locusts, or leafy greens in the wild. In captivity, you may feed your chameleon some common foods such as mealworms or Dubia Roaches." +
                                "The green anole, or American Chameleon, is indigenous to the sub-tropical areas of the southern United States.",
                        "অবিষাক্ত।",
                },

                {
                        "37",
                        "whiptail lizard",
                        "False",
                        "Teiidae",
                        "Not extinct",
                        "The desert grassland whiptail lizard is a relatively small reptile, whose size ranges from 2¾ inches (6.9 cm) to 5¼ inches (13.3 cm). Desert grassland whiptails are very long and slim, with a thin tail that is longer than their body length." +
                                "Whiptail lizards are opportunistic insectivores that will pursue whatever small invertebrates they can find. Termites, " +
                                "grasshoppers, and beetles are common choices regardless of a particular species' habitat — and some may feed on more " +
                                "dangerous prey like scorpions as well.",
                        "অবিষাক্ত।",
                },

                {
                        "38",
                        "agama",
                        "False",
                        "agama",
                        "Least concern",
                        "  ",
                        "অবিষাক্ত।",
                },

                {
                        "39",
                        "frilled lizard",
                        "False",
                        "Chlamydosaurus kingii",
                        "Least concern",
                        "frilled lizard, type of reptile found in Australia and New Guinea that can run standing up on its hind legs with its forelegs and tail in the air. The scaly membrane around its neck is used as a large part of the lizard's defensive posture." +
                                "They spend most of their lives in the trees, but descend occasionally to feed on ants and small lizards. Other menu items include spiders, cicadas, termites, and small mammals." +
                                "Frilled lizards, or frillnecks, are members of the dragon family that live in the tropical and warm temperate forests " +
                                "and savanna woodlands of northern Australia.",
                        "অবিষাক্ত।",
                },

                {
                        "40",
                        "Alligator lizard",
                        "False",
                        "Elgaria coerulea",
                        "Least concern",
                        "The alligator lizard has a triangular head and a prehensile tail that helps them climb and navigate through treetops. This species can grow up to about 9.8 inches (25 centimeters) long. These lizards are native to the Mexican states of Veracruz and Pueblo." +
                                "The alligator lizard is carnivorous, feeding on various invertebrate species, a" +
                                "nd occasionally on small, young mammals and birds. Of their invertebrate prey, insects and their larvae, " +
                                "especially ground beetles, grasshopper and crickets, are prominent in their diet.",
                        "অবিষাক্ত।",
                },

                {
                        "41",
                        "Gila monster",
                        "Venomous. Small amount of venom on his bite",
                        "Heloderma suspectum",
                        "Near threatened",
                        "Gila monsters are heavy-bodied lizards covered with beadlike scales, called osteoderms, that are black and yellow or pink covering all but their belly. The Gila monster is venomous; its venom is made by a row of glands in the lizard's lower jaw." +
                                " Its name comes from the Gila River, where the lizards are common. Gila monsters are desert dwellers, " +
                                "living near washes and arroyos and in semiarid rocky regions of desert scrub or grasslands. " +
                                "Gila monsters also seem to prefer rocky foothills and avoid open flats and agricultural areas.",
                        "বিষাক্ত। কামড়ে স্বল্প পরিমাণ বিষ থাকে।",
                },

                {
                        "42",
                        "Green lizard",
                        "False",
                        "Lacerta viridis",
                        "Least concern",
                        "Other Names Chameleon Description. The green anole is a common lizard, slender in build, with a narrow head and a long, slender tail that can be twice as long as the rest of the animal. Color can vary from gray-brown, to brown, to bright green. Each animal can change its color to blend with surroundings." +
                                "In fact, these lizards are beneficial, as they do feed on a wide variety of small insects such as crickets, cockroaches, moths, grubs, beetles, flies and grasshoppers. They do not chew their food but swallow it whole. Anoles grow to 5-7 inches in length." +
                                "The green anole lives in habitats with very high humidity. It can be found in swamps, forests, wooded beaches and other area.",
                        "অবিষাক্ত।",
                },

                {
                        "43",
                        "African chameleon",
                        "False",
                        "Chamaeleo africanus",
                        "Least concern",
                        "The African chameleon is a slow-moving, laterally flattened species growing to a maximum length of 46 cm (18 in). It has bulbous eyes which can move independently of each other and a prehensile tail." +
                                "Fast firing tongue. Chameleons generally eat insects such as locusts, mantids, grasshoppers, stick insects, and crickets. Some larger chameleons also eat small birds and other lizards." +
                                "Chameleons mostly live in the rain forests and deserts of Africa. The color of their skin helps them blend in with their habitats." +
                                " Chameleons that hang out in trees are usually green.",
                        "অবিষাক্ত।",
                },

                {
                        "44",
                        "Komodo dragon",
                        "Venomous. Could kill an adult human within 1 hour.",
                        "Varanus komodoensis",
                        "Endangered",
                        "Komodo dragons are large lizards with long tails, strong and agile necks, and sturdy limbs. Their tongues are yellow and forked. Adults are an almost-uniform stone color with distinct, large scales, while juveniles may display a more vibrant color and pattern." +
                                "Preferring the tropical forests, dragons can also be seen on land or near water, clocking up kilometres daily in search for food. " +
                                "Komodo dragons are carnivores, and they eat any kind of meat but mostly feed on carrion. " +
                                "They feed on small lizards, snakes and birds.",
                        "বিষাক্ত। ১ ঘন্টার মধ্যে পূর্ণবয়স্ক মানুষ মারতে সক্ষম।",
                },

                {
                        "162",
                        "Beagle Dog",
                        "False",
                        "Canis lupus familiaris",
                        "Least concern",
                        "The beagle is a breed of  small scent hound, similar in appearance to the much larger foxhound. The beagle was developed primarily for hunting hare known as beagling. Possessing a great sense of smell and superior tracking instincts, the beagle is the primary breed used as a detection dog for prohibited agricultural imports and foodstuffs in quarantine around the world. The beagle is intelligent and is a popular pet due to its size, good temper, and a lack of inherited health problems.The modern breed was developed in Great Britain around the 1830s from several breeds, including the Talbot Hound, the North Country Beagle, the Southern Hound, and possibly the Harrier.Beagles have been depicted in popular culture since Elizabethan times in literature and paintings and more recently in film, television, and comic books. The origin of the beagle is not known. In the 11th century, William the Conqueror brought the St. Hubert Hound and the Talbot hound to Britain. In Britain, both of these strains were then crossed with Greyhounds to give them speed and stamina for deer hunting.",
                        "অবিষাক্ত",
                        "বিগল হল ছোট ঘ্রাণ হাউন্ডের একটি জাত, যা দেখতে অনেক বড় ফক্সহাউন্ডের মতো। বিগলটি মূলত বিগলিং নামে পরিচিত খরগোশ শিকারের জন্য তৈরি করা হয়েছিল। গন্ধের একটি দুর্দান্ত বোধ এবং উচ্চতর ট্র্যাকিং প্রবৃত্তির অধিকারী, বিগল হল প্রাথমিক জাত যা বিশ্বজুড়ে কোয়ারেন্টাইনে নিষিদ্ধ কৃষি আমদানি এবং খাদ্যদ্রব্য সনাক্তকরণের কুকুর হিসাবে ব্যবহৃত হয়। বীগল বুদ্ধিমান এবং তার আকার, ভালো মেজাজ এবং উত্তরাধিকারসূত্রে প্রাপ্ত স্বাস্থ্য সমস্যার অভাবের কারণে এটি একটি জনপ্রিয় পোষা প্রাণী। আধুনিক ব্রিটেনে 1830 সালের দিকে গ্রেট ব্রিটেনে ট্যালবট হাউন্ড, নর্থ কান্ট্রি বিগল, সহ বিভিন্ন জাত থেকে বিকশিত হয়েছিল। সাউদার্ন হাউন্ড, এবং সম্ভবত হ্যারিয়ার। বিগলসকে এলিজাবেথান কাল থেকে জনপ্রিয় সংস্কৃতিতে চিত্রিত করা হয়েছে সাহিত্য ও চিত্রকলায় এবং সাম্প্রতিককালে চলচ্চিত্র, টেলিভিশন এবং কমিক বইয়ে। বিগলের উৎপত্তি জানা যায়নি। 11 শতকে, উইলিয়াম দ্য কনকারর সেন্ট হুবার্ট হাউন্ড এবং ট্যালবট হাউন্ডকে ব্রিটেনে নিয়ে আসেন। ব্রিটেনে, হরিণ শিকারের গতি ও সহনশীলতা দেওয়ার জন্য এই দুটি স্ট্রেনই গ্রেহাউন্ডের সাথে অতিক্রম করা হয়েছিল।"
                },
                {
                        "285",
                        "Egyptian cat",
                        "False",
                        "Felis catus",
                        "Least concern",
                        "Egyptian Maus are a small to medium-sized short-haired cat breed. They are one of the few naturally spotted breeds of domesticated cat. The spots of the Mau occur on only the tips of the hairs of its coat. It is considered a rare breed.\nCharacteristics \nEgyptian Maus are considered by proponents to be one of the progenitor breeds of the modern domestic cat. The breed conformation is described as a balance between the compactness of a Burmese and the slim elegance of a Siamese. Its medium-length body is muscular, with the hind legs longer than the front, giving the Mau the appearance of standing on tiptoes when upright. The Egyptian Mau is the fastest of the domestic cats, with its longer hind legs, and unique flap of skin extending from the flank to the back knee, which assists in running by allowing the legs to stretch back farther, providing for greater agility and length of stride. Maus have been clocked running more than 48 km/h (30 mph).One of the most important recognizable traits of this breed is a long, dark, dorsal stripe that runs from its head to its tail along its spine.Maus come in six colours. From most to least common, these colours are silver, bronze, smoke, black, caramel and blue/pewter. Black and pewter Maus cannot be shown, but may be used in breeding.",
                        "অবিষাক্ত",
                        "মিশরীয় মাউস একটি ছোট থেকে মাঝারি আকারের ছোট কেশিক বিড়ালের জাত। তারা গৃহপালিত বিড়ালের কয়েকটি প্রাকৃতিকভাবে দাগযুক্ত জাতগুলির মধ্যে একটি। মৌ এর দাগ এর কোটের চুলের ডগায় দেখা যায়। এটি একটি বিরল প্রজাতি হিসাবে বিবেচিত হয়।\n" +
                                "বৈশিষ্ট্য\n" +
                                "মিশরীয় মাউসকে সমর্থকরা আধুনিক গার্হস্থ্য বিড়ালের পূর্বপুরুষদের মধ্যে একটি বলে মনে করেন। শাবক গঠনকে বার্মিজদের কম্প্যাক্টনেস এবং সিয়ামিজের পাতলা কমনীয়তার মধ্যে ভারসাম্য হিসাবে বর্ণনা করা হয়। এর মাঝারি-দৈর্ঘ্যের শরীর পেশীবহুল, পিছনের পা সামনের চেয়ে লম্বা, মাউকে খাড়া অবস্থায় টিপটোর উপর দাঁড়ানোর চেহারা দেয়। মিশরীয় মাউ হল গৃহপালিত বিড়ালদের মধ্যে দ্রুততম, যার পিছনের পা লম্বা, এবং ত্বকের অনন্য ফ্ল্যাপ ফ্ল্যাঙ্ক থেকে পিছনের হাঁটু পর্যন্ত প্রসারিত, যা পাগুলিকে আরও দূরে প্রসারিত করার অনুমতি দিয়ে দৌড়াতে সহায়তা করে, আরও চটপটে এবং দৈর্ঘ্য প্রদান করে। অগ্রগতি মাউস 48 কিমি/ঘন্টা (30 মাইল) এরও বেশি গতিতে ছুটে চলেছে৷ এই প্রজাতির সবচেয়ে গুরুত্বপূর্ণ স্বীকৃত বৈশিষ্ট্যগুলির মধ্যে একটি হল একটি দীর্ঘ, গাঢ়, পৃষ্ঠীয় স্ট্রাইপ যা এটির মেরুদণ্ড বরাবর এর মাথা থেকে লেজ পর্যন্ত চলে। মাউস ছয়টি আসে। রং সবচেয়ে কম সাধারণ থেকে, এই রংগুলি হল রূপালী, ব্রোঞ্জ, ধোঁয়া, কালো, ক্যারামেল এবং নীল/পিউটার। কালো এবং পিউটার মাউস দেখানো যাবে না, তবে প্রজননে ব্যবহার করা যেতে পারে।"
                },
                {
                        "291",
                        "Lion",
                        "False",
                        "Panthera leo",
                        "Vulnerable",
                        "The lion (Panthera leo) is a large cat of the genus Panthera native to Africa and India. It has a muscular, broad-chested body, short, rounded head, round ears, and a hairy tuft at the end of its tail. It is sexually dimorphic; adult male lions are larger than females and have a prominent mane. It is a social species, forming groups called prides. A lion's pride consists of a few adult males, related females, and cubs. Groups of female lions usually hunt together, preying mostly on large ungulates. The lion is an apex and keystone predator; although some lions scavenge when opportunities occur and have been known to hunt humans, the species typically does not actively seek out and prey on humans. The lion inhabits grasslands, savannas and shrublands. It is usually more diurnal than other wild cats, but when persecuted, it adapts to being active at night and at twilight. During the Neolithic period, the lion ranged throughout Africa and Eurasia from Southeast Europe to India, but it has been reduced to fragmented populations in sub-Saharan Africa and one population in western India.",
                        "অবিষাক্ত",
                        "সিংহ (প্যানথেরা লিও) হল আফ্রিকা এবং ভারতে বসবাসকারী প্যানথেরা গোত্রের একটি বড় বিড়াল। এটি একটি পেশীবহুল, চওড়া-বুকযুক্ত শরীর, ছোট, গোলাকার মাথা, গোলাকার কান এবং লেজের শেষে একটি লোমশ টুফ্ট রয়েছে। এটি যৌনভাবে দ্বিরূপ; প্রাপ্তবয়স্ক পুরুষ সিংহগুলি স্ত্রীদের চেয়ে বড় হয় এবং একটি বিশিষ্ট কেশর থাকে। এটি একটি সামাজিক প্রজাতি, যাকে প্রাইড বলা হয়। একসাথে শিকার করে, বেশিরভাগই বড় অগোলেদের শিকার করে। সিংহ একটি শীর্ষ এবং কীস্টোন শিকারী; যদিও কিছু সিংহ যখন সুযোগ আসে এবং মানুষকে শিকার করার জন্য পরিচিত হয়, তখনও প্রজাতিগুলি সাধারণত সক্রিয়ভাবে মানুষের সন্ধান করে না এবং শিকার করে না। সিংহ তৃণভূমি, সাভানা এবং গুল্মভূমিতে বাস করে। এটি সাধারণত অন্যান্য বন্য বিড়ালদের তুলনায় বেশি দৈনিক, কিন্তু যখন প্রতিকূলতার মুখে এটি রাতে এবং গোধূলিতে সক্রিয় থাকার জন্য খাপ খায়। নিওলিথিক যুগে, সিংহ দক্ষিণ-পূর্ব ইউরোপ থেকে ভারত পর্যন্ত আফ্রিকা এবং ইউরেশিয়া জুড়ে বিস্তৃত ছিল, কিন্তু এটা সাব-সাহারান আফ্রিকায় খণ্ডিত জনসংখ্যা এবং পশ্চিম ভারতে একটি জনসংখ্যা হ্রাস পেয়েছে।"
                },
                {
                        "49",
                        "African crocodile",
                        "False",
                        "Crocodylus niloticus",
                        "Least Concern",
                        "The West African crocodile, desert crocodile, or sacred crocodile (Crocodylus suchus) is a species of crocodile related to – and often confused with – the larger and more aggressive Nile crocodile (C. niloticus). Compared to the Nile crocodile, the West African crocodile is smaller: Adults are typically 1.5–2.5 m (5–8 ft) long, and maximum is perhaps 3–4 m (10–13 ft). The species was named by Étienne Geoffroy Saint-Hilaire in 1807, who discovered differences between the skulls of a mummified crocodile and those of Nile crocodile (C. niloticus). This new species was, however, for a long time afterwards regarded as a synonym of the Nile crocodile. In 2003, a study indicated that C. suchus was a valid species, and this was confirmed by several other studies in 2011–2015. Despite the long history of confusion, genetic testing has revealed that the two are not particularly close. The closest relatives of the Nile crocodile are the Crocodylus species from the Americas, while the West African crocodile is basal to the clade of Nile and American crocodiles.Below is a cladogram based on a 2018 tip dating study by Lee & Yates simultaneously using morphological, molecular (DNA sequencing), and stratigraphic (fossil age) data, as revised by the 2021 Hekkala et al. paleogenomics study using DNA extracted from the extinct Voay. The West African crocodile inhabits much of West and Central Africa, ranging east to South Sudan and Uganda, and south to Democratic Republic of the Congo (in all three countries it may come into contact with Nile crocodiles). Other countries where it is found include Mauritania, Benin, Liberia, Guinea-Bissau, Nigeria, Niger, Cameroon, Chad, Sierra Leone, Central African Republic, Equatorial Guinea, Senegal, Mali, Guinea, Gambia, Burkina Faso, Ghana, Gabon, Togo, Ivory Coast and Republic of Congo.",
                        "অবিষাক্ত",
                        "পশ্চিম আফ্রিকার কুমির, মরুভূমির কুমির, বা পবিত্র কুমির (Crocodylus suchus) হল একটি প্রজাতির কুমিরের সাথে সম্পর্কিত - এবং প্রায়শই বিভ্রান্ত হয় - বড় এবং আরও আক্রমণাত্মক নীল কুমির (C. niloticus)। নীল নদের কুমিরের তুলনায়, পশ্চিম আফ্রিকার কুমির ছোট: প্রাপ্তবয়স্কদের সাধারণত 1.5-2.5 মিটার (5-8 ফুট) লম্বা এবং সর্বাধিক সম্ভবত 3-4 মিটার (10-13 ফুট)। 1807 সালে এটিয়েন জিওফ্রয় সেন্ট-হিলাইরে প্রজাতিটির নামকরণ করেছিলেন, যিনি একটি মমি করা কুমির এবং নীল কুমিরের (সি. নিলোটিকাস) মাথার খুলির মধ্যে পার্থক্য আবিষ্কার করেছিলেন। এই নতুন প্রজাতিটি অবশ্য দীর্ঘকাল পরে নীল নদের কুমিরের প্রতিশব্দ হিসাবে বিবেচিত হয়েছিল। 2003 সালে, একটি গবেষণায় ইঙ্গিত দেওয়া হয়েছিল যে সি. সুসাস একটি বৈধ প্রজাতি, এবং এটি 2011-2015 সালে অন্যান্য বেশ কয়েকটি গবেষণা দ্বারা নিশ্চিত করা হয়েছিল। বিভ্রান্তির দীর্ঘ ইতিহাস সত্ত্বেও, জেনেটিক পরীক্ষায় দেখা গেছে যে দুটি বিশেষভাবে কাছাকাছি নয়। নীল নদের কুমিরের নিকটতম আত্মীয় হল আমেরিকা থেকে আসা ক্রোকোডাইলাস প্রজাতি, যখন পশ্চিম আফ্রিকার কুমির হল নীল এবং আমেরিকান কুমিরের ক্লেডের বেসাল। নীচে লি ও ইয়েটসের 2018 সালের টিপ ডেটিং স্টাডির উপর ভিত্তি করে একটি ক্ল্যাডোগ্রাম রয়েছে যা একই সাথে রূপতাত্ত্বিক ব্যবহার করে, আণবিক (ডিএনএ সিকোয়েন্সিং), এবং স্ট্র্যাটিগ্রাফিক (ফসিল বয়স) ডেটা, 2021 হেক্কালা এট আল দ্বারা সংশোধিত। বিলুপ্ত Voay থেকে নিষ্কাশিত ডিএনএ ব্যবহার করে প্যালিওজেনোমিক্স অধ্যয়ন। পশ্চিম আফ্রিকার কুমিরটি পশ্চিম ও মধ্য আফ্রিকার বেশিরভাগ অংশে বাস করে, পূর্বে দক্ষিণ সুদান এবং উগান্ডা এবং দক্ষিণে কঙ্গো গণতান্ত্রিক প্রজাতন্ত্র (তিনটি দেশেই এটি নীল নদের কুমিরের সংস্পর্শে আসতে পারে)। অন্যান্য দেশে যেখানে এটি পাওয়া যায় তার মধ্যে রয়েছে মৌরিতানিয়া, বেনিন, লাইবেরিয়া, গিনি-বিসাউ, নাইজেরিয়া, নাইজার, ক্যামেরুন, চাদ, সিয়েরা লিওন, মধ্য আফ্রিকান প্রজাতন্ত্র, নিরক্ষীয় গিনি, সেনেগাল, মালি, গিনি, গাম্বিয়া, বুর্কিনা ফাসো, ঘানা, গ্যাবন, টোগো, আইভরি কোস্ট এবং কঙ্গো প্রজাতন্ত্র।"
                }
        };


}
