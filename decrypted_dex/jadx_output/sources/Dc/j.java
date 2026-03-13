package Dc;

import com.stub.StubApp;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class j extends zc.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1589f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1590g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, Object obj, Object obj2, int i3) {
        super(str, true);
        this.f1588e = i3;
        this.f1589f = obj;
        this.f1590g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [Dc.E, T] */
    @Override // zc.a
    public final long a() {
        long a3;
        z[] zVarArr;
        int i3 = 0;
        switch (this.f1588e) {
            case 0:
                r rVar = (r) this.f1589f;
                rVar.f1618a.a(rVar, (E) ((Ref.ObjectRef) this.f1590g).element);
                return -1L;
            case 1:
                try {
                    ((r) this.f1589f).f1618a.b((z) this.f1590g);
                } catch (IOException e10) {
                    Ec.n nVar = Ec.n.f2161a;
                    Ec.n nVar2 = Ec.n.f2161a;
                    String stringPlus = Intrinsics.stringPlus("Http2Connection.Listener failure for ", ((r) this.f1589f).f1620c);
                    nVar2.getClass();
                    Ec.n.i(stringPlus, 4, e10);
                    try {
                        ((z) this.f1590g).c(EnumC0053b.f1550c, e10);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                l lVar = (l) this.f1589f;
                E settings = (E) this.f1590g;
                Intrinsics.checkNotNullParameter(settings, "settings");
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                r rVar2 = lVar.f1595b;
                synchronized (rVar2.f1615A) {
                    synchronized (rVar2) {
                        try {
                            E e11 = rVar2.f1634t;
                            ?? e12 = new E();
                            e12.b(e11);
                            e12.b(settings);
                            objectRef.element = e12;
                            a3 = e12.a() - e11.a();
                            if (a3 != 0 && !rVar2.f1619b.isEmpty()) {
                                Object[] array = rVar2.f1619b.values().toArray(new z[0]);
                                if (array == null) {
                                    throw new NullPointerException(StubApp.getString2("11601"));
                                }
                                zVarArr = (z[]) array;
                                E e13 = (E) objectRef.element;
                                Intrinsics.checkNotNullParameter(e13, "<set-?>");
                                rVar2.f1634t = e13;
                                rVar2.f1626k.c(new j(Intrinsics.stringPlus(rVar2.f1620c, " onSettings"), rVar2, objectRef, i3), 0L);
                                Unit unit = Unit.INSTANCE;
                            }
                            zVarArr = null;
                            E e132 = (E) objectRef.element;
                            Intrinsics.checkNotNullParameter(e132, "<set-?>");
                            rVar2.f1634t = e132;
                            rVar2.f1626k.c(new j(Intrinsics.stringPlus(rVar2.f1620c, " onSettings"), rVar2, objectRef, i3), 0L);
                            Unit unit2 = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        rVar2.f1615A.a((E) objectRef.element);
                    } catch (IOException e14) {
                        rVar2.d(e14);
                    }
                    Unit unit3 = Unit.INSTANCE;
                }
                if (zVarArr != null) {
                    int length = zVarArr.length;
                    while (i3 < length) {
                        z zVar = zVarArr[i3];
                        i3++;
                        synchronized (zVar) {
                            zVar.f1674f += a3;
                            if (a3 > 0) {
                                zVar.notifyAll();
                            }
                            Unit unit4 = Unit.INSTANCE;
                        }
                    }
                }
                return -1L;
        }
    }
}
