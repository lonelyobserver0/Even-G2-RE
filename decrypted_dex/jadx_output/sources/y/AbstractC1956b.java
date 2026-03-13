package y;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.stub.StubApp;
import java.util.Arrays;
import java.util.HashMap;
import x.C1894a;
import x.C1897d;

/* renamed from: y.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1956b extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f23188a;

    /* renamed from: b, reason: collision with root package name */
    public int f23189b;

    /* renamed from: c, reason: collision with root package name */
    public Context f23190c;

    /* renamed from: d, reason: collision with root package name */
    public C1894a f23191d;

    private void setIds(String str) {
        if (str == null) {
            return;
        }
        int i3 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i3);
            if (indexOf == -1) {
                a(str.substring(i3));
                return;
            } else {
                a(str.substring(i3, indexOf));
                i3 = indexOf + 1;
            }
        }
    }

    public final void a(String str) {
        Context context;
        int i3;
        Object obj;
        if (str == null || (context = this.f23190c) == null) {
            return;
        }
        String trim = str.trim();
        try {
            i3 = AbstractC1961g.class.getField(trim).getInt(null);
        } catch (Exception unused) {
            i3 = 0;
        }
        if (i3 == 0) {
            i3 = context.getResources().getIdentifier(trim, StubApp.getString2(290), context.getPackageName());
        }
        if (i3 == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            if (trim != null) {
                HashMap hashMap = constraintLayout.f9629n;
                if (hashMap != null && hashMap.containsKey(trim)) {
                    obj = constraintLayout.f9629n.get(trim);
                    if (obj != null && (obj instanceof Integer)) {
                        i3 = ((Integer) obj).intValue();
                    }
                }
            } else {
                constraintLayout.getClass();
            }
            obj = null;
            if (obj != null) {
                i3 = ((Integer) obj).intValue();
            }
        }
        if (i3 != 0) {
            setTag(i3, null);
            return;
        }
        Log.w(StubApp.getString2(24556), StubApp.getString2(24555) + trim + StubApp.getString2(2123));
    }

    public final void b(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(null);
        }
        C1894a c1894a = this.f23191d;
        if (c1894a == null) {
            return;
        }
        c1894a.f22500j0 = 0;
        for (int i3 = 0; i3 < this.f23189b; i3++) {
            View view = (View) constraintLayout.f9618a.get(this.f23188a[i3]);
            if (view != null) {
                C1894a c1894a2 = this.f23191d;
                C1897d c10 = constraintLayout.c(view);
                int i10 = c1894a2.f22500j0 + 1;
                C1897d[] c1897dArr = c1894a2.f22499i0;
                if (i10 > c1897dArr.length) {
                    c1894a2.f22499i0 = (C1897d[]) Arrays.copyOf(c1897dArr, c1897dArr.length * 2);
                }
                C1897d[] c1897dArr2 = c1894a2.f22499i0;
                int i11 = c1894a2.f22500j0;
                c1897dArr2[i11] = c10;
                c1894a2.f22500j0 = i11 + 1;
            }
        }
    }

    public final void c() {
        if (this.f23191d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C1958d) {
            ((C1958d) layoutParams).f23236j0 = this.f23191d;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f23188a, this.f23189b);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setReferencedIds(int[] iArr) {
        this.f23189b = 0;
        for (int i3 : iArr) {
            setTag(i3, null);
        }
    }

    @Override // android.view.View
    public final void setTag(int i3, Object obj) {
        int i10 = this.f23189b + 1;
        int[] iArr = this.f23188a;
        if (i10 > iArr.length) {
            this.f23188a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f23188a;
        int i11 = this.f23189b;
        iArr2[i11] = i3;
        this.f23189b = i11 + 1;
    }
}
