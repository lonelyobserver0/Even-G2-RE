package Bc;

import Kc.B;
import Kc.C0101h;
import Kc.InterfaceC0103j;
import da.F;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class h extends F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f762a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f763b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0103j f764c;

    public h(long j, C0101h c0101h) {
        this.f763b = j;
        this.f764c = c0101h;
    }

    @Override // da.F
    public final InterfaceC0103j I() {
        switch (this.f762a) {
            case 0:
                return (B) this.f764c;
            default:
                return (C0101h) this.f764c;
        }
    }

    @Override // da.F
    public final long a() {
        switch (this.f762a) {
        }
        return this.f763b;
    }

    public h(long j, B source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f763b = j;
        this.f764c = source;
    }
}
