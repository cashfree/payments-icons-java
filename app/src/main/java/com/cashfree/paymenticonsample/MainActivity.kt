package com.cashfree.paymenticonsample

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.cashfree.paymenticons.Icon
import com.cashfree.paymenticons.IconModes
import com.cashfree.paymenticons.PaymentIcons
import com.cashfree.paymenticonsample.databinding.MainActivityBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        setModesView()
        binding.btnFetch.setOnClickListener {
            setImageAdapter(getIcons())
        }

        binding.btnFetchModes.setOnClickListener {
            setImageAdapter(getModesIcon())
        }
    }

    private fun setModesView() {
        val modes =
            arrayListOf("cardbanks", "cardschemes", "paylater", "upi", "wallet", "cardless")
        val modesAdapter: ArrayAdapter<String> = ArrayAdapter<String>(
            this@MainActivity,
            android.R.layout.simple_spinner_item, modes
        )

        modesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinnerModes.adapter = modesAdapter
    }

    private fun getSize(): String {
        val radioId = binding.radioGroup.checkedRadioButtonId
        var size = "sm"
        when (radioId) {
            R.id.rd_small -> size = "sm"
            R.id.rd_medium -> size = "md"
            R.id.rd_large -> size = "lg"
            R.id.rd_svg -> size = "svg"
        }
        return size
    }


    private fun setImageAdapter(icons: List<Icon>) {
        val imageAdapter: ImageAdapter = ImageAdapter(icons)
        binding.imageRecycler.layoutManager = GridLayoutManager(this, 3)
        binding.imageRecycler.adapter = imageAdapter
    }

    private fun getModesIcon(): List<Icon> {
        val modeSelected = binding.spinnerModes.selectedItem
        val size = getSize()
        val icons = mutableListOf<Icon>()
        var mode = IconModes.CARD_BANK
        when (modeSelected) {
            "cardbanks" -> mode = IconModes.CARD_BANK
            "cardschemes" -> mode = IconModes.CARD_SCHEME
            "paylater" -> mode = IconModes.PAYLATER
            "upi" -> mode = IconModes.UPI
            "wallet" -> mode = IconModes.WALLET
            "cardless" -> mode = IconModes.CARDLESS
            else -> IconModes.CARD_BANK
        }
        icons.addAll(PaymentIcons.getModesLogo(mode, size))
        return icons
    }

    private fun getIcons(): List<Icon> {
        val size = getSize()
        val icons = mutableListOf<Icon>()
        val bankNames = binding.edtSearch.text.toString()
        if (bankNames.isNotEmpty() && bankNames.contains(",")) {
            val nicks = bankNames.split(",")
            icons.addAll(PaymentIcons.getLogos(nicks, size))
        } else {
            icons.add(PaymentIcons.getLogo(bankNames, size))
        }
        return icons
    }
}