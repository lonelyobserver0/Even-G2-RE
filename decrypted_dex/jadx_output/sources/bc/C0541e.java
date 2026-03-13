package bc;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bc.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class C0541e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10763a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10764b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10765c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10766d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10767e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10768f;

    /* renamed from: g, reason: collision with root package name */
    public final EnumC0537a f10769g;

    public C0541e(boolean z2, boolean z10, boolean z11, String prettyPrintIndent, String classDiscriminator, boolean z12, EnumC0537a classDiscriminatorMode) {
        Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
        Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
        Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
        this.f10763a = z2;
        this.f10764b = z10;
        this.f10765c = z11;
        this.f10766d = prettyPrintIndent;
        this.f10767e = classDiscriminator;
        this.f10768f = z12;
        this.f10769g = classDiscriminatorMode;
    }

    public final String toString() {
        return StubApp.getString2(25987) + this.f10763a + StubApp.getString2(25988) + this.f10764b + StubApp.getString2(25989) + this.f10765c + StubApp.getString2(25990) + this.f10766d + StubApp.getString2(25991) + this.f10767e + StubApp.getString2(25992) + this.f10768f + StubApp.getString2(25993) + this.f10769g + ')';
    }
}
