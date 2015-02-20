package io.pacificbay;

import org.bitcoinj.core.Wallet;

import java.io.File;

/**
 * Created by bryanvu on 2/18/15.
 */

public class Account {

    public enum WalletType { FULL, WATCHING, MULTISIG }

    private Wallet wallet;

    private boolean isDefault = false;
    private String name;
    private File walletFile;

    WalletType type;

    public Account(Wallet wallet, String name, File walletFile, WalletType type, boolean isDefault) {
        this.wallet = wallet;
        this.name = name;
        this.walletFile = walletFile;
        this.type = type;
        this.isDefault = isDefault;
    }

    public void setDefault() {
        isDefault = true;
    }

    public void unsetDefault() {
        this.isDefault = false;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public File getWalletFile() {
        return walletFile;
    }
}
