package R6;

import a.AbstractC0378a;
import com.mapbox.bindgen.Value;
import com.stub.StubApp;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f6223a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6224b;

    /* renamed from: c, reason: collision with root package name */
    public final Value f6225c;

    public a(String propertyName, Object obj) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        this.f6223a = propertyName;
        this.f6224b = obj;
        try {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
            this.f6225c = AbstractC0378a.H(obj);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(StubApp.getString2(5740) + this.f6223a + StubApp.getString2(994) + e10.getMessage(), e10.getCause());
        }
    }

    public final String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(StubApp.getString2(423), Arrays.copyOf(new Object[]{this.f6223a, this.f6224b}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }
}
