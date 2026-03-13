package L4;

import Z9.q;
import java.util.Iterator;
import java.util.NoSuchElementException;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public String f4184b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f4185c;

    /* renamed from: d, reason: collision with root package name */
    public final d f4186d;

    /* renamed from: f, reason: collision with root package name */
    public int f4188f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q f4189g;

    /* renamed from: a, reason: collision with root package name */
    public int f4183a = 2;

    /* renamed from: e, reason: collision with root package name */
    public int f4187e = 0;

    public j(q qVar, Bc.i iVar, CharSequence charSequence) {
        this.f4189g = qVar;
        this.f4186d = (d) iVar.f767c;
        this.f4188f = iVar.f766b;
        this.f4185c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i3 = this.f4183a;
        if (i3 == 4) {
            throw new IllegalStateException();
        }
        int c10 = AbstractC1856e.c(i3);
        if (c10 == 0) {
            return true;
        }
        if (c10 == 2) {
            return false;
        }
        this.f4183a = 4;
        int i10 = this.f4187e;
        while (true) {
            int i11 = this.f4187e;
            if (i11 == -1) {
                this.f4183a = 3;
                str = null;
                break;
            }
            c cVar = (c) this.f4189g.f9143b;
            CharSequence charSequence = this.f4185c;
            int length = charSequence.length();
            hc.b.k(i11, length);
            while (true) {
                if (i11 >= length) {
                    i11 = -1;
                    break;
                }
                if (cVar.a(charSequence.charAt(i11))) {
                    break;
                }
                i11++;
            }
            if (i11 == -1) {
                i11 = charSequence.length();
                this.f4187e = -1;
            } else {
                this.f4187e = i11 + 1;
            }
            int i12 = this.f4187e;
            if (i12 == i10) {
                int i13 = i12 + 1;
                this.f4187e = i13;
                if (i13 > charSequence.length()) {
                    this.f4187e = -1;
                }
            } else {
                d dVar = this.f4186d;
                if (i10 < i11) {
                    charSequence.charAt(i10);
                    dVar.getClass();
                }
                if (i11 > i10) {
                    charSequence.charAt(i11 - 1);
                    dVar.getClass();
                }
                int i14 = this.f4188f;
                if (i14 == 1) {
                    i11 = charSequence.length();
                    this.f4187e = -1;
                    if (i11 > i10) {
                        charSequence.charAt(i11 - 1);
                        dVar.getClass();
                    }
                } else {
                    this.f4188f = i14 - 1;
                }
                str = charSequence.subSequence(i10, i11).toString();
            }
        }
        this.f4184b = str;
        if (this.f4183a == 3) {
            return false;
        }
        this.f4183a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4183a = 2;
        String str = this.f4184b;
        this.f4184b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
