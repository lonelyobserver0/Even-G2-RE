package C;

import android.media.AudioAttributes;

/* renamed from: C.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0035l {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i3) {
        return builder.setContentType(i3);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i3) {
        return builder.setUsage(i3);
    }
}
