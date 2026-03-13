package T4;

import I4.e;
import S3.D;
import com.stub.StubApp;
import f4.C0882f;
import java.util.concurrent.ConcurrentHashMap;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile b f7173c;

    /* renamed from: a, reason: collision with root package name */
    public final C0882f f7174a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f7175b;

    public b(C0882f c0882f) {
        D.h(c0882f);
        this.f7174a = c0882f;
        this.f7175b = new ConcurrentHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0099, code lost:
    
        if (r8.equals(com.stub.StubApp.getString2(1186)) != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r8, java.lang.String r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.b.a(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public final e b(String str, V6.b bVar) {
        if (!U4.a.f7456c.contains(str)) {
            boolean isEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f7175b;
            if (isEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean equals = StubApp.getString2(6153).equals(str);
                C0882f c0882f = this.f7174a;
                Pb.a e02 = equals ? new E0(c0882f, bVar) : StubApp.getString2(56).equals(str) ? new F5.c(c0882f, bVar) : null;
                if (e02 != null) {
                    concurrentHashMap.put(str, e02);
                    return new e(20);
                }
            }
        }
        return null;
    }
}
