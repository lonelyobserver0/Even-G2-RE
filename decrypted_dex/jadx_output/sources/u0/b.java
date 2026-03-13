package u0;

import android.media.MediaCodec;
import r0.AbstractC1560u;
import s.C1590a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f21385a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f21386b;

    /* renamed from: c, reason: collision with root package name */
    public int f21387c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f21388d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f21389e;

    /* renamed from: f, reason: collision with root package name */
    public int f21390f;

    /* renamed from: g, reason: collision with root package name */
    public int f21391g;

    /* renamed from: h, reason: collision with root package name */
    public int f21392h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f21393i;
    public final C1590a j;

    public b() {
        C1590a c1590a;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f21393i = cryptoInfo;
        if (AbstractC1560u.f20190a >= 24) {
            c1590a = new C1590a();
            c1590a.f20574a = cryptoInfo;
            c1590a.f20575b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        } else {
            c1590a = null;
        }
        this.j = c1590a;
    }
}
