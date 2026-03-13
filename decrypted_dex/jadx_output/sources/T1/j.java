package T1;

import android.animation.ObjectAnimator;
import android.view.View;
import com.stub.StubApp;
import java.util.HashMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends n {

    /* renamed from: z, reason: collision with root package name */
    public static final String[] f7110z = {StubApp.getString2(6136), StubApp.getString2(6137)};

    /* renamed from: y, reason: collision with root package name */
    public final int f7111y;

    public j(int i3) {
        this.f7111y = i3;
    }

    public static void G(s sVar) {
        int visibility = sVar.f7147b.getVisibility();
        HashMap hashMap = sVar.f7146a;
        hashMap.put(StubApp.getString2(6136), Integer.valueOf(visibility));
        View view = sVar.f7147b;
        hashMap.put(StubApp.getString2(6137), view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put(StubApp.getString2(6138), iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static T1.y I(T1.s r8, T1.s r9) {
        /*
            T1.y r0 = new T1.y
            r0.<init>()
            r1 = 0
            r0.f7165a = r1
            r0.f7166b = r1
            r2 = 0
            r3 = -1
            r4 = 6137(0x17f9, float:8.6E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            r5 = 6136(0x17f8, float:8.598E-42)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            if (r8 == 0) goto L39
            java.util.HashMap r6 = r8.f7146a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L39
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f7167c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f7169e = r6
            goto L3d
        L39:
            r0.f7167c = r3
            r0.f7169e = r2
        L3d:
            if (r9 == 0) goto L5c
            java.util.HashMap r6 = r9.f7146a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L5c
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f7168d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f7170f = r2
            goto L60
        L5c:
            r0.f7168d = r3
            r0.f7170f = r2
        L60:
            r2 = 1
            if (r8 == 0) goto L94
            if (r9 == 0) goto L94
            int r8 = r0.f7167c
            int r9 = r0.f7168d
            if (r8 != r9) goto L72
            android.view.ViewGroup r3 = r0.f7169e
            android.view.ViewGroup r4 = r0.f7170f
            if (r3 != r4) goto L72
            goto La9
        L72:
            if (r8 == r9) goto L82
            if (r8 != 0) goto L7b
            r0.f7166b = r1
            r0.f7165a = r2
            return r0
        L7b:
            if (r9 != 0) goto La9
            r0.f7166b = r2
            r0.f7165a = r2
            return r0
        L82:
            android.view.ViewGroup r8 = r0.f7170f
            if (r8 != 0) goto L8b
            r0.f7166b = r1
            r0.f7165a = r2
            return r0
        L8b:
            android.view.ViewGroup r8 = r0.f7169e
            if (r8 != 0) goto La9
            r0.f7166b = r2
            r0.f7165a = r2
            return r0
        L94:
            if (r8 != 0) goto L9f
            int r8 = r0.f7168d
            if (r8 != 0) goto L9f
            r0.f7166b = r2
            r0.f7165a = r2
            return r0
        L9f:
            if (r9 != 0) goto La9
            int r8 = r0.f7167c
            if (r8 != 0) goto La9
            r0.f7166b = r1
            r0.f7165a = r2
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.j.I(T1.s, T1.s):T1.y");
    }

    public final ObjectAnimator H(View view, float f10, float f11) {
        int i3 = 0;
        if (f10 == f11) {
            return null;
        }
        t.f7149a.y(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, t.f7150b, f11);
        ofFloat.addListener(new i(view));
        a(new h(view, i3));
        return ofFloat;
    }

    @Override // T1.n
    public final void d(s sVar) {
        G(sVar);
    }

    @Override // T1.n
    public final void g(s sVar) {
        G(sVar);
        sVar.f7146a.put(StubApp.getString2(6139), Float.valueOf(t.f7149a.m(sVar.f7147b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (I(n(r3, false), q(r3, false)).f7165a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ea  */
    @Override // T1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator k(android.view.ViewGroup r24, T1.s r25, T1.s r26) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.j.k(android.view.ViewGroup, T1.s, T1.s):android.animation.Animator");
    }

    @Override // T1.n
    public final String[] p() {
        return f7110z;
    }

    @Override // T1.n
    public final boolean r(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null) {
            HashMap hashMap = sVar2.f7146a;
            String string2 = StubApp.getString2(6136);
            if (hashMap.containsKey(string2) != sVar.f7146a.containsKey(string2)) {
                return false;
            }
        }
        y I10 = I(sVar, sVar2);
        if (I10.f7165a) {
            return I10.f7167c == 0 || I10.f7168d == 0;
        }
        return false;
    }
}
