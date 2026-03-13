package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class l<T> {

    /* renamed from: a, reason: collision with root package name */
    private List<T> f12784a;

    /* renamed from: b, reason: collision with root package name */
    private List<Integer> f12785b;

    private List<T> c() {
        if (this.f12784a == null) {
            this.f12784a = new ArrayList();
        }
        return this.f12784a;
    }

    private List<Integer> e() {
        if (this.f12785b == null) {
            this.f12785b = new ArrayList();
        }
        return this.f12785b;
    }

    public void a(T t3, int i3) {
        c().add(t3);
        e().add(Integer.valueOf(i3));
    }

    public T b(int i3) {
        return c().get(i3);
    }

    public int d(int i3) {
        return e().get(i3).intValue();
    }

    public void f(T t3, int i3) {
        int indexOf = c().indexOf(t3);
        if (indexOf > -1) {
            e().set(indexOf, Integer.valueOf(i3));
        }
    }

    public int g() {
        return c().size();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < c().size(); i3++) {
            if (i3 > 0) {
                sb2.append(StubApp.getString2(5156));
            }
            sb2.append(StubApp.getString2(16204));
            sb2.append(c().get(i3));
            sb2.append(StubApp.getString2(16205));
            sb2.append(d(i3));
        }
        return sb2.toString();
    }
}
