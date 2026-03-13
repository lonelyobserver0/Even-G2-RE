package m0;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.os.Handler;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImplApi26;
import java.util.Objects;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1263b {

    /* renamed from: g, reason: collision with root package name */
    public static final AudioAttributesCompat f16998g;

    /* renamed from: a, reason: collision with root package name */
    public final int f16999a;

    /* renamed from: b, reason: collision with root package name */
    public final Q9.b f17000b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f17001c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioAttributesCompat f17002d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f17003e;

    /* renamed from: f, reason: collision with root package name */
    public final AudioFocusRequest f17004f;

    static {
        int i3 = AudioAttributesCompat.f9951b;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setUsage(1);
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26(builder.build());
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f9952a = audioAttributesImplApi26;
        f16998g = audioAttributesCompat;
    }

    public C1263b(int i3, Q9.b bVar, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z2) {
        this.f16999a = i3;
        this.f17001c = handler;
        this.f17002d = audioAttributesCompat;
        this.f17003e = z2;
        this.f17000b = bVar;
        this.f17004f = AbstractC1262a.a(i3, audioAttributesCompat != null ? (AudioAttributes) audioAttributesCompat.f9952a.a() : null, z2, bVar, handler);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1263b)) {
            return false;
        }
        C1263b c1263b = (C1263b) obj;
        return this.f16999a == c1263b.f16999a && this.f17003e == c1263b.f17003e && this.f17000b.equals(c1263b.f17000b) && this.f17001c.equals(c1263b.f17001c) && Objects.equals(this.f17002d, c1263b.f17002d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f16999a), this.f17000b, this.f17001c, this.f17002d, Boolean.valueOf(this.f17003e));
    }
}
