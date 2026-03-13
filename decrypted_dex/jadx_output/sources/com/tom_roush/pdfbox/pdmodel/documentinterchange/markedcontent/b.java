package com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent;

import oa.AbstractC1469b;
import oa.C1471d;
import oa.j;
import ta.InterfaceC1743c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class b implements InterfaceC1743c {

    /* renamed from: a, reason: collision with root package name */
    protected final C1471d f12789a;

    public b() {
        this.f12789a = new C1471d();
    }

    public static b a(C1471d c1471d) {
        AbstractC1469b O7 = c1471d.O(j.f18621y3);
        return j.f18594s2.equals(O7) ? new Da.a(c1471d, 0) : j.f18599t2.equals(O7) ? new Da.a(c1471d, 1) : new b(c1471d);
    }

    @Override // ta.InterfaceC1743c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1471d p() {
        return this.f12789a;
    }

    public b(C1471d c1471d) {
        this.f12789a = c1471d;
    }
}
