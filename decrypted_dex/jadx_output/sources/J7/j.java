package J7;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final j f3434b = new j(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final j f3435c = new j(1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3436a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i3, int i10) {
        super(i3);
        this.f3436a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        r7 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r0, null, null, null, 0, null, J7.j.f3434b, 31, null);
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f3436a
            switch(r0) {
                case 0: goto L1e;
                default: goto L5;
            }
        L5:
            com.mapbox.api.directions.v5.models.RouteLeg r7 = (com.mapbox.api.directions.v5.models.RouteLeg) r7
            java.util.List r0 = r7.steps()
            if (r0 == 0) goto L1b
            r3 = 0
            r5 = 31
            r1 = 0
            r2 = 0
            J7.j r4 = J7.j.f3434b
            java.lang.String r7 = kotlin.collections.CollectionsKt.m(r0, r1, r2, r3, r4, r5)
            if (r7 == 0) goto L1b
            goto L1d
        L1b:
            java.lang.String r7 = ""
        L1d:
            return r7
        L1e:
            com.mapbox.api.directions.v5.models.LegStep r7 = (com.mapbox.api.directions.v5.models.LegStep) r7
            java.lang.String r7 = r7.name()
            if (r7 != 0) goto L28
            java.lang.String r7 = ""
        L28:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: J7.j.invoke(java.lang.Object):java.lang.Object");
    }
}
