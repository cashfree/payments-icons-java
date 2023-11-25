package com.cashfree.paymenticonsample;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import com.cashfree.paymenticons.Icon;
import com.cashfree.paymenticons.IconModes;
import com.cashfree.paymenticons.PaymentIcons;
import com.cashfree.paymenticonsample.databinding.MainActivityBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivityJava extends AppCompatActivity {

    private MainActivityBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initView();
    }


    private void initView() {
        setModesView();
        binding.btnFetch.setOnClickListener(v -> setImageAdapter(getIcons()));
        binding.btnFetchModes.setOnClickListener(v -> setImageAdapter(getModesIcon())
        );
    }

    private void setModesView() {
        ArrayList<String> modes = new ArrayList<>();
        modes.add("cardbanks");
        modes.add("cardschemes");
        modes.add("paylater");
        modes.add("upi");
        modes.add("wallet");
        modes.add("cardless");
        ArrayAdapter<String> modesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, modes);
        modesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinnerModes.setAdapter(modesAdapter);
    }

    private String getSize() {
        int radioId = binding.radioGroup.getCheckedRadioButtonId();
        String size;
        if (radioId == R.id.rd_small) size = "sm";
        else if (radioId == R.id.rd_medium) size = "md";
        else if (radioId == R.id.rd_large) size = "lg";
        else if (radioId == R.id.rd_svg) size = "svg";
        else size = "sm";
        return size;
    }


    private void setImageAdapter(List<Icon> icons) {
        ImageAdapter imageAdapter = new ImageAdapter(icons);
        binding.imageRecycler.setLayoutManager(new GridLayoutManager(this, 3));
        binding.imageRecycler.setAdapter(imageAdapter);
    }

    private List<Icon> getModesIcon() {
        String modeSelected = (String) binding.spinnerModes.getSelectedItem();
        String size = getSize();
        IconModes mode;
        switch (modeSelected) {
            case "cardbanks":
                mode = IconModes.CARD_BANK;
                break;
            case "cardschemes":
                mode = IconModes.CARD_SCHEME;
                break;
            case "paylater":
                mode = IconModes.PAYLATER;
                break;
            case "upi":
                mode = IconModes.UPI;
                break;
            case "wallet":
                mode = IconModes.WALLET;
                break;
            case "cardless":
                mode = IconModes.CARDLESS;
                break;
            default:
                mode = IconModes.CARD_BANK;
        }
        return new ArrayList<>(PaymentIcons.getModesLogo(mode, size));
    }

    private List<Icon> getIcons() {
        String size = getSize();
        List<Icon> icons = new ArrayList<>();
        String bankNames = binding.edtSearch.getText().toString();
        if (bankNames.contains(",")) {
            String[] nicks = bankNames.split(",");
            icons.addAll(PaymentIcons.getLogos(Arrays.asList(nicks), size));
        } else {
            icons.add(PaymentIcons.getLogo(bankNames, size));
        }
        return icons;
    }
}