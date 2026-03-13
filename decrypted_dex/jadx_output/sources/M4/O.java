package M4;

import com.stub.StubApp;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class O implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public static final O f4561a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ O[] f4562b;

    static {
        O o5 = new O(StubApp.getString2(3545), 0);
        f4561a = o5;
        f4562b = new O[]{o5};
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) f4562b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        hc.b.n(StubApp.getString2(3546), false);
    }
}
