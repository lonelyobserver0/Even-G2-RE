package n7;

import X6.f;
import X6.s;
import android.graphics.Color;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n7.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1392b {

    /* renamed from: a, reason: collision with root package name */
    public f f17854a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17855b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17856c;

    /* renamed from: d, reason: collision with root package name */
    public int f17857d;

    /* renamed from: e, reason: collision with root package name */
    public float f17858e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17859f;

    /* renamed from: g, reason: collision with root package name */
    public int f17860g;

    /* renamed from: h, reason: collision with root package name */
    public int f17861h;

    /* renamed from: i, reason: collision with root package name */
    public String f17862i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17863k;

    /* renamed from: l, reason: collision with root package name */
    public s f17864l;

    /* renamed from: m, reason: collision with root package name */
    public String f17865m;

    public C1392b(f locationPuck) {
        Intrinsics.checkNotNullParameter(locationPuck, "locationPuck");
        this.f17854a = locationPuck;
        this.f17857d = Color.parseColor(StubApp.getString2(21444));
        this.f17858e = 10.0f;
        String string2 = StubApp.getString2(21445);
        this.f17860g = Color.parseColor(string2);
        this.f17861h = Color.parseColor(string2);
        this.f17864l = s.f8472a;
    }

    public final C1393c a() {
        return new C1393c(this.f17855b, this.f17856c, this.f17857d, this.f17858e, this.f17859f, this.f17860g, this.f17861h, this.f17862i, this.j, this.f17863k, this.f17864l, this.f17865m, this.f17854a);
    }
}
