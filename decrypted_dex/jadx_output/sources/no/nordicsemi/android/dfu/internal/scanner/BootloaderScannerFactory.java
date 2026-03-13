package no.nordicsemi.android.dfu.internal.scanner;

import com.stub.StubApp;
import java.util.Locale;
import java.util.UUID;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class BootloaderScannerFactory {
    private static final int ADDRESS_DIFF = 1;

    private BootloaderScannerFactory() {
    }

    public static String getIncrementedAddress(String str) {
        String substring = str.substring(0, 15);
        String substring2 = str.substring(15);
        return AbstractC1482f.g(substring, String.format(Locale.US, StubApp.getString2(26682), Integer.valueOf((Integer.valueOf(substring2, 16).intValue() + 1) & 255)));
    }

    public static BootloaderScanner getScanner(String str, UUID uuid) {
        return new BootloaderScannerLollipop(str, getIncrementedAddress(str), uuid);
    }
}
