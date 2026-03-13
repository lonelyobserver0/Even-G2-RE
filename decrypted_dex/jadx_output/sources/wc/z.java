package wc;

import com.stub.StubApp;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final t f22493a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22494b;

    /* renamed from: c, reason: collision with root package name */
    public final s f22495c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1879D f22496d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f22497e;

    /* renamed from: f, reason: collision with root package name */
    public C1886c f22498f;

    public z(t url, String method, s headers, AbstractC1879D abstractC1879D, Map tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f22493a = url;
        this.f22494b = method;
        this.f22495c = headers;
        this.f22496d = abstractC1879D;
        this.f22497e = tags;
    }

    public final String a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f22495c.a(name);
    }

    public final B3.s b() {
        Intrinsics.checkNotNullParameter(this, "request");
        B3.s sVar = new B3.s(false);
        sVar.f654f = new LinkedHashMap();
        sVar.f651c = this.f22493a;
        sVar.f650b = this.f22494b;
        sVar.f653e = this.f22496d;
        Map map = this.f22497e;
        sVar.f654f = map.isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(map);
        sVar.f652d = this.f22495c.c();
        return sVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(35597));
        sb2.append(this.f22494b);
        sb2.append(StubApp.getString2(9615));
        sb2.append(this.f22493a);
        s sVar = this.f22495c;
        if (sVar.size() != 0) {
            sb2.append(StubApp.getString2(35598));
            int i3 = 0;
            for (Object obj : sVar) {
                int i10 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (i3 > 0) {
                    sb2.append(StubApp.getString2(81));
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i3 = i10;
            }
            sb2.append(']');
        }
        Map map = this.f22497e;
        if (!map.isEmpty()) {
            sb2.append(StubApp.getString2(35599));
            sb2.append(map);
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
