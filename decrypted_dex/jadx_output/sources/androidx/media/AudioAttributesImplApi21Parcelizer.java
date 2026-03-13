package androidx.media;

import V1.a;
import android.media.AudioAttributes;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f9953a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f9953a, 1);
        audioAttributesImplApi21.f9954b = aVar.f(audioAttributesImplApi21.f9954b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        aVar.k(audioAttributesImplApi21.f9953a, 1);
        aVar.j(audioAttributesImplApi21.f9954b, 2);
    }
}
