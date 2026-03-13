package o2;

import android.os.Build;
import n2.C1380a;
import r2.f;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1454a extends AbstractC1455b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18357e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1454a(p2.d dVar, int i3) {
        super(dVar);
        this.f18357e = i3;
    }

    @Override // o2.AbstractC1455b
    public final boolean a(f fVar) {
        switch (this.f18357e) {
            case 0:
                return fVar.j.f14719b;
            case 1:
                return fVar.j.f14721d;
            case 2:
                return fVar.j.f14718a == 2;
            case 3:
                int i3 = fVar.j.f14718a;
                return i3 == 3 || (Build.VERSION.SDK_INT >= 30 && i3 == 6);
            default:
                return fVar.j.f14722e;
        }
    }

    @Override // o2.AbstractC1455b
    public final boolean b(Object obj) {
        switch (this.f18357e) {
            case 2:
                C1380a c1380a = (C1380a) obj;
                if (!c1380a.f17795a || !c1380a.f17796b) {
                }
                break;
            case 3:
                C1380a c1380a2 = (C1380a) obj;
                if (!c1380a2.f17795a || c1380a2.f17797c) {
                }
                break;
        }
        return !((Boolean) obj).booleanValue();
    }
}
