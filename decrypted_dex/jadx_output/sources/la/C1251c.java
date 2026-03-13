package la;

import com.stub.StubApp;
import java.util.concurrent.ConcurrentHashMap;
import p0.AbstractC1482f;

/* renamed from: la.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1251c {

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f16836c = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f16837a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f16838b;

    public C1251c(String str) {
        this.f16837a = str;
        if (str.startsWith(StubApp.getString2(601))) {
            throw new IllegalArgumentException(E1.a.k(StubApp.getString2(21032), str, StubApp.getString2(620)));
        }
    }

    public static C1251c a(String str) {
        if (str.equals(StubApp.getString2(4673)) || StubApp.getString2(4744).equals(str)) {
            return new C1251c(str);
        }
        ConcurrentHashMap concurrentHashMap = f16836c;
        C1251c c1251c = (C1251c) concurrentHashMap.get(str);
        return (c1251c == null && (c1251c = (C1251c) concurrentHashMap.putIfAbsent(str, new C1251c(str))) == null) ? (C1251c) concurrentHashMap.get(str) : c1251c;
    }

    public final String toString() {
        return AbstractC1482f.k(new StringBuilder(StubApp.getString2(21033)), this.f16837a, StubApp.getString2(265));
    }
}
