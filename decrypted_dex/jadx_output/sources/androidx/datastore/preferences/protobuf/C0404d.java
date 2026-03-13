package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.C0594b2;
import com.google.protobuf.C0731i;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0404d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9772a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f9773b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f9774c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9775d;

    public C0404d(C0594b2 c0594b2) {
        this.f9775d = c0594b2;
        this.f9774c = c0594b2.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9772a) {
            case 0:
                if (this.f9773b < this.f9774c) {
                }
                break;
            case 1:
                if (this.f9773b < this.f9774c) {
                }
                break;
            default:
                if (this.f9773b < this.f9774c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9772a) {
            case 0:
                int i3 = this.f9773b;
                if (i3 >= this.f9774c) {
                    throw new NoSuchElementException();
                }
                this.f9773b = i3 + 1;
                return Byte.valueOf(((C0407g) this.f9775d).g(i3));
            case 1:
                int i10 = this.f9773b;
                if (i10 >= this.f9774c) {
                    throw new NoSuchElementException();
                }
                this.f9773b = i10 + 1;
                return Byte.valueOf(((C0594b2) this.f9775d).b(i10));
            default:
                int i11 = this.f9773b;
                if (i11 >= this.f9774c) {
                    throw new NoSuchElementException();
                }
                this.f9773b = i11 + 1;
                return Byte.valueOf(((C0731i) this.f9775d).f(i11));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9772a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0404d(C0731i c0731i) {
        this.f9775d = c0731i;
        this.f9774c = c0731i.size();
    }

    public C0404d(C0407g c0407g) {
        this.f9775d = c0407g;
        this.f9774c = c0407g.size();
    }
}
