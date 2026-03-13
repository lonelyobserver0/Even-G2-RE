package Dc;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class n extends zc.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1600e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r f1601f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1602g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f1603h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, r rVar, int i3, List list) {
        super(str, true);
        this.f1601f = rVar;
        this.f1602g = i3;
        this.f1603h = list;
    }

    @Override // zc.a
    public final long a() {
        switch (this.f1600e) {
            case 0:
                D d8 = this.f1601f.f1627l;
                List responseHeaders = this.f1603h;
                d8.getClass();
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                try {
                    this.f1601f.f1615A.v(this.f1602g, EnumC0053b.f1554g);
                    synchronized (this.f1601f) {
                        this.f1601f.f1617C.remove(Integer.valueOf(this.f1602g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                D d10 = this.f1601f.f1627l;
                List requestHeaders = this.f1603h;
                d10.getClass();
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                try {
                    this.f1601f.f1615A.v(this.f1602g, EnumC0053b.f1554g);
                    synchronized (this.f1601f) {
                        this.f1601f.f1617C.remove(Integer.valueOf(this.f1602g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, r rVar, int i3, List list, boolean z2) {
        super(str, true);
        this.f1601f = rVar;
        this.f1602g = i3;
        this.f1603h = list;
    }
}
