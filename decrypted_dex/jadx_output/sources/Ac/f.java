package Ac;

import Dc.C0052a;
import Dc.EnumC0053b;
import Dc.F;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import wc.C1884a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f320a;

    /* renamed from: b, reason: collision with root package name */
    public int f321b;

    /* renamed from: c, reason: collision with root package name */
    public int f322c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f323d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f324e;

    /* renamed from: f, reason: collision with root package name */
    public final Cloneable f325f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f326g;

    /* renamed from: h, reason: collision with root package name */
    public Object f327h;

    /* renamed from: i, reason: collision with root package name */
    public Object f328i;
    public Object j;

    public f(byte[] bArr, String str, String str2) {
        this(bArr, str, null, str2, -1, -1, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0339 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Ac.o a(int r15, int r16, int r17, int r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ac.f.a(int, int, int, int, boolean, boolean):Ac.o");
    }

    public boolean b(wc.t url) {
        Intrinsics.checkNotNullParameter(url, "url");
        wc.t tVar = ((C1884a) this.f324e).f22354h;
        return url.f22422e == tVar.f22422e && Intrinsics.areEqual(url.f22421d, tVar.f22421d);
    }

    public void c(IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.j = null;
        if ((e10 instanceof F) && ((F) e10).f1548a == EnumC0053b.f1553f) {
            this.f320a++;
        } else if (e10 instanceof C0052a) {
            this.f321b++;
        } else {
            this.f322c++;
        }
    }

    public f(q connectionPool, C1884a address, j call, wc.q eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f323d = connectionPool;
        this.f324e = address;
        this.f325f = call;
        this.f326g = eventListener;
    }

    public f(byte[] bArr, String str, ArrayList arrayList, String str2, int i3, int i10, int i11) {
        this.f323d = bArr;
        this.f324e = str;
        this.f325f = arrayList;
        this.f326g = str2;
        this.f320a = i10;
        this.f321b = i3;
        this.f322c = i11;
    }
}
