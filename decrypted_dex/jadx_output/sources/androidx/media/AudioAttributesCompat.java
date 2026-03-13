package androidx.media;

import V1.c;
import android.util.SparseIntArray;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class AudioAttributesCompat implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9951b = 0;

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f9952a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public static int b(int i3, int i10) {
        if ((i3 & 1) == 1) {
            return 7;
        }
        if ((i3 & 4) == 4) {
            return 6;
        }
        switch (i10) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f9952a;
        return audioAttributesImpl == null ? audioAttributesCompat.f9952a == null : audioAttributesImpl.equals(audioAttributesCompat.f9952a);
    }

    public final int hashCode() {
        return this.f9952a.hashCode();
    }

    public final String toString() {
        return this.f9952a.toString();
    }
}
