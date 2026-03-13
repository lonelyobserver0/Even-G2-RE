package q3;

import android.util.SparseBooleanArray;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;
import java.util.ArrayList;
import java.util.Iterator;
import x3.EnumC1907a;

/* renamed from: q3.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1517j {

    /* renamed from: s, reason: collision with root package name */
    public static final Object f20020s = new Object();

    /* renamed from: a, reason: collision with root package name */
    public PdfDocument f20021a;

    /* renamed from: b, reason: collision with root package name */
    public final PdfiumCore f20022b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20023c;

    /* renamed from: g, reason: collision with root package name */
    public final Size f20027g;

    /* renamed from: h, reason: collision with root package name */
    public final Size f20028h;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f20030k;

    /* renamed from: l, reason: collision with root package name */
    public final int f20031l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f20032m;

    /* renamed from: q, reason: collision with root package name */
    public final EnumC1907a f20036q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f20037r;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f20024d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f20025e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final SparseBooleanArray f20026f = new SparseBooleanArray();

    /* renamed from: i, reason: collision with root package name */
    public SizeF f20029i = new SizeF(0.0f, 0.0f);
    public SizeF j = new SizeF(0.0f, 0.0f);

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f20033n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f20034o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public float f20035p = 0.0f;

    public C1517j(PdfiumCore pdfiumCore, PdfDocument pdfDocument, EnumC1907a enumC1907a, Size size, boolean z2, int i3, boolean z10, boolean z11) {
        this.f20023c = 0;
        this.f20027g = new Size(0, 0);
        this.f20028h = new Size(0, 0);
        this.f20022b = pdfiumCore;
        this.f20021a = pdfDocument;
        this.f20036q = enumC1907a;
        this.f20030k = z2;
        this.f20031l = i3;
        this.f20032m = z10;
        this.f20037r = z11;
        this.f20023c = pdfiumCore.c(pdfDocument);
        for (int i10 = 0; i10 < this.f20023c; i10++) {
            Size e10 = pdfiumCore.e(this.f20021a, a(i10));
            if (e10.f12762a > this.f20027g.f12762a) {
                this.f20027g = e10;
            }
            if (e10.f12763b > this.f20028h.f12763b) {
                this.f20028h = e10;
            }
            this.f20024d.add(e10);
        }
        i(size);
    }

    public final int a(int i3) {
        if (i3 < 0 || i3 >= this.f20023c) {
            return -1;
        }
        return i3;
    }

    public final SizeF b() {
        return this.f20030k ? this.j : this.f20029i;
    }

    public final int c(float f10, float f11) {
        int i3 = 0;
        for (int i10 = 0; i10 < this.f20023c; i10++) {
            if ((((Float) this.f20033n.get(i10)).floatValue() * f11) - (((this.f20032m ? ((Float) this.f20034o.get(i10)).floatValue() : this.f20031l) * f11) / 2.0f) >= f10) {
                break;
            }
            i3++;
        }
        int i11 = i3 - 1;
        if (i11 >= 0) {
            return i11;
        }
        return 0;
    }

    public final float d(float f10, int i3) {
        SizeF f11 = f(i3);
        return (this.f20030k ? f11.f12765b : f11.f12764a) * f10;
    }

    public final float e(float f10, int i3) {
        if (a(i3) < 0) {
            return 0.0f;
        }
        return ((Float) this.f20033n.get(i3)).floatValue() * f10;
    }

    public final SizeF f(int i3) {
        return a(i3) < 0 ? new SizeF(0.0f, 0.0f) : (SizeF) this.f20025e.get(i3);
    }

    public final SizeF g(float f10, int i3) {
        SizeF f11 = f(i3);
        return new SizeF(f11.f12764a * f10, f11.f12765b * f10);
    }

    public final float h(float f10, int i3) {
        float f11;
        float f12;
        SizeF f13 = f(i3);
        if (this.f20030k) {
            f11 = b().f12764a;
            f12 = f13.f12764a;
        } else {
            f11 = b().f12765b;
            f12 = f13.f12765b;
        }
        return ((f11 - f12) * f10) / 2.0f;
    }

    public final void i(Size size) {
        float f10;
        float f11;
        float f12;
        SizeF sizeF;
        int i3;
        ArrayList arrayList = this.f20025e;
        arrayList.clear();
        x3.b bVar = new x3.b(this.f20036q, this.f20027g, this.f20028h, size, this.f20037r);
        this.j = bVar.f22844c;
        this.f20029i = bVar.f22845d;
        Iterator it = this.f20024d.iterator();
        while (true) {
            f10 = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            Size size2 = (Size) it.next();
            int i10 = size2.f12762a;
            if (i10 <= 0 || (i3 = size2.f12763b) <= 0) {
                sizeF = new SizeF(0.0f, 0.0f);
            } else {
                boolean z2 = bVar.f22848g;
                Size size3 = bVar.f22843b;
                float f13 = z2 ? size3.f12762a : i10 * bVar.f22846e;
                float f14 = z2 ? size3.f12763b : i3 * bVar.f22847f;
                int ordinal = bVar.f22842a.ordinal();
                sizeF = ordinal != 1 ? ordinal != 2 ? x3.b.c(size2, f13) : x3.b.a(size2, f13, f14) : x3.b.b(size2, f14);
            }
            arrayList.add(sizeF);
        }
        int i11 = this.f20031l;
        boolean z10 = this.f20030k;
        ArrayList arrayList2 = this.f20034o;
        boolean z11 = this.f20032m;
        if (z11) {
            arrayList2.clear();
            for (int i12 = 0; i12 < this.f20023c; i12++) {
                SizeF sizeF2 = (SizeF) arrayList.get(i12);
                if (z10) {
                    f11 = size.f12763b;
                    f12 = sizeF2.f12765b;
                } else {
                    f11 = size.f12762a;
                    f12 = sizeF2.f12764a;
                }
                float max = Math.max(0.0f, f11 - f12);
                if (i12 < this.f20023c - 1) {
                    max += i11;
                }
                arrayList2.add(Float.valueOf(max));
            }
        }
        float f15 = 0.0f;
        for (int i13 = 0; i13 < this.f20023c; i13++) {
            SizeF sizeF3 = (SizeF) arrayList.get(i13);
            f15 += z10 ? sizeF3.f12765b : sizeF3.f12764a;
            if (z11) {
                f15 = ((Float) arrayList2.get(i13)).floatValue() + f15;
            } else if (i13 < this.f20023c - 1) {
                f15 += i11;
            }
        }
        this.f20035p = f15;
        ArrayList arrayList3 = this.f20033n;
        arrayList3.clear();
        for (int i14 = 0; i14 < this.f20023c; i14++) {
            SizeF sizeF4 = (SizeF) arrayList.get(i14);
            float f16 = z10 ? sizeF4.f12765b : sizeF4.f12764a;
            if (z11) {
                float floatValue = (((Float) arrayList2.get(i14)).floatValue() / 2.0f) + f10;
                if (i14 == 0) {
                    floatValue -= i11 / 2.0f;
                } else if (i14 == this.f20023c - 1) {
                    floatValue += i11 / 2.0f;
                }
                arrayList3.add(Float.valueOf(floatValue));
                f10 = (((Float) arrayList2.get(i14)).floatValue() / 2.0f) + f16 + floatValue;
            } else {
                arrayList3.add(Float.valueOf(f10));
                f10 = f16 + i11 + f10;
            }
        }
    }
}
