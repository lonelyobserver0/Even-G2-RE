package com.google.android.gms.common;

import com.stub.StubApp;
import java.lang.ref.WeakReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p extends q {

    /* renamed from: i, reason: collision with root package name */
    public static final WeakReference f11209i = new WeakReference(null);

    /* renamed from: g, reason: collision with root package name */
    public WeakReference f11210g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11211h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(byte[] bArr, int i3) {
        super(bArr);
        this.f11211h = i3;
        this.f11210g = f11209i;
    }

    @Override // com.google.android.gms.common.q
    public final byte[] O() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f11210g.get();
                if (bArr == null) {
                    switch (this.f11211h) {
                        case 0:
                            bArr = q.N(StubApp.getString2("11547"));
                            break;
                        case 1:
                            bArr = q.N(StubApp.getString2("11546"));
                            break;
                        case 2:
                            bArr = q.N(StubApp.getString2("11545"));
                            break;
                        default:
                            bArr = q.N(StubApp.getString2("11544"));
                            break;
                    }
                    this.f11210g = new WeakReference(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr;
    }
}
