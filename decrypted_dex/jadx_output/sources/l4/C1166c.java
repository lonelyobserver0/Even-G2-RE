package l4;

import java.util.HashSet;
import t.C1692e;

/* renamed from: l4.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1166c extends A1 {

    /* renamed from: d, reason: collision with root package name */
    public String f16395d;

    /* renamed from: e, reason: collision with root package name */
    public HashSet f16396e;

    /* renamed from: f, reason: collision with root package name */
    public C1692e f16397f;

    /* renamed from: g, reason: collision with root package name */
    public Long f16398g;

    /* renamed from: h, reason: collision with root package name */
    public Long f16399h;

    @Override // l4.A1
    public final void n() {
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final java.util.ArrayList o(java.lang.String r35, java.util.List r36, java.util.List r37, java.lang.Long r38, java.lang.Long r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 2933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1166c.o(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    public final N1 p(Integer num) {
        if (this.f16397f.containsKey(num)) {
            return (N1) this.f16397f.get(num);
        }
        N1 n12 = new N1(this, this.f16395d);
        this.f16397f.put(num, n12);
        return n12;
    }
}
