package Kartoffel.Licht.Vulkan.video;
@Deprecated
public enum LanguageCodes {

	English (

	0),

	Georgian (

	52),

	French (

	1),

	Moldavian (

	53),

	German (

	2),

	Kirghiz (

	54),

	Italian (

	3),

	Tajiki (

	55),

	Dutch (

	4),

	Turkmen (

	56),

	Swedish (

	5),

	Mongolian (

	57),

	Spanish (

	6),

	MongolianCyr (

	58),

	Danish (

	7),

	Pashto (

	59),

	Portuguese (

	8),

	Kurdish (

	60),

	Norwegian (

	9),

	Kashmiri (

	61),

	Hebrew (

	10),

	Sindhi (

	62),

	Japanese (

	11),

	Tibetan (

	63),

	Arabic (

	12),

	Nepali (

	64),

	Finnish (

	13),

	Sanskrit (

	65),

	Greek (

	14),

	Marathi (

	66),

	Icelandic (

	15),

	Bengali (

	67),

	Maltese (

	16),

	Assamese (

	68),

	Turkish (

	17),

	Gujarati (

	69),

	Croatian (

	18),

	Punjabi (

	70),

	Traditional_Chinese (

	19),

	Oriya (

	71),

	Urdu (

	20),

	Malayalam (

	72),

	Hindi (

	21),

	Kannada (

	73),

	Thai (

	22),

	Tamil (

	74),

	Korean (

	23),

	Telugu (

	75),

	Lithuanian (

	24),

	Sinhala (

	76),

	Polish (

	25),

	Burmese (

	77),

	Hungarian (

	26),

	Khmer (

	78),

	Estonian (

	27),

	Lao (

	79),

	Lettish (

	28),

	Vietnamese (

	80),

	Latvian (

	28),

	Indonesian (

	81),

	Saami (

	29),

	Tagalog (

	82),

	Sami (

	29),

	MalayRoman (

	83),

	Faroese  (

	30),

	MalayArabic (

	84),

	Farsi (

	31),

	Amharic (

	85),

	Russian (

	32),

	Galla (

	87),

	Simplified_Chinese (

	33),

	Oromo (

	87),

	Flemish (

	34),

	Somali (

	88),

	Irish (

	35),

	Swahili (

	89),

	Albanian (

	36),

	Kinyarwanda (

	90),

	Romanian (

	37),

	Rundi (

	91),

	Czech (

	38),

	Nyanja (

	92),

	Slovak (

	39),

	Malagasy (

	93),

	Slovenian (

	40),

	Esperanto (

	94),

	Yiddish (

	41),

	Welsh (

	128),

	Serbian (

	42),

	Basque (

	129),

	Macedonian (

	43),

	Catalan (

	130),

	Bulgarian (

	44),

	Latin (

	131),

	Ukrainian (

	45),

	Quechua (

	132),

	Belarusian (

	46),

	Guarani (

	133),

	Uzbek (

	47),

	Aymara (

	134),

	Kazakh (

	48),

	Tatar (

	135),

	Azerbaijani (

	49),

	Uighur (

	136),

	AzerbaijanAr (

	50),

	Dzongkha (

	137),

	Armenian (

	51),

	JavaneseRom (

	138),

	Unspecified (

	32767);
	
	private int id;
	
	private LanguageCodes(int id) {
		this.id = id;
	}

	static String get(int v) {
		for(LanguageCodes l : LanguageCodes.values())
			if(l.id == v)
				return l.toString();
		return "--";
	}

}
