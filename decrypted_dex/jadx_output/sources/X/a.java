package X;

import com.stub.StubApp;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8220a = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        Object value = entry.getValue();
        return E1.a.n(new StringBuilder(StubApp.getString2(6127)), ((g) entry.getKey()).f8230a, StubApp.getString2(4978), value instanceof byte[] ? ArraysKt___ArraysKt.joinToString$default((byte[]) value, (CharSequence) StubApp.getString2(81), (CharSequence) StubApp.getString2(1557), (CharSequence) StubApp.getString2(511), 0, (CharSequence) null, (Function1) null, 56, (Object) null) : String.valueOf(entry.getValue()));
    }
}
