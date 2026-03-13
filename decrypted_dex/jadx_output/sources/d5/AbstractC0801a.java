package d5;

import a0.C0379a;
import java.util.concurrent.atomic.AtomicBoolean;
import q4.j;
import q4.k;
import q4.n;
import q4.s;

/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC0801a {

    /* renamed from: a, reason: collision with root package name */
    public static final G1.c f13413a = new G1.c(0);

    public static s a(j jVar, j jVar2) {
        C0379a c0379a = new C0379a(22);
        k kVar = new k((n) c0379a.f9233b);
        C2.e eVar = new C2.e(kVar, new AtomicBoolean(false), c0379a, 10);
        G1.c cVar = f13413a;
        jVar.continueWithTask(cVar, eVar);
        jVar2.continueWithTask(cVar, eVar);
        return kVar.f20051a;
    }
}
