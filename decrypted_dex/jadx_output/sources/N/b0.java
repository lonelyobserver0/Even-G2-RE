package N;

import android.view.WindowInsets;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class b0 {
    public static int a(int i3) {
        int statusBars;
        int i10 = 0;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i3 & i11) != 0) {
                if (i11 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i11 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i11 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i11 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i11 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i11 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i11 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i11 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                } else if (i11 == 512) {
                    statusBars = WindowInsets.Type.systemOverlays();
                }
                i10 |= statusBars;
            }
        }
        return i10;
    }
}
