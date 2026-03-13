package androidx.media;

import V1.a;
import V1.c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        c cVar = audioAttributesCompat.f9952a;
        if (aVar.e(1)) {
            cVar = aVar.h();
        }
        audioAttributesCompat.f9952a = (AudioAttributesImpl) cVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f9952a;
        aVar.i(1);
        aVar.l(audioAttributesImpl);
    }
}
