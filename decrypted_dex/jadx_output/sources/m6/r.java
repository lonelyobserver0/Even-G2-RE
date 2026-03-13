package m6;

import android.graphics.Rect;
import com.stub.StubApp;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final T5.c f17122a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17123b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17124c;

    /* renamed from: d, reason: collision with root package name */
    public Rect f17125d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17126e;

    public r(byte[] bArr, int i3, int i10, int i11, int i12) {
        this.f17122a = new T5.c(bArr, i3, i10);
        this.f17124c = i12;
        this.f17123b = i11;
        if (i3 * i10 <= bArr.length) {
            return;
        }
        StringBuilder l9 = AbstractC1482f.l(i3, StubApp.getString2(21088), i10, StubApp.getString2(925), StubApp.getString2(21089));
        l9.append(bArr.length);
        throw new IllegalArgumentException(l9.toString());
    }
}
