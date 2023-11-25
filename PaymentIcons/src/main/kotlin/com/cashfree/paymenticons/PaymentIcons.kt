package com.cashfree.paymenticons

import com.cashfree.paymenticons.Helper.getIcon
import com.cashfree.paymenticons.Helper.getIcons
import com.cashfree.paymenticons.Helper.getModesIcons

object PaymentIcons {

    @JvmStatic
    fun getModesLogo(mode: IconModes, size: String): List<Icon> {
        return getModesIcons(mode, size)
    }

    @JvmStatic
    fun getLogos(nicks: List<String>, size: String): List<Icon> {
        return getIcons(nicks, size)
    }

    @JvmStatic
    fun getLogo(nick: String, size: String): Icon {
        return getIcon(nick, size)
    }

}

enum class IconModes(val mode: String) {
    CARD_BANK("cardbanks"),
    CARD_SCHEME("cardschemes"),
    PAYLATER("paylater"),
    UPI("upi"),
    WALLET("wallet"),
    CARDLESS("cardless")
}

data class Icon(
    val iconName: String,
    val iconUrl: String
)