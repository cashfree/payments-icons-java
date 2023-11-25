package com.cashfree.paymenticons


internal object Helper {
    private const val IMAGE_URL = "https://cashfreelogo.cashfree.com/assets_images/pg"
    private const val DEFAULT_URL =
        "https://cashfreelogo.cashfree.com/assets_images/pg/nb/svg/default.svg"

    internal fun getModesIcons(iconModes: IconModes, size: String): List<Icon> {
        val icons = mutableListOf<Icon>()
        val imageSize = getImageSize(size)
        val modeMapping: Map<String, List<String>>? = getNameMapping()[iconModes.mode]
        modeMapping?.let {
            it.keys.forEach { key ->
                val url =
                    "${IMAGE_URL}/${getPaymentModeMapping()[key]}/${getSizeMapping()[imageSize]}/${key}.${getImageType()[imageSize]}"
                icons.add(Icon(iconName = key, iconUrl = url))
            }
        }
        return icons
    }

    internal fun getIcons(nicks: List<String>, size: String): List<Icon> {
        val icons = mutableListOf<Icon>()
        nicks.forEach {
            icons.add(getIcon(it, size))
        }
        return icons
    }

    internal fun getIcon(nick: String, size: String): Icon {
        var icon = Icon(
            iconName = "default",
            iconUrl = DEFAULT_URL
        )
        if (nick.isEmpty()) return icon
        val imageSize = getImageSize(size)


        getNameMapping().forEach { (_, modeValue) ->
            modeValue.forEach { (key, value) ->
                if (value.contains(nick)) {
                    val url =
                        "${IMAGE_URL}/${getPaymentModeMapping()[key]}/${getSizeMapping()[imageSize]}/${key}.${getImageType()[imageSize]}"
                    icon = Icon(iconName = key, iconUrl = url)
                }
            }
        }
        return icon
    }
}