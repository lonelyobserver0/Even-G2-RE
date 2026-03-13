package Kc;

import com.stub.StubApp;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class K extends o {

    /* renamed from: e, reason: collision with root package name */
    public static final y f3793e;

    /* renamed from: b, reason: collision with root package name */
    public final y f3794b;

    /* renamed from: c, reason: collision with root package name */
    public final t f3795c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f3796d;

    static {
        String str = y.f3858b;
        f3793e = C2.i.v(StubApp.getString2(601), false);
    }

    public K(y zipPath, t fileSystem, Map entries) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f3794b = zipPath;
        this.f3795c = fileSystem;
        this.f3796d = entries;
    }

    @Override // Kc.o
    public final n b(y child) {
        n nVar;
        Throwable th;
        Intrinsics.checkNotNullParameter(child, "path");
        y yVar = f3793e;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        Lc.h hVar = (Lc.h) this.f3796d.get(Lc.c.b(yVar, child, true));
        Throwable th2 = null;
        if (hVar == null) {
            return null;
        }
        boolean z2 = hVar.f4412b;
        n basicMetadata = new n(!z2, z2, z2 ? null : Long.valueOf(hVar.f4413c), null, hVar.f4414d, null);
        long j = hVar.f4415e;
        if (j == -1) {
            return basicMetadata;
        }
        s e10 = this.f3795c.e(this.f3794b);
        try {
            B d8 = AbstractC0095b.d(e10.e(j));
            try {
                Intrinsics.checkNotNullParameter(d8, "<this>");
                Intrinsics.checkNotNullParameter(basicMetadata, "basicMetadata");
                nVar = Lc.k.e(d8, basicMetadata);
                Intrinsics.checkNotNull(nVar);
                try {
                    d8.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    d8.close();
                } catch (Throwable th5) {
                    ExceptionsKt.addSuppressed(th4, th5);
                }
                th = th4;
                nVar = null;
            }
        } catch (Throwable th6) {
            try {
                e10.close();
            } catch (Throwable th7) {
                ExceptionsKt.addSuppressed(th6, th7);
            }
            nVar = null;
            th2 = th6;
        }
        if (th != null) {
            throw th;
        }
        Intrinsics.checkNotNull(nVar);
        try {
            e10.close();
        } catch (Throwable th8) {
            th2 = th8;
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.checkNotNull(nVar);
        return nVar;
    }
}
