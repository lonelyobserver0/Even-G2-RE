package b3;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import e9.InterfaceC0853a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b3.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0507i implements InterfaceC0853a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0498N f10629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Style f10630c;

    public /* synthetic */ C0507i(C0498N c0498n, Style style, int i3) {
        this.f10628a = i3;
        this.f10629b = c0498n;
        this.f10630c = style;
    }

    @Override // e9.InterfaceC0853a
    public final void accept(Object obj) {
        Expected value = (Expected) obj;
        switch (this.f10628a) {
            case 0:
                Intrinsics.checkNotNullParameter(value, "value");
                x9.I i3 = this.f10629b.f10578l;
                if (i3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("routeLineView");
                    i3 = null;
                }
                i3.j(this.f10630c, value);
                R2.c.b(StubApp.getString2(103), StubApp.getString2(9167));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(value, "value");
                x9.I i10 = this.f10629b.f10578l;
                if (i10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("routeLineView");
                    i10 = null;
                }
                i10.i(this.f10630c, value);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(value, "value");
                x9.I i11 = this.f10629b.f10578l;
                if (i11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("routeLineView");
                    i11 = null;
                }
                i11.i(this.f10630c, value);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(value, "value");
                x9.I i12 = this.f10629b.f10578l;
                if (i12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("routeLineView");
                    i12 = null;
                }
                i12.j(this.f10630c, value);
                R2.c.b(StubApp.getString2(103), StubApp.getString2(9166));
                break;
            default:
                x9.I i13 = this.f10629b.f10578l;
                if (i13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("routeLineView");
                    i13 = null;
                }
                i13.i(this.f10630c, value);
                break;
        }
    }
}
