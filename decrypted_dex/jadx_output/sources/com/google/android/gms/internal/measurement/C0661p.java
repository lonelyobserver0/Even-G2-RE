package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0661p implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11643a;

    /* renamed from: b, reason: collision with root package name */
    public int f11644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11645c;

    public /* synthetic */ C0661p(Object obj, int i3) {
        this.f11643a = i3;
        this.f11645c = obj;
        this.f11644b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f11643a) {
            case 0:
                if (this.f11644b < ((C0666q) this.f11645c).f11647a.length()) {
                }
                break;
            case 1:
                if (this.f11644b < ((C0666q) this.f11645c).f11647a.length()) {
                }
                break;
            default:
                if (this.f11644b < ((C0601d) this.f11645c).p()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f11643a) {
            case 0:
                String str = ((C0666q) this.f11645c).f11647a;
                int i3 = this.f11644b;
                if (i3 >= str.length()) {
                    throw new NoSuchElementException();
                }
                this.f11644b = i3 + 1;
                return new C0666q(String.valueOf(i3));
            case 1:
                C0666q c0666q = (C0666q) this.f11645c;
                String str2 = c0666q.f11647a;
                int i10 = this.f11644b;
                if (i10 >= str2.length()) {
                    throw new NoSuchElementException();
                }
                this.f11644b = i10 + 1;
                return new C0666q(String.valueOf(c0666q.f11647a.charAt(i10)));
            default:
                int i11 = this.f11644b;
                C0601d c0601d = (C0601d) this.f11645c;
                if (i11 < c0601d.p()) {
                    int i12 = this.f11644b;
                    this.f11644b = i12 + 1;
                    return c0601d.q(i12);
                }
                int i13 = this.f11644b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 21);
                sb2.append(StubApp.getString2(8408));
                sb2.append(i13);
                throw new NoSuchElementException(sb2.toString());
        }
    }

    public C0661p(C0666q c0666q) {
        this.f11643a = 0;
        Objects.requireNonNull(c0666q);
        this.f11645c = c0666q;
        this.f11644b = 0;
    }
}
