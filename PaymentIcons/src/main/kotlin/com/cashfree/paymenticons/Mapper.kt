package com.cashfree.paymenticons

internal fun getSizeMapping(): Map<String, String> {
    return mapOf(
        "sm" to "32",
        "md" to "64",
        "lg" to "128",
        "svg" to "svg"
    )
}

internal fun getImageSize(size: String): String {
    val sizeMapping = getSizeMapping()
    return if (sizeMapping.containsKey(size)) size
    else "sm"
}

internal fun getImageType(): Map<String, String> {
    return mapOf(
        "sm" to "png",
        "md" to "png",
        "lg" to "png",
        "svg" to "svg"
    )
}

internal fun getPaymentModeMapping(): Map<String, String> {
    return mapOf(
        "aus" to "nb",
        "axis" to "nb",
        "axisc" to "nb",
        "bdnc" to "nb",
        "bdnr" to "nb",
        "bobc" to "nb",
        "bobr" to "nb",
        "boi" to "nb",
        "bom" to "nb",
        "canara" to "nb",
        "cbi" to "nb",
        "csb" to "nb",
        "cub" to "nb",
        "dbs" to "nb",
        "deutsche" to "nb",
        "dhanlakshmi" to "nb",
        "equitas" to "nb",
        "federal" to "nb",
        "hdfc" to "nb",
        "icici" to "nb",
        "idfc" to "nb",
        "indian" to "nb",
        "indusind" to "nb",
        "iob" to "nb",
        "iobc" to "nb",
        "jkb" to "nb",
        "karnatka" to "nb",
        "karur" to "nb",
        "kotak" to "nb",
        "lvbc" to "nb",
        "lvbr" to "nb",
        "pnbc" to "nb",
        "pnbr" to "nb",
        "rbl" to "nb",
        "rblc" to "nb",
        "saraswat" to "nb",
        "sbi" to "nb",
        "sbic" to "nb",
        "scb" to "nb",
        "shivalik" to "nb",
        "sib" to "nb",
        "sur" to "nb",
        "tamcop" to "nb",
        "tammerc" to "nb",
        "uco" to "nb",
        "union" to "nb",
        "utk" to "nb",
        "yes" to "nb",
        "amex" to "card",
        "diners" to "card",
        "discover" to "card",
        "jcb" to "card",
        "maestro" to "card",
        "mastercard" to "card",
        "paypal" to "card",
        "rupay" to "card",
        "visa" to "card",
        "epaylater" to "paylater",
        "freecharge" to "paylater",
        "hdfc" to "paylater",
        "kotak" to "paylater",
        "lazypay" to "paylater",
        "olapostpaid" to "paylater",
        "simpl" to "paylater",
        "zestmoneypaylater" to "paylater",
        "bhim" to "upi",
        "gpay" to "upi",
        "paytm" to "upi",
        "phonepe" to "upi",
        "credpay" to "upi",
        "whatsapp" to "upi",
        "airtel" to "wallet",
        "amazon" to "wallet",
        "freecharge" to "wallet",
        "jio" to "wallet",
        "mobikwik" to "wallet",
        "ola" to "wallet",
        "paytm" to "wallet",
        "phonepe" to "wallet",
        "flexipay" to "cardless"
    )
}

internal fun getNameMapping(): Map<String, Map<String, List<String>>> {
    return mapOf(
        "cardbanks" to getCardBankMapping(),
        "cardschemes" to getCardSchemeMapping(),
        "paylater" to getPayLaterMapping(),
        "upi" to getUPIMapping(),
        "wallet" to getWalletMapping(),
        "cardless" to getCardLessMapping(),
    )
}


private fun getCardBankMapping(): Map<String, List<String>> {
    return mapOf(
        "aus" to listOf(
            "au small finance bank",
            "aus",
            "au small finance bank limited",
            "au small",
            "au small finance",
            "au",
            "aublr"
        ),
        "axis" to listOf("axis bank", "axis", "utibr"),
        "axisc" to listOf("axisc", "axis corporate", "utibc"),
        "bdnc" to listOf("bandhan bank", "bandhan", "bdnc", "bandhan corporate", "bdblc"),
        "bdnr" to listOf("bdnr", "bandhan retail", "bdblr"),
        "bobc" to listOf("bobc", "bank of baroda", "barbc"),
        "bobr" to listOf("bobr", "barbr"),
        "boi" to listOf("boi", "bank of india", "bkidr", "bkidc"),
        "bom" to listOf("bom", "bank of maharashtra", "mahbr"),
        "canara" to listOf("canara", "canara bank", "cnrbr"),
        "cbi" to listOf("central bank of india", "cbi", "cbinr"),
        "csb" to listOf(
            "csb bank",
            "csb",
            "catholic syrian bank limited",
            "catholic syrian bank",
            "csbkr",
        ),
        "cub" to listOf("city union bank", "cub", "ciubr", "ciubc"),
        "dbs" to listOf("dbs", "dbs bank", "digibank", "dbssr"),
        "deutsche" to listOf("deutsche", "deutsche bank", "deutr"),
        "dhanlakshmi" to listOf("dhanlakshmi", "dhanlakshmi bank", "dlxbr", "dlxbc"),
        "equitas" to listOf(
            "equitas small finance bank",
            "equitas",
            "equitas small finance",
            "equitas bank",
            "esfbr"
        ),
        "federal" to listOf("federal bank", "federal", "fdrlr"),
        "hdfc" to listOf("hdfc", "hdfc bank", "hdfcr", "hdfcc"),
        "icici" to listOf("icici", "icici bank", "icicr", "icicc"),
        "idfc" to listOf("idfc", "idfc bank", "idfc first bank", "idfbr"),
        "indian" to listOf("indian", "indian bank", "idibr"),
        "indusind" to listOf("indusind", "indusind bank", "indbr"),
        "iob" to listOf("iob", "iob bank", "indian overseas bank", "indian overseas bank", "iobar"),
        "iobc" to listOf(
            "iobc",
            "iob corporate",
            "indian overseas corporate",
            "indian overseas bank corporate",
            "iobac"
        ),
        "jkb" to listOf(
            "jkb",
            "jammu & kashmir bank",
            "jammu and kashmir bank",
            "j&k bank",
            "jakar"
        ),
        "karnatka" to listOf("karnataka", "karnataka bank", "karnatka", "karnatka bank", "karbr"),
        "karur" to listOf("karur", "karur bank", "karur vysya bank", "karur vysya", "kvblr"),
        "kotak" to listOf("kotak", "kotak bank", "kkbkr"),
        "lvbc" to listOf("lvbc", "lvb corporate", "lavbc"),
        "lvbr" to listOf("lvbr", "lvb retail", "lavbr"),
        "pnbc" to listOf(
            "pnbc",
            "punjab national bank corporate",
            "pnb",
            "punjab national bank",
            "punbc"
        ),
        "pnbr" to listOf("pnbr", "punjab national bank retail", "punbr"),
        "rbl" to listOf("rbl", "ratnakar bank", "rbl bank", "ratnr"),
        "rblc" to listOf("rbl corporate", "rblc", "ratnc"),
        "saraswat" to listOf("saraswat", "saraswat bank", "srcbr"),
        "sbi" to listOf("sbi", "state bank of india", "sbinr"),
        "sbic" to listOf("sbic", "sbi corporate", "state bank of india corporate", "sbinc"),
        "scb" to listOf("scb", "standard chartered", "standard chartered bank", "scblr"),
        "shivalik" to listOf("shivalik", "shivalik bank", "smcbr"),
        "sib" to listOf("sib", "south indian bank", "siblr"),
        "sur" to listOf("sur", "sur bank"),
        "tamcop" to listOf("tamcop", "tamcop bank"),
        "tammerc" to listOf("tammerc", "tammerc bank"),
        "uco" to listOf("uco", "uco bank", "united commercial bank", "ucbar", "ucbac"),
        "union" to listOf("union", "union bank", "ubinr", "ubinc"),
        "utk" to listOf(
            "utk",
            "utk bank",
            "utkarsh small finance bank",
            "utkarsh small finance",
            "utksr"
        ),
        "yes" to listOf("yes", "yes bank", "yesbc", "yesbr")
    )
}

private fun getCardSchemeMapping(): Map<String, List<String>> {
    return mapOf(
        "amex" to listOf("amex"),
        "diners" to listOf("diners"),
        "discover" to listOf("discover"),
        "jcb" to listOf("jcb"),
        "maestro" to listOf("maestro"),
        "mastercard" to listOf("mastercard"),
        "rupay" to listOf("rupay"),
        "visa" to listOf("visa"),
    )
}

private fun getPayLaterMapping() : Map<String, List<String>> {
    return mapOf(
        "epaylater" to listOf("epaylater"),
        "freecharge" to listOf("freecharge", "freechargepaylater"),
        "hdfc" to listOf("hdfc", "hdfcpaylater"),
        "kotak" to listOf("kotak", "kotakpaylater"),
        "lazypay" to listOf("lazypay"),
        "olapostpaid" to listOf("olapostpaid"),
        "simpl" to listOf("simpl"),
        "zestmoneypaylater" to listOf("zestmoney", "zestmoneypaylater"),
    )
}

private fun getUPIMapping(): Map<String, List<String>>  {
    return mapOf(
        "bhim" to listOf("bhim", "upi"),
        "gpay" to listOf("gpay", "googlepay"),
        "paytm" to listOf("paytm"),
        "phonepe" to listOf("phonepe"),
        "whatsapp" to listOf("whatsapp"),
        "credpay" to listOf("cred", "credpay"),
    )
}

private fun getWalletMapping() : Map<String, List<String>> {
    return mapOf(
        "airtel" to listOf("airtel", "airtelmoney", "airpr"),
        "amazon" to listOf("amazon", "amazonpay"),
        "freecharge" to listOf("freecharge"),
        "jio" to listOf("jio", "jiomoney", "jiopr"),
        "mobikwik" to listOf("mobikwik"),
        "ola" to listOf("ola"),
        "paytm" to listOf("paytm"),
        "phonepe" to listOf("phonepe"),
        "paypal" to listOf("paypal"),
    )
}

private fun getCardLessMapping(): Map<String, List<String>>  {
    return mapOf("flexipay" to  listOf("flexipay"))
}