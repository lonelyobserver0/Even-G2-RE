package T6;

import com.stub.StubApp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f7215a = new b(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        R6.a propertyValue = (R6.a) obj;
        Intrinsics.checkNotNullParameter(propertyValue, "propertyValue");
        return propertyValue.f6223a + StubApp.getString2(4978) + propertyValue.f6225c;
    }
}
