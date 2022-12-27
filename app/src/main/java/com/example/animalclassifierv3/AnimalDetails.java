package com.example.animalclassifierv3;


import java.util.ArrayList;

public class AnimalDetails {
        public static final String[] OPTIONS = new String[]{
                "Serial",
                "Name",
                "Alert",
                "Scientific Name",
                "Conservation Status",
                "Food",
                "Habitat",
                "Miscellaneous",
                "Bangla alert",
                "Bangla food",
                "Bangla habitat",
                "Bangla miscellaneous"
        };

        public static final String[] Dummy = new String[]{
                "291",
                "Dummy",
                "Dummy",
                "Dummy dummy",
                "Dummy",
                "Sorry, no data available yet. This section contains the prominent food and dietary habit of desired animal.",
                "Sorry, no data available yet. This section contains the description of habitat of desired animal.",
                "Sorry, no data available yet. This section contains some extra information about desired animal.",
                "ডামি",
                "দুঃখিত এখনো তথ্য সংযোজন করা হয়নি।",
                "দুঃখিত এখনো তথ্য সংযোজন করা হয়নি।",
                "দুঃখিত এখনো তথ্য সংযোজন করা হয়নি।"
        };

        public static final String[][] DETAILS = new String[][]{
//                {
//                        "0",
//                        "Tence fish",
//                        "Venomous. Time limit for death: 50 minutes.",
//                        "Tinca Tinca",
//                        "Least Concern",
//                        "The tench or doctor fish (Tinca tinca) is a fresh- and brackish-water fish of the order Cypriniformes found throughout Eurasia from Western Europe including the British Isles east into Asia as far as the Ob and Yenisei Rivers.[3] It is also found in Lake Baikal." +
//                                "It normally inhabits slow-moving freshwater habitats, particularly lakes and lowland rivers.",
//                        "বিষাক্ত। ৫০ মিনিটের মধ্যে মৃত্যু ঘটতে পারে।",
//                        "টেঞ্চ বা ডক্টর ফিশ (টিনকা টিনকা) হল সাইপ্রিনিফর্মের একটি তাজা- এবং লোনা-জলের মাছ যা ইউরেশিয়া জুড়ে পশ্চিম ইউরোপ থেকে ব্রিটিশ দ্বীপপুঞ্জ সহ পূর্ব এশিয়া পর্যন্ত ওব এবং ইয়েনিসেই নদী পর্যন্ত পাওয়া যায়। " +
//                                "এটি বৈকাল হ্রদেও পাওয়া যায়। এটি সাধারণত ধীর গতির মিঠা পানির আবাসস্থল, বিশেষ করে হ্রদ এবং নিম্নভূমি নদীতে বাস করে।"
//                },
//                {
//                        "1",
//                        "Goldfish.",
//                        "False",
//                        "Carassius auratus",
//                        "Least concern",
//                        "The goldfish (Carassius auratus) is a freshwater fish in the family Cyprinidae of order Cypriniformes." +
//                                "It is commonly kept as a pet in indoor aquariums, and is one of the most popular aquarium fish." +
//                                " Goldfish released into the wild have become an invasive pest in parts of North America." +
//                                "Native to East Asia, the goldfish is a relatively small member of the carp family " +
//                                "(which also includes the Prussian carp and the crucian carp)." +
//                                " It was first selectively bred for color in imperial China more than 1,000 years ago," +
//                                " and several distinct breeds have since been developed. Goldfish breeds vary greatly in size, body shape," +
//                                " fin configuration, and coloration (various combinations of white, yellow, orange, red, brown, and black are known)",
//                        "অবিষাক্ত",
//                        "গোল্ডফিশ (ক্যারাসিয়াস অরাটাস) হল সাইপ্রিনিফর্মের সাইপ্রিনিডি পরিবারের একটি মিঠা পানির মাছ।" +
//                                "এটি সাধারণত ইনডোর অ্যাকোয়ারিয়ামে পোষা প্রাণী হিসাবে রাখা হয় এবং এটি সবচেয়ে জনপ্রিয় অ্যাকোয়ারিয়াম মাছগুলির মধ্যে একটি।" +
//                                "বনে ছেড়ে দেওয়া গোল্ডফিশ উত্তর আমেরিকার কিছু অংশে আক্রমণকারী কীট হয়ে উঠেছে।" +
//                                "পূর্ব এশিয়ার আদিবাসী, গোল্ডফিশ কার্প পরিবারের একটি অপেক্ষাকৃত ছোট সদস্য" +
//                                "যার মধ্যে প্রুশিয়ান কার্প এবং ক্রুসিয়ান কার্পও রয়েছে)।" +
//                                "১০০০ বছরেরও বেশি আগে সাম্রাজ্য চীনে এটি প্রথম বেছে বেছে রঙের জন্য প্রজনন করা হয়েছিল," +
//                                "এবং এর পর থেকে বেশ কয়েকটি স্বতন্ত্র জাত তৈরি করা হয়েছে। গোল্ডফিশের জাতগুলি আকার, শরীরের আকারে ব্যাপকভাবে পরিবর্তিত হয়," +
//                                "ফিন কনফিগারেশন, এবং রঙ (সাদা, হলুদ, কমলা, লাল, বাদামী এবং কালো বিভিন্ন সমন্বয় পরিচিত)"
//
//                },
//                {
//                        "2",
//                        "White shark",
//                        "False",
//                        "Carcharodon carcharias",
//                        "Threatened",
//                        "The great white shark (Carcharodon carcharias), also known as the white shark, white pointer, or simply great white, " +
//                                "is a species of large mackerel shark which can be found in the coastal surface waters of all the major oceans." +
//                                " It is notable for its size, with larger female individuals growing to 6.1 m (20 ft) in length and " +
//                                "1,905–2,268 kg (4,200–5,000 lb) in weight at maturity. However, most are smaller;" +
//                                " males measure 3.4 to 4.0 m (11 to 13 ft), and females measure 4.6 to 4.9 m (15 to 16 ft) on average." +
//                                " According to a 2014 study, the lifespan of great white sharks is estimated to be as long as 70 years or more," +
//                                " well above previous estimates, making it one of the longest lived cartilaginous fishes currently known." +
//                                " According to the same study, male great white sharks take 26 years to reach sexual maturity, " +
//                                "while the females take 33 years to be ready to produce offspring." +
//                                " Great white sharks can swim at speeds of 25 km/h (16 mph)[10] for short bursts and to depths of " +
//                                "1,200 m (3,900 ft).",
//                        "অবিষাক্ত",
//                        "মহান সাদা হাঙর (Carcharodon carcharias), যা হোয়াইট হাঙ্গর, হোয়াইট পয়েন্টার বা সহজভাবে মহান সাদা নামেও পরিচিত বড় ম্যাকেরেল হাঙরের একটি প্রজাতি যা সমস্ত প্রধান মহাসাগরের উপকূলীয় পৃষ্ঠের জলে পাওয়া যায়। " +
//                                "এটি তার আকারের জন্য উল্লেখযোগ্য, বড় মহিলা ব্যক্তিদের দৈর্ঘ্য 6.1 মিটার (20 ফুট) পর্যন্ত বৃদ্ধি পায় এবং 1,905-2,268 কেজি (4,200-5,000 পাউন্ড) পরিপক্কতার সময় ওজন।" +
//                                " তবে, বেশিরভাগই ছোট; পুরুষদের পরিমাপ 3.4 থেকে 4.0 মিটার (11 থেকে 13 ফুট), এবং মহিলারা 4.6 থেকে 4.9 মিটার (15 থেকে 16 ফুট) গড়ে। " +
//                                "2014 সালের একটি সমীক্ষা অনুসারে, মহান সাদা হাঙরের জীবনকাল 70 বছর বা তার বেশি হতে পারে বলে অনুমান করা হয়। পূর্ববর্তী অনুমানের উপরে, এটি বর্তমানে পরিচিত সবচেয়ে " +
//                                "দীর্ঘজীবী কার্টিলাজিনাস মাছগুলির মধ্যে একটি। একই সমীক্ষা অনুসারে, পুরুষ মহান সাদা হাঙর যৌন পরিপক্কতা পেতে 26 বছর সময় নেয়, যদিও নারীদের সন্তান উৎপাদনের জন্য " +
//                                "প্রস্তুত হতে 33 বছর সময় লাগে। দারুণ সাদা হাঙররা 25 কিমি/ঘন্টা (16 মাইল প্রতি ঘণ্টা) [10] গতিতে সাঁতার কাটতে পারে এবং এর গভীরতায় 1,200 মি (3,900 ফুট)।"
//
//                },
//                {
//                        "3",
//                        "Tiger shark",
//                        "False",
//                        "Galeocerdo cuvier",
//                        "Not threatened",
//                        "The tiger shark (Galeocerdo cuvier) is a species of requiem shark and the last extant member of the Family galeocerdonidae. It is a large macropredator, capable of attaining a length over 5 m (16 ft 5 in). Populations are found in many tropical and temperate waters, especially around central Pacific islands. Its name derives from the dark stripes down its body, which resemble a tiger's pattern, but fade as the shark matures.[5]\n" +
//                                "\n" +
//                                "The tiger shark is a solitary, mostly nocturnal hunter. It is notable for having the widest food spectrum of all sharks, with a range of prey " +
//                                "that includes crustaceans, fish, seals, birds, squid, turtles, sea snakes, dolphins, and even other smaller sharks. It also has a reputation as a \"garbage eater\"," +
//                                " consuming a variety of inedible, man-made objects that linger in its stomach. Though apex predators, tiger sharks are sometimes taken as prey by groups of killer whales." +
//                                " It is considered a near threatened species because of finning and fishing by humans.\n" +
//                                "\n" + "The tiger shark is second only to the great white in recorded fatal attacks on humans," +
//                                "but these events are still exceedingly rare.",
//                        "অবিষাক্ত",
//                        "বাঘ হাঙর (গ্যালিওসারডো কুভিয়ার) হল রিকুয়েম হাঙরের একটি প্রজাতি এবং গ্যালিওসারডোনিডি পরিবারের সর্বশেষ বর্তমান সদস্য। এটি একটি বড় ম্যাক্রোপ্রিডেটর, যা 5 মিটার (16 ফুট 5 ইঞ্চি) এর বেশি দৈর্ঘ্য অর্জন করতে সক্ষম। জনসংখ্যা অনেক গ্রীষ্মমন্ডলীয় এবং নাতিশীতোষ্ণ জলে, বিশেষ করে মধ্য প্রশান্ত মহাসাগরীয় দ্বীপের চারপাশে পাওয়া যায়। এর নামটি এর শরীরের নিচের কালো ডোরা থেকে এসেছে, যা একটি বাঘের প্যাটার্নের মতো, কিন্তু হাঙ্গর পরিপক্ক হওয়ার সাথে সাথে বিবর্ণ হয়ে যায়।" +
//                                "                                টাইগার হাঙ্গর হল একটি নির্জন, বেশিরভাগ নিশাচর শিকারী। এটি শিকারের একটি পরিসর সহ সমস্ত হাঙ্গরের বিস্তৃত খাদ্য বর্ণালী থাকার জন্য উল্লেখযোগ্য" +
//                                "                                যার মধ্যে রয়েছে ক্রাস্টেসিয়ান, মাছ, সীল, পাখি, স্কুইড, কচ্ছপ, সামুদ্রিক সাপ, ডলফিন এবং এমনকি অন্যান্য ছোট হাঙ্গর। এটি একটি আবর্জনা ভক্ষক হিসেবেও খ্যাতি রয়েছে," +
//                                "                                বিভিন্ন রকমের অখাদ্য, মনুষ্যসৃষ্ট বস্তু গ্রাস করে যা এর পেটে থাকে। যদিও সর্বোচ্চ শিকারী, বাঘ হাঙরকে কখনও কখনও ঘাতক তিমির দল শিকার হিসাবে গ্রহণ করে।\" +\n" +
//                                "                                মানুষ দ্বারা ফিনিং এবং মাছ ধরার কারণে এটি একটি প্রায় বিপন্ন প্রজাতি হিসাবে বিবেচিত হয়৷" +
//                                "                                মানুষের উপর নথিভুক্ত মারাত্মক আক্রমণের ক্ষেত্রে বাঘ হাঙ্গর মহান সাদার পরেই দ্বিতীয় স্থানে রয়েছে," +
//                                "                                কিন্তু এই ঘটনাগুলি এখনও অত্যন্ত বিরল।"
//
//                },
//                {
//                        "4",
//                        "Hammerhead shark",
//                        "False",
//                        "Sphyrnidae",
//                        "Not threatened",
//                        "The hammerhead sharks are a group of sharks that form the family Sphyrnidae, so named for" +
//                                " the unusual and distinctive structure of their heads, which are flattened and " +
//                                "laterally extended into a \"hammer\" shape called a cephalofoil. Most hammerhead " +
//                                "species are placed in the genus Sphyrna, while the winghead shark is placed in its own genus, Eusphyra. Many different, but not necessarily mutually exclusive, functions have been postulated for the cephalofoil, including sensory reception, manoeuvering, and prey manipulation. The cephalofoil gives the shark superior binocular vision and depth perception.[1]\n" +
//                                "\n" +"Hammerheads are found worldwide in warmer waters along coastlines and " +
//                                "continental shelves. Unlike most sharks, some hammerhead species usually swim in schools during the day, " +
//                                "becoming solitary hunters at night. ",
//                        "অবিষাক্ত",
//
//                },
//                {
//                        "5",
//                        "Electric ray",
//                        "False",
//                        "Torpediniformes",
//                        "Threatened",
//                        "The electric rays are a group of rays, flattened cartilaginous fish with enlarged pectoral fins, composing the order Torpediniformes /tɔːrˈpɛdɪnɪfɔːrmiːz/. They are known for being capable of producing an electric discharge, ranging from 8 to 220 volts, depending on species, used to stun prey and for defense.[2] There are 69 species in four families.\n" +
//                                "\n" +
//                                "Perhaps the best known members are those of the genus Torpedo. The torpedo undersea weapon is named after it. The name comes from the Latin torpere, " +
//                                "'to be stiffened or paralyzed', from the effect on someone who touches the fish",
//                        "অবিষাক্ত",
//                },
//                {
//                        "6",
//                        "Stingray",
//                        "Venomous. Not deadly.",
//                        "Myliobatoidei",
//                        "Threatened",
//                        "Stingrays are a group of sea rays, which are cartilaginous fish related to sharks. They are classified in the suborder Myliobatoidei of the order Myliobatiformes and consist of eight families: Hexatrygonidae (sixgill stingray), Plesiobatidae (deepwater stingray), Urolophidae (stingarees), Urotrygonidae (round rays), Dasyatidae (whiptail stingrays), Potamotrygonidae (river stingrays), Gymnuridae (butterfly rays) and Myliobatidae (eagle rays).[1][2] There are about 220 known stingray species organized into 29 genera.\n" +
//                                "\n" +
//                                "Stingrays are common in coastal tropical and subtropical marine waters throughout the world. Some species, such as the thorntail stingray (Dasyatis thetidis), are found in warmer temperate oceans and others, such as the deepwater stingray (Plesiobatis daviesi), are found in the deep ocean. The river stingrays and a number of whiptail stingrays (such as the Niger stingray (Fontitrygon garouaensis)) are restricted to fresh water. Most myliobatoids are demersal (inhabiting the next-to-lowest zone in the water column), " +
//                                "but some, such as the pelagic stingray and the eagle rays, are pelagic.",
//                        "বিষাক্ত, তবে ঘাতক নয়।",
//                },
//                {
//                        "7",
//                        "Cock",
//                        "False",
//                        "Gallus gallus domesticus",
//                        "Domesticated",
//                        "The chicken (Gallus gallus domesticus) is a domesticated junglefowl species, with attributes of wild species such as the grey and the Ceylon junglefowl[1] that are originally from Southeastern Asia. Rooster or cock is a term for an adult male bird, and a younger male may be called a cockerel. A male that has been castrated is a capon. An adult female bird is called a hen and a sexually immature female is called a pullet. Humans now keep chickens primarily as a source of food (consuming both their meat and eggs) and as pets. " +
//                                "Traditionally they were also bred for cockfighting, which is still practiced in some places.",
//                        "অবিষাক্ত"
//                },
//                {
//                        "8",
//                        "Hen",
//                        "False",
//                        "Gallus gallus domesticus",
//                        "Domesticated",
//                        "The chicken (Gallus gallus domesticus) is a domesticated junglefowl species, with attributes of wild species such as the grey and the Ceylon junglefowl[1] that are originally from Southeastern Asia. Rooster or cock is a term for an adult male bird, and a younger male may be called a cockerel. A male that has been castrated is a capon. An adult female bird is called a hen and a sexually immature female is called a pullet. Humans now keep chickens primarily as a source of food (consuming both their meat and eggs) and as pets. " +
//                                "Traditionally they were also bred for cockfighting, which is still practiced in some places.",
//                        "অবিষাক্ত",
//
//                },
//                {
//                        "9",
//                        "Ostrich",
//                        "False",
//                        "Struthio camelus",
//                        "Not threatened",
//                        "Ostriches are large flightless birds of the genus Struthio in the order Struthioniformes, part of the infra-class Palaeognathae, a diverse group of flightless birds also known as ratites that includes the emus, rheas, and kiwis. There are two living species of ostrich: the common ostrich, native to large areas of sub-Saharan Africa and the Somali ostrich, native to the Horn of Africa.  The common ostrich was also historically native to the Arabian Peninsula, and ostriches were present across Asia as far east as Mongolia during the Late Pleistocene and possibly into the Holocene. They lay the largest eggs of any living land animal. With the ability to run at 70 km/h (43.5 mph), they are the fastest birds on land. They are farmed worldwide, particularly for their feathers as they are used as decoration and feather dusters. Their skin is also used for leather products. They are the heaviest living birds.\\n\\n\\n== Taxonomic history ==\\nThe genus Struthio was first described by Carl Linnaeus in 1758. The genus was used by Linnaeus and other early taxonomists to include the emu, rhea, and cassowary, until they each were placed in their own genera.",
//                        "অবিষাক্ত",
//                        "উটপাখি হল স্ট্রুথিও গোত্রের স্ট্রুথিওনিফর্মের ক্রমানুসারে বড় উড়ন্ত পাখি, যা ইনফ্রা-শ্রেণির প্যালেওগনাথায়ের অংশ, উড়ন্ত পাখিদের একটি বৈচিত্র্যময় দল যা রেটাইট নামেও পরিচিত যার মধ্যে ইমু, রিয়া এবং কিউই রয়েছে। উটপাখির দুটি জীবন্ত প্রজাতি রয়েছে: সাধারণ উটপাখি, সাব-সাহারান আফ্রিকার বৃহৎ অঞ্চলের স্থানীয় এবং সোমালি উটপাখি, আফ্রিকার হর্নের স্থানীয়। সাধারণ উটপাখিও ঐতিহাসিকভাবে আরব উপদ্বীপের স্থানীয় ছিল এবং উটপাখিরা প্লিসটোসিনের শেষের দিকে এবং সম্ভবত হলসিনে মঙ্গোলিয়া পর্যন্ত এশিয়া জুড়ে উপস্থিত ছিল। তারা যে কোনো জীবন্ত স্থল প্রাণীর মধ্যে সবচেয়ে বড় ডিম পাড়ে। 70 কিমি/ঘন্টা (43.5 মাইল) বেগে দৌড়ানোর ক্ষমতা সহ, তারা ভূমিতে সবচেয়ে দ্রুততম পাখি। এগুলি বিশ্বব্যাপী চাষ করা হয়, বিশেষ করে তাদের পালকের জন্য কারণ এগুলি সাজসজ্জা এবং পালক ঝাড়ন হিসাবে ব্যবহৃত হয়। তাদের চামড়া চামড়াজাত পণ্যের জন্যও ব্যবহৃত হয়। তারা সবচেয়ে ভারী জীবন্ত পাখি। শ্রেণীবিন্যাস ইতিহাস স্ট্রুথিও জিনাসটি কার্ল লিনিয়াস দ্বারা 1758 সালে প্রথম বর্ণনা করা হয়েছিল। লিনিয়াস এবং অন্যান্য প্রাথমিক শ্রেণীবিন্যাসবিদরা এমু, রিয়া এবং ক্যাসোওয়ারি অন্তর্ভুক্ত করার জন্য জিনাসটি ব্যবহার করেছিলেন, যতক্ষণ না তাদের প্রত্যেককে তাদের নিজস্ব বংশে স্থাপন করা হয়েছিল।"
//
//                },
//                {
//                        "10",
//                        "Brambling bird",
//                        "False",
//                        "Fringilla montifringilla",
//                        "Least concern",
//                        "This bird is widespread, in the breeding season, throughout the forests of northern Europe and east " +
//                                "across the Palearctic. It is migratory, wintering in southern Europe, North Africa, " +
//                                "northern India, northern Pakistan, China, and Japan. It frequently strays into Alaska during" +
//                                "migration and there are scattered records across the northern United States and southern Canada.[8] The global population of bramblings is about 100 to 200 million, with a decreasing trend.[1]\n" +
//                                "\n" +
//                                "Open coniferous or birch woodland is favoured for breeding.",
//                        "অবিষাক্ত",
//                },
//
//                {
//                        "11",
//                        "Goldfinch",
//                        "False",
//                        "Carduelis carduelis",
//                        "Least Concern ",
//                        "goldfinch (Carduelis carduelis) is a small passerine bird in the finch family that is native to Europe, North Africa and western and central Asia. It has been introduced to other areas, including Australia, New Zealand and Uruguay.\n" +
//                                "The breeding male has a red face with black markings around the eyes, and a black-and-white head. The back and flanks are buff or chestnut brown. The black wings have a broad yellow bar. The tail is black and the rump is white. Males and females are very similar, but females have a slightly smaller red area on the face." +
//
//                                "Sociable, often breeding in loose colonies, they have a delightful liquid twittering song and call. Their long fine beaks allow them to extract otherwise inaccessible seeds from thistles and teasels. Increasingly they are visiting bird tables and feeders. In winter many UK goldfinches migrate as far south as Spain." +
//                                "The goldfinch prefers open country where weeds thrive, such as fields, meadows, flood plains, as well as roadsides, orchards, and gardens. " +
//                                "Goldfinches eat a variety of seeds from trees, weeds, and grasses. They also eat some insects, " +
//                                "flower buds and berries while they feed on the ground, weed stalks and foliage",
//                        "অবিষাক্ত",
//
//                },
//
//                {
//                        "12",
//                        "house finch",
//                        "False",
//                        "Carpodacus mexicanus",
//                        "Least Concern ",
//                        " goldfinch (Carduelis carduelis) is a small passerine bird in the finch family that is native to Europe, North Africa and western and central Asia. It has been introduced to other areas, including Australia, New Zealand and Uruguay.\n" +
//                                "The breeding male has a red face with black markings around the eyes, and a black-and-white head. The back and flanks are buff or chestnut brown. The black wings have a broad yellow bar. The tail is black and the rump is white. Males and females are very similar, but females have a slightly smaller red area on the face." +
//                                "Sociable, often breeding in loose colonies, they have a delightful liquid twittering song and call. Their long fine beaks allow them to extract otherwise inaccessible seeds from thistles and teasels. Increasingly they are visiting bird tables and feeders. In winter many UK goldfinches migrate as far south as Spain." +
//                                "The goldfinch prefers open country where weeds thrive, such as fields, meadows, flood plains, as well as roadsides, orchards, and gardens. " +
//                                "Goldfinches eat a variety of seeds from trees, weeds, and grasses. They also eat some insects, " +
//                                "flower buds and berries while they feed on the ground, weed stalks and foliage",
//                        "অবিষাক্ত",
//
//                },
//
//                {
//                        "13",
//                        "Junco",
//                        "False",
//                        "Passerina cyanea",
//                        "Least concern",
//                        "A junco, is a small North American bird in the New World sparrow. Junco systematics are still confusing after decades of research, with various authors accepting between three and twelve species. Despite having a name that appears to derive from the Spanish term for the plant genus Juncus , these birds are seldom found among rush plants, which prefer wet ground, while juncos prefer dry soil." +
//                                "Juncos prefer to roost in evergreens at night but will also use tall grasses and brush piles. They return to the same roost location repeatedly and will share it with other flock mates, but they do not huddle together."+
//                                "Juncos breed in forests across much of North America and at elevations ranging from sea level to more than 11,000 feet. They are often found in coniferous forests incuding pine, Douglas-fir, spruce, and fir, but also in deciduous forests such as aspen, cottonwood, oak, maple, and hickory." +
//                                "Juncos feed mostly on the ground, eating weed and grass seeds, with a diet of mostly insects in the summer and " +
//                                "seeds in the winter",
//                        "অবিষাক্ত",
//                },
//
//                {
//                        "15",
//                        "American robin",
//                        "False",
//                        "Turdus migratorius",
//                        "Least concern",
//                        "The American robin is a migratory bird of the true thrush, the wider thrush family. It is named after the European robin[2] because of its reddish-orange breast, though the two species are not closely related, with the European robin belonging to the Old World flycatcher family. The American robin is widely distributed throughout North America, wintering from southern Canada to central Mexico and along the Pacific Coast." +
//                                "The American robin is active mostly during the day, and on its winter grounds it assembles in large flocks at night to roost in trees in secluded swamps or dense vegetation." +
//                                "American robins live in woodlands, suburban backyards, parks, and grasslands with shrubs. Robins can be found year-round in the continental United States, and some migrate north to spend summers in Alaska."+
//                                "The American robin's diet generally consists of around 40 percent small invertebrates, such as earthworms, " +
//                                "beetle grubs, caterpillars and grasshoppers, and 60 percent wild and cultivated fruits and berries.",
//                        "অবিষাক্ত",
//                },
//
//                {
//                        "16",
//                        "Bulbul",
//                        "False",
//                        "Pycnonotidae",
//                        "Least concern",
//                        "bulbul, any of about 140 species of birds of the family Pycnonotidae of Africa and Asia, including some called greenbuls and brownbuls. Members range in size from 14 to 28 cm long. They are active, noisy, plain-coloured birds that sometimes damage orchards." +
//                                "The red-vented bulbul is vocal bird and has distinct calls for different acts such as greeting and begging, as well as two distinctive alarm calls" +
//                                "Species of bulbuls occur in diverse tropical habitats, but not in deserts. They may occur in dense vegetation in tropical forests or in more open habitats, such as gardens in towns or even city parks." +
//                                "Red-vented bulbuls feed on fruits, petals of flowers, nectar, insects and occasionally house geckos.",
//                        "অবিষাক্ত",
//                },
//
//                {
//                        "17",
//                        "Jay",
//                        "False",
//                        "Cyanocitta cristata",
//                        "Least concern",
//                        "Jays are nearly omnivorous; some are egg stealers, and many store seeds and nuts for winter use. They make a twiggy, cuplike nest in a tree. After breeding, most species are gregarious." +
//                                "Jays are shy woodland birds, rarely moving far from cover  they are extremely intelligent. In fact, many scientists consider this Corvid family of birds to be the smartest animals on Earth." +
//                                "Jays will only occur where there is plenty of cover, and favour mature deciduous woodland and in particular with oak trees." +
//                                "Peanuts in any form—whole, shelled, or even peanut butter—are their favorites at backyard feeders.",
//                        "অবিষাক্ত",
//                },
//
//                {
//                        "19",
//                        "Chickadee",
//                        "False",
//                        "Poecile",
//                        "Least concern",
//                        "They are small-sized birds overall, usually having the crown of the head and throat patch distinctly darker than the body. They are at least 6 to 14 centimeters (2.4 to 5.5 inches) in size." +
//                                "The habitat that chickadees prefer is mixed deciduous or coniferous forests, parks, open woods, " +
//                                "cottonwood groves, willow thickets, and disturbed areas.",
//                        "অবিষাক্ত",
//                },
//
//                {
//                        "20",
//                        "Dipper",
//                        "False",
//                        "Cinclus Cinclidae",
//                        "Least concern",
//                        "Dippers are small, chunky, stout, short-tailed, short-winged, strong-legged birds.Dippers are found in suitable freshwater " +
//                                "habitats in the highlands of the Americas, Europe and Asia.",
//                        "অবিষাক্ত",
//                },
//
//                {
//                        "23",
//                        "Vulture",
//                        "False",
//                        "Cathartes",
//                        "Extinct",
//                        "A vulture is a bird of prey that scavenges on carrion. There are 23 extant species of vulture (including Condors).[2] Old World vultures include 16 living species native to Europe, Africa, and Asia; New World vultures are restricted to " +
//                                "North and South America and consist of seven identified species, all belonging to the Cathartidae. " +
//                                "Vultures are widely distributed, but they are absent from Australia and most oceanic islands. " +
//                                "Most vultures have broad food habits, consuming carrion, garbage, and even excrement, " +
//                                "but rarely do they descend upon live animals. A few occasionally take helpless prey such as lambs and tortoises or, " +
//                                "in the case of Andean condors, newborn calves.",
//                        "অবিষাক্ত",
//                },
//
//                {
//                        "24",
//                        "Great Grey Owl",
//                        "False",
//                        "Strix nebulosa",
//                        "Least Concern",
//                        "The great grey owl is a very large owl, documented as the world's largest species of owl by length. " +
//                                "Adults have a large rounded head with a grey face and yellow eyes with darker circles around them. The underparts are light with dark streaks; the upper parts are grey with pale bars. This owl does not have ear tufts and has the largest facial disc of any raptor." +
//                                "In northern areas their breeding habitat is often the dense coniferous forests of the taiga, " +
//                                "near open areas, such as meadows or bogs.",
//                        "অবিষাক্ত",
//                },
//
//                {
//                        "25",
//                        "European fire salamander",
//                        "Venomous. The fire salamander's primary alkaloid toxin, samandarin, causes strong muscle convulsions and hypertension combined with hyperventilation in all vertebrates.",
//                        "Salamandra salamandra",
//                        "Least concern",
//                        "The fire salamander (Salamandra salamandra) is a common species of salamander found in Europe. It is black with yellow spots or stripes to a varying degree; some specimens can be nearly completely black while on others the yellow is dominant. Shades of red and orange may sometimes appear, either replacing or mixing with the yellow according to subspecies. This bright coloration is highly conspicuous and acts to deter predators by honest signalling of its toxicity (aposematism) Fire salamanders can have a very long lifespan; one specimen lived for more than 50 years in Museum Koenig, a German natural history museum. Fire salamanders live in the forests of central Europe and are more common in hilly areas. They prefer deciduous forests since they like to hide in fallen leaves and around mossy tree trunks. They need small brooks or ponds with clean water in their habitat for the development of the larvae. Whether on land or in water, fire salamanders are inconspicuous. They spend much of their time hidden under wood or other objects. They are active in the evening and the night, but on rainy days they are active in the daytime as well.The diet of the fire salamander consists of various insects, spiders, millipedes, centipedes, earthworms and slugs, but they also occasionally eat newts and young frogs.",
//                        "বিষাক্ত। ক্ষারকীয় বিষ 'সামান্দারিন' যা মাংসপেশীর খিচুনি, উচ্চ রক্তচাপ ও হাপানীর সৃষ্টি করে।",
//                        "ফায়ার স্যালামান্ডার (স্যালামান্দ্রা সালাম্যান্ড্রা) হল ইউরোপে পাওয়া সালামন্ডারের একটি সাধারণ প্রজাতি। এটি হলুদ দাগ বা বিভিন্ন ডিগ্রী ডোরা সঙ্গে কালো; কিছু নমুনা প্রায় সম্পূর্ণ কালো হতে পারে যখন অন্যদের উপর হলুদ প্রভাবশালী। লাল এবং কমলা রঙের ছায়া কখনও কখনও প্রদর্শিত হতে পারে, হয় প্রতিস্থাপন বা উপ-প্রজাতি অনুসারে হলুদের সাথে মিশ্রিত হয়। এই উজ্জ্বল রঙ অত্যন্ত সুস্পষ্ট এবং এর বিষাক্ততার সৎ সংকেত দ্বারা শিকারীকে আটকাতে কাজ করে (অ্যাপোসেমেটিজম) ফায়ার সালাম্যান্ডারদের জীবনকাল খুব দীর্ঘ হতে পারে; একটি নমুনা জার্মান প্রাকৃতিক ইতিহাস জাদুঘর কোয়েনিগে 50 বছরেরও বেশি সময় ধরে বেঁচে ছিল। ফায়ার সালাম্যান্ডাররা মধ্য ইউরোপের বনাঞ্চলে বাস করে এবং পাহাড়ি এলাকায় বেশি দেখা যায়। তারা পর্ণমোচী বন পছন্দ করে কারণ তারা পতিত পাতা এবং শ্যাওলা গাছের কাণ্ডের চারপাশে লুকিয়ে থাকতে পছন্দ করে। লার্ভা বিকাশের জন্য তাদের বাসস্থানে পরিষ্কার জল সহ ছোট খাল বা পুকুর প্রয়োজন। স্থলে হোক বা জলে, ফায়ার স্যালাম্যান্ডারগুলি অদৃশ্য। তারা তাদের বেশিরভাগ সময় কাঠ বা অন্যান্য বস্তুর নিচে লুকিয়ে কাটায়। তারা সন্ধ্যায় এবং রাতে সক্রিয় থাকে, কিন্তু বৃষ্টির দিনে তারা দিনের বেলাও সক্রিয় থাকে। ফায়ার স্যালামান্ডারের খাদ্যে বিভিন্ন পোকামাকড়, মাকড়সা, মিলিপিডস, সেন্টিপিডস, কেঁচো এবং স্লাগ থাকে, তবে তারা মাঝে মাঝে নিউটসও খায়। এবং তরুণ ব্যাঙ।"
//                },
//
//                {
//                        "26",
//                        "Eft",
//                        "Venomous.  Some salamanders produce a neurotoxin (tetrodotoxin) on their skin.",
//                        "Triturus vulgaris",
//                        "Least concern",
//                        "Adult males of the smooth newt reach around 9–11 cm (3.5–4.3 in) head-to-tail length and are thus slightly larger than the females, which reach 8–9.5 cm (3.1–3.7 in). The body weight of adults varies between 0.3–5.2 g (0.011–0.183 oz), and decreases during the breeding season. The head is longer than it is wide, with 2–3 longitudinal grooves on the top, and the elongated snout is blunt in the male and rounded in the female. The skin is velvety and water-repellent on land but smooth during the aquatic phase; it contains mucus and toxin glands and its upper layer is shed off regularly." +
//                                "Smooth newts eat insects, caterpillars, worms and slugs while on land, and crustaceans, " +
//                                "molluscs and tadpoles when in the water. They are most active during the night.",
//                        "বিষাক্ত। কিছু সালামান্ডার তাদের ত্বকে নিউরোটক্সিন তৈরি করে।",
//
//                },
//
//                {
//                        "27",
//                        "Smooth newt",
//                        "Venomous.  Some salamanders produce a neurotoxin (tetrodotoxin) on their skin.",
//                        "Triturus vulgaris",
//                        "Least concern",
//                        "Adult males of the smooth newt reach around 9–11 cm (3.5–4.3 in) head-to-tail length and are thus slightly larger than the females, which reach 8–9.5 cm (3.1–3.7 in). The body weight of adults varies between 0.3–5.2 g (0.011–0.183 oz), and decreases during the breeding season. The head is longer than it is wide, with 2–3 longitudinal grooves on the top, and the elongated snout is blunt in the male and rounded in the female. The skin is velvety and water-repellent on land but smooth during the aquatic phase; it contains mucus and toxin glands and its upper layer is shed off regularly." +
//                                "Smooth newts eat insects, caterpillars, worms and slugs while on land, and crustaceans, " +
//                                "molluscs and tadpoles when in the water. They are most active during the night.",
//                        "বিষাক্ত। কিছু সালামান্ডার তাদের ত্বকে নিউরোটক্সিন তৈরি করে।",
//                },
//                {
//                        "28",
//                        "Spotted salamander",
//                        "Venomous.  Some salamanders produce a neurotoxin (tetrodotoxin) on their skin.",
//                        "Ambystoma mexicanum",
//                        "Least concern",
//                        "The spotted salamander usually lives in mature forests with ponds or ephemeral vernal pools for breeding sites.[10] Vernal pools are suitable breeding sites for these amphibians as they dry often enough to exclude fish that eat the salamander eggs and larvae, while retaining water long enough to allow amphibian larvae to complete development and metamorphose into terrestrial adults." +
//                                "Spotted salamanders are fossorial, meaning they spend most of their time underground. " +
//                                "They rarely come above ground, except after a rain or for foraging and breeding. " +
//                                "During the winter, they brumate underground, and are not seen again until breeding season in early March–May.",
//                        "বিষাক্ত। কিছু সালামান্ডার তাদের ত্বকে নিউরোটক্সিন তৈরি করে।",
//                },
//
//                {
//                        "30",
//                        "Bullfrog",
//                        "False",
//                        "Rana catesbeiana",
//                        "Least concern",
//                        "Adult American bullfrogs have voracious appetites and will eat anything they can fit into their mouths, including invertebrates, birds, bats, rodents, frogs, newts, lizards, snakes, and turtles." +
//                                "The banded bullfrog lives at low altitudes and is found in both urban and rural settings, " +
//                                "as well as in forest habitats. They bury themselves underground during dry periods and emerge " +
//                                "after heavy rainfall to emit calls and breed.",
//                        "অবিষাক্ত।",
//                },
//
//                {
//                        "31",
//                        "Tree frog",
//                        "False",
//                        "hyla arborea",
//                        "Not extinct",
//                        "Tree frogs are predators and their diet consists of insects, such as flies, ants, true bugs, bees, worms, beetles, isopods, wasps, spiders, and crickets. Keeping a frog healthy in captivity can be difficult because they don't have the same access to food as they would in the wild." +
//                                "The common green treefrog occurs in all habitats from desert to coastal swamps, " +
//                                "including dry vine thickets, but not dense tropical rainforest.",
//                        "অবিষাক্ত।",
//                },
//
//                {
//                        "32",
//                        "Tailed frog",
//                        "False",
//                        "Ascaphus trui",
//                        "Not Extinct",
//                        " Thus, the tailed frogs exhibit internal fertilisation, rather than the external fertilisation found in other frogs. These frogs are primitive in having a greater number of vertebrae than other frogs, in lacking the ability to vocalise, and in possessing free ribs.\\\"\n" +
//                                "Tailed Frogs live in and beside cool, clear mountain streams with year- round flow. All stages, from egg to adult, are able to tolerate only a narrow range of water temperatures. The eggs are most sensitive and can only survive in streams with highly oxygenated waters and temperatures of 5 to18. 5°C." +
//                                "They eat insects and other invertebrates they catch in the water or on land nearby. They look for food at night.",
//                        "অবিষাক্ত।",
//                },
//
//                {
//                        "33",
//                        "Loggerhead turtle",
//                        "false",
//                        "Caretta caretta",
//                        "Vulnerable ",
//                        "The leatherback sea turtle (Dermochelys coriacea), sometimes called the lute turtle or leathery turtle or simply the luth, is the largest of all living turtles and the heaviest non-crocodilian reptile, reaching lengths of up to 1.8 metres (5 ft 11 in) and weights of 500 kilograms (1,100 lb)" +
//                                "Leatherbacks spend most of their lives at sea and sometimes look for prey in coastal waters. Jellyfish make up the biggest portion of their diet, but they also eat seaweed, fish, crustaceans, and other marine invertebrates." +
//                                "Like other sea turtles, the meat of leatherbacks can be toxic to humans and other animals.",
//                        "অবিষাক্ত।",
//                },
//
//                {
//                        "34",
//                        "leatherback turtle",
//                        "False",
//                        "Dermochelys coriacea",
//                        "Vulnerable",
//                        "The leatherback sea turtle (Dermochelys coriacea), sometimes called the lute turtle or leathery turtle or simply the luth, is the largest of all living turtles and the heaviest non-crocodilian reptile, reaching lengths of up to 1.8 metres (5 ft 11 in) and weights of 500 kilograms (1,100 lb)" +
//                                "Leatherbacks spend most of their lives at sea and sometimes look for prey in coastal waters. Jellyfish make up the biggest portion of their diet, but they also eat seaweed, fish, crustaceans, and other marine invertebrates." +
//                                "Like other sea turtles, the meat of leatherbacks can be toxic to humans and other animals.",
//                        "অবিষাক্ত।",
//                },
//
//                {
//                        "35",
//                        "Mud turtle",
//                        "False",
//                        "Kinosternon",
//                        "Not Extinct",
//                        "Mud turtles eat mostly invertebrates, fish, carrion, and plant matter. Most mud turtles are either carnivorous or omnivorous and eat mostly invertebrates, fish, carrion, and plant matter. Striped mud turtles eat insects, snails, fish, carrion, dried krill, plants, and algae. Yellow mud turtles are also omnivorous." +
//                                "They can be found in fresh or brackish water, including marshes, small ponds, wet ditches and fields, and offshore islands.",
//                        "অবিষাক্ত।",
//                },
//
//                {
//                        "36",
//                        "Terrapin",
//                        "False",
//                        "Malaclemys terrapin",
//                        "Vulnerable",
//                        "Terrapins are one of several small species of turtle (order Testudines) living in fresh or brackish water. Terrapins do not form a taxonomic unit and may not be closely related. Many belong to the families Geoemydidae and Emydidae." +
//                                "Although terrapins generally prefer to eat fish and meats, they do also eat some green plants, found in marshy areas while in the wild. They prefer green leafy vegetables and grass." +
//                                "Diamondback terrapins live in the brackish water of salt marshes, estuaries, and tidal creeks. " +
//                                "They feed on fish, marine snails, crabs, marine and tidal mollusks, carrion, clams, and worms.",
//                        "অবিষাক্ত।",
//                },
//
//                {
//                        "37",
//                        "Box Turtle",
//                        "False",
//                        "Terrapene",
//                        "Not extinct",
//                        "Most (80-90%) of the plant material fed to box turtles should be vegetables and flowers, and only 10-20% should be fruit. As a rule, dark, leafy greens should make up the largest part of the diet. Yellow, red, and orange vegetables can also be included." +
//                                "Typically, however, box turtles are found in well-drained forest bottomlands and open deciduous forests. " +
//                                "They will use wetland areas at various times during the season. " +
//                                "During the hottest part of a summer day, they will wander to find springs and seepages where they can burrow into the moist soil.",
//                        "অবিষাক্ত।",
//                },
//
//                {
//                        "39",
//                        "Iguana",
//                        "Venomous but nearly harmless",
//                        "Iguana iguana",
//                        "Least concern",
//                        "Green iguanas are large, typically green lizards, though they can sometimes be brown or almost black in color. Some adults can take on an orange or pink coloration during certain times of the year. Hatchling and young green iguanas usually have bright green coloration." +
//                                "Iguanas are herbivorous, meaning they eat plants; specifically, they are folivores, meaning they eat leaves. In the wild, iguanas feed almost entirely on the leaves of trees and vines, plus some fruits and flowers." +
//                                "The green iguana is wide ranging and can be found from Mexico through to Central and South America. " +
//                                "They are seen as invasive animals in southern Florida and Hawaii.",
//                        "বিষাক্ত তবে ক্ষতিকর নয়।",
//                },
//
//                {
//                        "40",
//                        "American chameleon",
//                        "False",
//                        "Anolis carolinensis",
//                        "Least concern",
//                        "small arboreal tropical American insectivorous lizards with the ability to change skin color. anole, Anolis carolinensis. iguanid, iguanid lizard - lizards of the New World and Madagascar and some Pacific islands; typically having a long tail and bright throat patch in males." +
//                                "Chameleons eat fruits, vegetables, insects such as locusts, or leafy greens in the wild. In captivity, you may feed your chameleon some common foods such as mealworms or Dubia Roaches." +
//                                "The green anole, or American Chameleon, is indigenous to the sub-tropical areas of the southern United States.",
//                        "অবিষাক্ত।",
//                },
//
//                {
//                        "41",
//                        "whiptail lizard",
//                        "False",
//                        "Teiidae",
//                        "Not extinct",
//                        "The desert grassland whiptail lizard is a relatively small reptile, whose size ranges from 2¾ inches (6.9 cm) to 5¼ inches (13.3 cm). Desert grassland whiptails are very long and slim, with a thin tail that is longer than their body length." +
//                                "Whiptail lizards are opportunistic insectivores that will pursue whatever small invertebrates they can find. Termites, " +
//                                "grasshoppers, and beetles are common choices regardless of a particular species' habitat — and some may feed on more " +
//                                "dangerous prey like scorpions as well.",
//                        "অবিষাক্ত।",
//                },
//
//                {
//                        "43",
//                        "frilled lizard",
//                        "False",
//                        "Chlamydosaurus kingii",
//                        "Least concern",
//                        "frilled lizard, type of reptile found in Australia and New Guinea that can run standing up on its hind legs with its forelegs and tail in the air. The scaly membrane around its neck is used as a large part of the lizard's defensive posture." +
//                                "They spend most of their lives in the trees, but descend occasionally to feed on ants and small lizards. Other menu items include spiders, cicadas, termites, and small mammals." +
//                                "Frilled lizards, or frillnecks, are members of the dragon family that live in the tropical and warm temperate forests " +
//                                "and savanna woodlands of northern Australia.",
//                        "অবিষাক্ত।",
//                },
//
//                {
//                        "44",
//                        "Alligator lizard",
//                        "False",
//                        "Elgaria coerulea",
//                        "Least concern",
//                        "The alligator lizard has a triangular head and a prehensile tail that helps them climb and navigate through treetops. This species can grow up to about 9.8 inches (25 centimeters) long. These lizards are native to the Mexican states of Veracruz and Pueblo." +
//                                "The alligator lizard is carnivorous, feeding on various invertebrate species, a" +
//                                "nd occasionally on small, young mammals and birds. Of their invertebrate prey, insects and their larvae, " +
//                                "especially ground beetles, grasshopper and crickets, are prominent in their diet.",
//                        "অবিষাক্ত।",
//                },
//
//                {
//                        "45",
//                        "Gila monster",
//                        "Venomous. Small amount of venom on his bite",
//                        "Heloderma suspectum",
//                        "Near threatened",
//                        "Gila monsters are heavy-bodied lizards covered with beadlike scales, called osteoderms, that are black and yellow or pink covering all but their belly. The Gila monster is venomous; its venom is made by a row of glands in the lizard's lower jaw." +
//                                " Its name comes from the Gila River, where the lizards are common. Gila monsters are desert dwellers, " +
//                                "living near washes and arroyos and in semiarid rocky regions of desert scrub or grasslands. " +
//                                "Gila monsters also seem to prefer rocky foothills and avoid open flats and agricultural areas.",
//                        "বিষাক্ত। কামড়ে স্বল্প পরিমাণ বিষ থাকে।",
//                },
//
//                {
//                        "46",
//                        "Green lizard",
//                        "False",
//                        "Lacerta viridis",
//                        "Least concern",
//                        "Other Names Chameleon Description. The green anole is a common lizard, slender in build, with a narrow head and a long, slender tail that can be twice as long as the rest of the animal. Color can vary from gray-brown, to brown, to bright green. Each animal can change its color to blend with surroundings." +
//                                "In fact, these lizards are beneficial, as they do feed on a wide variety of small insects such as crickets, cockroaches, moths, grubs, beetles, flies and grasshoppers. They do not chew their food but swallow it whole. Anoles grow to 5-7 inches in length." +
//                                "The green anole lives in habitats with very high humidity. It can be found in swamps, forests, wooded beaches and other area.",
//                        "অবিষাক্ত।",
//                },
//
//                {
//                        "47",
//                        "African chameleon",
//                        "False",
//                        "Chamaeleo africanus",
//                        "Least concern",
//                        "The African chameleon is a slow-moving, laterally flattened species growing to a maximum length of 46 cm (18 in). It has bulbous eyes which can move independently of each other and a prehensile tail." +
//                                "Fast firing tongue. Chameleons generally eat insects such as locusts, mantids, grasshoppers, stick insects, and crickets. Some larger chameleons also eat small birds and other lizards." +
//                                "Chameleons mostly live in the rain forests and deserts of Africa. The color of their skin helps them blend in with their habitats." +
//                                " Chameleons that hang out in trees are usually green.",
//                        "অবিষাক্ত।",
//                },
//
//                {
//                        "48",
//                        "Komodo dragon",
//                        "Venomous. Could kill an adult human within 1 hour.",
//                        "Varanus komodoensis",
//                        "Endangered",
//                        "Komodo dragons are large lizards with long tails, strong and agile necks, and sturdy limbs. Their tongues are yellow and forked. Adults are an almost-uniform stone color with distinct, large scales, while juveniles may display a more vibrant color and pattern." +
//                                "Preferring the tropical forests, dragons can also be seen on land or near water, clocking up kilometres daily in search for food. " +
//                                "Komodo dragons are carnivores, and they eat any kind of meat but mostly feed on carrion. " +
//                                "They feed on small lizards, snakes and birds.",
//                        "বিষাক্ত। ১ ঘন্টার মধ্যে পূর্ণবয়স্ক মানুষ মারতে সক্ষম।",
//                },
                {
                        "9",
                        "Ostrich",
                        "False",
                        "Struthio camelus",
                        "Not threatened",
                        "Ostriches have a diet made up primarily of plant matter. In the wild, ostrich diets consist of roughly 60% plant material, 15% fruits or legumes, 5% insects or small-sized animals, and 20% grains, salts, and stones.",
                        "Today, ostriches are only found natively in the wild in Africa, where they occur in a range of open arid and semi-arid habitats such as savannas and the Sahel, both north and south of the equatorial forest zone. The Somali ostrich occurs in the Horn of Africa, having evolved isolated from the common ostrich by the geographic barrier of the East African Rift. In some areas, the common ostrich's Masai subspecies occurs alongside the Somali ostrich, but they are kept from interbreeding by behavioral and ecological differences. The Arabian ostriches in Asia Minor and Arabia were hunted to extinction by the middle of the 20th century, and in Israel attempts to introduce North African ostriches to fill their ecological role have failed. Escaped common ostriches in Australia have established feral populations.",
                        "Ostriches are large flightless birds of the genus Struthio in the order Struthioniformes, part of the infra-class Palaeognathae, a diverse group of flightless birds also known as ratites that includes the emus, rheas, and kiwis. There are two living species of ostrich: the common ostrich, native to large areas of sub-Saharan Africa and the Somali ostrich, native to the Horn of Africa.  The common ostrich was also historically native to the Arabian Peninsula, and ostriches were present across Asia as far east as Mongolia during the Late Pleistocene and possibly into the Holocene. They lay the largest eggs of any living land animal. With the ability to run at 70 km/h (43.5 mph), they are the fastest birds on land. They are farmed worldwide, particularly for their feathers as they are used as decoration and feather dusters. Their skin is also used for leather products. They are the heaviest living birds.\\n\\n\\n== Taxonomic history ==\\nThe genus Struthio was first described by Carl Linnaeus in 1758. The genus was used by Linnaeus and other early taxonomists to include the emu, rhea, and cassowary, until they each were placed in their own genera.",
                        "অবিষাক্ত",
                        "উটপাখির একটি খাদ্য রয়েছে যা মূলত উদ্ভিদ পদার্থ দিয়ে তৈরি। বন্য অঞ্চলে, উটপাখির খাদ্যে প্রায় 60% উদ্ভিদ উপাদান, 15% ফল বা লেবু, 5% পোকামাকড় বা ছোট আকারের প্রাণী এবং 20% শস্য, লবণ এবং পাথর থাকে।",
                        "আজ, উটপাখিগুলি শুধুমাত্র আফ্রিকার বন্য অঞ্চলে স্থানীয়ভাবে পাওয়া যায়, যেখানে তারা নিরক্ষীয় বনাঞ্চলের উত্তর ও দক্ষিণে সাভানা এবং সাহেলের মতো খোলা শুষ্ক এবং আধা-শুষ্ক আবাসস্থলের একটি পরিসরে দেখা যায়। সোমালি উটপাখি আফ্রিকার হর্নে দেখা যায়, পূর্ব আফ্রিকান রিফটের ভৌগলিক বাধা দ্বারা সাধারণ উটপাখি থেকে বিচ্ছিন্ন হয়ে বিবর্তিত হয়েছে। কিছু এলাকায়, সাধারণ উটপাখির মাসাই উপ-প্রজাতি সোমালি উটপাখির পাশাপাশি দেখা যায়, কিন্তু আচরণগত এবং পরিবেশগত পার্থক্যের কারণে তাদের আন্তঃপ্রজনন থেকে দূরে রাখা হয়। এশিয়া মাইনর এবং আরবের আরবীয় উটপাখিগুলি বিংশ শতাব্দীর মাঝামাঝি বিলুপ্তির পথে শিকার হয়েছিল এবং ইস্রায়েলে তাদের পরিবেশগত ভূমিকা পূরণের জন্য উত্তর আফ্রিকার উটপাখি চালু করার প্রচেষ্টা ব্যর্থ হয়েছে। অস্ট্রেলিয়ায় পালিয়ে আসা সাধারণ উটপাখিরা বন্য জনসংখ্যা প্রতিষ্ঠা করেছে।",
                        "উটপাখি হল স্ট্রুথিও গোত্রের স্ট্রুথিওনিফর্মের ক্রমানুসারে বড় উড়ন্ত পাখি, যা ইনফ্রা-শ্রেণির প্যালেওগনাথায়ের অংশ, উড়ন্ত পাখিদের একটি বৈচিত্র্যময় দল যা রেটাইট নামেও পরিচিত যার মধ্যে ইমু, রিয়া এবং কিউই রয়েছে। উটপাখির দুটি জীবন্ত প্রজাতি রয়েছে: সাধারণ উটপাখি, সাব-সাহারান আফ্রিকার বৃহৎ অঞ্চলের স্থানীয় এবং সোমালি উটপাখি, আফ্রিকার হর্নের স্থানীয়। সাধারণ উটপাখিও ঐতিহাসিকভাবে আরব উপদ্বীপের স্থানীয় ছিল এবং উটপাখিরা প্লিসটোসিনের শেষের দিকে এবং সম্ভবত হলসিনে মঙ্গোলিয়া পর্যন্ত এশিয়া জুড়ে উপস্থিত ছিল। তারা যে কোনো জীবন্ত স্থল প্রাণীর মধ্যে সবচেয়ে বড় ডিম পাড়ে। 70 কিমি/ঘন্টা (43.5 মাইল) বেগে দৌড়ানোর ক্ষমতা সহ, তারা ভূমিতে সবচেয়ে দ্রুততম পাখি। এগুলি বিশ্বব্যাপী চাষ করা হয়, বিশেষ করে তাদের পালকের জন্য কারণ এগুলি সাজসজ্জা এবং পালক ঝাড়ন হিসাবে ব্যবহৃত হয়। তাদের চামড়া চামড়াজাত পণ্যের জন্যও ব্যবহৃত হয়। তারা সবচেয়ে ভারী জীবন্ত পাখি। শ্রেণীবিন্যাস ইতিহাস স্ট্রুথিও জিনাসটি কার্ল লিনিয়াস দ্বারা 1758 সালে প্রথম বর্ণনা করা হয়েছিল। লিনিয়াস এবং অন্যান্য প্রাথমিক শ্রেণীবিন্যাসবিদরা এমু, রিয়া এবং ক্যাসোওয়ারি অন্তর্ভুক্ত করার জন্য জিনাসটি ব্যবহার করেছিলেন, যতক্ষণ না তাদের প্রত্যেককে তাদের নিজস্ব বংশে স্থাপন করা হয়েছিল।"

                },
                {
                        "22",
                        "Bald eagle",
                        "False",
                        "Haliaeetus leucocephalus",
                        "Least concern",
                        "The bald eagle is an opportunistic carnivore with the capacity to consume a great variety of prey. Fish often comprise most of the eagle's diet throughout their range. In 20 food habit studies across the species' range, fish comprised 56% of the diet of nesting eagles, birds 28%, mammals 14% and other prey 2%. More than 400 species are known to be included in the bald eagle's prey spectrum, far more than its ecological equivalent in the Old World, the white-tailed eagle, is known to take. Despite its considerably lower population, the bald eagle may come in second amongst all North American accipitrids, slightly behind only the red-tailed hawk, in number of prey species recorded.",
                        "The bald eagle occurs during its breeding season in virtually any kind of American wetland habitat such as seacoasts, rivers, large lakes or marshes or other large bodies of open water with an abundance of fish. Studies have shown a preference for bodies of water with a circumference greater than 11km, and lakes with an area greater than 10km2 are optimal for breeding bald eagles.",
                        "The plumage of an adult bald eagle is evenly dark brown with a white head and tail. The tail is moderately long and slightly wedge-shaped. Males and females are identical in plumage coloration, but sexual dimorphism is evident in the species, in that females are 25% larger than males. The beak, feet and irises are bright yellow. The legs are feather-free, and the toes are short and powerful with large talons. The highly developed talon of the hind toe is used to pierce the vital areas of prey while it is held immobile by the front toes. The beak is large and hooked, with a yellow cere. The adult bald eagle is unmistakable in its native range. The closely related African fish eagle (Haliaeetus vocifer) (from far outside the bald eagle's range) also has a brown body (albeit of somewhat more rufous hue), white head and tail, but differs from the bald eagle in having a white chest and black tip to the bill.",
                        "অবিষাক্ত",
                        "ঈগল হল একটি সুযোগসন্ধানী মাংসাশী প্রাণী যা অনেক ধরনের শিকার খাওয়ার ক্ষমতা রাখে। মাছ প্রায়শই তাদের পরিসীমা জুড়ে ঈগলের খাদ্যের বেশিরভাগই অন্তর্ভুক্ত করে। প্রজাতির পরিসর জুড়ে 20টি খাদ্যাভ্যাস গবেষণায়, বাসা বাঁধার ঈগলের খাদ্যের 56%, পাখি 28%, স্তন্যপায়ী প্রাণী 14% এবং অন্যান্য শিকার 2% অন্তর্ভুক্ত। 400 টিরও বেশি প্রজাতি বাল্ড ঈগলের শিকারের বর্ণালীতে অন্তর্ভুক্ত বলে জানা যায়, পুরানো বিশ্বে এর পরিবেশগত সমতুল্য, সাদা-লেজযুক্ত ঈগল, গ্রহণ করতে পরিচিত। যথেষ্ট কম জনসংখ্যা থাকা সত্ত্বেও, টাক ঈগল সমস্ত উত্তর আমেরিকার অ্যাসিপিট্রিডের মধ্যে দ্বিতীয় স্থানে আসতে পারে, লিপিবদ্ধ শিকার প্রজাতির সংখ্যায় শুধুমাত্র লাল-টেইলড বাজপাখির থেকে কিছুটা পিছনে।",
                        "টাক ঈগল তার প্রজনন ঋতুতে কার্যত আমেরিকান জলাভূমির আবাসস্থল যেমন সমুদ্র উপকূল, নদী, বড় হ্রদ বা জলাভূমি বা প্রচুর পরিমাণে মাছ সহ খোলা জলের অন্যান্য বৃহৎ দেহে দেখা দেয়। গবেষণায় 11 কিলোমিটারের বেশি পরিধির জলদেহের জন্য একটি পছন্দ দেখানো হয়েছে এবং 10 কিমি এর বেশি এলাকা সহ হ্রদগুলি টাক ঈগলের প্রজননের জন্য সর্বোত্তম।",
                        "একটি প্রাপ্তবয়স্ক টাক ঈগলের প্লামেজ সাদা মাথা এবং লেজ সহ সমানভাবে গাঢ় বাদামী হয়। লেজ মাঝারিভাবে লম্বা এবং সামান্য কীলক আকৃতির। পুরুষ ও স্ত্রী পালকের রঙে অভিন্ন, তবে প্রজাতির মধ্যে যৌন দ্বিরূপতা স্পষ্ট, যে ক্ষেত্রে নারীরা পুরুষের তুলনায় 25% বড়। ঠোঁট, পা এবং আইরিশ উজ্জ্বল হলুদ। পা পালকবিহীন, এবং পায়ের আঙ্গুলগুলি ছোট এবং বড় ট্যালন সহ শক্তিশালী। পিছনের পায়ের আঙ্গুলের উচ্চ বিকশিত ট্যালন শিকারের গুরুত্বপূর্ণ অংশগুলিকে ছিদ্র করতে ব্যবহৃত হয় যখন এটি সামনের পায়ের আঙ্গুল দ্বারা অচল থাকে। ঠোঁট বড় এবং আঙুলযুক্ত, একটি হলুদ সিরেজ সহ। প্রাপ্তবয়স্ক টাক ঈগল তার স্থানীয় পরিসরে অস্পষ্ট। ঘনিষ্ঠভাবে সম্পর্কিত আফ্রিকান ফিশ ঈগল (Haliaeetus vocifer) (টাক ঈগলের রেঞ্জের বাইরে থেকে) এরও একটি বাদামী দেহ রয়েছে (যদিও কিছুটা বেশি রুফাস বর্ণের হলেও), সাদা মাথা এবং লেজ, তবে একটি সাদা বুক এবং টাক ঈগলের থেকে আলাদা। বিলের কালো টিপ।"

                },

                {
                        "162",
                        "Beagle Dog",
                        "False",
                        "Canis lupus familiaris",
                        "Least concern",
                        "Dogs have been described as omnivores. Compared to wolves, dogs from agricultural societies have extra copies of amylase and other genes involved in starch digestion that contribute to an increased ability to thrive on a starch-rich diet. Similar to humans, some dog breeds produce amylase in their saliva and are classified as having a high starch diet. However, more like cats and less like other omnivores, dogs can only produce bile acid with taurine and they cannot produce vitamin D, which they obtain from animal flesh. Also more like cats, dogs require arginine to maintain its nitrogen balance. These nutritional requirements place dogs halfway between carnivores and omnivores.",
                        "Mostly domesticated and kept as pets",
                        "The beagle is a breed of  small scent hound, similar in appearance to the much larger foxhound. The beagle was developed primarily for hunting hare known as beagling. Possessing a great sense of smell and superior tracking instincts, the beagle is the primary breed used as a detection dog for prohibited agricultural imports and foodstuffs in quarantine around the world. The beagle is intelligent and is a popular pet due to its size, good temper, and a lack of inherited health problems.The modern breed was developed in Great Britain around the 1830s from several breeds, including the Talbot Hound, the North Country Beagle, the Southern Hound, and possibly the Harrier.Beagles have been depicted in popular culture since Elizabethan times in literature and paintings and more recently in film, television, and comic books. The origin of the beagle is not known. In the 11th century, William the Conqueror brought the St. Hubert Hound and the Talbot hound to Britain. In Britain, both of these strains were then crossed with Greyhounds to give them speed and stamina for deer hunting.",
                        "অবিষাক্ত",
                        "কুকুরকে সর্বভুক হিসাবে বর্ণনা করা হয়েছে। নেকড়েদের তুলনায়, কৃষি সমাজের কুকুরগুলিতে স্টার্চ হজমের সাথে জড়িত অ্যামাইলেজ এবং অন্যান্য জিনের অতিরিক্ত অনুলিপি রয়েছে যা স্টার্চ-সমৃদ্ধ খাদ্যে উন্নতির ক্ষমতা বৃদ্ধিতে অবদান রাখে। মানুষের মতোই, কিছু কুকুরের জাত তাদের লালায় অ্যামাইলেজ তৈরি করে এবং উচ্চ স্টার্চযুক্ত খাদ্য হিসাবে শ্রেণীবদ্ধ করা হয়। যাইহোক, বিড়ালের মতো বেশি এবং অন্যান্য সর্বভুকদের মতো কম, কুকুরগুলি কেবল টরিন দিয়ে পিত্ত অ্যাসিড তৈরি করতে পারে এবং তারা ভিটামিন ডি তৈরি করতে পারে না, যা তারা প্রাণীর মাংস থেকে পায়। এছাড়াও বিড়ালের মতো, কুকুরের নাইট্রোজেনের ভারসাম্য বজায় রাখতে আরজিনিনের প্রয়োজন হয়। এই পুষ্টির প্রয়োজনীয়তা কুকুরকে মাংসাশী এবং সর্বভুকদের মধ্যে অর্ধেক করে রাখে।",
                        "অধিকাংশকেই পোষ মানানো হয়েছে।",
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
                        "49",
                        "African crocodile",
                        "False",
                        "Crocodylus niloticus",
                        "Least Concern",
                        "The West African crocodile, desert crocodile, or sacred crocodile (Crocodylus suchus) is a species of crocodile related to – and often confused with – the larger and more aggressive Nile crocodile (C. niloticus). Compared to the Nile crocodile, the West African crocodile is smaller: Adults are typically 1.5–2.5 m (5–8 ft) long, and maximum is perhaps 3–4 m (10–13 ft). The species was named by Étienne Geoffroy Saint-Hilaire in 1807, who discovered differences between the skulls of a mummified crocodile and those of Nile crocodile (C. niloticus). This new species was, however, for a long time afterwards regarded as a synonym of the Nile crocodile. In 2003, a study indicated that C. suchus was a valid species, and this was confirmed by several other studies in 2011–2015. Despite the long history of confusion, genetic testing has revealed that the two are not particularly close. The closest relatives of the Nile crocodile are the Crocodylus species from the Americas, while the West African crocodile is basal to the clade of Nile and American crocodiles.Below is a cladogram based on a 2018 tip dating study by Lee & Yates simultaneously using morphological, molecular (DNA sequencing), and stratigraphic (fossil age) data, as revised by the 2021 Hekkala et al. paleogenomics study using DNA extracted from the extinct Voay. The West African crocodile inhabits much of West and Central Africa, ranging east to South Sudan and Uganda, and south to Democratic Republic of the Congo (in all three countries it may come into contact with Nile crocodiles). Other countries where it is found include Mauritania, Benin, Liberia, Guinea-Bissau, Nigeria, Niger, Cameroon, Chad, Sierra Leone, Central African Republic, Equatorial Guinea, Senegal, Mali, Guinea, Gambia, Burkina Faso, Ghana, Gabon, Togo, Ivory Coast and Republic of Congo.",
                        "অবিষাক্ত",
                        "পশ্চিম আফ্রিকার কুমির, মরুভূমির কুমির, বা পবিত্র কুমির (Crocodylus suchus) হল একটি প্রজাতির কুমিরের সাথে সম্পর্কিত - এবং প্রায়শই বিভ্রান্ত হয় - বড় এবং আরও আক্রমণাত্মক নীল কুমির (C. niloticus)। নীল নদের কুমিরের তুলনায়, পশ্চিম আফ্রিকার কুমির ছোট: প্রাপ্তবয়স্কদের সাধারণত 1.5-2.5 মিটার (5-8 ফুট) লম্বা এবং সর্বাধিক সম্ভবত 3-4 মিটার (10-13 ফুট)। 1807 সালে এটিয়েন জিওফ্রয় সেন্ট-হিলাইরে প্রজাতিটির নামকরণ করেছিলেন, যিনি একটি মমি করা কুমির এবং নীল কুমিরের (সি. নিলোটিকাস) মাথার খুলির মধ্যে পার্থক্য আবিষ্কার করেছিলেন। এই নতুন প্রজাতিটি অবশ্য দীর্ঘকাল পরে নীল নদের কুমিরের প্রতিশব্দ হিসাবে বিবেচিত হয়েছিল। 2003 সালে, একটি গবেষণায় ইঙ্গিত দেওয়া হয়েছিল যে সি. সুসাস একটি বৈধ প্রজাতি, এবং এটি 2011-2015 সালে অন্যান্য বেশ কয়েকটি গবেষণা দ্বারা নিশ্চিত করা হয়েছিল। বিভ্রান্তির দীর্ঘ ইতিহাস সত্ত্বেও, জেনেটিক পরীক্ষায় দেখা গেছে যে দুটি বিশেষভাবে কাছাকাছি নয়। নীল নদের কুমিরের নিকটতম আত্মীয় হল আমেরিকা থেকে আসা ক্রোকোডাইলাস প্রজাতি, যখন পশ্চিম আফ্রিকার কুমির হল নীল এবং আমেরিকান কুমিরের ক্লেডের বেসাল। নীচে লি ও ইয়েটসের 2018 সালের টিপ ডেটিং স্টাডির উপর ভিত্তি করে একটি ক্ল্যাডোগ্রাম রয়েছে যা একই সাথে রূপতাত্ত্বিক ব্যবহার করে, আণবিক (ডিএনএ সিকোয়েন্সিং), এবং স্ট্র্যাটিগ্রাফিক (ফসিল বয়স) ডেটা, 2021 হেক্কালা এট আল দ্বারা সংশোধিত। বিলুপ্ত Voay থেকে নিষ্কাশিত ডিএনএ ব্যবহার করে প্যালিওজেনোমিক্স অধ্যয়ন। পশ্চিম আফ্রিকার কুমিরটি পশ্চিম ও মধ্য আফ্রিকার বেশিরভাগ অংশে বাস করে, পূর্বে দক্ষিণ সুদান এবং উগান্ডা এবং দক্ষিণে কঙ্গো গণতান্ত্রিক প্রজাতন্ত্র (তিনটি দেশেই এটি নীল নদের কুমিরের সংস্পর্শে আসতে পারে)। অন্যান্য দেশে যেখানে এটি পাওয়া যায় তার মধ্যে রয়েছে মৌরিতানিয়া, বেনিন, লাইবেরিয়া, গিনি-বিসাউ, নাইজেরিয়া, নাইজার, ক্যামেরুন, চাদ, সিয়েরা লিওন, মধ্য আফ্রিকান প্রজাতন্ত্র, নিরক্ষীয় গিনি, সেনেগাল, মালি, গিনি, গাম্বিয়া, বুর্কিনা ফাসো, ঘানা, গ্যাবন, টোগো, আইভরি কোস্ট এবং কঙ্গো প্রজাতন্ত্র।"
                },
                {
                        "291",
                        "Lion",
                        "false",
                        "Panthera leo",
                        "Vulnerable",
                        "Lions usually hunt and eat medium-sized to large hoofed animals like wildebeests, zebras, and antelopes. They occasionally also prey on larger animals, especially sick or injured ones, and eat found meat such as carrion.",
                        "Lions inhabit a wide range of habitats, from open plains to thick brush and dry thorn forest. Except for a small population of the Indian lion subspecies that remains in the Gir Forest of northwest India, lions now live only in Africa, from the Sahara's southern fringe to northern South Africa.",
                        "The lion is a large cat of the genus Panthera native to Africa and India. It has a muscular, broad-chested body; short, rounded head; round ears; and a hairy tuft at the end of its tail. It is sexually dimorphic; adult male lions are larger than females and have a prominent mane",

                        "নির্বিষ।",
                        "সিংহরা সাধারণত মাঝারি আকারের থেকে বৃহৎ খুরওয়ালা প্রাণীদের শিকার করে। যেমন জেব্রা, হরিণ বা ওয়াইল্ডবিস্ট। এরা মাঝে মাঝে বড় প্রাণীদেরও শিকার করে, বিশেষ করে অসুস্থ, আহত বা দলবিচ্ছিন্নদের।",
                        "খোলা সমভূমি থেকে পুরু জঙ্গল এবং শুষ্ক কাঁটা বন পর্যন্ত সিংহরা বিস্তৃত আবাসস্থলে বাস করে। উত্তর-পশ্চিম ভারতের গির বনে রয়ে যাওয়া ভারতীয় সিংহের উপ-প্রজাতির একটি ক্ষুদ্র সংখ্যক কিছু সিংহ ছাড়া, সিংহরা এখন কেবল আফ্রিকাতেই বাস করে, সাহারার দক্ষিণ প্রান্ত থেকে উত্তর দক্ষিণ আফ্রিকা পর্যন্ত।",
                        "সিংহ হল আফ্রিকা ও ভারতে বসবাসকারী প্যানথেরা গোত্রের একটি বড় বিড়াল। এটির একটি পেশীবহুল ও প্রশস্ত বুকবিশিষ্ট শরীর আছে। এদের ছোট ও গোলাকার মাথা, গোলাকার কান এবং এর লেজের শেষে একটি লোমশ কেশপুঞ্জ রয়েছে। এটা সেক্সুয়ালি ডাইমরফিক অর্থাৎ, পুরুষ ও স্ত্রী দুইটি প্রজাতি রয়েছে।; প্রাপ্তবয়স্ক পুরুষ সিংহগুলি মহিলাদের চেয়ে বড় হয় এবং তাদের দৃষ্টিনন্দন কেশর থাকে।"
                },

                {
                        "292",
                        "Tiger",
                        "false",
                        "Panthera tigris",
                        "Endangered",
                        "Tigers eat a variety of prey ranging in size from termites to elephant calves. However, an integral component of their diet are large-bodied prey weighing about 20 kg (45 lbs.) or larger such as moose, deer species, pigs, cows, horses, buffalos and goats.",
                        "Tigers are found in amazingly diverse habitats: Sundarban rain forests, grasslands, savannas and even mangrove swamps. Unfortunately, 93% of historical tiger lands have disappeared primarily because of expanding human activity. Saving tigers means saving forests that are vital to the health of the planet.",
                        "The tiger (Panthera tigris) is the largest living cat species and a member of the genus Panthera. It is most recognisable for its dark vertical stripes on orange fur with a white underside. An apex predator, it primarily preys on ungulates, such as deer and wild boar. It is territorial and generally a solitary but social predator, requiring large contiguous areas of habitat to support its requirements for prey and rearing of its offspring. Tiger cubs stay with their mother for about two years and then become independent, leaving their mother's home range to establish their own."
                },

                {
                        "293",
                        "Cheetah",
                        "false",
                        "Acinonyx jubatus",
                        "Vulnerable",
                        "Gazelles (especially Gazella thompsonii), impalas (Aepyceros melampus), other small- to medium-sized ungulates, plus calves of larger ungulate species are the primary diet of cheetahs. In addition, hares (Lepus spp.), small mammals, and birds may also be taken.",
                        "Although they typically prefer open grasslands, cheetahs live in a range of habitats across eastern and southern Africa. Once found throughout Asia and Africa, cheetahs today are racing toward extinction. Loss of habitat and declining numbers of their prey combine to threaten the future of these cats",
                        "The cheetah (Acinonyx jubatus) is a large cat native to Africa and central Iran. It is the fastest land animal, estimated to be capable of running at 80 to 128 km/h (50 to 80 mph) with the fastest reliably recorded speeds being 93 and 98 km/h (58 and 61 mph), and as such has evolved specialized adaptations for speed, including a light build, long thin legs and a long tail. ",


                        "নির্বিষ",
                        "হরিণ, ইমপালা, অন্যান্য ছোট থেকে মাঝারি আকারের ungulates, এছাড়াও বড় ungulate প্রজাতির বাছুর হল চিতার প্রাথমিক খাদ্য। এছাড়াও, খরগোশ (Lepus spp.), ছোট স্তন্যপায়ী প্রাণী এবং পাখিও নেওয়া যেতে পারে।",
                        "যদিও তারা সাধারণত খোলা তৃণভূমি পছন্দ করে, চিতারা পূর্ব এবং দক্ষিণ আফ্রিকা জুড়ে বিভিন্ন আবাসস্থলে বাস করে। একবার এশিয়া এবং আফ্রিকা জুড়ে পাওয়া গেলে, চিতারা আজ বিলুপ্তির দিকে ধাবিত হচ্ছে। আবাসস্থল হারানো এবং তাদের শিকারের ক্রমহ্রাসমান সংখ্যা একত্রিত হয়ে ভবিষ্যতকে হুমকির মুখে ফেলেছে। এই বিড়াল",
                        "চিতা (অ্যাকিনোনিক্স জুবাটাস) আফ্রিকা এবং মধ্য ইরানের একটি বড় বিড়াল। এটি দ্রুততম স্থল প্রাণী, যা দ্রুততম নির্ভরযোগ্যভাবে রেকর্ড করা গতির সাথে 80 থেকে 128 কিমি/ঘন্টা (50 থেকে 80 মাইল) বেগে দৌড়াতে সক্ষম বলে অনুমান করা হয়। 93 এবং 98 কিমি/ঘন্টা (58 এবং 61 মাইল প্রতি ঘণ্টা), এবং এইভাবে গতির জন্য বিশেষ অভিযোজন বিকশিত হয়েছে, যার মধ্যে একটি হালকা বিল্ড, লম্বা পাতলা পা এবং একটি লম্বা লেজ রয়েছে।"
                },

                {
                        "294",
                        "Brown Bear",
                        "false",
                        "Ursus arctos",
                        "Least concern",
                        "Brown bears are very adaptable and like humans, they consume a wide variety of foods. Common foods include salmon, berries, grasses, sedges, cow parsnip, ground squirrels, carrion, and roots. In many parts of Alaska, brown bears are capable predators of moose and caribou, especially newborns.",
                        "Brown bears occupy the widest range of habitats of any bear species including dense coastal forests, boreal forests, sub alpine mountain areas, tundra, deciduous forests, and desert and semi-desert areas.",
                        "The brown bear (Ursus arctos) is a large bear species found across Eurasia and North America.[1][3] In North America, the populations of brown bears are called grizzly bears, while the subspecies that inhabits the Kodiak Islands of Alaska is known as the Kodiak bear.",

                        "নির্বিষ",
                        "বাদামী ভাল্লুক খুব মানিয়ে নিতে পারে এবং মানুষের মতো, তারা বিভিন্ন ধরণের খাবার খায়। সাধারণ খাবারের মধ্যে রয়েছে স্যামন, বেরি, ঘাস, সেজেস, গরুর পার্সনিপ, গ্রাউন্ড কাঠবিড়ালি, ক্যারিয়ন এবং শিকড়। আলাস্কার অনেক অংশে, বাদামী ভালুক সক্ষম। মুস এবং ক্যারিবুর শিকারী, বিশেষ করে নবজাতক।",
                        "বাদামী ভাল্লুক ঘন উপকূলীয় বন, বোরিয়াল বন, উপ-আল্পাইন পর্বত এলাকা, তুন্দ্রা, পর্ণমোচী বন এবং মরুভূমি এবং আধা-মরুভূমি সহ যেকোন ভালুক প্রজাতির আবাসস্থলের বিস্তৃত পরিসর দখল করে।",
                        "বাদামী ভালুক (Ursus arctos) হল একটি বড় ভাল্লুক প্রজাতি যা ইউরেশিয়া এবং উত্তর আমেরিকা জুড়ে পাওয়া যায়। কোডিয়াক ভালুক নামে পরিচিত।"
                },

                {
                        "295",
                        "American black bear",
                        "false",
                        "Ursus americanus",
                        "Least concern",
                        "Most of their diet consists of berries, fruit, sedges, and insects. They will also occasionally consume fish, honeycomb, and human food and garbage, so it is important to make sure to keep your items locked up with bear-proof equipment! In the spring, black bears may prey on young elk and deer.",
                        "Black bears are common throughout the Pacific Northwest's forests and mountains. They are also found in forests throughout Canada, Alaska, the Rocky Mountains, the upper Midwest, parts of the southern U.S., the Appalachian Mountains, and down into Mexico.",
                        "The American black bear (Ursus americanus), also called simply a black bear or sometimes a baribal,[3] is a medium-sized bear endemic to North America. It is the continent's smallest and most widely distributed bear species. American black bears are omnivores, with their diets varying greatly depending on season and location. They typically live in largely forested areas, but will leave forests in search of food, and are sometimes attracted to human communities due to the immediate availability of food.",

                        "নির্বিষ",
                        "তাদের বেশিরভাগ ডায়েটে থাকে বেরি, ফল, সেজ এবং পোকামাকড়। তারা মাঝে মাঝে মাছ, মৌচাক এবং মানুষের খাবার এবং আবর্জনাও খায়, তাই আপনার আইটেমগুলি ভালুক-প্রমাণ সরঞ্জামের সাথে লক করে রাখা নিশ্চিত করা গুরুত্বপূর্ণ! বসন্তে, কালো ভাল্লুক তরুণ এলক এবং হরিণ শিকার করতে পারে।",
                        "কালো ভাল্লুক প্রশান্ত মহাসাগরীয় উত্তর-পশ্চিমের বন এবং পর্বতমালা জুড়ে সাধারণ। কানাডা, আলাস্কা, রকি পর্বতমালা, উচ্চ মধ্যপশ্চিম, দক্ষিণ মার্কিন যুক্তরাষ্ট্রের কিছু অংশ, অ্যাপালাচিয়ান পর্বতমালা এবং নীচে মেক্সিকোতেও তারা বনে পাওয়া যায়।",
                        "আমেরিকান কালো ভাল্লুক (Ursus americanus), যাকে সহজভাবে একটি কালো ভাল্লুক বা কখনও কখনও বারিবলও বলা হয়,[3] উত্তর আমেরিকায় একটি মাঝারি আকারের ভালুক স্থানীয়। এটি মহাদেশের সবচেয়ে ছোট এবং সর্বাধিক বিস্তৃত ভাল্লুক প্রজাতি। আমেরিকান কালো ভাল্লুক এরা সর্বভুক, ঋতু এবং অবস্থানের উপর নির্ভর করে তাদের খাদ্যাভ্যাস ব্যাপকভাবে পরিবর্তিত হয়। তারা সাধারণত বৃহত্তর বনাঞ্চলে বাস করে, কিন্তু খাদ্যের সন্ধানে বন ছেড়ে চলে যায় এবং খাদ্যের তাৎক্ষণিক প্রাপ্যতার কারণে কখনও কখনও মানব সম্প্রদায়ের প্রতি আকৃষ্ট হয়।"

                },

                {
                        "52",
                        "Thunder Snake",
                        "Venomous. can kill a man in an hour.",
                        "Carphophis amoenus",
                        "Least concern",
                        "mainly frog and some kits",
                        "It is found in northern Georgia and Alabama, north to Massachusetts and west to Illinois. Copperheads live in a range of habitats, from terrestrial to semiaquatic, including rocky, forested hillsides and wetlands.",
                        "This form is typically a light tan in color, with darker brown, wide crossbands - which gives it its common name. The actual color varies, by locality, from a red-brown, to a gray-brown. It overlaps with the southern copperhead",

                        "বিষাক্ত। এক ঘন্টার মধ্যে একজন মানুষকে মেরে ফেলতে পারে।",
                        "প্রধানত ব্যাঙ এবং কিছু কিট",
                        "এটি উত্তর জর্জিয়া এবং আলাবামা, উত্তরে ম্যাসাচুসেটস এবং পশ্চিমে ইলিনয় পাওয়া যায়। কপারহেডগুলি পাথুরে, বনের পাহাড়ী পাহাড় এবং জলাভূমি সহ স্থলজ থেকে আধা জলজ পর্যন্ত বিভিন্ন আবাসস্থলে বাস করে।",
                        "এই ফর্মটি সাধারণত গাঢ় বাদামী, চওড়া ক্রসব্যান্ডগুলির সাথে একটি হালকা ট্যান রঙের হয় - যা এটিকে এর সাধারণ নাম দেয়। প্রকৃত রঙ স্থানীয়তা অনুসারে লাল-বাদামী থেকে ধূসর-বাদামী পর্যন্ত পরিবর্তিত হয়। এটি দক্ষিণের সাথে ওভারল্যাপ করে তামার মাথা"

                },

                {
                        "53",
                        "Ring-necked snake",
                        "false",
                        "Diadophis punctatus",
                        "Least concern",
                        "The diet of the ring-necked snake consists primarily of smaller salamanders, earthworms, and slugs, but they also sometimes eat lizards, frogs, and some juvenile snakes of other species.",
                        "Ring-necked snakes are habitat generalists occurring in a wide variety of habitats, but tend to be found in moist woodlands. They spend most of their time underground or hidden under logs, rocks, leaf litter, or debris. Diet: Includes earthworms, insect larvae, salamanders, and small snakes and lizards.",
                        " ringneck snake, is a harmless species of colubrid snake found throughout much of the United States, central Mexico, and south-eastern Canada.",

                        "নির্বিষ",
                        "রিং-নেকড সাপের খাদ্যে প্রাথমিকভাবে ছোট সালামান্ডার, কেঁচো এবং স্লাগ থাকে, তবে তারা কখনও কখনও টিকটিকি, ব্যাঙ এবং অন্যান্য প্রজাতির কিছু কিশোর সাপও খায়।",
                        "রিং-নেকড সাপগুলি আবাসস্থলের সাধারণবিদ যা বিভিন্ন ধরণের আবাসস্থলে ঘটে, তবে আর্দ্র বনভূমিতে দেখা যায়। তারা তাদের বেশিরভাগ সময় মাটির নিচে কাটায় বা লগ, শিলা, পাতার আবর্জনা বা ধ্বংসাবশেষের নীচে লুকিয়ে থাকে। ডায়েট: কেঁচো অন্তর্ভুক্ত, পোকামাকড়ের লার্ভা, সালামান্ডার এবং ছোট সাপ এবং টিকটিকি।",
                        "রিংনেক সাপ, একটি নিরীহ প্রজাতির কলুব্রিড সাপ যা মার্কিন যুক্তরাষ্ট্র, মধ্য মেক্সিকো এবং দক্ষিণ-পূর্ব কানাডা জুড়ে পাওয়া যায়।"
                },

                {
                        "54",
                        "Hognose snake",
                        "Venomous. is a species of mildly venomous rear-fanged snake in the family Colubridae. The species is endemic to North America.",
                        "Heterodon",
                        "Least concern",
                        "hognose snake uses its upturned snout to burrow through the earth in search of toads, its principal food. Other items eaten include frogs, lizards, mice, birds, snakes and reptile eggs.",
                        "hognose snake occurs from southern Canada throughout the United States to northern Mexico. It frequents areas with sandy or gravelly soils, ",
                        "Hognose snake is a common name for several unrelated species of snake with upturned snouts, classified in 2 colubrid snake genera and 1 pseudoxyrhophiid snake genus.",


                        "বিষাক্ত। এটি Colubridae পরিবারের মৃদু বিষাক্ত পিছন দিকের সাপের একটি প্রজাতি। প্রজাতিটি উত্তর আমেরিকায় স্থানীয়।",
                        "হগনোস সাপ তার উল্টানো থুতু ব্যবহার করে পৃথিবীর মধ্যে টোডের সন্ধানে, তার প্রধান খাদ্য। খাওয়া অন্যান্য আইটেমগুলির মধ্যে রয়েছে ব্যাঙ, টিকটিকি, ইঁদুর, পাখি, সাপ এবং সরীসৃপের ডিম।",
                        "হগনোস সাপ দক্ষিণ কানাডা থেকে সমগ্র মার্কিন যুক্তরাষ্ট্র জুড়ে উত্তর মেক্সিকো পর্যন্ত দেখা যায়। এটি ঘন ঘন বালুকাময় বা নুড়িযুক্ত মাটিযুক্ত এলাকায় দেখা দেয়, ",
                        "হগনোজ স্নেক হল একটি সাধারণ নাম যেটি 2টি কলুব্রিড স্নেক জেনারা এবং 1টি সিউডক্সিরহোফিড সাপের জেনাসে শ্রেণীবদ্ধ করা হয়েছে, যা উল্টে যাওয়া স্নাউটগুলির সাথে সম্পর্কহীন কিছু প্রজাতির সাপের জন্য।"
                },

                {
                        "55",
                        "Green snake",
                        "false",
                        "Opheodrys vernalis",
                        "Least concern",
                        "Green snakes are insectivores and are among the few snakes that eat a diet consisting entirely of insects and worms. In the wild, they consume a variety of prey such as crickets, moths, grasshoppers, caterpillars, fly larvae, spiders, and worms.",
                        "Smooth Green snakes are found in moist, grassy areas, usually in prairies, pastures, meadows, marshes, and lake eges. They can also be found in open forested areas. They are most often found on the ground or climbing in low bushes. They also bask on and hide beneath rocks, logs, and other debris.",
                        "The smooth green snake is a species of North American nonvenomous snake in the family Colubridae. The species is also referred to as the grass snake. It is a slender, small medium snake that measures 36–51 cm (14–20 in) as an adult.",

                        "নির্বিষ",
                        "সবুজ সাপগুলি কীটপতঙ্গ এবং এমন কয়েকটি সাপের মধ্যে রয়েছে যেগুলি সম্পূর্ণ পোকামাকড় এবং কৃমি সমন্বিত খাদ্য খায়৷ বন্য অঞ্চলে, তারা বিভিন্ন ধরণের শিকার যেমন ক্রিকেট, মথ, ঘাসফড়িং, শুঁয়োপোকা, মাছি লার্ভা, মাকড়সা এবং কৃমি খেয়ে থাকে৷ ",
                        "মসৃণ সবুজ সাপগুলি আর্দ্র, ঘাসযুক্ত অঞ্চলে পাওয়া যায়, সাধারণত প্রেরি, চারণভূমি, তৃণভূমি, জলাভূমি এবং লেক এজগুলিতে। এরা খোলা বনাঞ্চলেও পাওয়া যায়। তারা প্রায়শই মাটিতে বা নিচু ঝোপে আরোহণ করতে দেখা যায়। তারা পাথর, লগ এবং অন্যান্য ধ্বংসাবশেষের নীচে ঝাঁকে ঝাঁকে লুকিয়ে থাকে।",
                        "মসৃণ সবুজ সাপ হল Colubridae পরিবারের উত্তর আমেরিকার অবিষাক্ত সাপের একটি প্রজাতি। এই প্রজাতিটিকে গ্রাস সাপও বলা হয়। এটি একটি পাতলা, ছোট মাঝারি সাপ যা 36-51 সেমি (14-20 ইঞ্চি) পরিমাপ করে। একজন প্রাপ্তবয়স্ক।"

                },

                {
                        "56",
                        "King snake",
                        "false",
                        "Lampropeltis",
                        "Least concern",
                        "The “kingsnake” name refers to the fact that other snakes, including venomous species, are a principle food source for the kingsnake. They also eat rodents, lizards, birds and eggs, and turtle eggs.",
                        "King snakes make their home in rock outcrops, brushy hillsides, river valleys, woodlands, fields, and pine forests; and range from southeastern Canada to southern Ecuador. ",
                        "Kingsnakes vary widely in size and coloration. They can be as small as 24\" (61cm) or as long as 60\" (152cm).[2] Some kingsnakes are colored in muted browns to black, while others are brightly marked in white, reds, yellows, grays, and lavenders that form rings, longitudinal stripes, speckles, and saddle-shaped bands",

                        "নির্বিষ",
                        "কিংসনেক নামটি এই সত্যটিকে নির্দেশ করে যে বিষাক্ত প্রজাতি সহ অন্যান্য সাপগুলি কিংসাপের জন্য একটি প্রধান খাদ্য উত্স। তারা ইঁদুর, টিকটিকি, পাখি এবং ডিম এবং কচ্ছপের ডিমও খায়।",
                        "রাজা সাপরা পাথরের ক্ষেতে, পাহাড়ি ঢালে, নদীর উপত্যকা, বনভূমি, মাঠ এবং পাইন বনে তাদের বাসস্থান তৈরি করে; এবং দক্ষিণ-পূর্ব কানাডা থেকে দক্ষিণ ইকুয়েডর পর্যন্ত বিস্তৃত।",
                        "কিংসনেক আকার এবং রঙে ব্যাপকভাবে পরিবর্তিত হয়। তারা 24\" (61cm) বা 60\" (152cm) পর্যন্ত ছোট হতে পারে। সাদা, লাল, হলুদ, ধূসর এবং ল্যাভেন্ডারে যা রিং, অনুদৈর্ঘ্য স্ট্রাইপ, স্পেকেলস এবং স্যাডল-আকৃতির ব্যান্ড গঠন করে"
                },

                {
                        "57",
                        "Garter snake",
                        "False",
                        "Thamnophis",
                        "Least concern",
                        "Garter snakes are numerous partly because they will eat a variety of prey. Our Boulder snakes' favorite foods include: frogs, toads, tadpoles, fish, earthworms, snails, leeches, grasshoppers, slugs and salamanders. They will also eat mice, shrews, voles, chipmunks, birds, and other reptiles including other snakes.",
                        "Garter snakes can be found in meadows, gardens, forests, and they prefer areas near water. They like to make dens under big rocks or other support structures like steps, stone walls, and building foundations.",
                        "Garter snake is a common name for generally harmless, small to medium-sized snakes belonging to the genus Thamnophis in the family Colubridae. Native to North and Central America, species in the genus Thamnophis can be found from the subarctic plains of Canada to Costa Rica.",

                        "নির্বিষ",
                        "গার্টার সাপগুলি আংশিকভাবে অসংখ্য কারণ তারা বিভিন্ন ধরণের শিকার খাবে। আমাদের বোল্ডার সাপের প্রিয় খাবারের মধ্যে রয়েছে: ব্যাঙ, টোড, ট্যাডপোল, মাছ, কেঁচো, শামুক, জোঁক, ঘাসফড়িং, স্লাগ এবং সালামান্ডার। তারা ইঁদুর, ঝাঁকড়াও খাবে। , ভোল, চিপমাঙ্ক, পাখি এবং অন্যান্য সাপ সহ অন্যান্য সরীসৃপ।",
                        "গার্টার সাপগুলি তৃণভূমি, বাগান, বনাঞ্চলে পাওয়া যায় এবং তারা জলের কাছাকাছি জায়গা পছন্দ করে। তারা বড় পাথরের নীচে বা অন্যান্য সমর্থন কাঠামো যেমন ধাপ, পাথরের দেয়াল এবং ভবনের ভিত্তি তৈরি করতে পছন্দ করে।",
                        "গার্টার সাপ হল সাধারণভাবে নিরীহ, ছোট থেকে মাঝারি আকারের সাপগুলির একটি সাধারণ নাম যা Colubridae পরিবারের থ্যামনোফিস গণের অন্তর্গত। উত্তর ও মধ্য আমেরিকার স্থানীয়, কানাডার সাবর্কটিক সমভূমি থেকে কোস্টা পর্যন্ত থ্যামনোফিস গণের প্রজাতি পাওয়া যায়। রিকা।"
                },

                {
                        "58",
                        "Water snake",
                        "Venomous. sea water snake are venomous. but in bangladesh fresh water snake are completely non venomous.",
                        "Nerodia",
                        "Least concern",
                        "Frogs, salamanders, newts, crayfish, fish, toads, and tadpoles are the most common prey of banded water snakes.",
                        "Northern water snakes like a wide variety of aquatic habitats. They can be seen basking on rocks and prefer slow-moving or standing water near places where they can bask in the sun, such as ponds, vernal pools (seasonal pools of water), and lakes.",
                        "In sea of australia some snake are most venomous and can kill people in just 30 minutes. but in fresh water snake are not dangerous",


                        "বিষাক্ত। সামুদ্রিক পানির সাপ বিষাক্ত। কিন্তু বাংলাদেশে মিঠা পানির সাপ সম্পূর্ণরূপে অ-বিষাক্ত।",
                        "ব্যাঙ, স্যালামান্ডার, নিউটস, ক্রেফিশ, মাছ, টোডস এবং ট্যাডপোল হল ব্যান্ডেড ওয়াটার সাপের সবচেয়ে সাধারণ শিকার।",
                        "উত্তর জলের সাপগুলি বিভিন্ন ধরণের জলজ বাসস্থানের মতো। তাদের পাথরের উপর ঝাঁক দিতে দেখা যায় এবং তারা যেখানে রোদে শুতে পারে, যেমন পুকুর, ভার্নাল পুল (মৌসুমী জলের পুল), এবং হ্রদ।",
                        "অস্ট্রেলিয়া সাগরে কিছু সাপ সবচেয়ে বিষাক্ত এবং মাত্র 30 মিনিটের মধ্যে মানুষকে মেরে ফেলতে পারে৷ তবে মিষ্টি জলের সাপ বিপজ্জনক নয়"
                },


                {
                        "59",
                        "Vine snake",
                        "Venomous. All vine snakes are venomous with grooved fangs below the eye; however, most species are relatively harmless to humans, and only Thelotornis has caused human fatalities.",
                        "Ahaetulla nasuta",
                        "Least concern",
                        "Vine snakes primarily eat lizards. They will also consume small birds and mammals in the wild. In captivity, it is possible to switch them over to rodents—but sometimes not.",
                        "Vine snakes appear in two colours. Green species inhabit rainforest areas, and gray or brown species live primarily in savannas or dry forests.",
                        "They are considered by some scientists to be mildly venomous and are what is commonly termed as 'rear-fanged' or more appropriately, opisthoglyphous, meaning their enlarged teeth or fangs, intended to aid in venom delivery, are located in the back of the upper jaw, instead of in the front as they are in vipers or cobras.",

                        "বিষাক্ত। সমস্ত লতার সাপই চোখের নিচের খাঁজকাটা দানা সহ বিষাক্ত; তবে, বেশিরভাগ প্রজাতিই মানুষের জন্য তুলনামূলকভাবে ক্ষতিকারক, এবং শুধুমাত্র থেলোটোরনিসই মানুষের প্রাণহানি ঘটিয়েছে।",
                        "ভাইনের সাপ প্রাথমিকভাবে টিকটিকি খায়। তারা বন্যের ছোট পাখি এবং স্তন্যপায়ী প্রাণীদেরও খেয়ে ফেলবে। বন্দী অবস্থায়, তাদের ইঁদুরের দিকে নিয়ে যাওয়া সম্ভব - কিন্তু কখনও কখনও তা নয়।",
                        "ভাইন সাপ দুটি রঙে দেখা যায়। সবুজ প্রজাতি রেইনফরেস্ট এলাকায় বাস করে এবং ধূসর বা বাদামী প্রজাতি প্রধানত সাভানা বা শুকনো বনে বাস করে।",
                        "এগুলিকে কিছু বিজ্ঞানী মৃদু বিষাক্ত বলে মনে করেন এবং সাধারণভাবে যাকে 'পিছন-ফানড' বা আরও উপযুক্তভাবে বলা হয়, অপিসথোগ্লাইফাস, যার অর্থ তাদের বর্ধিত দাঁত বা ফ্যানগুলি, বিষ সরবরাহে সহায়তা করার উদ্দেশ্যে, এটির পিছনে অবস্থিত। উপরের চোয়ালের পরিবর্তে সামনের দিকে যেমন তারা ভাইপার বা কোবরা থাকে।"

                },


                {
                        "60",
                        "Night snake",
                        "Venomous. rear-fanged venomous, not dangerous to human.",
                        "Hypsiglena torquata",
                        "Least concern",
                        "Main food of night snake is Lizards, frogs, insects.",
                        "Night snakes are found in dry hot areas of the western United States and British Columbia, Canada. Habitats include cliffs, talus slopes, grasslands, shrub savannas, shrublands, rivers and riparian wetlands.",
                        "When disturbed, the night snake may flatten its head, coil tightly, and vibrate the tail - appearing as a viper (see photo). However, it is a gentle species that is easily handled. They are considered to be rear-fanged venomous, but not dangerous to humans.",

                        "বিষাক্ত, তবে মানুষের জন্য বিপজ্জনক নয়।",
                        "রাতের সাপের প্রধান খাদ্য হল টিকটিকি, ব্যাঙ, পোকামাকড়।",
                        "রাত্রি সাপগুলি পশ্চিম মার্কিন যুক্তরাষ্ট্র এবং ব্রিটিশ কলাম্বিয়া, কানাডার শুষ্ক গরম এলাকায় পাওয়া যায়। আবাসস্থলগুলির মধ্যে রয়েছে ক্লিফ, তালুস ঢাল, তৃণভূমি, ঝোপঝাড়, ঝোপঝাড়, নদী এবং নদী এবং নদীর জলাভূমি।",
                        "যখন বিরক্ত হয়, রাতের সাপ তার মাথাকে চ্যাপ্টা করে, শক্তভাবে কুণ্ডলী করতে পারে এবং লেজটিকে কম্পিত করতে পারে - এটি একটি ভাইপার হিসাবে উপস্থিত হয় (ছবি দেখুন)। যাইহোক, এটি একটি মৃদু প্রজাতি যা সহজেই পরিচালনা করা যায়। তাদের পিছনের ফ্যানযুক্ত বিষাক্ত বলে মনে করা হয়। কিন্তু মানুষের জন্য বিপজ্জনক নয়।"

                },


                {
                        "62",
                        "Rock python",
                        "false.the snake coils around it, tightening its coils every time the victim breathes out. ",
                        "Python molurus",
                        "Not threatened",
                        "Rock pythons are dormant during the dry season. When they are young, African rock pythons prey on small rodents and birds. As they grow to adult size, they prey on larger animals, including small antelope, warthogs, dogs, monkeys, waterfowl, goats and crocodiles.",
                        "Marshes, swamps, jungles, rocky regions, rice paddies, riverbanks and close to small villages, but always near a permanent source of water.",
                        "The rock python's color pattern is whitish or yellowish with the blotched patterns varying from tan to dark brown shades. This varies with terrain and habitat. Specimens from the hill forests of Western Ghats and Assam are darker, while those from the Deccan Plateau and Eastern Ghats are usually lighter. All pythons are non-venomous.",

                        "নির্বিষ | সাপ তার চারপাশে কুণ্ডলী করে, প্রতিবার শিকার যখন শ্বাস ছাড়ে তখন তার কুণ্ডলী শক্ত করে।",
                        "রক পাইথন শুষ্ক মৌসুমে সুপ্ত থাকে। যখন তারা ছোট থাকে, আফ্রিকান রক পাইথন ছোট ইঁদুর এবং পাখি শিকার করে। তারা প্রাপ্তবয়স্ক আকারে বড় হওয়ার সাথে সাথে তারা ছোট হরিণ, ওয়ারথগ, কুকুর, বানর, জলপাখি, সহ বড় প্রাণী শিকার করে। ছাগল এবং কুমির।",
                        "জলভূমি, জলাভূমি, জঙ্গল, পাথুরে অঞ্চল, ধানের ক্ষেত, নদীর তীর এবং ছোট গ্রামের কাছাকাছি, কিন্তু সবসময় জলের স্থায়ী উৎসের কাছাকাছি।",
                        "পাথর অজগরের রঙের প্যাটার্ন সাদা বা হলুদাভ এবং দাগযুক্ত প্যাটার্নগুলি ট্যান থেকে গাঢ় বাদামী শেড পর্যন্ত পরিবর্তিত হয়। এটি ভূখণ্ড এবং বাসস্থানের সাথে পরিবর্তিত হয়। পশ্চিমঘাট এবং আসামের পাহাড়ি বনের নমুনাগুলি গাঢ়, যখন দাক্ষিণাত্য মালভূমি এবং পূর্বাঞ্চলের নমুনাগুলি। ঘাটগুলি সাধারণত হালকা হয়। সমস্ত অজগরই অ-বিষাক্ত।"

                },


                {
                        "63",
                        "Indian cobra",
                        "Venomous. this is a very poisonous snake in Asia. It's bite can kill people in just 25-30 minutes ",
                        "Naja naja",
                        "Least concern",
                        "The diet of the Indian cobra mostly consists of rodents, lizards, and frogs. By feeding on vermin, these reptiles often keep an area free of annoying pests (although they often cause more problems than they actually solve).",
                        "It can be found in dense or open forests, plains, agricultural lands (rice paddy fields, wheat crops), rocky terrain, wetlands, and it can even be found in heavily populated urban areas, such as villages and city outskirts, ranging from sea level to 2,000 metres (6,600 ft) in altitude.",
                        "This is not king cobra but its very poisonous and kill people.",

                        "বিষাক্ত। এটি এশিয়ার একটি অত্যন্ত বিষাক্ত সাপ। এটির কামড় মাত্র 25-30 মিনিটে মানুষকে মেরে ফেলতে পারে",
                        "ভারতীয় কোবরার খাদ্যের মধ্যে বেশিরভাগই ইঁদুর, টিকটিকি এবং ব্যাঙ থাকে। কীটপতঙ্গ খাওয়ানোর মাধ্যমে, এই সরীসৃপগুলি প্রায়ই একটি এলাকাকে বিরক্তিকর কীটপতঙ্গ থেকে মুক্ত রাখে (যদিও তারা প্রায়শই সমাধানের চেয়ে বেশি সমস্যা সৃষ্টি করে)।",
                        "এটি ঘন বা খোলা বন, সমভূমি, কৃষি জমি (ধানের ক্ষেত, গমের ফসল), পাথুরে ভূখণ্ড, জলাভূমিতে পাওয়া যেতে পারে এবং এটি এমনকি গ্রাম এবং শহরের উপকণ্ঠের মতো ভারী জনবহুল শহুরে এলাকায়ও পাওয়া যেতে পারে। সমুদ্রপৃষ্ঠ থেকে মোটামুটি 2,000 মিটার (6,600 ফুট) উচ্চতায় এদের বেশি পাওয়া যায়।",
                        "এটির বিষক্রিয়া কিং কোবরার মত নয়, বরং এটি খুব বিষাক্ত এবং মানুষকে হত্যা করতে সক্ষম।"
                },


                {
                        "64",
                        "Eastern green mamba",
                        "Venomous. green mamba is very poisonous . the chances of surviving is very low if a green mamba bite.",
                        "Dendroaspis angusticeps",
                        "Least concern",
                        "he eastern green mamba preys primarily on birds and their eggs, and small mammals including bats. It is also believed to eat arboreal lizards.",
                        "The eastern green mamba is native to regions near the coastlines of Southern Africa and East Africa. Its range extends from Kenya south through Tanzania, Malawi, and eastern Zimbabwe;",
                        "The eastern green mamba (Dendroaspis angusticeps) is a highly venomous snake species of the mamba genus Dendroaspis native to the coastal regions of southern East Africa.",

                        "বিষাক্ত। গ্রিন মাম্বা খুবই বিষাক্ত। গ্রিন মাম্বা কামড়ালে বেঁচে থাকার সম্ভাবনা খুবই কম।",
                        "তিনি ইস্টার্ন গ্রিন মাম্বা প্রাথমিকভাবে পাখি এবং তাদের ডিম এবং বাদুড় সহ ছোট স্তন্যপায়ী প্রাণী শিকার করে। এটি আরবোরিয়াল টিকটিকি খায় বলেও বিশ্বাস করা হয়।",
                        "পূর্ব সবুজ মাম্বা দক্ষিণ আফ্রিকা এবং পূর্ব আফ্রিকার উপকূলরেখার কাছাকাছি অঞ্চলে স্থানীয়। এর পরিসর দক্ষিণ কেনিয়া থেকে তানজানিয়া, মালাউই এবং পূর্ব জিম্বাবুয়ে পর্যন্ত বিস্তৃত;",
                        "পূর্ব সবুজ মাম্বা (ডেনড্রোস্পিস অ্যাঙ্গুস্টিসেপস) দক্ষিণ পূর্ব আফ্রিকার উপকূলীয় অঞ্চলে বসবাসকারী মাম্বা জেনাস ডেনড্রোস্পিসের একটি অত্যন্ত বিষাক্ত সাপের প্রজাতি।"

                },


                {
                        "66",
                        "Horned viper",
                        "Venomous. this snake is highly venomous and if one can't take anti-venom after getting bite could be dead in only 45-60 minutes.",
                        "Cerastes cornutus",
                        "Least concern",
                        "Their favorite food is birds, but they will also eat lizards, rodents, and arthropods.",
                        "Found throughout the Sahara in Northern Africa, C. cerastes inhabits a variety of habitats within the desert, including rock hills, sandy deserts, and wadis. Members of this species can sometimes be found in dunes, and are rarely found on rock pavement and gravel plains.",
                        "Cerastes are small snakes, averaging less than 50 cm (20 in) in total length (body + tail), but are relatively stout in appearance. The head is broad, flat and distinct from the neck. The head is covered with tubercularly keeled scales, which usually number 15 or more across, and a supraorbital horn may be present over each eye in some species.",

                        "বিষাক্ত। এই সাপটি অত্যন্ত বিষাক্ত এবং কামড়ানোর পর যদি কেউ অ্যান্টি-ভেনম গ্রহণ করতে না পারে তবে মাত্র 45-60 মিনিটের মধ্যে মারা যেতে পারে।",
                        "তাদের প্রিয় খাবার পাখি, কিন্তু তারা টিকটিকি, ইঁদুর এবং আর্থ্রোপডও খাবে।",
                        "উত্তর আফ্রিকার সাহারা জুড়ে পাওয়া যায়, সি. সিরাস্টেস মরুভূমির মধ্যে বিভিন্ন আবাসস্থলে বাস করে, যার মধ্যে রয়েছে শিলা পাহাড়, বালুকাময় মরুভূমি এবং ওয়াদি। এই প্রজাতির সদস্যদের কখনও কখনও টিলাগুলিতে পাওয়া যায় এবং খুব কমই পাথরের ফুটপাতে পাওয়া যায় এবং নুড়ি সমভূমি।",
                        "সেরাস্টেস হল ছোট সাপ, মোট দৈর্ঘ্যে (শরীরের লেজ) গড় 50 সেমি (20 ইঞ্চি) থেকে কম, তবে দেখতে তুলনামূলকভাবে শক্ত। মাথাটি চওড়া, চ্যাপ্টা এবং ঘাড় থেকে আলাদা। মাথাটি টিউবারকুলার কিলড আঁশ দিয়ে ঢাকা। , যা সাধারণত 15 বা তার বেশি জুড়ে থাকে এবং কিছু প্রজাতির প্রতিটি চোখের উপরে একটি সুপারঅরবিটাল হর্ন থাকতে পারে।",

                },



                {
                        "71",
                        "Scorpion",
                        "Venomous. there is only one species of scorpion which can kill human. human can dead after a week or later its bite",
                        "Scorpiones",
                        "Least concern",
                        "Scorpions eat a variety of insects, spiders, other scorpions and lizards. They also eat small mammals, such as mice. Scorpions must have water to drink, but they can survive for months without food. Scorpions use their pincers to capture and crush prey.",
                        "Scorpions are found on every continent except Antarctica, in habitats ranging from tropical rainforests to grasslands and deserts. As adults, most scorpions are nocturnal and solitary, usually staying in the same territory throughout their lives. Many live in burrows they dig or claim and defend from other wildlife.",
                        "Scorpions are predatory arachnids of the order Scorpiones. They have eight legs, and are easily recognized by a pair of grasping pincers and a narrow, segmented tail, often carried in a characteristic forward curve over the back and always ending with a stinger. ",

                        "বিষাক্ত। বিচ্ছুর একটি মাত্র প্রজাতি আছে যা মানুষকে মেরে ফেলতে পারে। মানুষ এক সপ্তাহ বা তার কামড়ে মারা যেতে পারে|",
                        "বিচ্ছুরা বিভিন্ন ধরনের পোকামাকড়, মাকড়সা, অন্যান্য বিচ্ছু এবং টিকটিকি খায়। তারা ইঁদুরের মতো ছোট স্তন্যপায়ী প্রাণীও খায়। বিচ্ছুদের অবশ্যই পান করার জন্য পানি থাকতে হবে, কিন্তু তারা খাবার ছাড়াই কয়েক মাস বেঁচে থাকতে পারে। বিচ্ছুরা তাদের চিমটি ব্যবহার করে শিকারকে ধরতে এবং পিষে ফেলে। ",
                        "অ্যান্টার্কটিকা ব্যতীত প্রতিটি মহাদেশে বিচ্ছু পাওয়া যায়, গ্রীষ্মমন্ডলীয় রেইনফরেস্ট থেকে শুরু করে তৃণভূমি এবং মরুভূমি পর্যন্ত আবাসস্থলে। প্রাপ্তবয়স্ক হিসাবে, বেশিরভাগ বিচ্ছু নিশাচর এবং নির্জন, সাধারণত সারা জীবন একই অঞ্চলে থাকে। অনেকে গর্তে বাস করে তারা খনন করে বা দাবি করে এবং অন্যান্য বন্যপ্রাণী থেকে রক্ষা করুন।",
                        "বিচ্ছুরা স্কর্পিওনস ক্রমের শিকারী আরাকনিড। তাদের আটটি পা আছে এবং একজোড়া আঁকড়ে ধরা চিমটি এবং একটি সরু, খণ্ডিত লেজ দ্বারা সহজেই চেনা যায়, প্রায়শই পিছনের দিকে একটি বৈশিষ্ট্যযুক্ত সামনের বক্ররেখায় বহন করা হয় এবং সর্বদা একটি স্টিংগার দিয়ে শেষ হয়।" ,
                },


                {
                        "371",
                        "hussar monkey",
                        "False",
                        "Erythrocebus patas",
                        "Not threatened",
                        "Monkeys eat eggs, nuts, seeds, and fruits. Monkeys are omnivores that eat a varied diet that can include nuts, fruits, seeds, eggs, insects, lizards, and more.",
                        "The common patas monkey (Erythrocebus patas), also known as the wadi monkey or hussar monkey, is a ground-dwelling monkey distributed over semi-arid areas of West Africa, and into East Africa.",
                        "he male common patas monkey grows to 60 cm (24 in) to 87 cm (34 in) in length, excluding the tail, which measures 75 cm (30 in). Adult males are considerably larger than adult females, which average 49 cm (19 in) in length.",

                        "নির্বিষ",
                        "বানররা ডিম, বাদাম, বীজ এবং ফল খায়। বানর হল সর্বভুক যারা একটি বৈচিত্র্যময় খাদ্য খায় যাতে বাদাম, ফল, বীজ, ডিম, পোকামাকড়, টিকটিকি এবং আরও অনেক কিছু অন্তর্ভুক্ত থাকতে পারে।",
                        "সাধারণ পাটাস বানর (এরিথ্রোসেবাস পাটাস), যা ওয়াদি বানর বা হুসার বানর নামেও পরিচিত, এটি পশ্চিম আফ্রিকার আধা-শুষ্ক অঞ্চলে এবং পূর্ব আফ্রিকায় বিতরণ করা একটি স্থল-বাসকারী বানর।",
                        "তিনি পুরুষ সাধারণ পটাস বানর দৈর্ঘ্যে 60 সেমি (24 ইঞ্চি) থেকে 87 সেমি (34 ইঞ্চি) পর্যন্ত বৃদ্ধি পায়, লেজ ব্যতীত, যার পরিমাপ 75 সেমি (30 ইঞ্চি)। প্রাপ্তবয়স্ক পুরুষরা প্রাপ্তবয়স্ক মহিলাদের তুলনায় যথেষ্ট বড় হয়, যার গড় 49 সেমি দৈর্ঘ্যে (19 ইঞ্চি)।"
                },


                {
                        "370",
                        "Guenon monkey",
                        "False",
                        "Cercopithecus cephus",
                        "Least concern",
                        "Unlike other tree-dwelling and leaf-eating monkeys, guenons have a more varied diet that includes fruits, seeds, and insects. ",
                        "Most guenons are arboreal, living in the tropical forests and woodlands. But some spend a greater part of their time on the ground and are found in forested mountain areas.",
                        "The guenons usually mate between 4 and 5 years old, with a female showing her rump to the male. The regular time for new births comes at the end of the rainy period of the year due to the subsequent rich food season. If the rainy season is year-round in the equatorial area, the mating and birth seasons can also appear at any time in the year.",
                        "নির্বিষ",
                        "অন্যান্য গাছে বসবাসকারী এবং পাতা খাওয়া বানরদের থেকে ভিন্ন, গেননদের আরও বৈচিত্র্যময় খাদ্য রয়েছে যার মধ্যে ফল, বীজ এবং পোকামাকড় রয়েছে।",
                        "বেশিরভাগ গেননই বৃক্ষমণ্ডলীয়, গ্রীষ্মমন্ডলীয় বন ও বনভূমিতে বাস করে। কিন্তু কেউ কেউ তাদের সময়ের একটি বৃহত্তর অংশ মাটিতে কাটায় এবং জঙ্গলময় পাহাড়ী এলাকায় পাওয়া যায়।",
                        "গেননরা সাধারণত 4 থেকে 5 বছর বয়সের মধ্যে সঙ্গম করে, একজন মহিলা পুরুষের সাথে তার রম্প দেখায়। পরবর্তী সমৃদ্ধ খাদ্য মৌসুমের কারণে বছরের বর্ষাকালের শেষে নতুন জন্মের জন্য নিয়মিত সময় আসে। যদি বৃষ্টি হয় নিরক্ষীয় অঞ্চলে ঋতু সারা বছর ধরে থাকে, সঙ্গম এবং জন্মের ঋতুও বছরের যে কোনও সময় উপস্থিত হতে পারে।"
                },


                {
                        "372",
                        "Baboon",
                        "False",
                        "Papio",
                        "Least concern",
                        "Baboons are opportunistic eaters and, fond of crops, become destructive pests to many African farmers. They eat fruits, grasses, seeds, bark, and roots, but also have a taste for meat. They eat birds, rodents, and even the young of larger mammals, such as antelopes and sheep.",
                        "In sundarban we largely found baboon.The major requirements for any habitat appear to be abundant water sources and safe sleeping places—either in tall trees or on cliff faces.",
                        "Baboons are primates comprising the genus Papio, one of the 23 genera of Old World monkeys. There are six species of baboon: the hamadryas baboon, the Guinea baboon, the olive baboon, the yellow baboon, the Kinda baboon and the chacma baboon. ",

                        "নির্বিষ",
                        "বেবুনরা সুবিধাবাদী ভক্ষক এবং শস্যের প্রতি অনুরাগী, অনেক আফ্রিকান কৃষকের কাছে ধ্বংসাত্মক কীটপতঙ্গ হয়ে ওঠে। তারা ফল, ঘাস, বীজ, বাকল এবং শিকড় খায়, তবে মাংসের স্বাদও রয়েছে। তারা পাখি, ইঁদুর এবং এমনকি বাচ্চাদেরও খায়। বৃহত্তর স্তন্যপায়ী প্রাণী, যেমন হরিণ এবং ভেড়া।",
                        "সুন্দরবনে আমরা মূলত বেবুন খুঁজে পেয়েছি৷ যে কোনও বাসস্থানের জন্য প্রধান প্রয়োজনীয়তাগুলি প্রচুর জলের উত্স এবং নিরাপদ ঘুমানোর জায়গা-হয় লম্বা গাছে বা পাহাড়ের মুখে।",
                        "বেবুন হল প্রাইমেট যা প্যাপিও জেনাস নিয়ে গঠিত, যা পুরানো বিশ্বের বানরের 23টি বংশের একটি। বেবুনের ছয়টি প্রজাতি রয়েছে: হামাদ্রিয়া বেবুন, গিনি বেবুন, জলপাই বেবুন, হলুদ বেবুন, কাইন্ডা বেবুন এবং চাকমা বেবুন। "

                },

                {
                        "373",
                        "Macaque",
                        "False",

                        "Macaca",
                        "Least concern",
                        "Macaques are principally frugivorous (preferring fruit), although their diet also includes seeds, leaves, flowers, and tree bark. Some species, such as the crab-eating macaque, subsist on a diet of invertebrates and occasionally small vertebrates.",
                        "The ecological and geographic ranges of the macaque are the widest of any non-human primate. Their habitats include the tropical rainforests of Southeast Asia, Sri Lanka, India, arid mountains of Pakistan and Afghanistan, and temperate mountains in Algeria, Japan, northern China, Morocco, and Nepal.",
                        "The macaques constitute a genus (Macaca) of gregarious Old World monkeys of the subfamily Cercopithecinae. The 23 species of macaques inhabit ranges throughout Asia, North Africa, and (in one instance) Gibraltar.",

                        "নির্বিষ",
                        "ম্যাকাক প্রধানত ফলপ্রসূ (ফল পছন্দ করে), যদিও তাদের খাদ্যতালিকায় বীজ, পাতা, ফুল এবং গাছের ছালও থাকে। কিছু প্রজাতি, যেমন কাঁকড়া-খাওয়া ম্যাকাক, অমেরুদণ্ডী প্রাণী এবং মাঝে মাঝে ছোট মেরুদণ্ডী প্রাণীর খাদ্যে থাকে।",
                        "ম্যাকাকের পরিবেশগত এবং ভৌগলিক রেঞ্জগুলি যে কোনও অ-মানব প্রাইমেটের চেয়ে প্রশস্ত। তাদের আবাসস্থলগুলির মধ্যে রয়েছে দক্ষিণ-পূর্ব এশিয়ার গ্রীষ্মমন্ডলীয় রেইনফরেস্ট, শ্রীলঙ্কা, ভারত, পাকিস্তান ও আফগানিস্তানের শুষ্ক পর্বতমালা এবং আলজেরিয়া, জাপান, উত্তরের নাতিশীতোষ্ণ পর্বতমালা চীন, মরক্কো এবং নেপাল।",
                        "ম্যাকাকগুলি সাবফ্যামিলি সারকোপিথেসিনেইর গ্রেগারিয়স ওল্ড ওয়ার্ল্ড বানরের একটি জেনাস (ম্যাকাকা) গঠন করে৷ ম্যাকাকের 23 প্রজাতি এশিয়া, উত্তর আফ্রিকা এবং (একটি উদাহরণে) জিব্রাল্টার জুড়ে বিস্তৃত অঞ্চলে বাস করে৷"
                },


                {
                        "374",
                        "Langur",
                        "false",
                        "Semnopithecus",
                        "Least concern",
                        "Their primary natural diet is leaves. The yet-to-be-published paper traces the urban adaptation of langurs coexisting with humans.",
                        "They inhabit arid habitats like deserts, tropical habitats like tropical rainforests and temperate habitats like coniferous forests, deciduous habitats and mountains habitats. They are found at sea level to altitudes up to 4,000 m (13,000 ft).",
                        "Colobines are medium-sized primates with long tails (except for the pig-tailed langur) and diverse colorations. The coloring of nearly all young animals differs remarkably from that of the adults.",


                        "নির্বিষ",
                        "তাদের প্রাথমিক প্রাকৃতিক খাদ্য হল পাতা। এখনও প্রকাশিত হওয়া কাগজে মানুষের সাথে সহাবস্থানে থাকা ল্যাংগুরদের শহুরে অভিযোজনের সন্ধান করা হয়েছে।",
                        "তারা মরুভূমির মতো শুষ্ক আবাসস্থল, গ্রীষ্মমন্ডলীয় রেইনফরেস্টের মতো গ্রীষ্মমন্ডলীয় আবাসস্থল এবং শঙ্কুযুক্ত বন, পর্ণমোচী আবাসস্থল এবং পাহাড়ের আবাসস্থলের মতো নাতিশীতোষ্ণ আবাসস্থলে বাস করে। তারা সমুদ্রপৃষ্ঠ থেকে 4,000 মিটার (13,000 ফুট) পর্যন্ত উচ্চতায় পাওয়া যায়।",
                        "কোলোবাইন হল মাঝারি আকারের প্রাইমেট যার লম্বা লেজ (শুয়োরের লেজযুক্ত ল্যাঙ্গুর বাদে) এবং বিভিন্ন রঙের। প্রায় সব তরুণ প্রাণীর রঙ প্রাপ্তবয়স্কদের থেকে উল্লেখযোগ্যভাবে আলাদা।"
                },


                {
                        "375",
                        "colobus monkey",
                        "false",
                        "Colobus",
                        "Least concern",
                        "They are strictly leaf-eaters and spend most of their time in treetops, preferring to eat the tender young leaves found there.",
                        "Where do colobus monkeys live? The two species of black and white colobus monkeys are found in Kenya, those that inhabit coastal forests and those in inland high-country areas. Red colobus monkeys are also found in East Africa, but are endangered and quite rare.",
                        "Colobus habitats include primary and secondary forests, riverine forests, and wooded grasslands; they are found more in higher-density logged forests than in other primary forests. Their ruminant-like digestive systems have enabled them to occupy niches that are inaccessible to other primates: they are herbivorous, eating leaves, fruit, flowers, lichen, herbaceous vegetation and bark. Colobuses are important for seed dispersal through their sloppy eating habits, as well as through their digestive systems.",


                        "নির্বিষ",
                        "তারা কঠোরভাবে পাতা খায় এবং তাদের বেশিরভাগ সময় গাছের টপে কাটায়, সেখানে পাওয়া কোমল কচি পাতা খেতে পছন্দ করে।",
                        "কোলোবাস বানররা কোথায় বাস করে? কালো এবং সাদা কোলোবাস বানরের দুটি প্রজাতি কেনিয়াতে পাওয়া যায়, যারা উপকূলীয় বনে বাস করে এবং যারা অভ্যন্তরীণ উচ্চ-দেশীয় অঞ্চলে। লাল কোলোবাস বানরগুলি পূর্ব আফ্রিকাতেও পাওয়া যায়, কিন্তু বিপন্ন এবং বেশ বিরল।",
                        "কলোবাসের আবাসস্থলের মধ্যে রয়েছে প্রাথমিক ও গৌণ বন, নদীমাতৃক বন, এবং কাঠের ঘাসভূমি; অন্যান্য প্রাথমিক বনের তুলনায় এগুলি উচ্চ-ঘনত্বের লোগযুক্ত বনে বেশি পাওয়া যায়। তাদের রুমিন্যান্ট-সদৃশ পাচনতন্ত্র তাদের কুলুঙ্গিগুলি দখল করতে সক্ষম করেছে যা অন্যান্য প্রাইমেটদের কাছে অ্যাক্সেসযোগ্য নয়। : তারা তৃণভোজী, পাতা, ফল, ফুল, লাইকেন, গুল্মজাতীয় গাছপালা এবং বাকল খায়। কলোবাসগুলি তাদের ঢালু খাদ্যাভ্যাসের পাশাপাশি তাদের পরিপাকতন্ত্রের মাধ্যমে বীজ ছড়িয়ে দেওয়ার জন্য গুরুত্বপূর্ণ।"
                },


                {
                        "376",
                        "Proboscis monkey",
                        "False",
                        "Nasalis larvatus",
                        "Endangered",
                        "Proboscis monkeys survive mainly on a diet of leaves, seeds, and unripe fruits but will occasionally consume insects as well. They have complex, chambered stomachs that rely on a host of symbiotic bacteria for digestion.",
                        "Proboscis monkeys are endemic to the jungles of Borneo, never straying far from the island's rivers, coastal mangroves, and swamps. They are a highly arboreal species and will venture onto land only occasionally to search for food.",
                        "The proboscis monkey (Nasalis larvatus) or long-nosed monkey is an arboreal Old World monkey with an unusually large nose, a reddish-brown skin color and a long tail. It is endemic to the southeast Asian island of Borneo and is found mostly in mangrove forests and on the coastal areas of the island.",


                        "নির্বিষ",
                        "প্রোবোসিস বানর প্রধানত পাতা, বীজ এবং অপরিপক্ক ফলের খাদ্যে বেঁচে থাকে তবে মাঝে মাঝে পোকামাকড়ও খেয়ে ফেলে। তাদের জটিল, চেম্বারযুক্ত পাকস্থলী রয়েছে যা হজমের জন্য সিম্বিওটিক ব্যাকটেরিয়ার উপর নির্ভর করে।",
                        "প্রোবোসিস বানরগুলি বোর্নিওর জঙ্গলে স্থানীয়, দ্বীপের নদী, উপকূলীয় ম্যানগ্রোভ এবং জলাভূমি থেকে কখনও দূরে সরে যায় না। এরা একটি অত্যন্ত আর্বোরিয়াল প্রজাতি এবং শুধুমাত্র মাঝে মাঝে খাবারের সন্ধানে ভূমিতে আসে।",
                        "প্রোবোসিস বানর (নাসালিস লার্ভাটাস) বা দীর্ঘ-নাকযুক্ত বানর হল একটি আর্বোরিয়াল ওল্ড ওয়ার্ল্ড বানর যার একটি অস্বাভাবিক বড় নাক, একটি লালচে-বাদামী চামড়ার রঙ এবং একটি লম্বা লেজ। এটি দক্ষিণ-পূর্ব এশিয়ার দ্বীপ বোর্নিওতে স্থানীয় এবং বেশিরভাগই পাওয়া যায়। ম্যানগ্রোভ বনে এবং দ্বীপের উপকূলীয় এলাকায়।"
                },


                {
                        "377",
                        "Marmoset",
                        "false",
                        "Callithrix jacchus",
                        "Least concern",
                        "In nature marmosets usually eat insects, but will also take snails, spiders, frogs, lizards and geckos. They will also eat various fruits, flowers, nectar, leaves and tree gum. It is imperative to feed them on a raised platform, since they like to sit and eat up in the trees.",
                        "Common marmosets inhabit a variety of forest types including the extreme northern Atlantic coastal forest, dry, seasonal, semideciduous inland forests, riverine forests in dry thorn scrub habitat or caatinga.",
                        "The marmosets , also known as zaris or sagoin, are 22 New World monkey species of the genera Callithrix, Cebuella, Callibella, and Mico. All four genera are part of the biological family Callitrichidae. The term is also used in reference to Goeldi's marmoset, Callimico goeldii, which is closely related.",

                        "নির্বিষ",
                        "প্রকৃতিতে মারমোসেটরা সাধারণত পোকামাকড় খায়, তবে শামুক, মাকড়সা, ব্যাঙ, টিকটিকি এবং গেকোও নেবে। তারা বিভিন্ন ফল, ফুল, অমৃত, পাতা এবং গাছের আঠাও খাবে। একটি উঁচু মঞ্চে তাদের খাওয়ানো অপরিহার্য, যেহেতু তারা গাছে বসে খেতে পছন্দ করে।",
                        "সাধারণ মারমোসেটরা চরম উত্তর আটলান্টিকের উপকূলীয় বন, শুষ্ক, মৌসুমী, আধা-পীড়াযুক্ত অভ্যন্তরীণ বন, শুষ্ক কাঁটা ঝাড়ার আবাসস্থল বা ক্যাটিঙ্গার নদীমাতৃক বন সহ বিভিন্ন ধরণের বনে বাস করে।",
                        "মারমোসেটগুলি, যা জারিস বা সাগোইন নামেও পরিচিত, হল ক্যালিথ্রিক্স, সেবুয়েলা, ক্যালিবেলা এবং মাইকো প্রজাতির 22টি নতুন বিশ্ব বানর প্রজাতি। চারটি বংশই জৈবিক পরিবার Callitrichidae-এর অংশ। শব্দটি Goeldi's marmoset-এর প্রসঙ্গেও ব্যবহৃত হয়। , Callimico goeldii, যা ঘনিষ্ঠভাবে সম্পর্কিত।"

                },


                {
                        "378",
                        "capuchin",
                        "false",
                        "Cebus capucinus",
                        "Least concern",
                        "A typical diet for capuchin monkeys includes fruit, insects, leaves and small birds.",
                        "Brown or Tufted, Capuchins ( Sapajus apella) are a South American species found primarily in Brazil, around the Amazon Basin. They occupy tropical rainforests as well as savannah forests, mangroves and varzea (seasonally inundated forests).",
                        "The capuchin monkeys are New World monkeys of the subfamily Cebinae. They are readily identified as the  monkey, and have been used in many movies and television shows.",


                        "ক্যাপুচিন",
                        "নির্বিষ",
                        "ক্যাপুচিন বানরের জন্য একটি সাধারণ খাদ্যের মধ্যে রয়েছে ফল, পোকামাকড়, পাতা এবং ছোট পাখি।",
                        "ব্রাউন বা টুফটেড, ক্যাপুচিন ( সাপাজুস অ্যাপেলা) হল একটি দক্ষিণ আমেরিকার প্রজাতি যা মূলত ব্রাজিলে, আমাজন অববাহিকার আশেপাশে পাওয়া যায়। তারা গ্রীষ্মমন্ডলীয় রেইনফরেস্টের পাশাপাশি সাভানা বন, ম্যানগ্রোভ এবং ভারজিয়া (ঋতুগতভাবে প্লাবিত বন) দখল করে।",
                        "কাপুচিন বানর হল সাবফ্যামিলি Cebinae-এর নিউ ওয়ার্ল্ড বানর। তারা সহজেই বানর হিসাবে চিহ্নিত হয়, এবং অনেক সিনেমা এবং টেলিভিশন শোতে ব্যবহার করা হয়েছে।"


                },
        };


        public static final String[][] PHOTOS = new String[][]{
                {
                        "291",
                        "Lion",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Lion_waiting_in_Namibia.jpg/1200px-Lion_waiting_in_Namibia.jpg",
                        "https://cdn.britannica.com/55/2155-050-604F5A4A/lion.jpg",
                        "https://th-thumbnailer.cdn-si-edu.com/PWHloyMbSU3lE5BWo5WcXgeYuFw=/fit-in/1072x0/https://tf-cmsv2-smithsonianmag-media.s3.amazonaws.com/filer/two-male-lions-Kenya-520.jpg",
                        "https://www.krugerpark.co.za/images/lion-facts-786x446.jpg",
                        "https://www.humanesociety.org/sites/default/files/styles/400x400/public/2019/10/lioness-with-cub.jpg?h=e0668860&itok=GCe0XP5K"
                },
                {
                        "9",
                        "Ostrich",
                        "https://cdn.mos.cms.futurecdn.net/tMnjLRtEm47ueTPt9Rkyxd-1200-80.jpg",
                        "https://i.natgeofe.com/n/23b2ba2c-f668-4269-a68e-d918dfed59c2/6108126_16x9.jpg",
                        "https://cdn.britannica.com/35/154235-050-E9B69238/ostriches-Maasai-Mara-National-Reserve-Kenya.jpg",
                        "https://cdn.britannica.com/58/152058-050-9BFAC1EF/Ostriches.jpg",
                        "https://www.zoodelahautetouche.fr/sites/hautetouche/files/styles/1020x576/public/thumbnails/image/autruches_c_gilles_martin.jpg?itok=ilANaLoi"
                },
                {
                        "162",
                        "Beagle Dog",
                        "https://cdn.britannica.com/16/234216-050-C66F8665/beagle-hound-dog.jpg",
                        "https://www.purina.co.uk/sites/default/files/styles/square_medium_440x440/public/2022-07/GettyImages-1064619358%20%281%29.jpg?h=d3398a4a&itok=IdOM_9v_",
                        "https://cleverpuppies.com/wp-content/uploads/2022/01/Beagle-Dog-Breed-Everything-You-Need-to-Know.jpg",
                        "https://blog.myollie.com/wp-content/uploads/2020/02/beagle-puppy-running-through-a-yard-with-a-ball-in-his-mouth.jpg",
                        "https://cf.ltkcdn.net/dogs/dog-breeds/images/orig/325050-1600x1030-mini-beagle-puppy-pictures.jpg"
                },
                {
                        "22",
                        "Bald eagle",
                        "https://d.newsweek.com/en/full/343853/bald-eagle-alaska-preserve-2.jpg",
                        "https://people.com/thmb/8FHjWGYSrebOUV8tTxIg2hoZVb0=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc():focal(999x0:1001x2)/bald-eagle-2-2000-5ed4d3089b6d4472848cc839bce306d4.jpg",
                        "https://upload.wikimedia.org/wikipedia/commons/1/1a/About_to_Launch_%2826075320352%29.jpg",
                        "https://nationaltoday.com/wp-content/uploads/2021/12/Bald-Eagle-Appreciation-Day-640x514.jpg",
                        "https://nationalzoo.si.edu/sites/default/files/animals/baldeagle-001.jpg"
                },
                {
                        "285",
                        "Egyptian cat",
                        "https://www.purina.co.uk/sites/default/files/2022-02/GettyImages-1250476831%20%281%29.jpg",
                        "https://upload.wikimedia.org/wikipedia/commons/thumb/7/7f/Egyptian_Mau_Bronze.jpg/1200px-Egyptian_Mau_Bronze.jpg",
                        "https://imagesvc.meredithcorp.io/v3/mm/image?q=60&c=sc&poi=%5B1120%2C479%5D&w=2000&h=1333&url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F47%2F2021%2F04%2F13%2Fsavannah-brick-1411656827-2000.jpg",
                        "http://azure.wgp-cdn.co.uk/app-yourcat/posts/egytian_mau1.jpg?&width=1200&height=630&mode=crop&format=webp&webp.quality=40&scale=both",
                        "https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F47%2F2022%2F01%2F06%2Fabyssinian-outdoors-1290957479-2000.jpg&q=60"
                },
                {
                        "26",
                        "Spotted salamander",
                        "https://i.natgeofe.com/n/2d4a5585-ff8c-429b-bdd6-437ec10884d5/spotted-salamander.jpg?w=636&h=422",
                        "https://texashillcountry.com/wp-content/uploads/reed-e1562867214582.jpg",
                        "https://static01.nyt.com/images/2016/04/17/nyregion/17NATURE1/17NATURE1-superJumbo.jpg",
                        "https://reptilesmagazine.com/wp-content/uploads/data-import/a07c22e7/spotted-salamander-shutterstock_82093852.jpg",
                        "https://i.pinimg.com/736x/36/0d/02/360d022a1eccbfb1db6b4e3700bc23f4--all-about-animals-salamanders.jpg"

                }
        };


}
