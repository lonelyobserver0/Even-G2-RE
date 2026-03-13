package Ac;

import com.stub.StubApp;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import wc.C1881F;
import wc.u;
import wc.x;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a implements u {

    /* renamed from: a, reason: collision with root package name */
    public static final a f296a = new a();

    @Override // wc.u
    public final C1881F a(Bc.g chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        j jVar = chain.f753a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (jVar) {
            if (!jVar.f347q) {
                throw new IllegalStateException(StubApp.getString2("24931"));
            }
            if (jVar.f346p) {
                throw new IllegalStateException(StubApp.getString2("6068"));
            }
            if (jVar.f345n) {
                throw new IllegalStateException(StubApp.getString2("6068"));
            }
            Unit unit = Unit.INSTANCE;
        }
        f fVar = jVar.j;
        Intrinsics.checkNotNull(fVar);
        x client = jVar.f334a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            e eVar = new e(jVar, jVar.f338e, fVar, fVar.a(chain.f758f, chain.f759g, chain.f760h, client.f22460B, client.f22468f, !Intrinsics.areEqual(chain.f757e.f22494b, "GET")).j(client, chain));
            jVar.f344m = eVar;
            jVar.f349s = eVar;
            synchronized (jVar) {
                jVar.f345n = true;
                jVar.f346p = true;
            }
            if (jVar.f348r) {
                throw new IOException(StubApp.getString2(13498));
            }
            return Bc.g.a(chain, 0, eVar, null, 61).b(chain.f757e);
        } catch (r e10) {
            fVar.c(e10.f386b);
            throw e10;
        } catch (IOException e11) {
            fVar.c(e11);
            throw new r(e11);
        }
    }
}
