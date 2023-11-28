package dev.hoyobox.api.data.genshin

enum class Characters(val id: String, val stars: Int) {

    ALBEDO("albedo", 5),
    Alhaitham("alhaitham", 5),
    ALOY("aloy", 5),
    AMBER("amber", 4),
    ARATAKI_ITTO("arataki_itto", 5),
    BAIZHU("baizhu", 5),
    BARBARA("barbara", 4),
    BEIDOU("beidou", 4),
    BENNETT("bennett", 4),
    CANDACE("candace", 4),
    CHARLOTTE("charlotte", 4),
    CHONGYUN("chongyun", 4),
    COLLEI("collei", 4),
    CYNO("cyno", 5),
    DEHYA("dehya", 5),
    DILUC("diluc", 5),
    DIONA("diona", 4),
    EULA("eula", 5),
    FARUZAN("faruzan", 4),
    FISCHL("fischl", 4),
    FREMINET("freminet", 4),
    FURINA("furina", 5),
    GANYU("ganyu", 5),
    GOROU("gorou", 4),
    HUTAO("hu_tao", 5),
    JEAN("jean", 5),
    KAEDEHARA_KAZUHA("kaedehara_kazuha", 5),
    KAEYA("kaeya", 4),
    KAMISATO_AYAKA("kamisato_ayaka", 5),
    KAMISATO_AYATO("kamisato_ayato", 5),
    KAVEH("kaveh", 4),
    KEQING("keqing", 5),
    KIRARA("kirara", 4),
    KLEE("klee", 5),
    KUJOUSARA("kujou_sara", 4),
    KUKI_SHINOBU("kuki_shinobu", 4),
    LAYLA("layla", 4),
    LISA("lisa", 4),
    LYNETTE("lynette", 4),
    LYNEY("lyney", 5),
    MIKA("mika", 4),
    MONA("mona", 5),
    NAHIDA("nahida", 5),
    NEUVILLETTE("neuvillette", 5),
    NILOU("nilou", 5),
    NINGGUANG("ningguang", 4),
    NOELLE("noelle", 4),
    QIQI("qiqi", 5),
    RAIDEN_SHOGUN("raiden_shogun", 5),
    RAZOR("razor", 4),
    ROSARIA("rosaria", 4),
    SANGONOMIYA_KOKOMI("sangonomiya_kokomi", 5),
    SAYU("sayu", 4),
    SHENHE("shenhe", 5),
    SHIKANOIN_HEIZOU("shikanoin_heizou", 4),
    SUCROSE("sucrose", 4),
    TARTAGLIA("tartaglia", 5),
    THOMA("thoma", 4),
    TIGHNARI("tighnari", 5),
    VENTI("venti", 5),
    WANDERER("wanderer", 5),
    WRIOTHESLEY("wriothesley", 5),
    XIANGLING("xiangling", 4),
    XIAO("xiao", 5),
    XINGQIU("xingqiu", 4),
    XINYAN("xinyan", 4),
    YAE_MIKO("yea_miko", 5),
    Yanfei("yanfei", 4),
    YAOYAO("yaoyao", 4),
    YELAN("yelan", 5),
    YOIMIYA("yoimiya", 5),
    YUN_JIN("yun_jin", 4),
    ZHONGLI("zhongli", 5);

    companion object {

        fun contains(id: String): Boolean {
            for (character in entries)
                if (character.id == id)
                    return true
            return false
        }

    }

}