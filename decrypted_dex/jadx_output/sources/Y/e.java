package Y;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.C0472z;
import androidx.recyclerview.widget.M;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public int f8655a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8656b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8657c;

    public e(M m4) {
        this.f8655a = Integer.MIN_VALUE;
        this.f8657c = new Rect();
        this.f8656b = m4;
    }

    public static e a(M m4, int i3) {
        if (i3 == 0) {
            return new C0472z(m4, 0);
        }
        if (i3 == 1) {
            return new C0472z(m4, 1);
        }
        throw new IllegalArgumentException(StubApp.getString2(7461));
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i3);

    public e(g gVar) {
        this.f8655a = 0;
        this.f8657c = new c();
        this.f8656b = gVar;
    }
}
