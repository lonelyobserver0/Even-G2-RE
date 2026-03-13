package androidx.media;

import V1.a;
import android.media.AudioAttributes;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f9953a = (AudioAttributes) aVar.g(audioAttributesImplApi26.f9953a, 1);
        audioAttributesImplApi26.f9954b = aVar.f(audioAttributesImplApi26.f9954b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, a aVar) {
        aVar.getClass();
        aVar.k(audioAttributesImplApi26.f9953a, 1);
        aVar.j(audioAttributesImplApi26.f9954b, 2);
    }
}
