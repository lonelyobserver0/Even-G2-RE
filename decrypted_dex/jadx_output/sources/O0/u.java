package O0;

import L0.h0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import r0.AbstractC1560u;
import r0.C1553n;
import r4.AbstractC1567a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public int f5181a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5182b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5183c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5184d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5185e;

    /* renamed from: f, reason: collision with root package name */
    public Object f5186f;

    public u(s0.p pVar) {
        this.f5182b = pVar;
        this.f5183c = new ArrayDeque();
        this.f5184d = new ArrayDeque();
        this.f5185e = new PriorityQueue();
        this.f5181a = -1;
    }

    public static u b(Context context, int i3) {
        M.d.a(StubApp.getString2(3972), i3 != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, AbstractC1567a.j);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList o5 = L1.o(context, obtainStyledAttributes, 4);
        ColorStateList o10 = L1.o(context, obtainStyledAttributes, 9);
        ColorStateList o11 = L1.o(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        I4.k a3 = I4.k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new I4.a(0)).a();
        obtainStyledAttributes.recycle();
        return new u(o5, o10, o11, dimensionPixelSize, a3, rect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r8 < r0.f20652b) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r8, r0.C1553n r10) {
        /*
            r7 = this;
            int r0 = r7.f5181a
            if (r0 == 0) goto La1
            java.lang.Object r1 = r7.f5185e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -1
            if (r0 == r2) goto L23
            int r0 = r1.size()
            int r3 = r7.f5181a
            if (r0 < r3) goto L23
            java.lang.Object r0 = r1.peek()
            s0.o r0 = (s0.o) r0
            int r3 = r0.AbstractC1560u.f20190a
            long r3 = r0.f20652b
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L23
            goto La1
        L23:
            java.lang.Object r0 = r7.f5183c
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L33
            r0.n r0 = new r0.n
            r0.<init>()
            goto L39
        L33:
            java.lang.Object r0 = r0.pop()
            r0.n r0 = (r0.C1553n) r0
        L39:
            int r3 = r10.a()
            r0.D(r3)
            byte[] r3 = r10.f20176a
            int r10 = r10.f20177b
            byte[] r4 = r0.f20176a
            int r5 = r0.a()
            r6 = 0
            java.lang.System.arraycopy(r3, r10, r4, r6, r5)
            java.lang.Object r10 = r7.f5186f
            s0.o r10 = (s0.o) r10
            if (r10 == 0) goto L60
            long r3 = r10.f20652b
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L60
            java.util.ArrayList r8 = r10.f20651a
            r8.add(r0)
            return
        L60:
            java.lang.Object r10 = r7.f5184d
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L70
            s0.o r10 = new s0.o
            r10.<init>()
            goto L76
        L70:
            java.lang.Object r10 = r10.pop()
            s0.o r10 = (s0.o) r10
        L76:
            r10.getClass()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L83
            r6 = 1
        L83:
            r0.AbstractC1550k.c(r6)
            java.util.ArrayList r3 = r10.f20651a
            boolean r4 = r3.isEmpty()
            r0.AbstractC1550k.g(r4)
            r10.f20652b = r8
            r3.add(r0)
            r1.add(r10)
            r7.f5186f = r10
            int r8 = r7.f5181a
            if (r8 == r2) goto La0
            r7.c(r8)
        La0:
            return
        La1:
            java.lang.Object r0 = r7.f5182b
            s0.p r0 = (s0.p) r0
            r0.c(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.u.a(long, r0.n):void");
    }

    public void c(int i3) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.f5185e;
            if (priorityQueue.size() <= i3) {
                return;
            }
            s0.o oVar = (s0.o) priorityQueue.poll();
            int i10 = AbstractC1560u.f20190a;
            int i11 = 0;
            while (true) {
                int size = oVar.f20651a.size();
                arrayList = oVar.f20651a;
                if (i11 >= size) {
                    break;
                }
                ((s0.p) this.f5182b).c(oVar.f20652b, (C1553n) arrayList.get(i11));
                ((ArrayDeque) this.f5183c).push((C1553n) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            s0.o oVar2 = (s0.o) this.f5186f;
            if (oVar2 != null && oVar2.f20652b == oVar.f20652b) {
                this.f5186f = null;
            }
            ((ArrayDeque) this.f5184d).push(oVar);
        }
    }

    public u(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i3, I4.k kVar, Rect rect) {
        M.d.d(rect.left);
        M.d.d(rect.top);
        M.d.d(rect.right);
        M.d.d(rect.bottom);
        this.f5182b = rect;
        this.f5183c = colorStateList2;
        this.f5184d = colorStateList;
        this.f5185e = colorStateList3;
        this.f5181a = i3;
        this.f5186f = kVar;
    }

    public u(int[] iArr, h0[] h0VarArr, int[] iArr2, int[][][] iArr3, h0 h0Var) {
        this.f5182b = iArr;
        this.f5184d = h0VarArr;
        this.f5185e = iArr3;
        this.f5183c = iArr2;
        this.f5186f = h0Var;
        this.f5181a = iArr.length;
    }
}
