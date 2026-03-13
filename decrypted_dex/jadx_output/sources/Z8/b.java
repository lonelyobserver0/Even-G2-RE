package Z8;

import com.mapbox.navigator.RouteAlternative;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f9043a = new b(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return String.valueOf(((RouteAlternative) obj).getId());
    }
}
