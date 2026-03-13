package androidx.media;

import V1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f9955a = aVar.f(audioAttributesImplBase.f9955a, 1);
        audioAttributesImplBase.f9956b = aVar.f(audioAttributesImplBase.f9956b, 2);
        audioAttributesImplBase.f9957c = aVar.f(audioAttributesImplBase.f9957c, 3);
        audioAttributesImplBase.f9958d = aVar.f(audioAttributesImplBase.f9958d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f9955a, 1);
        aVar.j(audioAttributesImplBase.f9956b, 2);
        aVar.j(audioAttributesImplBase.f9957c, 3);
        aVar.j(audioAttributesImplBase.f9958d, 4);
    }
}
