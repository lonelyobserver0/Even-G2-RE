package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import com.stub.StubApp;
import i2.u;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    public String f15132A;

    /* renamed from: D, reason: collision with root package name */
    public int f15135D;

    /* renamed from: E, reason: collision with root package name */
    public int f15136E;

    /* renamed from: F, reason: collision with root package name */
    public int f15137F;

    /* renamed from: G, reason: collision with root package name */
    public int f15138G;

    /* renamed from: H, reason: collision with root package name */
    public float f15139H;

    /* renamed from: I, reason: collision with root package name */
    public String f15140I;

    /* renamed from: J, reason: collision with root package name */
    public String f15141J;

    /* renamed from: K, reason: collision with root package name */
    public float f15142K;

    /* renamed from: L, reason: collision with root package name */
    public float f15143L;

    /* renamed from: M, reason: collision with root package name */
    public float f15144M;

    /* renamed from: N, reason: collision with root package name */
    public float f15145N;

    /* renamed from: O, reason: collision with root package name */
    public float[] f15146O;

    /* renamed from: P, reason: collision with root package name */
    public h f15147P;

    /* renamed from: S, reason: collision with root package name */
    public ArrayList f15150S;

    /* renamed from: T, reason: collision with root package name */
    public f f15151T;

    /* renamed from: U, reason: collision with root package name */
    public f f15152U;

    /* renamed from: W, reason: collision with root package name */
    public float[] f15154W;

    /* renamed from: Y, reason: collision with root package name */
    public float[] f15156Y;

    /* renamed from: Z, reason: collision with root package name */
    public Rect f15157Z;

    /* renamed from: a, reason: collision with root package name */
    public final l f15158a;

    /* renamed from: c, reason: collision with root package name */
    public int f15160c;

    /* renamed from: d, reason: collision with root package name */
    public int f15161d;

    /* renamed from: e, reason: collision with root package name */
    public int f15162e;

    /* renamed from: f, reason: collision with root package name */
    public int f15163f;

    /* renamed from: g, reason: collision with root package name */
    public int f15164g;

    /* renamed from: h, reason: collision with root package name */
    public int f15165h;

    /* renamed from: i, reason: collision with root package name */
    public int f15166i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f15167k;

    /* renamed from: l, reason: collision with root package name */
    public float f15168l;

    /* renamed from: m, reason: collision with root package name */
    public float f15169m;

    /* renamed from: n, reason: collision with root package name */
    public float f15170n;

    /* renamed from: o, reason: collision with root package name */
    public String f15171o;

    /* renamed from: p, reason: collision with root package name */
    public String f15172p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f15173q;

    /* renamed from: r, reason: collision with root package name */
    public String f15174r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f15175s;

    /* renamed from: t, reason: collision with root package name */
    public String f15176t;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f15177u;

    /* renamed from: v, reason: collision with root package name */
    public String f15178v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f15179w;

    /* renamed from: x, reason: collision with root package name */
    public String f15180x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f15181y;

    /* renamed from: z, reason: collision with root package name */
    public String f15182z;

    /* renamed from: b, reason: collision with root package name */
    public int f15159b = -1;

    /* renamed from: B, reason: collision with root package name */
    public int f15133B = -1;

    /* renamed from: C, reason: collision with root package name */
    public boolean f15134C = false;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f15148Q = new ArrayList();

    /* renamed from: R, reason: collision with root package name */
    public final ArrayList f15149R = new ArrayList();

    /* renamed from: V, reason: collision with root package name */
    public boolean f15153V = true;

    /* renamed from: X, reason: collision with root package name */
    public boolean f15155X = true;

    public h(l lVar) {
        this.f15158a = lVar;
    }

    public static boolean a(h hVar, e eVar) {
        return (hVar.f15161d & eVar.f15125a) != 0;
    }

    public static CharSequence b(h hVar) {
        CharSequence[] charSequenceArr = {d(hVar.f15175s, hVar.f15174r), hVar.e(), d(hVar.f15181y, hVar.f15180x)};
        CharSequence charSequence = null;
        for (int i3 = 0; i3 < 3; i3++) {
            CharSequence charSequence2 = charSequenceArr[i3];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, StubApp.getString2(81), charSequence2);
            }
        }
        return charSequence;
    }

    public static SpannableString d(ArrayList arrayList, String str) {
        if (str == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                int c10 = AbstractC1856e.c(jVar.f15185c);
                if (c10 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder(StubApp.getString2(18919)).build(), jVar.f15183a, jVar.f15184b, 0);
                } else if (c10 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((g) jVar).f15131d)), jVar.f15183a, jVar.f15184b, 0);
                } else if (c10 == 2) {
                    spannableString.setSpan(new URLSpan(((k) jVar).f15186d), jVar.f15183a, jVar.f15184b, 0);
                }
            }
        }
        return spannableString;
    }

    public static ArrayList g(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int i3 = byteBuffer.getInt();
        if (i3 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i3);
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = byteBuffer.getInt();
            int i12 = byteBuffer.getInt();
            int i13 = AbstractC1856e.d(3)[byteBuffer.getInt()];
            int c10 = AbstractC1856e.c(i13);
            if (c10 == 0) {
                byteBuffer.getInt();
                i iVar = new i();
                iVar.f15183a = i11;
                iVar.f15184b = i12;
                iVar.f15185c = i13;
                arrayList.add(iVar);
            } else if (c10 == 1) {
                ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                g gVar = new g();
                gVar.f15183a = i11;
                gVar.f15184b = i12;
                gVar.f15185c = i13;
                gVar.f15131d = Charset.forName(StubApp.getString2(640)).decode(byteBuffer2).toString();
                arrayList.add(gVar);
            }
        }
        return arrayList;
    }

    public static void k(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f10 = fArr[3];
        fArr[0] = fArr[0] / f10;
        fArr[1] = fArr[1] / f10;
        fArr[2] = fArr[2] / f10;
        fArr[3] = 0.0f;
    }

    public final void c(ArrayList arrayList) {
        if (h(12)) {
            arrayList.add(this);
        }
        Iterator it = this.f15148Q.iterator();
        while (it.hasNext()) {
            ((h) it.next()).c(arrayList);
        }
    }

    public final SpannableString e() {
        ArrayList arrayList = this.f15173q;
        String str = this.f15132A;
        if (str != null && str.length() > 0) {
            arrayList = arrayList == null ? new ArrayList() : new ArrayList(arrayList);
            k kVar = new k();
            kVar.f15183a = 0;
            kVar.f15184b = this.f15172p.length();
            kVar.f15186d = this.f15132A;
            kVar.f15185c = 3;
            arrayList.add(kVar);
        }
        return d(arrayList, this.f15172p);
    }

    public final String f() {
        String str;
        if (h(13) && (str = this.f15172p) != null && !str.isEmpty()) {
            return this.f15172p;
        }
        Iterator it = this.f15148Q.iterator();
        while (it.hasNext()) {
            String f10 = ((h) it.next()).f();
            if (f10 != null && !f10.isEmpty()) {
                return f10;
            }
        }
        return null;
    }

    public final boolean h(int i3) {
        return (u.b(i3) & this.f15160c) != 0;
    }

    public final h i(float[] fArr, boolean z2) {
        float f10 = fArr[3];
        boolean z10 = false;
        float f11 = fArr[0] / f10;
        float f12 = fArr[1] / f10;
        if (f11 < this.f15142K || f11 >= this.f15144M || f12 < this.f15143L || f12 >= this.f15145N) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f15149R.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (!hVar.h(14)) {
                if (hVar.f15153V) {
                    hVar.f15153V = false;
                    if (hVar.f15154W == null) {
                        hVar.f15154W = new float[16];
                    }
                    if (!Matrix.invertM(hVar.f15154W, 0, hVar.f15146O, 0)) {
                        Arrays.fill(hVar.f15154W, 0.0f);
                    }
                }
                float[] fArr3 = fArr;
                Matrix.multiplyMV(fArr2, 0, hVar.f15154W, 0, fArr3, 0);
                h i3 = hVar.i(fArr2, z2);
                if (i3 != null) {
                    return i3;
                }
                fArr = fArr3;
            }
        }
        if (z2 && this.f15166i != -1) {
            z10 = true;
        }
        if (j() || z10) {
            return this;
        }
        return null;
    }

    public final boolean j() {
        if (h(12)) {
            return false;
        }
        if (h(22)) {
            return true;
        }
        int i3 = this.f15161d;
        int i10 = l.f15187z;
        if ((i3 & (-61)) != 0 || (this.f15160c & 10682871) != 0) {
            return true;
        }
        String str = this.f15172p;
        if (str != null && !str.isEmpty()) {
            return true;
        }
        String str2 = this.f15174r;
        if (str2 != null && !str2.isEmpty()) {
            return true;
        }
        String str3 = this.f15180x;
        return (str3 == null || str3.isEmpty()) ? false : true;
    }

    public final void l(float[] fArr, HashSet hashSet, boolean z2) {
        hashSet.add(this);
        if (this.f15155X) {
            z2 = true;
        }
        if (z2) {
            if (this.f15156Y == null) {
                this.f15156Y = new float[16];
            }
            if (this.f15146O == null) {
                this.f15146O = new float[16];
            }
            Matrix.multiplyMM(this.f15156Y, 0, fArr, 0, this.f15146O, 0);
            float[] fArr2 = {this.f15142K, this.f15143L, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            k(fArr3, this.f15156Y, fArr2);
            fArr2[0] = this.f15144M;
            fArr2[1] = this.f15143L;
            k(fArr4, this.f15156Y, fArr2);
            fArr2[0] = this.f15144M;
            fArr2[1] = this.f15145N;
            k(fArr5, this.f15156Y, fArr2);
            fArr2[0] = this.f15142K;
            fArr2[1] = this.f15145N;
            k(fArr6, this.f15156Y, fArr2);
            if (this.f15157Z == null) {
                this.f15157Z = new Rect();
            }
            this.f15157Z.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f15155X = false;
        }
        Iterator it = this.f15148Q.iterator();
        int i3 = -1;
        while (it.hasNext()) {
            h hVar = (h) it.next();
            hVar.f15133B = i3;
            i3 = hVar.f15159b;
            hVar.l(this.f15156Y, hashSet, z2);
        }
    }
}
