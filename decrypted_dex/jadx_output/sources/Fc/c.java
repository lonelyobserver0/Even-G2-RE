package Fc;

import com.stub.StubApp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import wc.x;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f2355a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2356b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = x.class.getPackage();
        String name = r22 == null ? null : r22.getName();
        if (name != null) {
            linkedHashMap.put(name, StubApp.getString2(25277));
        }
        String name2 = x.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, StubApp.getString2(25278));
        String name3 = Dc.g.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, StubApp.getString2(25279));
        String name4 = zc.c.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, StubApp.getString2(25280));
        linkedHashMap.put(StubApp.getString2(25281), StubApp.getString2(25282));
        f2356b = MapsKt.toMap(linkedHashMap);
    }
}
