package androidx.media;

import android.media.AudioAttributes;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f9953a;

    /* renamed from: b, reason: collision with root package name */
    public int f9954b = -1;

    public AudioAttributesImplApi21() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object a() {
        return this.f9953a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f9953a.equals(((AudioAttributesImplApi21) obj).f9953a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9953a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f9953a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f9953a = audioAttributes;
    }
}
