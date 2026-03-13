package D4;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.stub.StubApp;
import l.C1132c;
import r4.AbstractC1567a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1334a = {2130903242};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1335b = {2130903245};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1336c = {R.attr.theme, 2130903946};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1337d = {2130903712};

    public static void a(Context context, AttributeSet attributeSet, int i3, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1567a.f20341u, i3, i10);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z2) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(2130903440, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f1335b, StubApp.getString2(1295));
            }
        }
        c(context, f1334a, StubApp.getString2(1296));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = r4.AbstractC1567a.f20341u
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r10.length
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L1f
            int r5 = r0.getResourceId(r2, r4)
            if (r5 == r4) goto L3a
        L1d:
            r2 = r3
            goto L3a
        L1f:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = r2
        L25:
            if (r7 >= r6) goto L36
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r4)
            if (r8 != r4) goto L33
            r5.recycle()
            goto L3a
        L33:
            int r7 = r7 + 1
            goto L25
        L36:
            r5.recycle()
            goto L1d
        L3a:
            r0.recycle()
            if (r2 == 0) goto L40
            return
        L40:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r6 = 1297(0x511, float:1.817E-42)
            java.lang.String r6 = com.stub.StubApp.getString2(r6)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.j.b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (!obtainStyledAttributes.hasValue(i3)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(E1.a.k(StubApp.getString2(1298), str, StubApp.getString2(1299)));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static Context d(Context context, AttributeSet attributeSet, int i3, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1337d, i3, i10);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (resourceId == 0 || ((context instanceof C1132c) && ((C1132c) context).f15649a == resourceId)) {
            return context;
        }
        C1132c c1132c = new C1132c(context, resourceId);
        TypedArray obtainStyledAttributes2 = c1132c.obtainStyledAttributes(attributeSet, f1336c);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        return resourceId2 != 0 ? new C1132c(c1132c, resourceId2) : c1132c;
    }

    public static PorterDuff.Mode e(int i3, PorterDuff.Mode mode) {
        if (i3 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i3 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i3 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i3) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
