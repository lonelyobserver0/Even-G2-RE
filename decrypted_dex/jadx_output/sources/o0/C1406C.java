package o0;

import com.stub.StubApp;
import java.io.IOException;
import p0.AbstractC1482f;

/* renamed from: o0.C, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class C1406C extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18021a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18022b;

    public C1406C(String str, Exception exc, boolean z2, int i3) {
        super(str, exc);
        this.f18021a = z2;
        this.f18022b = i3;
    }

    public static C1406C a(String str, RuntimeException runtimeException) {
        return new C1406C(str, runtimeException, true, 1);
    }

    public static C1406C b(String str, Exception exc) {
        return new C1406C(str, exc, true, 4);
    }

    public static C1406C c(String str) {
        return new C1406C(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append(StubApp.getString2(21519));
        sb2.append(this.f18021a);
        sb2.append(StubApp.getString2(21520));
        return AbstractC1482f.f(this.f18022b, StubApp.getString2(265), sb2);
    }
}
