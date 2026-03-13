package Vb;

import com.stub.StubApp;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* renamed from: Vb.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class AbstractC0358d {

    /* renamed from: a, reason: collision with root package name */
    public static final F5.c f7938a = new F5.c(StubApp.getString2(25756), 24);

    public static final Object a(v vVar, long j, Function2 function2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (vVar.f7972c >= j && !vVar.c()) {
                return vVar;
            }
            Object obj = e.f7939a.get(vVar);
            F5.c cVar = f7938a;
            if (obj == cVar) {
                return cVar;
            }
            v vVar2 = (v) ((e) obj);
            if (vVar2 == null) {
                vVar2 = (v) function2.invoke(Long.valueOf(vVar.f7972c + 1), vVar);
                do {
                    atomicReferenceFieldUpdater = e.f7939a;
                    if (atomicReferenceFieldUpdater.compareAndSet(vVar, null, vVar2)) {
                        if (vVar.c()) {
                            vVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(vVar) == null);
            }
            vVar = vVar2;
        }
    }
}
