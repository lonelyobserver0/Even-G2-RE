package Q6;

import S6.f;
import Xa.h;
import com.stub.StubApp;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends P6.c {

    /* renamed from: e, reason: collision with root package name */
    public final String f5745e;

    public c(String layerId, String sourceId) {
        Intrinsics.checkNotNullParameter(layerId, "layerId");
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        this.f5745e = layerId;
        this.f5549a = sourceId;
    }

    @Override // P6.c
    public final String f() {
        return this.f5745e;
    }

    @Override // P6.c
    public final String g() {
        return StubApp.getString2(5295);
    }

    @Override // P6.c
    public final f h() {
        String value;
        String str = (String) P6.c.a(this);
        if (str == null) {
            return null;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = str.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        value = StringsKt__StringsJVMKt.replace$default(upperCase, '-', '_', false, 4, (Object) null);
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, "VISIBLE")) {
            return f.f6597b;
        }
        if (Intrinsics.areEqual(value, "NONE")) {
            return f.f6598c;
        }
        throw new RuntimeException(h.n(StubApp.getString2(4977), ']', value));
    }

    @Override // P6.c
    public final P6.c j(f visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        i(new R6.a("visibility", visibility));
        return this;
    }

    public final void k() {
        i(new R6.a(StubApp.getString2(5296), Boolean.TRUE));
    }

    public final void l(boolean z2) {
        i(new R6.a(StubApp.getString2(5297), Boolean.valueOf(z2)));
    }
}
